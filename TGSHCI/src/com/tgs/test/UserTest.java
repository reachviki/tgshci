package com.tgs.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tgs.domain.User;

public class UserTest {
	
	private User user;
	
	public void testCase1(){
		  assertTrue( "TestExample", true );
	}
		
	@Before
	public void setUp() throws Exception {
		user = new User();
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCountry() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCountry() {
		fail("Not yet implemented");
	}

}
