package com.si.beans;

public class Television {
	private Channel channel;
	
	public void watchTv() {
		channel = new SonyChannelImpl();
		channel.tuneChannel();
	}
}
