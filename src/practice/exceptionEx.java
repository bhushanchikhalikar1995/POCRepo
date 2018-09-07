package practice;

public class exceptionEx {

	public void tempMethod() throws Exception
	{
		int no=10/0;
		System.out.println("No :"+no);
	}
	
	public static void main(String[] args)  {
		
		exceptionEx e =new exceptionEx();
		try {
			e.tempMethod();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally
		{
			System.out.println("Hi");
		}
		
		
	}
}
