import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello,world!");
		ByteChannel b = new ByteChannel() {
			
			@Override
			public int write(ByteBuffer src) throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean isOpen() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void close() throws IOException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int read(ByteBuffer dst) throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
