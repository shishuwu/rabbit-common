package com.shishuwu.rabbit.rabbit_common;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CommonAppTest {

	@Test
	public void testPrint() {
		Assert.assertEquals("common", new CommonApp().print());
	}
	
	@Test
	public void testSayHi(){
		new CommonApp().sayHi();
	}
}
