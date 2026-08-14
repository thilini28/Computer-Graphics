import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class DDAmouselistener extends JFrame implements MouseListener 
{
	Graphics g;
	public DDAmouselistener()
	{
		setTitle("Draw Square");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		g=getGraphics();
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e) 
	{
		//super.paint(g);			
		int x=e.getX();
		int y=e.getY();
		
		drawBox(x,y);			
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	public void drawBox(int x,int y)
	{
		g.setColor(Color.RED);
		drawLineDDA(g,x,y,x+50,y);
		drawLineDDA(g,x+50,y,x+50,y+50);
		drawLineDDA(g,x+50,y+50,x,y+50);
		drawLineDDA(g,x,y+50,x,y);	
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
			g.fillRect(Math.round(x),Math.round(y),1,1); 
			//g.drawLine(Math.round(x),Math.round(y),Math.round(x),Math.round(y));
			x += xInc;
			y += yInc;
		}		
	}	
	
	public static void main(String args[])
	{
		new DDAmouselistener();
	}
}