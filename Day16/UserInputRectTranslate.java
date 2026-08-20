import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class UserInputRectTranslate extends JFrame 
{
    int tx, ty;

    public UserInputRectTranslate(int tx, int ty) 
	{
        this.tx = tx;
        this.ty = ty;

        setTitle("Rectangle Translation using Scanner");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g)
	{
        super.paint(g);

        // Original Rectangle
		int x=100,y=150;
		int width=200,height=100;
        g.setColor(Color.BLUE);
        Rectangle(g,x,y,width,height);
        g.drawString("Original Rectangle", 100, 140);

        // Translated Rectangle
        g.setColor(Color.RED);
        Rectangle(g,x+tx,y+ty,width,height);
        g.drawString("Translated Rectangle", 100 + tx, 140 + ty);
    }

    public void Rectangle(Graphics g,int x,int y,int width,int height)
	{
		drawDDA(g,x,y,x+width,y);
		drawDDA(g,x+width,y,x+width,y+height);
		drawDDA(g,x+width,y+height,x,y+height);
		drawDDA(g,x,y+height,x,y);
	}

    public void drawDDA(Graphics g,int x1,int y1,int x2,int y2)
	{
		int dx=x2-x1;
		int dy=y2-y1;
		
		int steps=Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy);
		
		float xInc=dx/(float)steps;
		float yInc=dy/(float)steps;
		
		int x=x1;
		int y=y1;
		
		for(int i=0; i<=steps; i++)
		{
			g.drawRect(Math.round(x),Math.round(y),1,1);
			x+=xInc;
			y+=yInc;
		}
	}
	
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter translation in X (tx): ");
        int tx = sc.nextInt();

        System.out.print("Enter translation in Y (ty): ");
        int ty = sc.nextInt();

        new UserInputRectTranslate(tx, ty);

        sc.close();
    }
}