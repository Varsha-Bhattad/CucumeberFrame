package stepDefinitions;

import io.cucumber.java.After;

//import io.cucumber.java.After;

import io.cucumber.java.Before;

import varshasb.CucumberFrame1.Baseclass;

public class hooks extends Baseclass {

	
	
	@Before
	public void setUp() {
		initializeDriver();
		
	}
	
	
	
	@After
	public void close() {
		closeDriver();
		
	}
}
