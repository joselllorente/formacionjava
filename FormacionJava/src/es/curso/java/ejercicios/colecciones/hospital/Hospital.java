package es.curso.java.ejercicios.colecciones.hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	public static void main(String[] args) {
		Doctor d1 = new Doctor ("Doctor1","Apellido","1111A",43, 78, "Medicina General");
		
		List<EmpleadoHospital> empleados = new ArrayList<EmpleadoHospital>();
		empleados.add(d1);
		ficharEmpleados(empleados);
		
		Paciente p = new Paciente ("P1","A1","D","Dolor De Cabeza");
		Paciente p2 = new Paciente ("P2","A2","D","Dolor De Cabeza");
		List<Paciente> salaEspera = new ArrayList<Paciente>();
		
		salaEspera.add(p);
		salaEspera.add(p2);
		
		System.out.println(salaEspera.size());
		for (Paciente paciente : salaEspera) {
			System.out.println("Paciente "+ paciente.getNombre());
			//salaEspera.remove(paciente);
			
			boolean estaEnfermo = d1.tratarPaciente(paciente);
			
			if (!estaEnfermo){
				System.out.println("El paciente "+paciente.getNombre() + " Abandona el hospital");
			}else{
				System.out.println("El paciente se queda en el hospital con el doctor "+d1.getNombre());
			}
			
		}
		
		
		ficharEmpleado(d1);

	}
	
	private static void ficharEmpleado (EmpleadoHospital eh){
		
			eh.fichar();
			
	}
	
	private static void ficharEmpleados (List<EmpleadoHospital> eh){
		for (EmpleadoHospital empleadoHospital : eh) {
			empleadoHospital.fichar();
		}
	}

}
