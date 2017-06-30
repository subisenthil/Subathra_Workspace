package com.fannie1;

//when you extend from exception class then it is eligible to be thrwable
public class FannieException extends Exception {

	private String msg;

	public FannieException() {
		this.msg = "FanniMae Exception called without msg";
	}

	public FannieException(String msg){
	 this.msg = msg;	
		}

	@Override
	public String toString() {
		return "FannieException [msg=" + msg + "]";
	}	
	@Override
	public String getMessage() {
		return ":::::::" + msg;
	}
	
}
