package com.bankTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.Atm;

public class testBank {
	
	ApplicationContext container = new ClassPathXmlApplicationContext("demoConfig.xml");
	Atm calc = (Atm) container.getBean("atm");

}
