package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class usertest {
private user Uauth;
	
	@BeforeEach
	public void setup() {
		Uauth= new user();
		System.out.println("Authentication User main class inititated");
	}
	
	@AfterEach
	public void tearDown() {
		Uauth=null;
		System.out.println("Class Closed");
	}
	
	@Test
	public void checkUser() {
		assertEquals("mallikakakollu@gmail.com", Uauth.username());
	}
	@Test
	public void checkUserNull()
	{
		assertNotNull(Uauth.username());
	}
	
	@Test
	public void checkPass() {
		assertEquals("harsha", Uauth.password());
}
	
	@Test
	public void checkPassNull()
	{
		assertNotNull(Uauth.password());
	}
	
	@Test
	public void checkUserRegx()
	{
		String email = Uauth.username();
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		
		assertEquals(true, matcher.matches());
	}

	
}

