package B;

class CShape
{
	public double area()
	{
		return 0.0;
	}
}

class CCircle extends CShape
{
	double radius;
	public CCircle(double r)
	{
		radius = r;
	}
	public double area()
	{
		return (3.14*radius*radius);
	}
}

class CSquare extends CShape
{
	double side;
	public CSquare(double s)
	{
		side = s;
	}
	public double area()
	{
		return(side*side);
	}
}

class CTrangle extends CShape
{
	double base,height;
	public CTrangle(double b ,double h)
	{
		base = b;
		height = h;
	}
	public double area()
	{
		return(base*height/2);
	}
}

public class class11 {
	public static void main(String args[])
	{
		CCircle cir1 = new CCircle(2.0);
		CCircle cir2= new CCircle(3.0);
		CSquare csp1= new CSquare(2.0);
		CSquare csp2= new CSquare(3.0);
		CTrangle ctr1= new CTrangle(2,5);
		CTrangle ctr2= new CTrangle(2,6);
		double a[]=new double[6];
		
		System.out.println("circle(2.0)="+cir1.area());
		System.out.println("circle(3.0)="+cir2.area());
		System.out.println("square(2.0)="+csp1.area());
		System.out.println("square=(3.0)"+csp2.area());
		System.out.println("trangle(2,5)="+ctr1.area());
		System.out.println("trangle=(2,6)"+ctr2.area());
		
		a[0]=cir1.area(); 
		a[1]=cir2.area(); 
		a[2]=csp1.area(); 
		a[3]=csp2.area(); 
		a[4]=ctr1.area(); 
		a[5]=ctr2.area(); 
		System.out.println("The largest area is "+largest(a));
	}
	public static double largest(double a[])
	{
		double max=a[0];
		for (int i=0; i<a.length; i++)
			if(max<a[i])
				max=a[i];
		return max;
	}

}
