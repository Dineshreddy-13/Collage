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
		setLayout(new GridLayout(2,1,20,0));
		setPreferredSize(new Dimension(500,400));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l1 = new JLabel("SELECT SUBJECT");
		JLabel l2 = new JLabel("SUBJECT NAME");
		String[] arr = new String[] {"item1","item2","item3","item4","item5"};
		JPanel p1 = new JPanel();
		p1.setBackground(Color.PINK);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.PINK);
		JTextArea textArea  = new JTextArea();
		textArea.setPreferredSize(new Dimension(250,40));
		JComboBox<String> comboBox  = new JComboBox<String>(arr);
		comboBox.setPreferredSize(new Dimension(250,40));
		comboBox.addActionListener(e ->{
			textArea.setText((String) comboBox.getSelectedItem());
		});
		p1.add(l1);
		p1.add(comboBox);
		p2.add(l2);
		p2.add(textArea);
		add(p1);
		add(p2);
		pack();
		setVisible(true);
	}
}
