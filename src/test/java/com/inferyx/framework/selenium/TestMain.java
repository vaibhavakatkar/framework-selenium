package com.inferyx.framework.selenium;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestMain {

	public static void main(String[] args) {
			    List<String> file = new ArrayList<String>();
			    file.add("testng.xml");
			    TestNG testNG = new TestNG();
			    testNG.setTestSuites(file);
			    testNG.run();
	}

}
