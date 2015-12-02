package lesson6.practice;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginFrame {

	JLabel nameLabel = new JLabel("Name");
	JTextField nameText = new JTextField(10);
	JLabel passwordLabel = new JLabel("Password");
	JPasswordField passwordText = new JPasswordField(10);
	JButton loginButton = new JButton("Login");
	JButton cancelButton = new JButton("Cancel");

	public loginFrame() {
		JFrame mainFrame = new JFrame();

		JPanel loginPanel = new JPanel();

		mainFrame.setTitle("Login Screen");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		// mainFrame.setResizable(false);
		mainFrame.add(loginPanel);
		passwordText.setEchoChar('-');

		loginPanel.setLayout(new GridBagLayout());
		loginPanel.setPreferredSize(new Dimension(200, 100));
		loginPanel.setMinimumSize(new Dimension(200, 100));
		loginPanel.setMaximumSize(new Dimension(200, 100));
		
		// loginPanel.setBounds(100, 100, 300, 200);

		

		loginPanel.add(nameLabel);
		loginPanel.add(nameText);
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordText);
		loginPanel.add(loginButton);
		loginPanel.add(cancelButton);
		loginPanel.setVisible(true);

		mainFrame.pack();

		LoginEvent l = new LoginEvent();
		CancelEvent c = new CancelEvent();

		loginButton.addActionListener(l);
		cancelButton.addActionListener(c);

	}

	class LoginEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String outputMsg = new String();
			if (nameText.getText().equals(null) | nameText.getText().equals(""))
				outputMsg = "Name Field is Empty";
			else if (passwordText.getText().equals(null) | passwordText.getText().equals(""))
				outputMsg = outputMsg + "\nPassword Field is Empty";

			else
				outputMsg = "Please Login " + nameText.getText() + "\nYour Password: " + passwordText.getText();

			JOptionPane.showMessageDialog(null, outputMsg);

		}
	}

	class CancelEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			JOptionPane.showMessageDialog(null, "Cancel button Pressed");

		}

	}

	public static void main(String[] args) {
		loginFrame lframe = new loginFrame();
	}

}
