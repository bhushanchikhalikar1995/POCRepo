package practice;


class NumberNotInRange extends Exception
{
	public NumberNotInRange(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
	
}

public class userDefinedException {

	public static void validate(int num) throws NumberNotInRange{
		// TODO Auto-generated method stub
	
		if(num < 0 || num >100)
		{
			throw new NumberNotInRange("Invalid");
		}
		else
		{
			System.out.println("Correct No");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=Integer.parseInt(args[0]);

		try {
			validate(num);
		} catch (NumberNotInRange e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
