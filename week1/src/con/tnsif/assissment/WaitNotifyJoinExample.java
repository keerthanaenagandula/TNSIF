package con.tnsif.assissment;


	class SharedResource {
	    private boolean isReady = false;

	    // Method for waiting thread
	    public synchronized void waitForSignal() {
	        System.out.println(Thread.currentThread().getName() + " is waiting for signal...");
	        try {
	            while (!isReady) {
	                wait(); // waits until notified
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println(Thread.currentThread().getName() + " received the signal and is resuming work!");
	    }

	    // Method for notifying thread
	    public synchronized void sendSignal() {
	        System.out.println(Thread.currentThread().getName() + " is sending the signal...");
	        isReady = true;
	        notify(); // wakes up one waiting thread
	    }
	}

	public class WaitNotifyJoinExample {
	    public static void main(String[] args) {

	        SharedResource resource = new SharedResource();

	        // Thread 1 - waiting thread
	        Thread t1 = new Thread(() -> {
	            resource.waitForSignal();
	        }, "Thread-1");

	        // Thread 2 - notifying thread
	        Thread t2 = new Thread(() -> {
	            try {
	                Thread.sleep(2000); // Delay before sending signal
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            resource.sendSignal();
	        }, "Thread-2");

	        // Start threads
	        t1.start();
	        t2.start();

	        // Use join to wait for both threads to finish
	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Main thread ends after both threads finish.");
	    }
	}



