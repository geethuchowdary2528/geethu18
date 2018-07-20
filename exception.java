package block;

public class exception {
	public void logic()
	{
		try
		{
			System.out.println("!");
			int a=16/0;
			System.out.println("1");
			System.out.println("2");
		}
		catch(ArithmeticException ae)
		{
		
			System.out.println("3");
			System.out.println("4");
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
exception e=new exception();
e.logic();

	}

}
