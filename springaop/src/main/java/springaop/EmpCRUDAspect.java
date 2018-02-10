package springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmpCRUDAspect {

	/*
	 * @Pointcut("execution(* EmpManager.*(..))") public void k1() {
	 * System.out.println("Hello"); }
	 * 
	 * @Before("execution(* EmpManager.getId(..))")
	 * 
	 * @Before("k1()") public void logBeforev1(JoinPoint jpoint) {
	 * System.out.println("logBeforeV1 " + jpoint.getSignature().getName()); }
	 * 
	 * 
	 * @Before("k()") public void logBeforev2(JoinPoint jpoint) {
	 * System.out.println("logBeforeV2" + jpoint.getSignature().getName()); }
	 * 
	 * @After("k()") public void logAfterv1(JoinPoint jpoint) {
	 * System.out.println("logAfterV1" + jpoint.getSignature().getName()); }
	 * 
	 * @After("k1()") public void logAfterv1(JoinPoint jpoint) {
	 * System.out.println("logAfterV1" + jpoint.getSignature().getName()); }
	 */
	
	@AfterThrowing(pointcut = "execution(* EmpManager.*(..))", throwing = "error")
	public void myAdvice(JoinPoint jpoint, Throwable error) {
		System.out.println("method signature " + jpoint.getSignature());
		System.out.println("Exception is " + error);
		System.out.println("End of throwing advice...");
	}

	/*
	 * @Pointcut("execution(* EmpManager.*(..))") public void pointcut1() {
	 * System.out.println("Hello"); }
	 * 
	 * @Around("pointcut1()") public Object myAdvice(ProceedingJoinPoint pjp) throws
	 * Throwable {
	 * System.out.println("Additional concern Before calling actual method"); Object
	 * obj = pjp.proceed();
	 * System.out.println("Additional concern After calling actual method"); return
	 * obj; }
	 ****
	 * @AfterReturning(pointcut = "execution(* EmpManager.*(..))", returning =
	 * "result") public void myAdvice(JoinPoint jpoint, Object result) {
	 * System.out.println("Method Signature  " + jpoint.getSignature()); //
	 * System.out.println("Result in advance " + result); }
	 */
}
