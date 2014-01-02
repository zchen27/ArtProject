import java.util.*;

public class Microbe
{
	private int mutations;
	private boolean aerobic;
	private boolean chemo;
	private boolean photo;
	private boolean decomp;
	private boolean predator;
	private double efficiency;
	private double mutability;
	private double[] light =  new double[2];
	private double[] humidity = new double[2];
	private double[] heat = new double[2];
	private double[] pH = new double[2];
	private double[] radResist = new double[2];
	private double[] radMetabolize = new double[2];
	private ArrayList<Material> food;
	private ArrayList<Material> intolerant;
	
}
