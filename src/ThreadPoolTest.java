import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(
				new Runnable() {
					
					@Override
					public void run() {
						while(true) {
							System.out.println(new Date());
						}
					}
				});
	}

}
