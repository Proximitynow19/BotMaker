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
import javax.swing.JEditorPane;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

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
		frmDiscordBotMaker.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("106px"),
				ColumnSpec.decode("222px"),
				ColumnSpec.decode("106px"),},
			new RowSpec[] {
				RowSpec.decode("239px"),
				RowSpec.decode("22px"),}));
		
		Button button = new Button("Export To Javascript");
		frmDiscordBotMaker.getContentPane().add(button, "1, 2, 3, 1, fill, top");
		
		JEditorPane editorPane = new JEditorPane();
		frmDiscordBotMaker.getContentPane().add(editorPane, "1, 1, left, fill");
		
		JEditorPane editorPane_1 = new JEditorPane();
		frmDiscordBotMaker.getContentPane().add(editorPane_1, "3, 1, left, fill");
	}

}
