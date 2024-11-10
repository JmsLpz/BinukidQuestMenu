package menuPackage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;

public class mainMenu{
	public JFrame frame = new JFrame();
	public JLabel label = new JLabel();
	public ImageIcon logo = new ImageIcon("images/logo.png");
	public ImageIcon background = new ImageIcon("images/background.png");
	public JButton startButton = new JButton();
	void _mainMenu() {
		//Game logo
		frame.setIconImage(logo.getImage());
		//Game Title
		frame.setTitle("Binukid Quest");
		//Labels
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setIcon(background);
		//Frame
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.add(label);
		frame.pack();
		//Button
		ImageIcon startIcon = new ImageIcon("images/Start.png");
		startButton = new JButton(startIcon);
		//To remove the button border and set it into transparent
		startButton.setBorderPainted(false); 
		startButton.setContentAreaFilled(false); 
		startButton.setFocusPainted(false);
		startButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //To have pointer cursor
		startButton.setSize(400, 150);
		// Calculate center position
		int xPosition = (label.getWidth() - startButton.getWidth()) / 2;
	    int yPosition = (((label.getHeight() - startButton.getHeight()) / 2) + 70);

	    // Set button position
	    startButton.setLocation(xPosition, yPosition);

		label.add(startButton);
		frame.repaint();
	}
}
