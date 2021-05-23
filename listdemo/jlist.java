import jdk.nashorn.internal.runtime.logging.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class jlist extends JFrame implements ActionListener{
	
	JButton b1;
	JTextField txt1;
	JPanel pane = new JPanel();
	List jl = new List(10,false);
	
	public jlist() {
		
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		c.add(pane);
		
		pane.add(jl);
		pane.add(txt1 = new JTextField(10));
		pane.add(b1 = new JButton("Add"));
		
		b1.addActionListener(this);
	}
	
	public static void main(String[] args) {
		
	    jlist jf = new jlist();
		jf.setVisible(true);
		jf.setSize(350,220);
		jf.setTitle("JList Demo 1.0");
		System.out.println("Hello this is sample program");
		System.out.println("Hello this is sample program");
	}
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane jp = new JOptionPane();
		
		if(e.getSource()==b1) {
	
			jl.add(txt1.getText());
			txt1.setText("");
		}
		
	}
}