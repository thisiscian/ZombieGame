package main;
import javax.swing.*;
import java.awt.*;

import ui.CustomButton;
import ui.CustomFrame;
import ui.FullScreen;

public class ZombieGame
{
	private static void addElementsToDisplay(FullScreen screen)
	{
		CustomButton Q = new CustomButton('Q', screen);	
	}

	public static void main(String[] args)
	{
	
		javax.swing.SwingUtilities.invokeLater
		(
			new Runnable()
			{
				public void run()
				{
					FullScreen screen = new FullScreen();
					addElementsToDisplay(screen);
					screen.display();
					//createAndShowGUI();
				}
			}
		);
	}
}
