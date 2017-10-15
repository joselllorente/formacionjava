package es.curso.java.bbdd;

import java.sql.SQLException;
import java.util.List;

import es.curso.java.ejercicios.colecciones.hospital.Doctor;

public interface IDoctorDao {
	
	public void insertarDoctor(Doctor doc) throws SQLException;
	public void updateDoctor(int idDoctor,Doctor doc) throws SQLException;
	public void deleteDoctor(int idDoctor) throws SQLException;
	public void deleteDoctor(Doctor Doctor) throws SQLException;
	public List<Doctor> selectDoctores () throws SQLException;
	public Doctor selectDoctor (String dni) throws SQLException;
	
}
