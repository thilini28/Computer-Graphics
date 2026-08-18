import javax.swing.*;
import java.awt.*;

public class OlympicLogo extends JFrame
{
	public OlympicLogo()
	{
		setTitle("Bresenhan's algorithm - Olimpic Logo");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		int radius=50;
		int startx=100, starty=150;  //starting point for the first ring
		
		//colors for the olympic rings in order 
		Color[] colors = {Color.BLUE, Color.YELLOW, Color.BLACK, Color.GREEN, Color.RED};
		int colorIndex = 0;
		
		//draw top 3 rings closer together
		int topRingSpacing=80; //decreased spacing between top rings
		for(int i=0; i<3; i++)
		{
			g.setColor(colors[colorIndex++]);
			drawBresenhamCircle(g, startx +i *topRingSpacing, starty, radius);
		}
		
		//draw bottom 2 rings with adjusted spacing
		int bottomRingSpacing=80;  //adjust spacing for bottom rings
		int bottomRingYoffset=70;  //vertical offset for bottom rings
		for(int i=0; i<2; i++)
		{
			g.setColor(colors[colorIndex++]);
			drawBresenhamCircle(g, startx +i *bottomRingSpacing+40, starty + bottomRingYoffset, radius);
		}
	}
	
	private void drawBresenhamCircle(Graphics g, int xcenter, int ycenter, int r)
	{
		int x=0;
		int y=r;
		int d=3-(2*r);
		
		plotCirclePoints(g, xcenter, ycenter,x, y);
		
		while(x<=y)
		{
			x++;
			if(d<0)
			{
				d += 4*x+6;
			}
			else
			{
				y--;
				d +=4*(x-y)+10;
			}
			plotCirclePoints(g, xcenter, ycenter,x, y);
		}
	}
	
	private void plotCirclePoints(Graphics g, int xc, int yc, int x, int y)
	{
		g.fillOval(xc+x-1, yc+y-1, 2, 2);
		g.fillOval(xc-x-1, yc+y-1, 2, 2);
		g.fillOval(xc+x-1, yc-y-1, 2, 2);
		g.fillOval(xc-x-1, yc-y-1, 2, 2);
		g.fillOval(xc+y-1, yc+x-1, 2, 2);
		g.fillOval(xc-y-1, yc+x-1, 2, 2);
		g.fillOval(xc+y-1, yc-x-1, 2, 2);
		g.fillOval(xc-y-1, yc-x-1, 2, 2);
	}
	
	public static void main(String []args)
	{
		new OlympicLogo();
	}
}