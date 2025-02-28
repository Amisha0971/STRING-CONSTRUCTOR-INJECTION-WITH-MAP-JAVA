package Main;

import org.codehaus.groovy.tools.groovydoc.ClasspathResourceManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Model.Question;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Question q=(Question)context.getBean("q");  
	    q.displayInfo();  

	}

}
