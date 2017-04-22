package windowBuil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class WindowBuilder {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField txtEscribe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilder window = new WindowBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBotoncito = new JButton("botoncito");
		btnBotoncito.setBounds(31, 38, 117, 25);
		frame.getContentPane().add(btnBotoncito);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(144, 122, 129, 21);
		frame.getContentPane().add(menuBar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(98, 168, 204, 19);
		frame.getContentPane().add(passwordField);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(125, 227, 148, 14);
		frame.getContentPane().add(progressBar);
		
		txtEscribe = new JTextField();
		txtEscribe.setText("escribe");
		txtEscribe.setBounds(229, 69, 114, 19);
		frame.getContentPane().add(txtEscribe);
		txtEscribe.setColumns(10);
	}
}
