package com.inferyx.framework.selenium;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestMain {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" +currentDir);
			    List<String> file = new ArrayList<String>();
			    file.add( System.getProperty("user.dir")+"/src/main/resources/testng.xml");
			    TestNG testNG = new TestNG();
			    testNG.setTestSuites(file);
			    testNG.run();
	}

}
