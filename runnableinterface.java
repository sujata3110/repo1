class Thread1 implements Runnable
{
 	public void run()
{
System.out.println("This Frist thread is cerated using interface....");
    }
}
class Thread2 implements Runnable
{
 	public void run()
{
System.out.println("This Second thread is cerated using interface....");
    }
}

class Test
{
 public static void main(String args[])
{
      Thread1 t1=new Thread1();
	Thread t2=new Thread(t1);
	t2.start();
	Thread2 t3=new Thread2();
	Thread t4=new Thread(t3);
	t4.start();

        }
}