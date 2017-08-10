/**
 * 
 */
package test;

import service.MassegeProvider;
import service.MassegeRenderer;

/**
 * @author alex_jd
 *
 */
public class testInstance {
	private static testInstance newInstance;
	
	private static testInstance getInstance(){
		return newInstance = new testInstance();
	}
	
	public void getInfo() {
		System.out.println("I am a newInstance of Class testInstance");
	}
	
	private MassegeRenderer renderer;
	private MassegeProvider provider;
	
	private testInstance() {
		try {
			String rendererClass = "test.TestRenderer";
			String providerClass = "test.TestProvider";

			renderer = (MassegeRenderer) Class.forName(rendererClass).newInstance();
			provider = (MassegeProvider) Class.forName(providerClass).newInstance();
		} catch (Exception ex) {

		}
	}
	
	public MassegeRenderer getRenderer() {
		return renderer;
	}
	
	public MassegeProvider getProvider() {
		return provider;
	}
	
	
	//Test the class
	public static void main(String[] args) {
		testInstance.getInstance().getInfo();
		
		MassegeRenderer mr = testInstance.getInstance().getRenderer();
		MassegeProvider mp = testInstance.getInstance().getProvider();
		
		mr.getInfo();
		mp.getInfo();
		
	}

}
