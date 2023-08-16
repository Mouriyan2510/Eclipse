package com.one.interfaceabstract;

public class MTC extends Bus{
	public int fare(int dis) {
		return 3*dis;
	}
	public String board() {
		return "Government";
	}
	public float timing(int dis) {
		return dis/70;
	}

}
