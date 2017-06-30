
package com.fannie.collections;

//bean

// public getters and setters

public class Park implements Comparable <Park> {

	private int parkId;

	private String parkName;

	private String parkLoc;

	@Override

	public boolean equals(Object obj) {

		// TODO Auto-generated method stub

		// return super.equals(obj);

		Park park = (Park) obj;

		if (

		this.parkId == park.parkId &&

				this.parkName.equals(park.parkName) &&

				this.parkLoc.equals(park.parkLoc)

		) {

			return true;

		} else {

			return false;

		}

	}

	@Override

	public int hashCode() {

		// TODO Auto-generated method stub

		return this.parkName.charAt(0);

	}

	public Park(int parkId, String parkName, String parkLoc) {

		super();

		this.parkId = parkId;

		this.parkName = parkName;

		this.parkLoc = parkLoc;

	}

	@Override

	public String toString() {

		return "Park [parkId=" + parkId + ", parkName=" + parkName + ", parkLoc=" + parkLoc + "]";

	}

	public int getParkId() {

		return parkId;

	}

	public void setParkId(int parkId) {

		this.parkId = parkId;

	}

	public String getParkName() {

		return parkName;

	}

	public void setParkName(String parkName) {

		this.parkName = parkName;

	}

	public String getParkLoc() {

		return parkLoc;

	}

	public void setParkLoc(String parkLoc) {

		this.parkLoc = parkLoc;

	}

	@Override
	public int compareTo(Park o) {
	
		return this.parkId - o.getParkId();
}
}

