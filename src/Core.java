import java.util.*;
import java.util.concurrent.*;
public class Core
{
	private class Pointer implements Runnable
	{
		private int location;
		private boolean alive = true;;
		@Override
		public void run()
		{
			while (alive)
			{
				
			}
		}
		
		public void execute() throws UnsupportedOperationException
		{
			Register register = mars[location];
			if(register == null)
			{
				alive = false;
			}
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
