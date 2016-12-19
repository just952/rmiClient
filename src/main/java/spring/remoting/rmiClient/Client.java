package spring.remoting.rmiClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.remoting.data.Result;

public class Client 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
		Calculation calculation = (Calculation)context.getBean("calculationBean");
		
		Result re = calculation.cube(9);
		System.out.println(re.getName());
		System.out.println(re.getResult());
	}
}
