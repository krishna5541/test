package project_test;

public class Circle extends Shape2D {
	private static final double PI = 3.14d;
	private double radius;
	public Circle(double r)
	{
		super(PI*r*r, 2*PI*r);
		this.radius = r;
	}
	public Circle()
	{
		this.radius = 0;
	}
	//protectors
	public boolean setArea(double Temp) {System.out.println("Not allowed bro...");return false;}
	public boolean setPeri(double Temp) {System.out.println("Not allowed bro...");return false;}
	
	//(s,g)ettes
	public boolean setRadius(double Temp) 
	{
		this.radius = Temp;
		super.setArea(PI*this.radius*this.radius);
		super.setPeri(2*PI*this.radius);
		return true;
	}
	public double getRadius() {return this.radius;}

}
