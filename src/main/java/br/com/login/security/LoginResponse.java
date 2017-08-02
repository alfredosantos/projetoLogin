package br.com.login.security;

public class LoginResponse  {
	public String token;
	public String perfil;

	private LoginResponse(final String token, String perfil) {
		this.token = token;
		this.perfil = perfil;
	}
	
	public static LoginResponse of(String token, String perfil){
		return new LoginResponse(token, perfil);
	}
}
