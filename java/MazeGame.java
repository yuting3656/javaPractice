package tw.leonchen.myproject.oop.thread;

class Maze {
	private int x = 0, y = 0;

	public void move(int x, int y) {
		synchronized (this) {
			this.x = x;
			this.y = y;
			System.out.println("x:" + x + " y:" + y);
			this.notify();
		}
	}

	public void checkExit() {
		synchronized (this) {
			try {
				this.wait();

				if (x == 0 && y == 0) {
					System.out.println("i will survive.");
					System.exit(-1);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class Hero implements Runnable {

	private Maze core;

	public Hero(Maze core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			int x = (int) (Math.random() * 5);
			int y = (int) (Math.random() * 5);
			try {
				Thread.sleep((int) (Math.random() * 800) + 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			core.move(x, y);
		}
	}

}

class MazeCheck implements Runnable {

	private Maze core;

	public MazeCheck(Maze core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			
			core.checkExit();
			
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class MazeGame {

	public static void main(String[] args) {
		Maze core = new Maze();

		Hero poseidon = new Hero(core);
		Thread thread1 = new Thread(poseidon);
		thread1.start();
		
		MazeCheck check = new MazeCheck(core);
		Thread thread2 = new Thread(check);
		thread2.start();
	}

}
