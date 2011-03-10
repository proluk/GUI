package pl.edu.pjwstk.s8267.GUI.Lab2;

public class Equation {
	//ax+by=c
	private int a, b, c;

	public Equation(int[] t1) {
		a = t1[0];
		b = t1[1];
		c = t1[2];
	}
	public String toString() {
		return (a!=0?(a!=1?a:"")+"x":"")+(b>0?"+":"")+(b!=0?(b!=1?b:"")+"y":"")+" = "+c;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
}
