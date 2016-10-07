package com.itcast.spring.a_aop_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class Aop {
	public void before(JoinPoint joinPoint){
		String string =joinPoint.getTarget().toString();
		//System.out.println(string.substring(0, string.indexOf("@")));
		//System.out.println(string.substring(0, string.indexOf("@"))+"的"+joinPoint.getSignature().getName()+"方法执行之前");
		System.out.println(string.substring(string.lastIndexOf(".")+1, string.indexOf("@"))+"的"+joinPoint.getSignature().getName()+"方法执行之前");
	}
	
	/*
	 * com.itcast.spring.a_aop_xml.UserService
	1025
	save
	interface com.itcast.spring.a_aop_xml.UserService*/
	public void before2(JoinPoint joinPoint){
		Signature signature = joinPoint.getSignature();
		System.out.println(signature.getDeclaringTypeName());
		System.out.println(signature.getModifiers());
		System.out.println(signature.getName());
		System.out.println(signature.getDeclaringType());
		System.out.println(signature.getName()+"方法执行之前");
	}
	
	/*
	method-execution
	com.itcast.spring.a_aop_xml.UserServiceImpl@b86609
	com.itcast.spring.a_aop_xml.UserServiceImpl@b86609
	[Ljava.lang.Object;@32f90a
	class org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint
	void com.itcast.spring.a_aop_xml.UserService.save()
	org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint$SourceLocationImpl@805ebb
	execution(void com.itcast.spring.a_aop_xml.UserService.save())*/
	public void before1(JoinPoint joinPoint){
		System.out.println(joinPoint.getKind());
		System.out.println(joinPoint.getTarget());
		System.out.println(joinPoint.getThis());
		System.out.println(joinPoint.getArgs());
		System.out.println(joinPoint.getClass());
		System.out.println(joinPoint.getSignature());
		System.out.println(joinPoint.getSourceLocation());
		System.out.println(joinPoint.getStaticPart());
		System.out.println("方法执行之前");
	}
	
	
	
}
