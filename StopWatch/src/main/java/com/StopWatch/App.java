package com.StopWatch;

/**
 * Hello world!
 *
 */
public class App 
{
	private final long start;
	
    public App() {
    	start=System.currentTimeMillis();
    }
    public double eclapsedTime() {
    	long stop=System.currentTimeMillis();
    	return(stop-start)/1000;
    }
}
