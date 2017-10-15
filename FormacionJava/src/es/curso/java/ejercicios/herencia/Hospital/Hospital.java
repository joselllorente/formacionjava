package es.curso.java.ejercicios.herencia.Hospital;

import java.util.Scanner;

public class Hospital {
	String nombre,apellidos,dni;
	int edad;
	Doctor [] doctores = new Doctor[3];
	Empleado [] empleados = new Empleado[5];
	Enfermo[] salaDeEspera = new Enfermo[20];
	
	public static void main(String[] args) {
		int opcion=0;
		Hospital hospital = new Hospital();
		do{
			hospital.pintarMenu();
			Scanner scan = new Scanner (System.in);
			opcion = scan.nextInt();
			if (opcion==1){
				hospital.insertarDoctor();
			}else if (opcion==2){
				hospital.insertarEmpleado();
			}else if (opcion==3){
				hospital.insertarEnfermo();
			}else if (opcion==4){
				hospital.mostrarDoctores();
			}
		}while(opcion!=6);
		
	}
	
	public void pintarMenu(){
		System.out.println("1. Insertar Doctor");
		System.out.println("2. Insertar Empleado");
		System.out.println("3. Insertar Enfermo");
		System.out.println("4. Mostrar Doctores");
		System.out.println("1. ");
		System.out.println("6. Salir");
		System.out.println("Elige una opcion");
	}
	
	public void insertarDoctor(){
		boolean hayPlazasLibres=false;
		int pos=0;
		for (Doctor doctor:doctores){
			if (doctor==null){
				hayPlazasLibres=true;
				break;
			}
			pos++;
		}
		if (hayPlazasLibres){
			pedirDatos();
			Scanner scan = new Scanner (System.in);
			System.out.println("Escribe la especialidad");
			String especialidad = scan.nextLine();
			Doctor doc = new Doctor(nombre,apellidos,edad,dni,especialidad);
			doctores[pos]=doc;
		}else{
			System.out.println("No hay plazas libres para un nuevo doctor");
		}
	}
	
	public void insertarEmpleado(){
		boolean hayPlazasLibres=false;
		int pos=0;
		for (Empleado empleado:empleados){
			if (empleado==null){
				hayPlazasLibres=true;
				break;
			}
			pos++;
		}
		if (hayPlazasLibres){
			pedirDatos();
			Scanner scan = new Scanner (System.in);
			System.out.println("Escribe la sala");
			String sala = scan.nextLine();
			Empleado emp = new Empleado(nombre,apellidos,edad,dni,sala);
			empleados[pos]=emp;
		}else{
			System.out.println("No hay plazas libres para un nuevo empleado");
		}
	}

	public void insertarEnfermo(){
		boolean hayDoctorLibre=false;
		pedirDatos();
		Scanner scan = new Scanner (System.in);
		System.out.println("Escribe la enfermedad");
		String enfermedad = scan.nextLine();
		Enfermo enfermo = new Enfermo(nombre,apellidos,edad,dni,enfermedad);
		
		for (Doctor doctor:doctores){
			if (doctor!=null && doctor.getEnfermo()==null){
				hayDoctorLibre=true;
				doctor.setEnfermo(enfermo);
				
				break;
			}
		}
		if (!hayDoctorLibre){
			int pos=0;
			for (Enfermo paciente:salaDeEspera){
				if (paciente==null){
					salaDeEspera[pos]=enfermo;
					break;
				}
				pos++;
			}
		}
	}
	
	public void pedirDatos(){
		Scanner scan = new Scanner (System.in);
		System.out.println("Escribe el nombre");
		nombre = scan.nextLine();
		System.out.println("Escribe apellidos");
		scan = new Scanner (System.in);
		apellidos = scan.nextLine();
		System.out.println("Escribe el dni");
		scan = new Scanner (System.in);
		dni = scan.nextLine();
		System.out.println("Escribe la edad");
		scan = new Scanner (System.in);
		edad = scan.nextInt();
	}
	
	public void mostrarDoctores(){
		for (Doctor doctor : doctores) {
			doctor.mostrarDatos();
		}
	}
}
