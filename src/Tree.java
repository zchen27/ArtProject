import java.awt.Color;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Tree implements ActionListener
{
	private final Timer timer;
	private int frameCount;
	private double d;
	private JFrame frame;
	private JPanel panel;
	private Color[] colors = new Color[10];
	private Color[] sky = new Color[30];
	int n = 0;
	
	public class FractalTree extends JPanel
	{
		public FractalTree()
		{
			setBounds(100, 100, 800, 600);
		}
 
		private void drawTree(Graphics g, int x1, int y1, double angle, int depth, double remainder)
		{
			if (depth <= 0 || d > 10)
			{
				return;
			}

			int strokeSize = depth;
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(colors[9 - (depth - 1)]);
			g2.setStroke(new BasicStroke(strokeSize));
			int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * remainder * 10.0);
			int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * remainder * 10.0);
			g2.drawLine(x1, y1, x2, y2);
			drawTree(g, x2, y2, angle - 20, depth - 1, remainder);
			drawTree(g, x2, y2, angle + 20, depth - 1, remainder);
		}
 
		@Override
		public void paint(Graphics g)
		{
			super.paint(g);
			n = n % 30;
			g.setColor(sky[n]);
			
			g.fillRect(0, 0, 800, 400);
			g.setColor(Color.orange);
			g.fillRect(0, 400, 800, 400);
			g.setColor(new Color(0x6B8E23));
			removeAll();
			revalidate();
			repaint();
			drawTree(g, 400, 500, -90, 10, Math.abs(d - (int) d));
		}
	}
	
	public Tree()
	{
		setUpColors();
		timer = new Timer(100, this);
		panel = new FractalTree();
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(panel);
		frame.pack();
		frame.setBounds(0, 0, 800, 800);
        frame.setResizable(false);
		frameCount = 0;
		timer.start();
		frame.setVisible(true);
		
	}
	
	public void setUpColors()
	{
		int[] color0 = {139, 69, 19};
		int[] colorf = {34, 139, 34};
		
		int[]sky0 = {173,216,230};
		int[]sky1 = {255,36,0};
		int[]sky2 = {0,0,156};
		
		int dR0 = (colorf[0] - color0[0]) / 9;
		int dG0= (colorf[1] - color0[1]) / 9;
		int dB0 = (colorf[2] - color0[2]) / 9;
		for(int i = 0; i < colors.length; i++)
		{
			int R0 = color0[0] + dR0 * i;
			int G0 = color0[1] + dG0 * i;
			int B0 = color0[2] + dB0 * i;
			colors[i] = new Color(R0, G0, B0);
		}
		
		int dRs0 = (sky1[0] - sky0[0]) / 9;
		int dGs0 = (sky1[1] - sky0[1]) / 9;
		int dBs0 = (sky1[2] - sky0[2]) / 9;
		
		int dRs1 = (sky2[0] - sky1[0]) / 9;
		int dGs1 = (sky2[1] - sky1[1]) / 9;
		int dBs1 = (sky2[2] - sky1[2]) / 9;
		
		int dRs2 = (sky0[0] - sky2[0]) / 9;
		int dGs2 = (sky0[1] - sky2[1]) / 9;
		int dBs2 = (sky0[2] - sky2[2]) / 9;
		
		for(int i = 0; i < 10; i++)
		{
			int Rs0 = sky0[0] + dRs0 * i;
			int Gs0 = sky0[1] + dGs0 * i;
			int Bs0 = sky0[2] + dBs0 * i;
			sky[i] = new Color(Rs0, Gs0, Bs0);
		}
		
		for(int i = 0; i < 10; i++)
		{
			int Rs1 = sky1[0] + dRs1 * i;
			int Gs1 = sky1[1] + dGs1 * i;
			int Bs1 = sky1[2] + dBs1 * i;
			sky[i + 10] = new Color(Rs1, Gs1, Bs1);
		}
		
		for(int i = 0; i < 10; i++)
		{
			int Rs2 = sky2[0] + dRs2 * i;
			int Gs2 = sky2[1] + dGs2 * i;
			int Bs2 = sky2[2] + dBs2 * i;
			sky[i + 20] = new Color(Rs2, Gs2, Bs2);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		frameCount++;
		d = (double) frameCount / 1000;
		n++;
	}	
	
	private static void runTree()
	{
		Tree tree = new Tree();
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runTree();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
}