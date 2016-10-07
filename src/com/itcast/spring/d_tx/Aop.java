package com.itcast.spring.d_tx;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
	
	@Before(value="execution(* com.itcast.spring.d_tx.*.*(..))")
	public void log(JoinPoint joinPoint){
		String string =joinPoint.getTarget().toString();
		System.out.println(string.substring(string.lastIndexOf(".")+1, string.indexOf("@"))+"的"+joinPoint.getSignature().getName()+"方法执行之前");
	}
}
