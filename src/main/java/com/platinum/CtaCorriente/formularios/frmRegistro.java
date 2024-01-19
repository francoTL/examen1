package com.platinum.CtaCorriente.formularios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.platinum.CtaCorriente.bean.Persona;
import com.platinum.CtaCorriente.mantenimientos.GestionPersona;

public class frmRegistro extends JFrame{

	private JPanel contentPane;
	private JTextField txtRut;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRegistro frame = new frmRegistro();
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
	public frmRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("NUEVO REGISTRO");
		lblTitulo.setBounds(150, 20, 200, 50);
		contentPane.add(lblTitulo);
		
		JLabel lblRut = new JLabel("Rut:");
		lblRut.setBounds(50, 70, 65, 20);
		contentPane.add(lblRut);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(50, 90, 65, 20);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(50, 110, 65, 20);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setBounds(50, 130, 65, 20);
		contentPane.add(lblDireccion);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(50, 150, 65, 20);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(50, 170, 65, 20);
		contentPane.add(lblTelefono);
		
		txtRut = new JTextField();
		txtRut.setBounds(135, 70, 105, 20);
		contentPane.add(txtRut);
		txtRut.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setBounds(135, 90, 105, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(135, 110, 105, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(135, 130, 105, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(135, 150, 105, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(135, 170, 105, 20);
		contentPane.add(txtTelefono);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salir();
			}
		});
		btnSalir.setBounds(77, 210, 89, 23);
		contentPane.add(btnSalir);

		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnGuardar.setBounds(197, 210, 106, 23);
		contentPane.add(btnGuardar);
			
	}
	
	protected void guardar() {
		
		String rut = txtRut.getText();
		String nombre = txtNombre.getText();
		String apellido = txtApellido.getText();
		String direccion = txtDireccion.getText();
		String correo = txtCorreo.getText();
		String telefono = txtTelefono.getText();

		GestionPersona gestionPersona = new GestionPersona();

		Persona persona2 = new Persona();
		
		persona2.setRut(rut);
		persona2.setNombre(nombre);
		persona2.setApellido(apellido);
		persona2.setDireccion(direccion);
		persona2.setCorreo(correo);
		persona2.setTelefono(telefono);

		Persona perso = gestionPersona.registrarPersona(persona2);
				
		if (perso !=null) {
			JOptionPane.showMessageDialog(contentPane, "Registro correcto!");

		} else {
			JOptionPane.showMessageDialog(contentPane, "Datos invalidos", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}
	
	protected void salir() {
		this.dispose();
	}

}

