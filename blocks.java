package block;

public class blocks {
	public void logic()
	{
		try
		{
			int a=23/7;
			System.out.println(a);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
blocks b=new blocks();
b.logic();
	}

}
