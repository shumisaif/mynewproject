package com.hooks;

import com.ca.basepage.SuperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends SuperClass {

@Before 
public void suiteSetup() {
	initialization();
}
@After
public void tearDown() {
	driver.quit();
    driver.close();


}




}
