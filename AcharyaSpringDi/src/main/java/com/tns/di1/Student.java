package com.tns.di1;

public class Student {
 private MathCheat chit;

public MathCheat getChit() {
	return chit;
}

public void setChit(MathCheat chit) {
	this.chit = chit;
}

public void cheating() {
	chit.mathCheat();
}
}
