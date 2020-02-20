package com.si.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.si.beans.Channel;
import com.si.beans.SonyChannelImpl;
import com.si.beans.Television;

public class SITest {
	public static void main(String[] args) {
		Channel channel;
		Television television = null;
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/si/common/application-context.xml"));
		channel = beanFactory.getBean("sony",SonyChannelImpl.class);
		television.watchTv();
		
	}
}
