package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
	    System.out.println("[LoggingAspect] --> Starting method: " + joinPoint.getSignature());

	    long start = System.currentTimeMillis();
	    Object result = joinPoint.proceed();
	    long end = System.currentTimeMillis();

	    System.out.println("[LoggingAspect] --> Finished method: " + joinPoint.getSignature());
	    System.out.println("[LoggingAspect] --> Execution time: " + (end - start) + "ms");
	    System.out.println("------------------------------------------------------");

	    return result;
	}

}
