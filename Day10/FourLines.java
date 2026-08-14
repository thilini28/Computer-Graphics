import javax.swing.*; 
import java.awt.*; 

public class FourLines extends JFrame 
{
	public FourLines()
	{
		setTitle("Four Lines");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		//Positive
		g.setColor(Color.BLACK);		
		drawDDA(g,50,50,150,150);	
		
		//negative
		g.setColor(Color.BLUE); 		
		drawDDA(g,300,50,200,150);
		
		g.setColor(Color.YELLOW); 		
		drawDDA(g,200,400,300,350);	
		
		//horizontal
		g.setColor(Color.RED); 		
		drawDDA(g,300,100,450,100);	
		
		//vertical
		g.setColor(Color.GRAY); 		
		drawDDA(g,500,50,500,200);
	}
	
	public void drawDDA(Graphics g,int x1,int y1,int x2,int y2)
	{
		int dx=x2-x1; //dx=horizontal distance
		int dy=y2-y1; //dy = vertical distance
		
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
		new FourLines();
	}
}