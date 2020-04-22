import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Window.Type;
import javax.swing.JList;
import java.awt.Button;

public class Frame1 {

	private JFrame frmDiscordBotMaker;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmDiscordBotMaker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDiscordBotMaker = new JFrame();
		frmDiscordBotMaker.setTitle("Discord Bot Maker");
		frmDiscordBotMaker.setBounds(100, 100, 450, 300);
		frmDiscordBotMaker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Hi");
		frmDiscordBotMaker.getContentPane().add(lblNewJgoodiesLabel, BorderLayout.NORTH);
		
		Button button = new Button("Export To Javascript");
		frmDiscordBotMaker.getContentPane().add(button, BorderLayout.SOUTH);
	}

}
