/**
 * 
 */
package com.jweinfurtner.jenkinstest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Jared
 *
 */
public class HomeControllerTest {

	private HomeController homeController;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		homeController = new HomeController();
	}

	/**
	 * Test method for {@link com.jweinfurtner.jenkinstest.HomeController#homepage(org.springframework.ui.Model)}.
	 */
	@Test
	public void testHomepage() {
		assertNotNull(homeController);
	}

	/**
	 * Test method for {@link com.jweinfurtner.jenkinstest.HomeController#test(org.springframework.ui.Model)}.
	 */
	@Test
	public void testTest() {
		assertNotNull(homeController);
	}

}
