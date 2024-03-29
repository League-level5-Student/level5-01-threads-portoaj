package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;
	Worker(ConcurrentLinkedQueue<Task> _taskQueue)
	{
		taskQueue = _taskQueue;
	}
	@Override
	public void run() {
		while(taskQueue.size() > 0)
		{
			taskQueue.poll().perform();
		}
	}


}
