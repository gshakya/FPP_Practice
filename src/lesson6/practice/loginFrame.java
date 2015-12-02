package lesson6.practice;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class loginFrame {

	public loginFrame() {
		JFrame mainFrame = new JFrame();

		JPanel loginPanel = new JPanel();

		mainFrame.setTitle("Login Screen");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
//		mainFrame.setResizable(false);
		mainFrame.add(loginPanel);

		loginPanel.setLayout(new GridLayout(3, 2 , 10,10));
//		loginPanel.setBounds(100, 100, 300, 200);

		loginPanel.setSize(300, 200);

		JLabel nameLabel = new JLabel("Name");
		loginPanel.add(BorderLayout.WEST,nameLabel);

		JTextField nameText = new JTextField(10);
		loginPanel.add(nameText);

		JLabel passwordLabel = new JLabel("Password");
		loginPanel.add(BorderLayout.WEST,passwordLabel);

		JTextField passwordText = new JTextField(10);
		loginPanel.add(passwordText);

		JButton loginButton = new JButton("Login");
		JButton cancelButton = new JButton("Cancel");
		loginPanel.add(loginButton);
		loginPanel.add(cancelButton);
		loginPanel.setVisible(true);

		mainFrame.pack();

	}

	public static void main(String[] args) {
		loginFrame lframe = new loginFrame();
	}

}
