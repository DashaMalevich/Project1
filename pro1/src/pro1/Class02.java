package pro1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Class02 extends JFrame {

	JTextField SomeString;
	JButton ShowButton;
	JButton SwapButton;
	String UsedText;
	String TempVariable;
	Listener listener = new Listener();

	public Class02(String s) {

		super(s);
		setLayout(new FlowLayout());
		ShowButton = new JButton("Показать");
		SwapButton = new JButton("Замена");
		SomeString = new JTextField(10);

		add(SomeString);
		add(ShowButton);
		add(SwapButton);

		ShowButton.addActionListener(listener);
		SwapButton.addActionListener(listener);

	}

	public class Listener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == ShowButton) {
				UsedText = SomeString.getText();
				SwapButton.setText(UsedText);
			}
			if (e.getSource() == SwapButton) {
				TempVariable = ShowButton.getText();
				ShowButton.setText(SwapButton.getText());
				SwapButton.setText(TempVariable);
			}

		}

	}

}
