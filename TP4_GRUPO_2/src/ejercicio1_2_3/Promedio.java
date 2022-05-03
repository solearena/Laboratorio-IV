package ejercicio1_2_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Promedio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Promedio frame = new Promedio();
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
	public Promedio() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(31, 11, 250, 145);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(100, 21, 123, 20);
		panel.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(100, 52, 123, 20);
		panel.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(100, 83, 123, 20);
		panel.add(txtNota3);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota1.setBounds(44, 24, 46, 14);
		panel.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota2.setBounds(44, 55, 46, 14);
		panel.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota3.setBounds(44, 86, 46, 14);
		panel.add(lblNota3);
		
		JComboBox cbxTps = new JComboBox();
		cbxTps.setEditable(true);
		cbxTps.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		cbxTps.setBounds(100, 114, 123, 20);
		panel.add(cbxTps);
		
		JLabel lblTps = new JLabel("TPS:");
		lblTps.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTps.setBounds(44, 117, 46, 14);
		panel.add(lblTps);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(31, 167, 250, 89);
		contentPane.add(panel_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(100, 21, 123, 20);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(100, 52, 123, 20);
		panel_1.add(textField_1);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPromedio.setBounds(33, 24, 57, 14);
		panel_1.add(lblPromedio);
		
		JLabel lblCondicin = new JLabel("Condici\u00F3n:");
		lblCondicin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCondicin.setBounds(33, 55, 57, 14);
		panel_1.add(lblCondicin);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcular.setBackground(SystemColor.activeCaption);
		btnCalcular.setForeground(Color.BLACK);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.setBounds(312, 50, 101, 32);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNuevo.setBackground(SystemColor.activeCaption);
		btnNuevo.setForeground(Color.BLACK);
		btnNuevo.setBounds(312, 93, 101, 32);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBackground(SystemColor.activeCaption);
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setBounds(312, 136, 101, 32);
		contentPane.add(btnSalir);
	}
	
	public void cambiarVisibilidad(boolean estado) {
		
		setVisible(estado);
	}
	
}
