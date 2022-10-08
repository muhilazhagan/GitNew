package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAdvices {

	@Before(value = "execution(public * com.example.demo.MyController.*(..))")
	public void test() {
		System.out.println("AOP Before");
	}

	@After(value = "execution(public * com.example.demo.MyController.*(..))")
	public void aftercall() {
		System.out.println("AOP After");
	}

	@Around(value = "execution(public * com.example.demo.MyController.*(..))")
	public void aroundCall(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("AOP around startup");

		long start = System.nanoTime();
		Object retval = pjp.proceed();
		long end = System.nanoTime();
		String methodName = pjp.getSignature().getName();
		System.out.println("Execution of " + methodName + " Start time " + start + " End Time " + end + " ms");
		System.out.println("AOP around end");
	}

	@After("testpc()")
	public void log() {

		System.out.println("AOP after Pointcut");
	}

	@Pointcut("execution(public * com.example.demo.MyController.*(..))")
	public void testpc() {
		System.out.println("Point cut expression");
	}
}
