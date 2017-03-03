package pro1;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainClass {

	public static void main(String[] args) {

		
		
		
		Element01 el = new Element01("Добавление в список");
		el.setVisible(true);
		el.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		el.setSize(400, 400);
		el.setResizable(false);
		el.setLocationRelativeTo(null);

		
		

	}

	private static Component createEmptyLabel() {
		// TODO Auto-generated method stub
		return null;
	}

}
