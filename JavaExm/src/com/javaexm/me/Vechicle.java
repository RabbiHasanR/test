package com.javaexm.me;

public class Vechicle {
	public String vechicleName;
	public String vechicleId;
	public int vechicleChesisNo;

	public Vechicle(String vechicleName, String vechicleId, int vechicleChesisNo) {
		this.vechicleName = vechicleName;
		this.vechicleId = vechicleId;
		this.vechicleChesisNo = vechicleChesisNo;
	}

	public void display() {
		System.out.println(vechicleName + " " + vechicleId + " " + vechicleChesisNo);
	}

}
