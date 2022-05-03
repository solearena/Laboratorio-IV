package ejercicio1_2_3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Contactos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	private JButton btnMostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contactos frame = new Contactos();
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
	public Contactos() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(68, 39, 78, 22);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNombre.setBounds(156, 39, 165, 22);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellido.setBounds(68, 72, 78, 22);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtApellido.setColumns(10);
		txtApellido.setBounds(156, 72, 165, 22);
		contentPane.add(txtApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTelefono.setBounds(68, 105, 78, 22);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(156, 105, 165, 22);
		contentPane.add(txtTelefono);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFechaNac.setBounds(68, 138, 78, 22);
		contentPane.add(lblFechaNac);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(156, 138, 165, 22);
		contentPane.add(txtFechaNac);
		
		JLabel lbldatosing = new JLabel("Los datos ingresados fueron:");
		lbldatosing.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbldatosing.setBounds(68, 205, 190, 22);
		contentPane.add(lbldatosing);
		
		JLabel lblDatos = new JLabel("");
		lblDatos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDatos.setBounds(68, 228, 327, 22);
		contentPane.add(lblDatos);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDatos.setText("");
				
				if(txtNombre.getText().isEmpty()) {
					txtNombre.setBackground(Color.RED);
				}
				else {
					txtNombre.setBackground(Color.WHITE);
				}
				if(txtApellido.getText().isEmpty()) {
					txtApellido.setBackground(Color.RED);
				}
				else {
					txtApellido.setBackground(Color.WHITE);
				}
				if(txtTelefono.getText().isEmpty()) {
					txtTelefono.setBackground(Color.RED);
				}
				else {
					txtTelefono.setBackground(Color.WHITE);
				}
				if(txtFechaNac.getText().isEmpty()) {
					txtFechaNac.setBackground(Color.RED);
				}
				else {
					txtFechaNac.setBackground(Color.WHITE);
				}
				
				
				if(!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtTelefono.getText().isEmpty() && !txtFechaNac.getText().isEmpty() )
				{
					lblDatos.setText(txtNombre.getText()+ " "+ txtApellido.getText()+", "+ txtTelefono.getText() + ", " + txtFechaNac.getText() );
				
				txtNombre.setText("");
				txtNombre.setBackground(Color.WHITE);
				txtApellido.setText("");
				txtApellido.setBackground(Color.WHITE);
				txtTelefono.setText("");
				txtTelefono.setBackground(Color.WHITE);
				txtFechaNac.setText("");
				txtFechaNac.setBackground(Color.WHITE);
				}
			}
		});
		btnMostrar.setBounds(232, 171, 89, 23);
		contentPane.add(btnMostrar);
		
		
	}

	public void cambiarVisibilidad(boolean estado) {
		
		setVisible(estado);
	}
}
