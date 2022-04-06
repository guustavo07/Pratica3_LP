package Questao1;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField numCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(197, 41, 40, 25);
		contentPane.add(lblNewLabel);
		
		nome = new JTextField();
		nome.setBackground(Color.WHITE);
		nome.setBounds(74, 65, 280, 25);
		contentPane.add(nome);
		nome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(197, 101, 34, 25);
		contentPane.add(lblNewLabel_1);
		
		numCpf = new JTextField();
		numCpf.setForeground(Color.GRAY);
		numCpf.setToolTipText("");
		numCpf.setBounds(161, 122, 112, 25);
		contentPane.add(numCpf);
		numCpf.setColumns(10);
		
		JButton conferirButton = new JButton("Conferir CPF");
		conferirButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String CPF = numCpf.getText();
				if(ValidacaoCpf.isCPF(CPF)==true)
					JOptionPane.showMessageDialog(null, "CPF Válido" + CPF);
				else
					JOptionPane.showMessageDialog(null,"CPF Inválido");
			}
		});
		conferirButton.setForeground(Color.GRAY);
		conferirButton.setBackground(Color.MAGENTA);
		conferirButton.setBounds(161, 192, 112, 23);
		contentPane.add(conferirButton);
	}
}

