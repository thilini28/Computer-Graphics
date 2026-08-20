import javax.swing.*;
import java.awt.*;

public class threeRectTranslateDDA extends JFrame
{
	public threeRectTranslateDDA()
	{
		setTitle("Three Rectangle Translation");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		//original rect 1
		int x1=100,y1=100;
		int width1=200,height1=100;		
		g.setColor(Color.BLACK);
		Rectangle(g,x1,y1,width1,height1);
		
		//translated rect 1
		int tx1=100;
		int ty1=50;
		g.setColor(Color.RED);
        Rectangle(g,x1+tx1,y1+ty1,width1,height1);
		
		//original rect 2
		int x2=150,y2=250;
		int width2=150,height2=80;		
		g.setColor(Color.GREEN);
		Rectangle(g,x2,y2,width2,height2);
		
		//translated rect 2
		int tx2=150;
		int ty2=75;
		g.setColor(Color.ORANGE);
        Rectangle(g,x2+tx2,y2+ty2,width2,height2);
		
		//original rect 3
		int x3=200,y3=400;
		int width3=120,height3=60;		
		g.setColor(Color.BLUE);
		Rectangle(g,x3,y3,width3,height3);
		
		//translated rect 3
		int tx3=200;
		int ty3=100;
		g.setColor(Color.MAGENTA);
        Rectangle(g,x3+tx3,y3+ty3,width3,height3);
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
		
		int steps = Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy);
		
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
		new threeRectTranslateDDA();
	}
}