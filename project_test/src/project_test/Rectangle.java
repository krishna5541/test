package project_test;

public class Rectangle extends Shape2D {
	private double height, width;
	
	//constructors
	public Rectangle(double h, double w)
	{
		super(w*h,2*(w+h));
		this.height = h;
		this.width = w;
	}
	public Rectangle()
	{
		this.height = 0;
		this.width = 0;
	}
	
	//protectors
	public boolean setArea(double Temp) {System.out.println("Not allowed bro...");return false;}
	public boolean setPeri(double Temp) {System.out.println("Not allowed bro...");return false;}
	
	//setters
	public boolean setHeight(double hTemp) 
	{
		this.height = hTemp;
		super.setArea(this.height * this.width);
		super.setPeri(2*(this.height+this.width));
		return true;
	}
	public boolean setWidth(double wTemp) 
	{
		this.width = wTemp;
		super.setArea(this.height * this.width);
		super.setPeri(2*(this.height+this.width));
		return true;
	}
	
	//getters
	public double getHeight() {return this.height;}
	public double getWidth() {return this.width;}
}
