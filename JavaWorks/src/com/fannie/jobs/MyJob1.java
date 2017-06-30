package com.fannie.jobs;

import java.util.ArrayList;
import java.util.List;

public class MyJob1 {

	public boolean insertEmp(int val) {
		if (val == 1) {
			return true;
		} else {
			return false;
		}
	}

	public int getNumberOfEmps() {
		// assume it will come DB
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 5;

	}

	public List<String> getMyEmps(){
	return new ArrayList<>();
}
}
