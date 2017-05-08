import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculadora {

	private JFrame frame;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("1");
		button.setBounds(29, 64, 50, 23);
		frame.getContentPane().add(button);
		/*Evento Boton*/
		button.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				int valor=1;
				if (e.getSource()==button) {
		            text.setText(""+valor);
		        }
			}
				
		}
		);
		JButton button_1 = new JButton("2");
		button_1.setBounds(89, 64, 50, 23);
		frame.getContentPane().add(button_1);
		button_1.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				int valor=2;
				if (e.getSource()==button_1) {
		            text.setText(""+valor);
		        }
			}
				
		}
		);
		JButton button_2 = new JButton("3");
		button_2.setBounds(149, 64, 50, 23);
		frame.getContentPane().add(button_2);
		
		button_2.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				int valor=3;
				if (e.getSource()==button_2) {
		            text.setText(""+valor);
		        }
			}
				
		}
		);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(29, 98, 50, 23);
		frame.getContentPane().add(button_3);
		
		button_3.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				int valor=4;
				if (e.getSource()==button_3) {
		            text.setText(""+valor);
		        }
			}
				
		}
		);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(89, 98, 50, 23);
		frame.getContentPane().add(button_4);
		
		button_4.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				int valor=5;
				if (e.getSource()==button_4) {
		            text.setText(""+valor);
		        }
			}
				
		}
		);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(149, 98, 50, 23);
		frame.getContentPane().add(button_5);
		
		button_5.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				int valor=6;
				if (e.getSource()==button_5) {
		            text.setText(""+valor);
		        }
			}
				
		}
		);
		
		JButton button_6 = new JButton("7");
		button_6.setBounds(29, 132, 50, 23);
		frame.getContentPane().add(button_6);
		
		button_6.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				int valor=7;
				if (e.getSource()==button_6) {
		            text.setText(""+valor);
		        }
			}
				
		}
		);
		
		JButton button_7 = new JButton("8");
		button_7.setBounds(89, 132, 50, 23);
		frame.getContentPane().add(button_7);
		
		button_7.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				int valor=8;
				if (e.getSource()==button_7) {
		            text.setText(""+valor);
		        }
			}
				
		}
		);
		
		JButton button_8 = new JButton("9");
		button_8.setBounds(148, 132, 50, 23);
		frame.getContentPane().add(button_8);
		
		button_8.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				int valor=9;
				if (e.getSource()==button_8) {
		            text.setText(""+valor);
		        }
			}
				
		}
		);
		
		JButton Sum = new JButton("+");
		Sum.setBounds(220, 64, 50, 23);
		frame.getContentPane().add(Sum);
		Sum.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){
			int numero=0;
			
			if (e.getSource()==Sum) {
		String num1 =text.getText();
		String num2 =text.getText();
		

		numero = Integer.valueOf(num1).intValue();
		numero = numero + Integer.valueOf(num2).intValue();
		      
}
			text.setText(""+numero);
		}
		}
);
		JButton tot = new JButton("=");
		tot.setBounds(220, 98, 50, 23);
		frame.getContentPane().add(tot);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(280, 98, 50, 23);
		frame.getContentPane().add(btnC);
		btnC.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e){
					
					int valor=0;
					if (e.getSource()==btnC) {
			            text.setText(""+valor);
			        }
				}
					
			}
			);
		
		
		JButton button_11 = new JButton("0");
		button_11.setBounds(220, 132, 50, 23);
		frame.getContentPane().add(button_11);
		
		text = new JTextField();
		text.setText("0");
		text.setBounds(25, 11, 194, 23);
		frame.getContentPane().add(text);
		text.setColumns(10);
	}

}
