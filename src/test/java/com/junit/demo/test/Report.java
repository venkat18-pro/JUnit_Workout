package com.junit.demo.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Report {

public static void main(String[] args) {
	Result result = JUnitCore.runClasses(JunitMain.class, JunitMain2.class);
	
	System.out.println("Failure Count: "+result.getFailureCount());
	System.out.println("Run Count: "+result.getRunCount());
	
	int pass = result.getRunCount() - result.getFailureCount();
	
	System.out.println("Pass Count: " + pass);
	
}
	
}
