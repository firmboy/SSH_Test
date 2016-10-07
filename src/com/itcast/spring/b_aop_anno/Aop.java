package com.itcast.spring.b_aop_anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //只是声明这个类是个切面类
@Component //把这个切面类方法哦IOC容器中
public class Aop {
	
	@Before(value="execution(* com.itcast.spring.b_aop_anno.*.*(..))")
	public void before(JoinPoint joinPoint){
		String string =joinPoint.getTarget().toString();
		System.out.println(string.substring(string.lastIndexOf(".")+1, string.indexOf("@"))+"的"+joinPoint.getSignature().getName()+"方法执行之前");
	}
}
