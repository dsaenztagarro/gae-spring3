package com.davlanca.pets.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	private static final Logger log = Logger.getLogger(LoggingAspect.class.getName());
	
	/**
	   * A join point is in the web layer if the method is defined
	   * in a type in the com.xyz.someapp.web package or any sub-package
	   * under that.
	   */
	  @Pointcut("execution(* com.davlanca..*.*(..))")
	  public void logControllerLayer(JoinPoint jp) {
		  System.out.println("logControllerLayer");
		  log.info("log-controller-layer");
		  log.warning("log-controller-layer");
		  log.severe("log-controller-layer");
	  }

	  /**
	   * A join point is in the service layer if the method is defined
	   * in a type in the com.xyz.someapp.service package or any sub-package
	   * under that.
	   */
	  @Pointcut("execution(* com.davlanca.pets.service.*.*(..))")
	  public void logServiceLayer() {
		  System.out.println("logServiceLayer");
		  log.info("log-service-layer");
		  log.warning("log-service-layer");
		  log.severe("log-service-layer");
	  }

}
