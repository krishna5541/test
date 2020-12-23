package project_test;

public class Triangle extends Shape2D 
{
	private double a, b, c;
	public Triangle(double a,double b, double c)
	{
		double s = (a+b+c)/2;
		double aTemp = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		super.setArea(aTemp);
		super.setPeri(a+b+c);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Triangle()
	{
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	//protectors
	public boolean setArea(double Temp) {System.out.println("Not allowed bro...");return false;}
	public boolean setPeri(double Temp) {System.out.println("Not allowed bro...");return false;}
	
	//(s,g)ettes
	public boolean setSides(double a, double b, double c) 
	{
		double s = (a+b+c)/2;
		double aTemp = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		this.a = a;
		this.b = b;
		this.c = c;
		super.setArea(aTemp);
		super.setPeri(a+b+c);
		return true;
	}
	public double[] getSides() {double[] ret = {this.a,this.b,this.c};return ret;}

}
