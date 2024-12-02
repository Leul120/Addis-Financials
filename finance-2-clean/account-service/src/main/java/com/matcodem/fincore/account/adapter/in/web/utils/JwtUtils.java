package com.matcodem.fincore.account.adapter.in.web.utils;

import java.util.List;

import org.springframework.security.oauth2.jwt.Jwt;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class JwtUtils {

	public static String userId(Jwt jwt) {
		return jwt.getSubject();
	}

	public static boolean hasRole(Jwt jwt, String role) {
		List<String> roles = jwt.getClaimAsStringList("roles");
		return roles != null && roles.contains(role);
	}

	public static boolean isAdmin(Jwt jwt) {
		return hasRole(jwt, "ROLE_ADMIN");
	}
}
// Updated on 2024-12-02 10:53:31