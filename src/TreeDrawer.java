import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
//import java.util.*;
import javax.swing.*;

public class TreeDrawer implements ActionListener
{
	private int treeStep;
	private static final double MIN_RATIO = 1.41;
	private static final double MAX_RATIO = 3;
	private static final int MAX_STEP = 500;
	private static final int MAX_STAGE = 10;
	private static final double ANGLE = Math.PI/3;
	private static int L = 250;
	private static int W = 20;
	private double ratio = MIN_RATIO;

	
	private Timer timer;
	
	TreeDrawer()
	{
		//this.timer = new Timer(100, this);
		treeStep = 0;
		//timer.start();
		JFrame frame = new TreeFrame();
		frame.setBackground(Color.yellow);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		//changeRatio();
		
		//if(treeStep < MAX_STEP)
		{
			//treeStep++;
		}
	}
	
	public class TreeFrame extends JFrame
	{
		@Override
		public void paint(Graphics g)
		{
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.green);
			
			g2d.translate(250, -500);
			drawBranch(g2d, L, W);
			g2d.translate(0, -L);
			drawBranches(g2d, 1);
			g2d.translate(0, L);
			g2d.translate(-250, 500);
		}
		
		private void drawBranches(Graphics2D g, double stage)
		{
			double currentRatio = Math.pow(ratio, stage);
			double newLength = (double) L / currentRatio;
			double newWidth = (double) W / currentRatio;
			
			if(newLength < 3 || stage > 10)
			{
				return;
			}
			
			g.rotate(ANGLE);
			drawBranch(g, newLength, newWidth);
			g.translate(0, -newLength);
			drawBranches(g, stage + 1);
			g.translate(0, newLength);
			g.rotate(-ANGLE);
			
			g.rotate(-ANGLE);
			drawBranch(g, newLength, newWidth);
			g.translate(0, -newLength);
			drawBranches(g, stage + 1);
			g.translate(0, newLength);
			g.rotate(ANGLE);
			
		}
		
		private void drawBranch(Graphics2D g, double l, double w)
		{
			g.setStroke(new BasicStroke((float) Math.floor(w)));
			g.draw(new Line2D.Double(0, 0, 0, -l));
		}
		
	}
	
	/*private void changeRatio()
	{
		ratio = (1 - treeStep) * (MAX_RATIO - MIN_RATIO) + MIN_RATIO;
	}*/
	
	public static void main(String[] args)
	{
		TreeDrawer t = new TreeDrawer();
	}
}
