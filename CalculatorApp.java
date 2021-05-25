package xyz.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalculatorApp extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel label;
	private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	private JButton bMulti, bDiv, bPlus, bMinus, bClear, bEquals;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp frame = new CalculatorApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculatorApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		b7 = new JButton("7");
		b7.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b7);
		
		b8 = new JButton("8");
		b8.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b8);
		
		b9 = new JButton("9");
		b9.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b9);
		
		bMulti = new JButton("*");
		bMulti.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bMulti);
		
		b4 = new JButton("4");
		b4.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b4);
		
		b5 = new JButton("5");
		b5.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b5);
		
		b6 = new JButton("6");
		b6.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b6);
		
		bDiv = new JButton("/");
		bDiv.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bDiv);
		
		b1 = new JButton("1");
		b1.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b1);
		
		b2 = new JButton("2");
		b2.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b2);
		
		b3 = new JButton("3");
		b3.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b3);
		
		bPlus = new JButton("+");
		bPlus.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bPlus);
		
		b0 = new JButton("0");
		b0.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b0);
		
		bClear = new JButton("C");
		bClear.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bClear);
		
		bEquals = new JButton("=");
		bEquals.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bEquals);
		
		bMinus = new JButton("-");
		bMinus.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bMinus);
		
		label = new JLabel("0");
		label.setBackground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setFont(new Font("Dialog", Font.BOLD, 30));
		contentPane.add(label, BorderLayout.NORTH);
	}

}
