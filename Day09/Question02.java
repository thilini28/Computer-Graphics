import javax.swing.*;
import java.awt.*;

class Question02 extends JFrame
 {
	public Question02()
	{
		setSize(1024,768);
		setTitle("Draw Chair");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.BLUE);
		
		int xPoints[] = {100,200,200,100};
		int yPoints[] = {100,100,200,200};
		
		for(int i=0; i<xPoints.length; i++)
		{
			DDALine(g,xPoints[i],yPoints[i],xPoints[(i+1)%xPoints.length],yPoints[(i+1)%yPoints.length]);
		}
		
		int x1[] = {200,280,180,100};
		int y1[] = {200,250,250,200};
		
		for(int i=0; i<x1.length; i++)
		{
			DDALine(g,x1[i],y1[i],x1[(i+1)%x1.length],y1[(i+1)%y1.length]);
		}
		
		DDALine(g,100,200,100,300);
		DDALine(g,200,200,200,300);
		DDALine(g,280,250,280,350);
		DDALine(g,180,250,180,350);
	}
	
	public void DDALine(Graphics g, int x1, int y1, int x2, int y2)
	{
		int dx = x2 - x1;
		int dy = y2 - y1;
		
	
		int steps;
		if(Math.abs(dx) > Math.abs(dy))
		{
			steps = Math.abs(dx);
		}
		else{
			steps = Math.abs(dy);
		}
		
		float Xincreament = dx /(float) steps;
		float Yincreament = dy /(float) steps;
		
		float x = x1;
		float y = y1;
		

		for(int i=0; i<=steps; i++)
		{
			g.drawRect(Math.round(x),Math.round(y),1,1); 
			x += Xincreament;
			y += Yincreament;
		}
	}
	
	public static void main(String[] args)
	{
		new Question02();
	}
}