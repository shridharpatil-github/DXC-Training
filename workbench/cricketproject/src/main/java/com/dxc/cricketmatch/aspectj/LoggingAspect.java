package com.dxc.cricketmatch.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/* Annotate this class with @Aspect and @Component */
/**
 * @author Paartha
 *
 */
@Aspect
@Component
public class LoggingAspect {
	/*
	 * Write loggers for each of the methods of Category controller, any particular
	 * method will have all the four aspectJ annotation
	 * (@Before, @After, @AfterReturning, @AfterThrowing).
	 */
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 
	 */
	@Pointcut(value = "execution(* com.dxc.cricketmatch.controller.*.*(..))")
	public void beforeController() {
	}

	/**
	 * @param joinpoint
	 */
	@Before("beforeController()")
	public void beforeAspect(JoinPoint joinpoint) {
		logger.info("-------@Before(\"beforeController()\"----------" + joinpoint.getSignature());

	}

	/**
	 * 
	 */
	@Pointcut(value = "execution(* com.dxc.cricketmatch.controller.*.*(..))")
	public void afterController() {
	}

	/**
	 * @param joinpoint
	 */
	@After("afterController()")
	public void afterAspect(JoinPoint joinpoint) {
		logger.info("----------@After(afterController()" + joinpoint.getSignature());
	}

	/**
	 * 
	 */
	@Pointcut(value = "execution(* com.dxc.cricketmatch.controller.*.*(..))")
	public void afterThrowing() {
	}

	/**
	 * @param exception
	 */
	@AfterThrowing(pointcut = "execution(* com.dxc.cricketmatch.controller.*.*(..))", throwing = "exception")
	public void afterThrowingAspect(Exception exception) {
		logger.info("----@AfterThrowing---" + exception.getMessage());
	}

	/**
	 * 
	 */
	@Pointcut(value = "execution(* com.dxc.cricketmatch.controller.*.*(..))")
	public void afterReturning() {
	}

	/**
	 * @param val
	 */
	@AfterReturning(pointcut = "execution(* com.dxc.cricketmatch.controller.*.*(..))", returning = "val")
	public void afterReturningAspect(Object val) {
		logger.info("----@AfterReturning---" + val);
	}
}