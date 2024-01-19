package com.platinum.CtaCorriente.mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.platinum.CtaCorriente.bean.*;
import com.platinum.CtaCorriente.utils.*;

public class GestionPersona {
	

public Persona registrarPersona(Persona perso){
	
	Persona persona = null;
	
	Connection con = null;
	PreparedStatement pst = null;
	
	try {
	
		con = MySQLConexion.getConexion();
	
		String sql = "insert into persona (rut, nombre, apellido, direccion, correo, telefono) values (?, ?, ?, ?, ?, ? )";
		
		pst = con.prepareStatement(sql);
		
		pst.setString(1, perso.getRut());
		pst.setString(2, perso.getNombre());
		pst.setString(3, perso.getApellido());
		pst.setString(4, perso.getDireccion());
		pst.setString(5, perso.getCorreo());
		pst.setString(6, perso.getTelefono());
		
		pst.execute();
		
		if(pst != null) {
			persona = new Persona(perso.getRut(), perso.getNombre(), perso.getApellido(), perso.getDireccion(), perso.getCorreo(), perso.getTelefono());
			System.out.println("Ok");
		}
		
	} catch (Exception e) {
	System.out.println("Error al registrar");
	}	
	
	return persona;
	
	}	

}
