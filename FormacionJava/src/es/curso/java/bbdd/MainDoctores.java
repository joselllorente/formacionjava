package es.curso.java.bbdd;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import es.curso.java.ejercicios.colecciones.hospital.Doctor;
import es.curso.java.utils.Utilidades;

public class MainDoctores {

	public static void main(String[] args) {
	
		Connection conexionBBDD = null;
		int opcion = 0;
		conexionBBDD = Utilidades.getConexionBBDD();
		
		do{
			String [] opciones = {"1. Consultar Doctores",
				"2. Consulta por DNI",
				"3. Insertar Doctor",
				"4. Actualizar Doctor",
				"5. Borrar Doctor",
				"6. Salir"};
		
			
			opcion = Utilidades.pintaMenu(opciones);
			
			switch (opcion){
				case 1: consultaDoctores(conexionBBDD);break;
				case 2: consultaDoctorDNI(conexionBBDD);break;
				case 3: insertarDoctor(conexionBBDD);break;
				case 4: actualizarDoctor(conexionBBDD);break;
				case 5: borrarDoctor(conexionBBDD);break;
				case 6: cierraConexion(conexionBBDD);break;
				default: System.out.println("Opcion incorrecta");
			}
		}while (opcion!=6);
	
		
		System.out.println("ADIOS!!!");
	}
	
	
	private static void  consultaDoctores(Connection conex){
		DoctorDAO ddao = new DoctorDAO(conex);
		try {
			List<Doctor> doctores = ddao.selectDoctores();
			for (Doctor doctor : doctores) {
				System.out.println(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	private static void  consultaDoctorDNI(Connection conex){
		DoctorDAO ddao = new DoctorDAO(conex);
		
		String dni = Utilidades.pideCadena("Introduce DNI");
		
		try {
			Doctor doctor = ddao.selectDoctor(dni);
			if (doctor!=null){
				System.out.println(doctor);
			}else{
				System.out.println("No hay doctor con ese DNI");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	private static void  insertarDoctor(Connection conex){
		DoctorDAO ddao = new DoctorDAO(conex);
		
		Doctor doc = pideDatosDoctor();
		
		
		try {
			ddao.insertarDoctor(doc);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	private static void cierraConexion(Connection conexionBBDD){
		
		try {
			conexionBBDD.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void actualizarDoctor(Connection conexionBBDD){
		DoctorDAO ddao = new DoctorDAO(conexionBBDD);
		
		int idDoctor = Utilidades.pideEntero("Introduce ID doctor a eliminar");
		Doctor doc = pideDatosDoctor();
		
		try {
			ddao.updateDoctor(idDoctor, doc);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void borrarDoctor (Connection conexion){
		DoctorDAO ddao = new DoctorDAO(conexion);
		
		int idDoctor = Utilidades.pideEntero("Introduce ID doctor a eliminar");
		
		try {
			ddao.deleteDoctor(idDoctor);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	private static Doctor pideDatosDoctor(){
		Doctor reply=null;
		
		int id = Utilidades.pideEntero("Introduce ID");
		int edad = Utilidades.pideEntero("Introduce Edad");
		String nombre = Utilidades.pideCadena("Introduce Nombre");
		String apellidos = Utilidades.pideCadena("Introduce Apellidos");
		String dni = Utilidades.pideCadena("Introduce DNI");
		String especialidad = Utilidades.pideCadena("Introduce Especialidad");

		reply = new Doctor (nombre,apellidos,dni);
		reply.setId(id);
		reply.setEdad(edad);
		reply.setEspecialidad(especialidad);
		
		return reply;
	}
}







