package start;
import javax.swing.*;
import java.awt.*;

public class HelloWorldSwing
{
	private static void createAndShowGUI()
	{
		JPanel panel = new JPanel();

		ImageIcon icon = new ImageIcon("img/little_face.png");
		JFrame frame = new JFrame("HelloWorldSwing"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("1", icon);
				button.setVerticalTextPosition(AbstractButton.CENTER);
        button.setHorizontalTextPosition(AbstractButton.TRAILING);
				button.setVerticalAlignment(AbstractButton.BOTTOM);
				button.setHorizontalAlignment(AbstractButton.LEADING);
				button.setBorderPainted(false);
				button.setToolTipText("hello hoverers");
				Dimension buttdim = new Dimension(150,30);
				button.setPreferredSize(buttdim);
				panel.add(button);

		JButton button2 = new JButton("2", icon);
				button2.setVerticalTextPosition(AbstractButton.CENTER);
        button2.setHorizontalTextPosition(AbstractButton.TRAILING);
				button2.setToolTipText("hello hoverers");
				panel.add(button2);

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
