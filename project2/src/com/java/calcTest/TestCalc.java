package com.java.calcTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.calc.CalculatorInterface;

public class TestCalc {
	
	@Test
	public void test(){
		 //read XML and start creating bean
		ApplicationContext container = new ClassPathXmlApplicationContext("demoConfig.xml");
		// Get the bean 
		CalculatorInterface calc = (CalculatorInterface) container.getBean("calc");
		System.out.println(calc.add(15,12));
		System.out.println(calc.subtract(15,12));
		
	}

}