package com.kh.polymorphism.model.child;

import com.kh.polymorphism.model.parent.Employee;

public class Secretary extends Employee {
	
	


public Secretary(String string, int i, String string2) {
	// TODO Auto-generated constructor stub
}

public Secretary() {
	
}

private String boss;

public String getBoss() {
	return boss;
}

public void setBoss(String boss) {
	this.boss = boss;
}

@Override
public String toString() {
	return "Secretary [boss=" + boss + "]";
}


}