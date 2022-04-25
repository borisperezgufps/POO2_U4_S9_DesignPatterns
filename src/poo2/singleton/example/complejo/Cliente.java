package poo2.singleton.example.complejo;

public class Cliente {

	public static void main(String[] args) {
		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		threadFoo.start();
		threadBar.start();
		
	}

	static class ThreadFoo implements Runnable {
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("FOO");
			System.out.println(singleton.getValue());
		}
	}

	static class ThreadBar implements Runnable {
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("BAR");
			System.out.println(singleton.getValue());
		}
	}

}
