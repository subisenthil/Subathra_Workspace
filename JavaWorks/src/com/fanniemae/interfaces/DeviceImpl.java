package com.fanniemae.interfaces;

import java.util.Arrays;

public class DeviceImpl {
	
	public static void main(String[] args) {
		Devices[] devs = new Devices[]{
			new Devices(101,"laptop"),
			new Devices(44,"monitor"),
			new Devices(456,"mobile"),
			new Devices(101,"projector")
		};
		
		for (Devices temp: devs){
			System.out.println(temp.getDeviceId() + "," + temp.getDeviceName());
		}
		System.out.println("__________________________");
		Arrays.sort(devs);
		
		for(Devices temp : devs){
			System.out.println(temp.getDeviceId() + "," + temp.getDeviceName());
		}
	}

}
