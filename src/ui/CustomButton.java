package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ui.FullScreen;

import java.util.ArrayList;

public class CustomButton extends JComponent implements MouseListener
{
	private Dimension size = new Dimension(30,30);
	private ArrayList<ActionListener> listeners = new ArrayList<ActionListener>();
	private boolean isPressed = false;
	private boolean mouseEntered = false;
	private char txt = '1';

	public Dimension arc = new Dimension((int)Math.sqrt(size.width), (int)Math.sqrt(size.height));

	public CustomButton(char text, FullScreen screen)
	{
		setValues(text);
		screen.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.getExtendedKeyCodeForChar(text), 0, false), "pressed");
    screen.getActionMap().put("pressed", pressed);
		screen.add(this);
	}

	private void setValues(char text)
	{
		txt = text;
		this.enableInputMethods(true);
		this.addMouseListener(this);
		this.setFocusable(true);
 	}
	
	private Action pressed = new AbstractAction("pressed")
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			isPressed = !isPressed;
			repaint();
		}
  };

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D antiAlias = (Graphics2D)g;
		antiAlias.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	
		Font font = getFont();
		FontMetrics metric = getFontMetrics(font);	
		if(mouseEntered)
		{
			g.setColor(Color.GRAY);
			g.fillRoundRect(0,0,getWidth(),getHeight(), arc.width,arc.height);
		}
		if(isPressed)
		{
			g.setColor(Color.decode("#250000"));
		}
		else
		{
			g.setColor(Color.BLACK);
		}
		g.fillRoundRect(1,1,getWidth()-2,getHeight()-2, arc.width, arc.height);
		g.setColor(Color.WHITE);
		if(isPressed)
		{
			g.drawString("R", getWidth()-3-metric.stringWidth("R"), getHeight()-3-metric.getHeight());
		}
		else
		{
			g.drawString(Character.toString(txt), getWidth()-3-metric.charWidth(txt), getHeight()-3-metric.getHeight());
		}
		
}

	public Dimension getPreferredSize()
	{
		return new Dimension(30,30);
	}
	public Dimension getMinimumSize()
	{
		return getPreferredSize();
	}
	public Dimension getMaximumSize()
	{
		return getPreferredSize();
	}

	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e)
	{
		notifyListeners(e);
		isPressed = true;
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
			isPressed = false;
			repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		mouseEntered = false;
		repaint();
	}
	public void mouseEntered(MouseEvent e)
	{
		mouseEntered = true;
		repaint();
	}
	public void notifyListeners(KeyEvent e)
	{
		ActionEvent evt = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, new String(), e.getWhen(), e.getModifiers());
		synchronized(listeners)
		{
			for (int i=0; i<listeners.size(); i++)
			{
				ActionListener tmp = listeners.get(i);
				tmp.actionPerformed(evt);
			}
		}
	}public void notifyListeners(MouseEvent e)
	{
		ActionEvent evt = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, new String(), e.getWhen(), e.getModifiers());
		synchronized(listeners)
		{
			for (int i=0; i<listeners.size(); i++)
			{
				ActionListener tmp = listeners.get(i);
				tmp.actionPerformed(evt);
			}
		}
	}
}
