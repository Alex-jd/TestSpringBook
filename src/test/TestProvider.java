/**
 * 
 */
package test;

import service.MassegeProvider;

/**
 * @author alex_jd
 *
 */
public class TestProvider implements MassegeProvider{

	public TestProvider() {
		//System.out.println("I am TestProvider");
	}
	
	public void getInfo() {
		System.out.println("I am TestProvider");
	}

}
