package com.dxc.cricketmatch.user.tokengenerator;

import java.util.Map;

import com.dxc.cricketmatch.user.model.User;


// An interface created for token generation
// We need to write a class which will implement this interface
/**
 * @author Paartha
 *
 */
public interface TokenGenerator {

	/**
	 * @param user
	 * @return map
	 */
	public String generateToken(User user);
}
