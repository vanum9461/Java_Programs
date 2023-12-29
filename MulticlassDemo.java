class Circle{
	double x,y;
	double r;
	
	double circumference(){
		return 2*3.1415*r;
	}
	
	double area(){
		return (22/7)*r*r;
	}
}
class Box{
	double w,h,d;
	double area(){
		double a;
		a=(w*h+h*d+w*d)*2;
		return a;
	}
	double volume(){
		double v;
		v=w*h*d;
		return v;
	}
}
class MulticlassDemo{
	public static void main(String args[]){
		Circle c=new Circle();
		Box b=new Box();
		c.x=3.0;c.y=4.0;c.r=5.0;
		b.w=3.0;b.h=4.0;b.d=5.0;
		System.out.println("Circumference Circle: "+c.circumference());
		System.out.println("Area Circle: "+c.area());
		System.out.println("Volume box: "+b.volume());
		System.out.println("Area box: "+b.area());
	}
}