package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import metier.IMetier;

public class SpringPres {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		IMetier metier = ctx.getBean(IMetier.class);
		System.out.println(metier.calcul());
	}
}
