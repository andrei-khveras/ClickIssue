package com.epam.mp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Fake unit test.
 * 
 * @author andrei_khveras
 */
public class GetTitleAppTest {
	
	GetTitleApp testApp = new GetTitleApp();;
	
	private static final String SITE_TITLE = "GISMETEO.BY";
	
	@Test
	public void testShoudBePassed() {
		assertTrue("I should fail", testApp.getGismeteoTitle().contains(SITE_TITLE));
	}

	@Test
	public void testShouldBeFailed() {
		assertEquals("Page title is not 'Google Home'", "Google home", testApp.getGismeteoTitle());
	}
}
