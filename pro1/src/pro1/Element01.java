package pro1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Element01 extends JFrame {

	JTextField StringToAdd;
	JButton AddToListButton;
	String[] Strings = {};
	JComboBox ListOfStrings;
	String text;
	int NumberOfElements=0;
	Listener listener = new Listener();
	
	
	JTextField SomeString;
	JButton ShowButton;
	JButton SwapButton;
	String UsedText;
	String TempVariable;
	Listener2 listener2 = new Listener2();
	
	
	JTextField RadioString;
	JButton MarkButton;
	ButtonGroup RadioButtonGroup;
	JRadioButton RadioButton1;
	JRadioButton RadioButton2;
	JRadioButton RadioButton3;
	String RadioButtonName;
	Listener3 listener3 = new Listener3();
	
	

	public Element01(String s) {

		super(s);
		setLayout(new FlowLayout());
		AddToListButton = new JButton("������� � ������");
		StringToAdd = new JTextField(10);
		ListOfStrings = new JComboBox(Strings);
		ListOfStrings.setEditable(true);
		add(StringToAdd);
		add(AddToListButton);
		add(ListOfStrings);
		
		ShowButton = new JButton("��������");
		SwapButton = new JButton("������");
		SomeString = new JTextField(10);

		add(SomeString);
		add(ShowButton);
		add(SwapButton);
		
		AddToListButton.addActionListener(listener);
		ShowButton.addActionListener(listener2);
		SwapButton.addActionListener(listener2);
		
		MarkButton = new JButton("�������");
		RadioButton1  = new JRadioButton("������");
		RadioButton2  = new JRadioButton("������");
		RadioButton3  = new JRadioButton("������");
		RadioString = new JTextField(15);
		RadioButtonGroup = new ButtonGroup();
		RadioButtonGroup.add(RadioButton1);
		RadioButtonGroup.add(RadioButton2);
		RadioButtonGroup.add(RadioButton3);
		
		
		
		
		add(RadioString);
		add(MarkButton);
		add(RadioButton1);
		add(RadioButton2);
		add(RadioButton3);
		
		MarkButton.addActionListener(listener3);
		
		
	}

	public class Listener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == AddToListButton) {
				text=StringToAdd.getText();
				ListOfStrings.addItem(text);
				
				
				
			}

		}

	}
	
	
	public class Listener2 implements ActionListener {

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
	
	
	public class Listener3 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == MarkButton) {
				RadioButtonName = RadioString.getText();
				if (RadioButtonName.compareTo(RadioButton1.getText()) != 0
						& RadioButtonName.compareTo(RadioButton2.getText()) != 0
						&  RadioButtonName.compareTo(RadioButton3.getText()) != 0) {
					JOptionPane.showMessageDialog(null, "����� ������ �� ����������!");
				} else {
					if (RadioButtonName.compareTo(RadioButton1.getText()) == 0) {
						RadioButton1.setSelected(true);
						RadioButtonGroup.remove(RadioButton1);
					}

					if (RadioButtonName.compareTo(RadioButton2.getText()) == 0) {
						RadioButton2.setSelected(true);
						RadioButtonGroup.remove(RadioButton2);
					}

					if (RadioButtonName.compareTo(RadioButton3.getText()) == 0) {
						RadioButton3.setSelected(true);
						RadioButtonGroup.remove(RadioButton3);
					}
				}
			}

		}

	}

}
