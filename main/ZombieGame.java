package main;
import javax.swing.*;
import java.awt.*;

import ui.CustomButton;

public class ZombieGame
{
	private static void createAndShowGUI()
	{
		JPanel panel = new JPanel();

		ImageIcon icon = new ImageIcon("img/little_face.png");
		JFrame frame = new JFrame("HelloWorldSwing"); 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			frame.setSize(400,400);		
		
	
		JButton button = new JButton("1", icon);
				button.setVerticalTextPosition(AbstractButton.CENTER);
        button.setHorizontalTextPosition(AbstractButton.TRAILING);
				button.setAlignmentY(AbstractButton.BOTTOM);
				button.setAlignmentX(AbstractButton.LEADING);
				button.setBorderPainted(false);
				button.setToolTipText("hello hoverers");
				button.setPreferredSize(new Dimension(150,30));
				panel.add(button);

		CustomButton button2 = new CustomButton('Q');
			panel.add(button2);
		frame.setContentPane(panel);

		CustomButton button3 = new CustomButton('W', true);
			panel.add(button3);
		frame.setContentPane(panel);

		frame.pack();
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
