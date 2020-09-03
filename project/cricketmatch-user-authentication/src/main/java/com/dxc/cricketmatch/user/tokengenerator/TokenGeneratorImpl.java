package com.dxc.cricketmatch.user.tokengenerator;

import java.util.HashMap;

import java.util.Map;

import com.dxc.cricketmatch.user.model.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
/**
 * @author Paartha
 *
 */
public class TokenGeneratorImpl implements TokenGenerator {

	@Override
	public String generateToken(User user) {
		// Token needs to be generated
		
		String jwtToken=Jwts.builder().setId(user.getEmail()).setSubject(user.getPassword()).setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "secretkey").compact();
	    System.out.println(jwtToken);
		return jwtToken;
		
	}

}
