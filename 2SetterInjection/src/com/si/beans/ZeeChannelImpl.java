package com.si.beans;

public class ZeeChannelImpl implements Channel {

	private int channelNumber;

	@Override
	public void tuneChannel() {
		System.out.println("You are watching Zee TV..\nChannel Number:" + channelNumber);
	}

	public void setChannelNumber(int channelNumber) {
		this.channelNumber = channelNumber;
	}

	@Override
	public String toString() {
		return "SonyChannelImpl [channelNumber=" + channelNumber + "]";
	}

}
