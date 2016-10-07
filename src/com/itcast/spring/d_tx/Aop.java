package com.itcast.spring.d_tx;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
	
	private Logger log = Logger.getLogger(Aop.class);
	
	
	@Before(value="execution(* com.itcast.spring.d_tx.*DaoImpl.save*(..))")
	public void logSave(JoinPoint joinPoint){
		Object[] args = joinPoint.getArgs();
		String string =joinPoint.getTarget().toString();
		log.info(string.substring(string.lastIndexOf(".")+1, string.indexOf("@"))+"的"+joinPoint.getSignature().getName()+"方法正在保存"+args[0]);
	}
}
