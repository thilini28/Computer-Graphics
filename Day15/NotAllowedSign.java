import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NotAllowedSign extends JFrame implements MouseListener
{	
    int xc,yc,r;
	boolean isDraw=false;
    Graphics g; //This line creates a variable named g that can store a Graphics object
	Graphics2D g2; //(Graphics2D)g
	
	public NotAllowedSign()
	{		
		setTitle("Sign");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addMouseListener(this);
		g=getGraphics(); //Java gives the JFrame's drawing object
		g2=(Graphics2D)g;
	}
	
	public void mouseClicked(MouseEvent e)
	{
        if(!isDraw)
		{
			int xc=e.getX();
			int yc=e.getY();
			drawMidpointCircle(xc,yc,100);
			BresenhamLine(xc-68,yc-68,xc+68,yc+68);
			isDraw=true;
		}					
	}
	
	public void mousePressed(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	
	public void drawMidpointCircle(int xc, int yc, int r)
	{
		int x=0;
		int y=r;
		int d=1-r;
		
		while(x<=y)
		{
			plotPoints(xc, yc, x, y);

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
	
	public void plotPoints(int xc, int yc, int x, int y)
	{
        g2.setStroke(new BasicStroke(8)); //setStroke() belongs to Graphics2D
		g2.setColor(Color.RED);
		
		g2.fillRect(xc+x,yc+y,8,8);
		g2.fillRect(xc+y,yc+x,8,8);
			
		g2.fillRect(xc-x,yc+y,8,8);
		g2.fillRect(xc+y,yc-x,8,8);
					  		  
		g2.fillRect(xc-x,yc-y,8,8);
		g2.fillRect(xc-y,yc-x,8,8);
		
	    g2.fillRect(xc+x,yc-y,8,8);
		g2.fillRect(xc-y,yc+x,8,8);
	}
	
	//use basic bresenham line
	public void BresenhamLine(int x1,int y1,int x2,int y2)
	{
		g2.setStroke(new BasicStroke(8));
		
		int dx=x2-x1; 
		int dy=y2-y1; 
		
		int x=x1;
		int y=y1;
		
		int d=(2*dy) - dx;
		
		g2.fillRect(x,y,8,8);
		
		while(x<x2)
		{
			x++;
			if(d<0)
			{
				d = d+(2*dy);
			}
			else{
				y++;
				d= d+(2*dy)-(2*dx);
			}
			g2.fillRect(x,y,8,8);           
		}		
	}	
	
	public static void main(String []args)
	{
		new NotAllowedSign();
	}
}

	