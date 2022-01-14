package ThreadCreations;

public class myThread extends Thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		myThread mt = new  myThread();
  		mt.start();
 	}

}
