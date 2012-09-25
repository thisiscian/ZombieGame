package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.ArrayList;

public class CustomFrame extends JFrame implements KeyListener
{

	CustomButton Q;
	CustomButton W;
	public CustomFrame()
	{
		super("Fullscreen");
		pack();
		enableInputMethods(true);
		addKeyListener(this);
		setFocusable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e)
	{
		char c = Character.toUpperCase(e.getKeyChar());
		switch(c)
		{
			case 'Q': 
				Q.released();
				break;
			case 'W':
				W.released();	
				break;
		}
	}
	public void keyPressed(KeyEvent e)
	{
		char c = Character.toUpperCase(e.getKeyChar());
		switch(c)
		{
			case 'Q': 
				Q.pressed();
				break;
			case 'W':
				W.pressed();	
				break;
		}
		
	}

	public void addComponents()
	{
		JPanel panel = new JPanel();
		Q = new CustomButton('Q');
			panel.add(Q);
		setContentPane(panel);

		W = new CustomButton('W', true);
			panel.add(W);
		setContentPane(panel);
	}
}
