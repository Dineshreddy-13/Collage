package exp10;
import javax.swing.*;
import java.awt.*;

public class Q1 {
	
	public static void main(String args[]) {
		new MyFrame();
	}
}

class MyFrame extends JFrame{
	MyFrame(){
		setTitle("demo");
		setLayout(new GridLayout(4,1));
		setPreferredSize(new Dimension(500,400));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel();
		JButton yes = new JButton("Yes");
		JButton no = new JButton("no");
		JButton close = new JButton("close");
		yes.addActionListener(e ->{
			label.setText("Yes button pressed !");
		});
		no.addActionListener(e ->{
			label.setText("No button pressed !");
		});
		close.addActionListener(e ->{
			dispose();
		});
		add(yes);
		add(no);
		add(close);
		add(label);
		pack();
		setVisible(true);
	}
}
