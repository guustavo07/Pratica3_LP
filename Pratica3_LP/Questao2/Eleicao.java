package Questao2;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;

public class Eleicao extends JFrame {
	int vtMaria, vtPedro, vtNulo, vtBranco, totalVotos;
	private JPanel contentPane;
	private JTextField txtVoto;
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

		JLabel votoMaria = new JLabel("20 - MARIA");
		votoMaria.setBounds(56, 40, 63, 14);
		contentPane.add(votoMaria);

		JLabel votoPedro = new JLabel("30 - PEDRO");
		votoPedro.setBounds(56, 65, 56, 14);
		contentPane.add(votoPedro);

		JLabel votoNulo = new JLabel("1 - NULO");
		votoNulo.setBounds(56, 116, 46, 14);
		contentPane.add(votoNulo);

		JLabel votoBranco = new JLabel("2 - BRANCO");
		votoBranco.setBounds(56, 141, 63, 14);
		contentPane.add(votoBranco);

		JButton buttonVotar = new JButton("VOTAR");
		buttonVotar.setForeground(new Color(255, 255, 0));
		buttonVotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int voto = Integer.parseInt(txtVoto.getText());
				if(voto == 20) {
					vtMaria++;
					totalVotos++;
					JOptionPane.showMessageDialog(null, "Voto Confirmado!");
					txtVoto.setText("");
				}else if(voto == 30) {
					vtPedro++;
					totalVotos++;
					JOptionPane.showMessageDialog(null, "Voto Confirmado!");
					txtVoto.setText("");
				}else if(voto == 1) {
					vtNulo++;
					totalVotos++;
					JOptionPane.showMessageDialog(null, "Voto Confirmado!");
					txtVoto.setText("");
				}else if(voto == 2) {
					vtBranco++;
					totalVotos++;
					JOptionPane.showMessageDialog(null, "Voto Confirmado!");
					txtVoto.setText("");
				}else
					JOptionPane.showMessageDialog(null, "Voto inválido!");
					txtVoto.setText("");
			}
		});
		buttonVotar.setBounds(56, 176, 89, 23);
		contentPane.add(buttonVotar);

		JButton buttonCancelar = new JButton("CANCELAR");
		buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonCancelar.setBounds(255, 176, 89, 23);
		contentPane.add(buttonCancelar);

		JLabel lblNewLabel_4 = new JLabel("Seu Voto:");
		lblNewLabel_4.setBounds(222, 87, 56, 23);
		contentPane.add(lblNewLabel_4);

		txtVoto = new JTextField();
		txtVoto.setBounds(288, 77, 86, 42);
		contentPane.add(txtVoto);
		txtVoto.setColumns(10);
		
		JButton buttonEncerrar = new JButton("ENCERRAR VOTA\u00C7\u00C3O");
		buttonEncerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vtMaria > vtPedro) {
					vtMaria = vtMaria/totalVotos*100;
					JOptionPane.showMessageDialog(null, "Maria foi a candidata mais votada!");
				}else if(vtPedro > vtMaria){
					// calcular percentual
			}
			}
		});
		buttonEncerrar.setForeground(Color.RED);
		buttonEncerrar.setBounds(139, 210, 139, 33);
		contentPane.add(buttonEncerrar);
	}
}
