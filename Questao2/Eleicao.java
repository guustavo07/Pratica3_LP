package Questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;

public class Eleicao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleicao frame = new Eleicao();
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
	public Eleicao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("20 - MARIA");
		lblNewLabel.setBounds(56, 40, 63, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("30 - PEDRO");
		lblNewLabel_1.setBounds(56, 65, 56, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("1 - NULO");
		lblNewLabel_2.setBounds(56, 116, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("2 - BRANCO");
		lblNewLabel_3.setBounds(56, 141, 63, 14);
		contentPane.add(lblNewLabel_3);

		JButton buttonVotar = new JButton("VOTAR");
		buttonVotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonVotar.setBounds(80, 198, 89, 23);
		contentPane.add(buttonVotar);

		JButton buttonCancelar = new JButton("CANCELAR");
		buttonCancelar.setBounds(256, 198, 89, 23);
		contentPane.add(buttonCancelar);

		JLabel lblNewLabel_4 = new JLabel("Seu Voto");
		lblNewLabel_4.setBounds(212, 87, 46, 23);
		contentPane.add(lblNewLabel_4);

		textField = new JTextField();
		textField.setBounds(288, 77, 86, 42);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
