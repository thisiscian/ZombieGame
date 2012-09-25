package main;
import javax.swing.*;
import java.awt.*;

import ui.CustomButton;
import ui.CustomFrame;

public class ZombieGame
{
	private static void createAndShowGUI()
	{
		CustomFrame frame = new CustomFrame();
		frame.addComponents();
		frame.getContentPane().setPreferredSize( Toolkit.getDefaultToolkit().getScreenSize());
		frame.pack();
		frame.setResizable(false);

			Point p = new Point(-1, 0);
      SwingUtilities.convertPointToScreen(p, frame.getContentPane());
      Point l = frame.getLocation();
      l.x -= p.x;
      l.y -= p.y;
      frame.setLocation(l);

		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
	
		javax.swing.SwingUtilities.invokeLater
		(
			new Runnable()
			{
				public void run()
				{
					createAndShowGUI();
				}
			}
		);
	}
}
