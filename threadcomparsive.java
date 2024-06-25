class Thread1 extends Thread
{
 	public void run()
{
System.out.println("First Thread started....");
    }
}
class Thread2 extends Thread
{
 	public void run()
{
System.out.println("Second Thread started....");
    }
}

class Test
{
 public static void main(String args[])
{
      Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	t1.run();
	t2.run();

        }
}