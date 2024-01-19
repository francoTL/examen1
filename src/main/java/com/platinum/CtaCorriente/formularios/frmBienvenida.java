package com.platinum.CtaCorriente.formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.platinum.CtaCorriente.bean.*;
import com.platinum.CtaCorriente.mantenimientos.GestionUsuario;

public class frmBienvenida extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmBienvenida frame = new frmBienvenida();
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
	public frmBienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblHola = new JLabel("Bienvenido a la pagina de inicio..!");
		lblHola.setBounds(116, 100, 200, 14);
		contentPane.add(lblHola);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salir();
			}
		});
		btnSalir.setBounds(77, 177, 89, 23);
		contentPane.add(btnSalir);

		JButton btnIngresar = new JButton("NUEVA PERSONA");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrar();
			}
		});
		btnIngresar.setBounds(197, 177, 150, 23);
		contentPane.add(btnIngresar);
	}
	
	protected void registrar() {
		
			frmRegistro registro = new frmRegistro();
			registro.setVisible(true);

	}
	
	protected void salir() {
		System.exit(0);
	}

}
