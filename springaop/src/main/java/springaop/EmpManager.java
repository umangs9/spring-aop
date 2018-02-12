package springaop;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class EmpManager {

	public void validate(int age) throws Exception {
		if (age < 18) {
			throw new ArithmeticException("Not Valid age");
		} else {
			System.out.println("Thanks for vote");
		}
	}

	public int m() {
		System.out.println("m() method invoked");
		return 2;
	}

	public int k() {
		System.out.println("k() method invoked");
		return 3;
	}

	public EmpModel getId(Integer empId) {
		System.out.println("Method getId() called");
		return new EmpModel();
	}

	public EmpModel getId2(Integer empId2) {
		System.out.println("Method getId2() called");
		return new EmpModel();
	}

	public List<EmpModel> getAllEmp() {
		System.out.println("Method getAllEmp() called");
		return new ArrayList<EmpModel>();
	}

	public void createEmp(EmpModel emp) {
		System.out.println("Method createEmp() called");
	}

	public void deleteEmp(EmpModel emp) {
		System.out.println("Method deleteEmp() called");
	}

	public void updateEmp(EmpModel emp) {
		System.out.println("Method updateEmp() called");
	}
}
