import java.util.*;
import java.util.concurrent.*;
public class Core
{
	private class Pointer implements Runnable
	{
		private int location;
		@Override
		public void run()
		{
			throw new UnsupportedOperationException("Not supported yet.");
		}
		
		public void execute() throws UnsupportedOperationException
		{
			Register register = mars[location];
		}
		
		public void increment()
		{
			location++;
		}
		
		public void jump(int distance)
		{
			location += distance;
		}
	}
	
	private volatile Register[] mars = new Register[8000];
	private ConcurrentNavigableMap<String, Runnable> pointers;
	
}
