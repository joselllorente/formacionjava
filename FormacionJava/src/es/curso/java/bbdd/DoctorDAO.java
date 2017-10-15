package es.curso.java.bbdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ejercicios.colecciones.hospital.Doctor;

public class DoctorDAO implements IDoctorDao{

	private Connection conex;
	
	public DoctorDAO(Connection conex) {
		super();
		this.conex = conex;
	}

	@Override
	public void deleteDoctor(int idDoctor) throws SQLException {
		String sql = "DELETE FROM TB_DOCTORES WHERE ID=?";
		
		PreparedStatement ps = conex.prepareStatement(sql);
		ps.setInt(1, idDoctor);
		
		int numRegistrosBorrados = ps.executeUpdate();
		
		if (numRegistrosBorrados==1){
			System.out.println("El doctor con id "+
					idDoctor + " se ha eliminado");
		}else{
			//Lanzar una excepcion personalizada
			System.out.println("El doctor con id "+
					idDoctor + " no se ha eliminado!!!!");
		}
		
		
		
	}

	@Override
	public void deleteDoctor(Doctor doctor) throws SQLException {
		deleteDoctor(doctor.getId());
		
	}

	@Override
	public void insertarDoctor(Doctor doc) throws SQLException{
		String sql = "INSERT INTO " +
				"TB_DOCTORES VALUES (?,?,?,?,?,?)";
		
		PreparedStatement ps = conex.prepareStatement(sql);
		ps.setInt(1, doc.getId());
		ps.setString(2, doc.getNombre());
		ps.setString(3, doc.getApellidos());
		ps.setString(4, doc.getDni());
		ps.setInt(5, doc.getEdad());
		ps.setString(6, doc.getEspecialidad());
		
		int numRegistrosInsertados = ps.executeUpdate();
		
		
		if (numRegistrosInsertados==1){
			System.out.println("Doctor "+doc+ " Insertado");
		}
		
	}

	@Override
	public Doctor selectDoctor(String dni) 
		throws SQLException{
		String sql = "SELECT * FROM TB_DOCTORES" +
				" WHERE DNI=?";

		PreparedStatement ps = conex.prepareStatement(sql);
		ps.setString(1, dni);
		
		ResultSet rs = ps.executeQuery();
		
		Doctor doctor = null; 
		
		while(rs.next()){
			int id = rs.getInt("ID");
			String nombre = rs.getString("NOMBRE");
			String apellidos = rs.getString("APELLIDOS");
			String dniBD = rs.getString("DNI");
			String especialidad = rs.getString("ESPECIALIDAD");
			int edad = rs.getInt("EDAD");
			
			doctor = new Doctor(nombre,apellidos,dniBD);
			doctor.setId(id);
			doctor.setEspecialidad(especialidad);
			doctor.setEdad(edad);
			
			
		}
		
		return doctor;
	}

	@Override
	public List<Doctor> selectDoctores() throws SQLException{
		List<Doctor> reply = new ArrayList<Doctor>();
		
		String sql = "SELECT * FROM TB_DOCTORES";
		
		PreparedStatement ps = conex.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		Doctor doctor = null;
		
		while(rs.next()){
			int id = rs.getInt("ID");
			String nombre = rs.getString("NOMBRE");
			String apellidos = rs.getString("APELLIDOS");
			String dniBD = rs.getString("DNI");
			String especialidad = rs.getString("ESPECIALIDAD");
			int edad = rs.getInt("EDAD");
			
			doctor = new Doctor(nombre,apellidos,dniBD);
			doctor.setId(id);
			doctor.setEspecialidad(especialidad);
			doctor.setEdad(edad);
			
			reply.add(doctor);
		}
		
		
		return reply;
	}

	@Override
	public void updateDoctor(int idDoctor, Doctor doc) throws SQLException{
		String sql = "UPDATE " +
		"TB_DOCTORES SET ID = ?, NOMBRE=?,APELLIDOS=?," +
		"DNI=?,EDAD=?,ESPECIALIDAD=? WHERE ID=?";

		PreparedStatement ps = conex.prepareStatement(sql);
		ps.setInt(1, doc.getId());
		ps.setString(2, doc.getNombre());
		ps.setString(3, doc.getApellidos());
		ps.setString(4, doc.getDni());
		ps.setInt(5, doc.getEdad());
		ps.setString(6, doc.getEspecialidad());
		ps.setInt(7,idDoctor);
		
		int numRegistrosActualizados = ps.executeUpdate();
		
		
		if (numRegistrosActualizados==1){
			System.out.println("Doctor "+doc+ " actualizado");
		}
		
	}

	
	
}
