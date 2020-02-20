package com.si.beans;

public class Television {
	private Channel channel;
	
	public void watchTv() {
		channel.tuneChannel();
		System.out.println("Watch TV Executed with Class:"+this.getClass().getCanonicalName());
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
}
