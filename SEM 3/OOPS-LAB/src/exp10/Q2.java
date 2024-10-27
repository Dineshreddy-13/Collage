package exp10;

import java.awt.*;
import javax.swing.*;

public class Q2 {
	public static void main(String args[]) {
		new Demo();
	}

}
class Demo extends JFrame{
	Demo(){
		
		setTitle("demo");
		setBackground(Color.green);
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(500,400));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] arr = new String[] {"item1","item2","item3","item4","item5"};
		JTextArea textArea  = new JTextArea();
		textArea.setPreferredSize(new Dimension(250,40));
		JComboBox<String> comboBox  = new JComboBox<String>(arr);
		comboBox.setPreferredSize(new Dimension(250,40));
		comboBox.addActionListener(e ->{
			textArea.setText((String) comboBox.getSelectedItem());
			
		});
		setBackground(Color.PINK);
		add(comboBox);
		add(textArea);
		pack();
		setVisible(true);
	}
}
