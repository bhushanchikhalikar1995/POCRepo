package consumer;

public class Test {

	public static void main(String[] args) {
		
		Test t = new Test();
		Bank b = t.createBankObject("SBI");
		b.startloanProcess();
		
	}
	
	Bank createBankObject(String name)
	{
		Bank b = null;
		if(name.equals("SBI"))
		{
			b=new Sbi();
			
		}
		return b;
	}
}
