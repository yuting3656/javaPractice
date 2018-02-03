package tw.leonchen.myproject.oop.thread;

class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//System.out.print(Thread.currentThread().getName() + " ");
			//System.out.println("i=" + i);
		}
	}
	
}

public class CallTestThreadEx1 {

	public static void main(String[] args) {
		MyThread test1 = new MyThread();
		
		Thread thread1 = new Thread(test1, "hero");
		Thread thread2 = new Thread(test1, "predator");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("finished");
	}

}
