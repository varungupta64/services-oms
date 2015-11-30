package com.exclusively.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	private static Logger logger = Logger.getLogger(LoggingAspect.class.getName());

	@Pointcut("execution(* com.exclusively.oms.controllers.SuborderController.* (..))")
	private void logMethods() {}
	
	@Around("logMethods()")
	private Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		logger.debug("Start Method : "+proceedingJoinPoint.getSignature().getName());
		logger.info("Start Method : "+proceedingJoinPoint.getSignature().getName());
		Object result = proceedingJoinPoint.proceed();
		logger.debug("Exit Method : "+proceedingJoinPoint.getSignature().getName());
		logger.info("Exit Method : "+proceedingJoinPoint.getSignature().getName());
		return result;
	}
}
