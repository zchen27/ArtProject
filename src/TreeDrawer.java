import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TreeDrawer implements MouseListener
{
	private ArrayList<Branch> branches = new ArrayList();
	public final int xi = 250;
	public final int li = 128;
	
	public class Branch
	{
		public final int x0;
		public final int y0;
		public final int xf;
		public final int yf;
		public final int length;
		public final double angle;
		public final Color color;
		
		Branch(int xstart, int ystart, int l, double theta, Color c)
		{
			x0 = xstart;
			y0 = ystart;
			length = l;
			angle = theta;
			color = c;
			xf = x0 + (int)(length * Math.cos(theta));
			yf = y0 + (int)(length * Math.sin(theta));
		}
	}
	
	TreeDrawer(Color color)
	{
		branches.add(new Branch(xi, 0, li, 0, color));
	}
	
	public class TreePanel extends JPanel
	{
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponents(g);
		}
	}
	
	private void generateBranches(int x0, int y0, int length, double theta, Color color)
	{
		Branch currentBranch0 = new Branch(x0, y0, length, Math.PI - theta, color);
		Branch currentBranch1 = new Branch(x0, y0, length, Math.PI + theta, color);
		branches.add(currentBranch0);
		branches.add(currentBranch1);
		Color nextColor = color.darker();
		
		if(length > 1)
		{
			generateBranches(currentBranch0.xf, currentBranch0.yf, length/2, theta, nextColor);
			generateBranches(currentBranch1.xf, currentBranch1.yf, length/2, theta, nextColor);
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e)
	{
		int x = e.getXOnScreen();
		int y = e.getYOnScreen();
		double theta = Math.atan2(y, x);
		Branch branch0 = branches.get(0);
		int x0 = branch0.xf;
		int y0 = branch0.yf;
		Color color = branch0.color.darker();
		generateBranches(x0, y0, branch0.length / 2, theta, color);
		
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		
	}
}
