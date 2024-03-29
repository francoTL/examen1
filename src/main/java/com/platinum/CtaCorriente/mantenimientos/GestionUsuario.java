package com.platinum.CtaCorriente.mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.platinum.CtaCorriente.bean.*;
import com.platinum.CtaCorriente.utils.*;

public class GestionUsuario {
	

public Usuario obtenerUsuario(Usuario usu){
	
	Usuario usuario = null;
	
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	try {
	
		con = MySQLConexion.getConexion();
	
		String sql = "select*from usuario where nombreUsuario = ? and password =  ? ";
		
		pst = con.prepareStatement(sql);
		
		pst.setString(1, usu.getUsuario());
		pst.setString(2, usu.getClave());
		
		rs = pst.executeQuery();
		
		while (rs.next()) {
			usuario = new Usuario(rs.getString(1), rs.getString(2));
			
		}	
		
	} catch (Exception e) {
	System.out.println("Error en obtener usuario");
	}	
	
	return usuario;
	
	}	

}
