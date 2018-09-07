
public class threadEx extends Thread {

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	public static void main(String[]args)
	{
		threadEx t1 =new threadEx();
		threadEx t2 =new threadEx();
		threadEx t3 =new threadEx();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
	}
	
}
