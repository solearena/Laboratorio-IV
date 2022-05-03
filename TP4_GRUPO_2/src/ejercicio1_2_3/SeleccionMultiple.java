package ejercicio1_2_3;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SeleccionMultiple extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private ButtonGroup buttonGroup;
	private JPanel contentPane;
	private JTextField txtfCantHoras;
	private JCheckBox chckbxProgramacin;
	private JCheckBox chckbxAdministracin;
	private JCheckBox chckbxDiseoGrfico; 

	public SeleccionMultiple() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		setTitle("Seleccion multiple");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 464, 45);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Elige un sistema operativo");
		lblNewLabel.setBounds(10, 11, 165, 14);
		panel.add(lblNewLabel);

		buttonGroup = new ButtonGroup();

		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(181, 7, 103, 23);
		rdbtnWindows.setActionCommand("Windows");
		panel.add(rdbtnWindows);
		buttonGroup.add(rdbtnWindows);

		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(286, 7, 91, 23);
		rdbtnMac.setActionCommand("Mac");
		panel.add(rdbtnMac);
		buttonGroup.add(rdbtnMac);

		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(379, 7, 79, 23);
		rdbtnLinux.setActionCommand("Linux");
		panel.add(rdbtnLinux);
		buttonGroup.add(rdbtnLinux);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 67, 464, 93);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		
		chckbxProgramacin = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacin.setBounds(264, 7, 194, 23);
		panel_1.add(chckbxProgramacin);

		chckbxAdministracin = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracin.setBounds(264, 33, 194, 23);
		panel_1.add(chckbxAdministracin);

		chckbxDiseoGrfico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDiseoGrfico.setBounds(264, 59, 194, 23);
		panel_1.add(chckbxDiseoGrfico);

		JLabel lblEligeUnaEspecialidad = new JLabel("Elige una especialidad");
		lblEligeUnaEspecialidad.setBounds(10, 37, 226, 14);
		panel_1.add(lblEligeUnaEspecialidad);

		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en la computadora");
		lblCantidadDeHoras.setBounds(10, 171, 322, 14);
		contentPane.add(lblCantidadDeHoras);

		txtfCantHoras = new JTextField();
		txtfCantHoras.setBounds(388, 168, 86, 20);
		contentPane.add(txtfCantHoras);
		txtfCantHoras.setColumns(10);
		txtfCantHoras.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num = e.getKeyChar();
				CheckOnlyNumbers(num, e);

			}
		});

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comprobarRadioButtons(rdbtnWindows, rdbtnMac, rdbtnLinux)) {
					if (comprobarCheckBoxes(chckbxProgramacin, chckbxAdministracin, chckbxDiseoGrfico)) {
						if (txtfCantHoras.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de horas.");
						} else
						if(comprobarHorasIngresadas(txtfCantHoras)) {
							JOptionPane.showMessageDialog(null, getInformacionSeleccionada());
						}
						
					} else {
						JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una especialidad.");
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Debe seleccionar un sistema operativo.");
				}
				
			}
		});
		btnAceptar.setBounds(385, 227, 89, 23);
		contentPane.add(btnAceptar);
	}

	private void CheckOnlyNumbers(char num, KeyEvent e) {
		if (Character.isLetter(num) || num=='-' || num=='+') {
			getToolkit().beep();
			e.consume();
			JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
		}
	}
	
	private boolean comprobarRadioButtons(JRadioButton jrb1, JRadioButton jrb2, JRadioButton jrb3) {
		boolean retorno = true;
		
		if ((!(jrb1.isSelected()) && !(jrb2.isSelected()) && !(jrb3.isSelected()))) {
			retorno = false;
		}
		
		return retorno;
	}
	
	private boolean comprobarCheckBoxes(JCheckBox jcb1, JCheckBox jcb2, JCheckBox jcb3) {
		boolean retorno = true;
		
		if ((!(jcb1.isSelected()) && !(jcb2.isSelected()) && !(jcb3.isSelected()))) {
			retorno = false;
		}
		
		return retorno;
	}
	
	private boolean comprobarHorasIngresadas(JTextField jtf) {
		boolean retorno = true;
		
		String input = jtf.getText();
		float horas = -1;	
		if (input.length() > 0) {
			try {
				horas = Float.valueOf(input).floatValue();
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "La cantidad de horas ingresada no es valida.\n Utilice punto(.) para ingresar decimales, la coma no esta permitida");
				System.out.println("Cant. de horas no valida");
				retorno = false;
			}
			if (horas < 0 || horas > 24) {
				JOptionPane.showMessageDialog(null, "La cantidad de horas ingresada no es valida. \n Debe estar entre 0 y 24 horas.");
				retorno = false;
			}
			
		}
		
		return retorno;
}
	
	private String getInformacionSeleccionada() {
		String retorno;
		retorno = buttonGroup.getSelection().getActionCommand() + " - ";
		if(chckbxProgramacin.isSelected()) {
			retorno += chckbxProgramacin.getText() + " - ";
		}
		if(chckbxAdministracin.isSelected()) {
			retorno += chckbxAdministracin.getText() + " - ";
		}
		if(chckbxDiseoGrfico.isSelected()) {
			retorno += chckbxDiseoGrfico.getText() + " - ";
		}
		retorno += txtfCantHoras.getText() + " Hs";
		return retorno;
	}
}
	