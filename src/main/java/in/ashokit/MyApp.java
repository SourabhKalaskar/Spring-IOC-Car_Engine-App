package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Car c = context.getBean(Car.class);

		c.drive();

		((ClassPathXmlApplicationContext) context).close();

	}

}
