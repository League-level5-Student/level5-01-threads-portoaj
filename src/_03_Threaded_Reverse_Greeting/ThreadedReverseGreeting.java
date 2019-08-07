package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	/* HINT: You will most likely need to do this with recursion */
	public static void main(String[] args) {
		Thread start = new Thread(() -> recurse(1));
		start.run();
	}
	public static void recurse(int count)
	{
		int test  = count + 1;
		if(count > 50)
			return;
		Thread newt = new Thread(() -> recurse(test));
		newt.start();
		try {
			newt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("This is thread: " + count);
		}

	}
}
