package br.com.login.security;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class TokenUtil {
	
	@Value("${app.auth.timeOutToken}")
	int timeOutToken;
	
	public static final String TOKEN = YamanToken.JWT_TOKEN;

    public LoginResponse createToken(String usename, String perfil){        
        return LoginResponse.of(Jwts.builder().setSubject(usename).setSubject(perfil)
				.setExpiration(new Date(Calendar.getInstance().getTimeInMillis() + timeOutToken))
				.setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, TOKEN).compact(), perfil);
    }
    
    public boolean isValidaToken(String authHeader){
    	return authHeader != null && authHeader.startsWith("Bearer ");    	
    }

}