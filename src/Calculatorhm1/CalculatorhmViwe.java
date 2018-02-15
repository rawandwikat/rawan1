package Calculatorhm1;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class CalculatorhmViwe {
	private	JButton a1=new JButton("+");
	private	JButton a2=new JButton("-");
	private	JButton a3=new JButton("/");
	private	JButton a4=new JButton("*");
	private	JButton a5=new JButton("%");
	private JButton a6=new JButton("sq root");
	private	JButton b=new JButton("=");
	private JLabel g=new  JLabel("enter the first number");
	private JLabel c=new  JLabel("enter the second number");
	private	JTextField t1 = new JTextField();
	private	JTextField t2 = new JTextField();
	private	JTextField re = new JTextField();
		//Constructor
	public	CalculatorhmViwe(){
		b.setEnabled(false);
		re.setEnabled(false);
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
	GridLayout experimentLayout = new GridLayout(6,3);
	        frame.setLayout(experimentLayout);
	        frame.add(g);
	        frame.add(t1);
	        frame.add(c);
	        frame.add(t2);
	        frame.add(a1);
	        frame.add(a2);
	        frame.add(a3);
	        frame.add(a4);
	        frame.add(a5);
	        frame.add(a6);
	        frame.add(b);
	        frame.add(re);
	        frame.setVisible(true);
	        
		 }
	public void setresult(int x) {
		re.setText(Integer.toString(x));
	}
	public int getfirstnum() {
		return Integer.parseInt(t1.getText());
		
	}
	public int getsecondnum() {
		return Integer.parseInt(t2.getText());
		
	}
	public int getresultnum() {
		return Integer.parseInt(re.getText());
		
	}
	public void addactionlistener(ActionListener t) {
		a1.addActionListener(t);
	}
	public void subactionlistener(ActionListener t) {
		a2.addActionListener(t);
	}
	public void divactionlistener(ActionListener t) {
		a3.addActionListener(t);
	}
	public void mulactionlistener(ActionListener t) {
		a4.addActionListener(t);
	}
	public void modactionlistener(ActionListener t) {
		a5.addActionListener(t);
	}
	public void squactionlistener(ActionListener t) {
		a6.addActionListener(t);
	}
}
