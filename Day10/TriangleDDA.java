import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class TriangleDDA extends JFrame implements MouseListener 
{	
	Graphics g;
	public TriangleDDA()
	{
		setTitle("Draw Triangle");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		g=getGraphics();
		addMouseListener(this);
	}
	
	int x[] = new int[3];
	int y[] = new int[3];
	int count;
	
	public void mouseClicked(MouseEvent e) 
	{
		if(count < 3)
		{
			//use count to get coordinates
			x[count] = e.getX(); //x[0] = 100
			y[count] = e.getY(); //y[0] = 100
			
			g.setColor(Color.BLACK);
			g.fillOval(x[count],y[count],5,5); //show point
			//x = [100,?,?] , y = [150,?,?]
			
			count++;
		}
		
		//after 3 clicks draw triangle
		if(count == 3)
		{
			drawTriangle(x, y);
		}
	}
	
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	public void drawTriangle(int x[],int y[])
	{
		g.setColor(Color.BLUE);
		
        for(int i=0; i<x.length; i++)
		{
			drawLineDDA(g, x[i], y[i], x[(i+1)%x.length], y[(i+1)%y.length]);
		}
	}
	
	public void drawLineDDA(Graphics g,int x1,int y1,int x2,int y2)
	{		
		int dx=x2-x1; 
		int dy=y2-y1; 
		
		int steps = Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy);
	
		float xInc = dx/(float)steps;
		float yInc = dy/(float)steps;
		
		float x=x1;
		float y=y1;		
		
		for(int i=0; i<=steps; i++)
		{
			//g.fillRect(Math.round(x),Math.round(y),1,1); 
			g.drawLine(Math.round(x),Math.round(y),Math.round(x),Math.round(y));
			x += xInc;
			y += yInc;
		}		
	}	
	
	public static void main(String args[])
	{
		new TriangleDDA();
	}
}