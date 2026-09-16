
public class MyThread extends Thread {
		
		 @Override
		public void run() {
			//System.out.println("In Run()");
			Thread c = Thread.currentThread();
			for(int i=1; i<=5; i++) {
			System.out.println(i + " "+ c.getName());
			}
			//System.out.println(c.getPriority());
		}
		 
		 public static void main(String[] args) {
			 MyThread t = new MyThread();
			 t.setName("Hello");
			 //t.setPriority(Thread.MAX_PRIORITY);
			 t.start();
			 
			 
			 MyThread t1 = new MyThread();
			 t1.setName("Hii");
			 //t.setPriority(Thread.MAX_PRIORITY);
			 t1.start();
			 
			 System.out.println(Thread.currentThread().getName());
		 }

}
