import javax.swing.*;
import java.awt.*;

public class Q01 extends JFrame
{
	public Q01()
	{
		setTitle("Grid");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.PINK);
		int size=40;
        int spacing = 20;	
		int x,y;
		
		for(int row=0; row<5; row++)
		{		
			for(int col=0; col<5; col++)
			{
				if(row%2 == 0)
				{
					g.setColor(Color.BLUE);
				}
				else{
					g.setColor(Color.GRAY);
				}
				x=col * (size + spacing)+40;
				y=row * (size + spacing)+40;
       	        g.fillRect(x,y,size,size);				
			}		
		}
	}
	
	public static void main(String args[])
	{
		new Q01(); 
	}
}

