package springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/springaop/applicationContext.xml");
		EmpManager manager = (EmpManager) context.getBean("opBean");
		/*
		 * manager.getId(1); manager.createEmp(new EmpModel());
		 */
		//System.out.println("calling m...");  
        manager.m();  
        //System.out.println("calling k...");  
        manager.k();  
	}
}
