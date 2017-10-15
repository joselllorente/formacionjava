package es.curso.java.bbdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ejercicios.colecciones.hospital.Doctor;
import es.curso.java.utils.Utilidades;

public class ConsultaDoctores {

	public static void main(String[] args) {
		
		Connection conex = Utilidades.getConexionBBDD();
		String especialidad ="Oftalmologia";
		
		if (conex!=null){
			PreparedStatement ps = null;
			
			String query = "SELECT ID, NOMBRE, APELLIDOS, "+
					"DNI FROM TB_DOCTORES";
			if (!especialidad.equals("")){
				query+=" WHERE ESPECIALIDAD=?";
			}
			System.out.println(query);
			try {
				ps = conex.prepareStatement(query);
				if (!especialidad.equals("")){
					ps.setString(1, especialidad);
				}
				
//				ps.setMaxRows(max)
				ResultSet rs = ps.executeQuery();
				
				Doctor doctor = null;
				List<Doctor> doctores= new ArrayList<Doctor>();
				while(rs.next()){
					//int id = rs.getInt("ID");
					String nombre = rs.getString("NOMBRE");
					String apellidos = rs.getString("APELLIDOS");
					String dni = rs.getString("DNI");
					//System.out.println("DNI: "+dni);
					doctor = new Doctor(nombre,apellidos,dni);
					doctores.add(doctor);
					
				}
				
				
				for (Doctor doctor2 : doctores) {
					System.out.println(doctor2);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}else{
			System.out.println("Ha ocurrido un problema en la conexion con la BBDD");
		}
		
	}

}
