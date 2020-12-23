package project_test;

public  class Shape2D
{
	private double area, perimeter;

	//Constructors()
	public Shape2D(double aTemp , double pTemp) 
	{
		System.out.println("Shape2D(double, double) called");
		this.area = aTemp;
		this.perimeter = pTemp;
	}
	public Shape2D()
	{
		System.out.println("Shape2D() called");
		this.area=0;
		this.perimeter = 0;
	}
	
	//setters()
	public boolean setArea(double Temp) {this.area = Temp;return true;}
	public boolean setPeri(double Temp) {this.perimeter = Temp;return true;}
	
	//getters()
	public double getArea() {return this.area;}
	public double getPeri() {return this.perimeter;}
}
