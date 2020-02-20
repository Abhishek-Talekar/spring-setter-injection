package com.si.beans;

public class SonyChannelImpl implements Channel {
	private int channelNumber;

	@Override
	public void tuneChannel() {
		System.out.println("You are watching Sony TV..\nChannel Number:"+channelNumber);
	}

	public void setChannelNumber(int channelNumber) {
		this.channelNumber = channelNumber;
	}
	@Override
	public String toString() {
		return "SonyChannelImpl [channelNumber=" + channelNumber + "]";
	}

}
