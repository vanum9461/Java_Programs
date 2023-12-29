//Using constructors
class Circle{
	double x,y;
	double r;
	
	double circumference(){
		return 2*3.1415*r;
	}
	
	double area(){
		return (22/7)*r*r;
	}
	//using this keyword
	Circle(double x,double y,double r){
	this.x=x;       
	this.y=y;
	this.r=r;
	}
	/*
	Circle(double a,double b,double c){
	x=a;       
	y=b;
	r=c;
	}
	*/
}
class circledemo3{
	public static void main(String args[]){
		Circle c1=new Circle(3.0,4.0,5.0);
		Circle c2=new Circle(-4.0,8.0,10.0);
		System.out.println("Circumference: "+c1.circumference());
		System.out.println("Area: "+c1.area());
		System.out.println("Circumference: "+c2.circumference());
		System.out.println("Area: "+c2.area());
	}
}