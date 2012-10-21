package ui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ui.CustomButton;
public class FullScreen extends JPanel
{
	private static final String EXIT = "Exit";
  private JFrame f = new JFrame("ZombieGame");
  private Action exit = new AbstractAction(EXIT)
	{
	  @Override
  	public void actionPerformed(ActionEvent e)
		{
      f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
    }
  };

  private JButton b = new JButton(exit);

  public FullScreen()
	{
  	this.add(b);
    f.getRootPane().setDefaultButton(b);
    //this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 0), EXIT);
    this.getActionMap().put(EXIT, exit);
    this.addMouseMotionListener(new MouseAdapter()
		{
 			@Override
    	public void mouseMoved(MouseEvent e)
			{
    	  FullScreen.this.setToolTipText("("+ e.getX() + "," + e.getY() + ")");
    	}
    });
  }

  public void display()
	{
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice dev = env.getDefaultScreenDevice();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setBackground(Color.darkGray);
    f.setResizable(false);
    f.setUndecorated(true);
    f.add(this);
    f.pack();
    dev.setFullScreenWindow(f);
  }
}
