package B;

class Caaa
{
	private int num;
	
	 public void display()
	 {
		 System.out.println("print from Caaa class");
	 }
}

class Cbbb extends Caaa
{
	public void display()
	{
		System.out.println("print from Cbbb class");
	}
}

public class class09 {
	public static void main(String args[])
	{
		Caaa b = new Cbbb();
		b.display();
	}

}
