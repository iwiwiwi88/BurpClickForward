package burp;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton clickButton = new JButton("Klikaj klikajko");

	public MainView() {
		this.setTitle("BURP - Click Forward");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setAlwaysOnTop(true);
		setSize();
		addButton();
	}

	private void addButton() {
		clickButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ClickForwardService().click();
			}
			
		});
		this.add(clickButton);
	}

	private void setSize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle winSize = GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getMaximumWindowBounds();
		int taskBarHeight = screenSize.height - winSize.height;
		int windowWidth = 300;
		int windowHeight = 200;
		this.setSize(windowWidth, windowHeight);
		this.setLocation(screenSize.width - windowWidth,
				screenSize.height - taskBarHeight - windowHeight);
	}
}
