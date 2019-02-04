package com.inferyx.framework.selenium;

import java.io.File;
import java.util.Collections;
import java.util.Map;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;

public class MainOne {
    public static void main(String[] args) {
    	 Map<String, String> env = System.getenv();
         // Java 8
         //env.forEach((k, v) -> System.out.println(k + ":" + v));

         // Classic way to loop a map
         for (Map.Entry<String, String> entry : env.entrySet()) {
             System.out.println(entry.getKey() + " : " + entry.getValue());
         }
    	
        InvocationRequest request = new DefaultInvocationRequest();
        request.setPomFile( new File( "pom.xml" ));
        request.setGoals( Collections.singletonList( "install" ));
        Invoker invoker = new DefaultInvoker();
        invoker.setMavenHome(new File(System.getenv("M2_HOME")));
        try {
            invoker.execute( request );
        } catch (MavenInvocationException e) {
            e.printStackTrace();
        } 
    } 
}