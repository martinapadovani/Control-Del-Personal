
import clases.Persona;
import clases.Empleado;
import clases.MetodosEmpleados;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Sector Recursos Humanos

		Empleado r1 = new Empleado("Romina", "Lopez", "rominalopez@gmail.con", 23034187, 2765, 87500, "maniana", "RRHH");

		Empleado r2 = new Empleado("Martin", "Rodriguez", "martinrodriguez@gmail.com", 37487129, 3287, 66300, "tarde",
				"RRHH");

		// Sector Finanzas

		Empleado f1 = new Empleado("Julieta", "Suarez", "julietasuarez@gmail.com", 35677235, 3094, 77500, "maniana",
				"Finanzas");

		Empleado f2 = new Empleado("Juan Martin", "Arocha", "juanmarocha@gmail.com", 36775304, 3953, 10200, "tarde",
				"Finanzas");

		// Sector Desarrollo

		Empleado d1 = new Empleado("Martina", "Padovani", "martinapadovani@gmail.com", 26598225, 2877, 96500, "maniana",
				"Desarrollo");

		Empleado d2 = new Empleado("Franco", "Pedraza", "francopedraza@gmail.com", 28576283, 3298, 85300, "tarde",
				"Desarrollo");

		Scanner scanner = new Scanner(System.in);
		

		// Lista empleados
		Empleado empleadosRRHH[] = {r1, r2};
		Empleado empleadosFinanzas[] = {f1, f2};
		Empleado empleadosDesarrollo[] = {d1, d2};

		//MetodosEmpleados listaEmpleados = new MetodosEmpleados(empleadosRRHH, empleadosFinanzas, empleadosDesarrollo);
		
		
		System.out.println("Elegir operacion que desea realizar, las opciones son: 'Ver', 'Agregar', 'Despedir' ");

		String operacion = scanner.nextLine();

		MetodosEmpleados metodosEmpleados = new MetodosEmpleados(empleadosRRHH, empleadosFinanzas, empleadosDesarrollo, operacion);

		metodosEmpleados.elegirOperacion(operacion);
		
		
		

	  // listaEmpleados.verEmpleados();
	   

	}

}
