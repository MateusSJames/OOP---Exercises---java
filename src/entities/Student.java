package entities;

public class Student {

	public String name;
	public double nota;
	public double nota3;
	public double nota2;

	public double sum() {
		return nota + nota2 + nota3;
	}
	
	public double grade() {
		if(sum() <= 60.0) {
			return (60.0 - sum());
		}
		else {
			return 0.0;
		}
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", sum());
	}
}
