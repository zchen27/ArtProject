import java.util.*;
import java.util.concurrent.*;
public class Core
{
	private volatile Register[] mars = new Register[8000];
	private ConcurrentNavigableMap<String, Runnable> pointers;
	
}
