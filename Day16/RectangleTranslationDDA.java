import javax.swing.*;
import java.awt.*;

public class RectangleTranslationDDA extends JFrame
{
	public RectangleTranslationDDA()
	{
		setTitle("Rectangle Translation");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		//original rect
		int x=150,y=200;
		int width=100,height=80;
		Rectangle(g,x,y,width,height);
		
		//translated
		int tx=-100;
		int ty=50;
		g.setColor(Color.RED);
        Rectangle(g,x+tx,y+ty,width,height);
	}
	
	public void Rectangle(Graphics g,int x,int y,int width,int height)
	{
		drawDDA(g,x,y,x+width,y); // Top
		drawDDA(g,x+width,y,x+width,y+height); // Right
		drawDDA(g,x+width,y+height,x,y+height); // Bottom
		drawDDA(g,x,y+height,x,y); // Left
	}
	
	public void drawDDA(Graphics g,int x1,int y1,int x2,int y2)
	{
		int dx=x2-x1;
		int dy=y2-y1;
		
		int steps;
		
		if(Math.abs(dx)>Math.abs(dy))
		{
			steps=Math.abs(dx);
		}
		else{
			steps=Math.abs(dy);
		}
		
		float xInc=dx/(float)steps;
		float yInc=dy/(float)steps;
		
		float x=x1;
		float y=y1;
		
		for(int i=0; i<=steps; i++)
		{
			g.drawRect(Math.round(x),Math.round(y),1,1);
			x+=xInc;
			y+=yInc;
		}
	}
	
	public static void main(String args[])
	{
		new RectangleTranslationDDA();
	}
}