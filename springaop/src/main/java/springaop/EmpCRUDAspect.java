package springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmpCRUDAspect {

	@Pointcut("execution(* EmpManager.*(..))")
	public void k() {
		System.out.println("Hello");
	}// pointcut name

	// @Before("execution(* EmpManager.getId(..))")
	/*
	 * @Before("k()") public void logBeforev1(JoinPoint jpoint) {
	 * System.out.println("logBeforeV1 " + jpoint.getSignature().getName()); }
	 * 
	 * @Before("k()") public void logBeforev2(JoinPoint jpoint) {
	 * System.out.println("logBeforeV2" + jpoint.getSignature().getName()); }
	 * 
	 * @After("k()") public void logAfterv1(JoinPoint jpoint) {
	 * System.out.println("logAfterV1" + jpoint.getSignature().getName()); }
	 */
	@After("k()")
	public void logAfterv1(JoinPoint jpoint) {
		System.out.println("logAfterV1" + jpoint.getSignature().getName());
	}

	@AfterReturning(pointcut = "execution(* EmpManager.*(..))", returning = "result")
	public void myAdvice(JoinPoint jpoint, Object result) {
		System.out.println("Additional concern");
		System.out.println("Method Signature  " + jpoint.getSignature());
		System.out.println("Result in advance " + result);
		System.out.println("End of afterReturningAdvice");
	}
}
