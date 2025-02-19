//DependencyInjection Test.java (Client App)
package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	

public static void main(String[] args) {
//create the IOC container
AnnotationConfigApplicationContext ctx=
new AnnotationConfigApplicationContext(AppConfig.class);
/* //get Target spring bean class obj from the container
Object objectx.getBean("wmg"); //here obj (Object class ref variable) is refering Wish MessageGenerator class obj
//type casting to WishMessageGernator class
WishMessageGenerator generator=(WishMessageGenerator)obj; */
//get Target spring bean class obj from the container
WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);  // getBean(-,-)with generics
// invoke b.method
String resultMsg=generator.showWishMessage("raja");
System.out.println(resultMsg);
//close the container
ctx.close();
}
}

