package com.fanniemae.interfaces;

//if  a class as private variables and public getters and setters then it is called java bean
public class Devices implements Comparable<Devices> {
	private int deviceId;
	private String deviceName;
	public Devices(int deviceId, String deviceName) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
	}
	public int getDeviceId() {
		return deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	@Override
	public int compareTo(Devices o) {
		// TODO Auto-generated method stub
		//return  o.deviceId - this.deviceId;
		return this.deviceName.compareTo(o.deviceName);
	}
	

}
		