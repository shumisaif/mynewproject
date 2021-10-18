package com.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

features = "./Feature/login.feature",

glue =  "com.stepdef",

plugin = {"pretty","json:target/cucumber.json" },	
	
//dryRun = false,

//monochrome = true, 
		

 
tags = 	"@Smoke"	)	

public class MyRunnerclass extends AbstractTestNGCucumberTests {

}

