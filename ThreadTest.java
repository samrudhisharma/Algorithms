
public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new A().start();
		new B().start();
		new C().start();

	}

}

class A extends Thread
{
	public void run()
	{
		System.out.println("AAA");
	}
}

class B extends Thread
{
	public void run()
	{
		System.out.println("BBB");
	}
}

class C extends Thread
{
	public void run()
	{
		System.out.println("CCC");
	}
}