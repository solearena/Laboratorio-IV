package ejercicio1_2_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGrupoNro = new JLabel("GRUPO NRO: 2");
		lblGrupoNro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGrupoNro.setBounds(29, 29, 118, 14);
		contentPane.add(lblGrupoNro);
		
		JButton btnEjercicio = new JButton("Ejercicio 1");
		btnEjercicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contactos contacto = new Contactos();
				contacto.cambiarVisibilidad(true);
			}
		});
		btnEjercicio.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEjercicio.setBounds(158, 63, 118, 25);
		contentPane.add(btnEjercicio);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Promedio promedio = new Promedio();
				promedio.cambiarVisibilidad(true);
			}
		});
		btnEjercicio2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEjercicio2.setBounds(158, 116, 118, 25);
		contentPane.add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEjercicio3.setBounds(158, 164, 118, 25);
		contentPane.add(btnEjercicio3);
	}

	public void cambiarVisibilidad(boolean estado) {
		
		setVisible(estado);
	}
}
