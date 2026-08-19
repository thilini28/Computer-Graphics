import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorCircleMidpoint extends JFrame implements MouseListener
{	
    Graphics g;
	public ColorCircleMidpoint()
	{		
		setTitle("Color Circle");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addMouseListener(this);
		g=getGraphics();
	}
	
	public void mouseClicked(MouseEvent e)
	{
		super.paint(g);
		
		int xc=e.getX();
		int yc=e.getY();
		int r=100;
		
		drawMidpointCircle(g, xc, yc, r);		
	}	
	
	public void mousePressed(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	
	public void drawMidpointCircle(Graphics g, int xc, int yc, int r)
	{
		int x=0;
		int y=r;
		int d=1-r;
		
		while(x<=y)
		{
			plotPoints(g, xc, yc, x, y);

			if(d<0)
			{
				d=d+(2*x)+3;
			}
			else
			{
				d=d+(2*(x-y))+5;
				y--;
			}
			x++;
		}
	}
	
	public void plotPoints(Graphics g, int xc, int yc, int x, int y)
	{
		g.setColor(Color.CYAN);
		g.fillRect(xc+x,yc+y,5,5);
		g.setColor(Color.GREEN);
		g.fillRect(xc+y,yc+x,5,5);
			
		g.setColor(Color.BLUE);
		g.fillRect(xc-x,yc+y,5,5);
		g.setColor(Color.YELLOW);
		g.fillRect(xc+y,yc-x,5,5);
					  
		g.setColor(Color.PINK);			  
		g.fillRect(xc-x,yc-y,5,5);
		g.setColor(Color.MAGENTA);
		g.fillRect(xc-y,yc-x,5,5);
		
		g.setColor(Color.RED);
	    g.fillRect(xc+x,yc-y,5,5);
		g.setColor(Color.ORANGE);
		g.fillRect(xc-y,yc+x,5,5);
	}
	
	public static void main(String []args)
	{
		new ColorCircleMidpoint();
	}
}
