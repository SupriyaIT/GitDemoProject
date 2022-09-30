package seleniumClassTest;

public class exceptionTest {

	
	public static void main(String[] args) 
	{
		int i=10,j=0;
		int k;
		
		try                              //risky code
		{
			System.out.println("inside try 1 before rosky code");
			k=i/j;
			System.out.println("inside try 2 after risky code");
		}
		catch(Exception e)                //exception handling mechanism
		{
			System.out.println("inside cath");
		}
		finally                           //real time block,to handle the resources
		{
			System.out.println("inside finally block");
		}

	}

}
