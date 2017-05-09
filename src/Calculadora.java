import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculadora {

	private JFrame frame;
	private JTextField text;
	protected float num1;
	protected float num2;
	protected int operacion;
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
				String aux = "";
				aux += text.getText().toLowerCase() + "1";
				text.setText(aux);
			}
				
		}
		);
		JButton button_1 = new JButton("2");
		button_1.setBounds(89, 64, 50, 23);
		frame.getContentPane().add(button_1);
		button_1.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String aux = "";
				aux += text.getText().toLowerCase() + "2";
				text.setText(aux);
			}
				
		}
		);
		JButton button_2 = new JButton("3");
		button_2.setBounds(149, 64, 50, 23);
		frame.getContentPane().add(button_2);
		
		button_2.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String aux = "";
				aux += text.getText().toLowerCase() + "3";
				text.setText(aux);
			}
				
		}
		);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(29, 98, 50, 23);
		frame.getContentPane().add(button_3);
		
		button_3.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String aux = "";
				aux += text.getText().toLowerCase() + "4";
				text.setText(aux);
			}
				
		}
		);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(89, 98, 50, 23);
		frame.getContentPane().add(button_4);
		
		button_4.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String aux = "";
				aux += text.getText().toLowerCase() + "5";
				text.setText(aux);
			}
				
		}
		);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(149, 98, 50, 23);
		frame.getContentPane().add(button_5);
		
		button_5.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String aux = "";
				aux += text.getText().toLowerCase() + "6";
				text.setText(aux);
			}
				
		}
		);
		
		JButton button_6 = new JButton("7");
		button_6.setBounds(29, 132, 50, 23);
		frame.getContentPane().add(button_6);
		
		button_6.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String aux = "";
				aux += text.getText().toLowerCase() + "7";
				text.setText(aux);
			}
				
		}
		);
		
		JButton button_7 = new JButton("8");
		button_7.setBounds(89, 132, 50, 23);
		frame.getContentPane().add(button_7);
		
		button_7.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String aux = "";
				aux += text.getText().toLowerCase() + "8";
				text.setText(aux);
		        }
			}
				
		
		);
		
		JButton button_8 = new JButton("9");
		button_8.setBounds(148, 132, 50, 23);
		frame.getContentPane().add(button_8);
		
		button_8.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String aux = "";
				aux += text.getText().toLowerCase() + "9";
				text.setText(aux);
				
			}
				
		}
		);
		
		JButton Sum = new JButton("+");
		Sum.setBounds(219, 172, 50, 23);
		frame.getContentPane().add(Sum);
		Sum.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String aux = text.getText();
					operacion = 1;
					num1 = Integer.parseInt(aux);
					text.setText("");
	}
				
		}
		);


		JButton tot = new JButton("=");
		tot.setBounds(149, 172, 50, 23);
		frame.getContentPane().add(tot);
		tot.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
			String aux = text.getText();
			num2 = Integer.parseInt(aux);
			float igual=0f;
			if (operacion == 1) {
				igual = num1 + num2;
			}else if(operacion==2){
				igual = num1-num2;
			}else if(operacion==3){
				igual = num1*num2;
			}else if(operacion==4){
				igual = num1/num2;
			}
			num1=num2;
			num2=0;
			aux=String.valueOf(igual);
			text.setText(aux);
		}
	});
		
		
		
		JButton btnC = new JButton("C");
		btnC.setBounds(89, 172, 50, 23);
		frame.getContentPane().add(btnC);
		btnC.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e){
					
					
					if (e.getSource()==btnC) {
			            text.setText("");
			        }
				}
					
			}
			);
		
		
		JButton button_11 = new JButton("0");
		button_11.setBounds(29, 172, 50, 23);
		frame.getContentPane().add(button_11);
		
		button_11.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String aux = "";
				aux += text.getText().toLowerCase() + "0";
				text.setText(aux);
				
			}
				
		}
		);
		
		
		text = new JTextField();
		text.setBounds(25, 11, 194, 23);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String aux = text.getText();
				operacion = 3;
				num1 = Integer.parseInt(aux);
				text.setText("");
}
			
	}
	);
		button_9.setBounds(219, 98, 50, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("/");
		button_10.setBounds(219, 64, 50, 23);
		frame.getContentPane().add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = text.getText();
				operacion = 4;
				num1 = Integer.parseInt(aux);
				text.setText("");
}
			
	}
	);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = text.getText();
				operacion = 2;
				num1 = Integer.parseInt(aux);
				text.setText("");
}
			
	}
	);
		
		button_12.setBounds(219, 132, 50, 23);
		frame.getContentPane().add(button_12);
		
	}
}
