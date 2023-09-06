package clases;

import java.util.Scanner;
import clases.Persona;
import clases.Empleado;

public class MetodosEmpleados {
	
	int sector;
	String operacion;
	Scanner scanner = new Scanner(System.in);
	
	Empleado empleadosRRHH[] = {}; //RRHH
	Empleado empleadosFinanzas[]; //Finanzas
	Empleado empleadosDesarrollo[]; //Desarrollo
	
	public MetodosEmpleados (Empleado [] empleadosRRHH, Empleado empleadosFinanzas[], Empleado empleadosDesarrollo[], String operacion) {
		
		this.empleadosRRHH = empleadosRRHH;
		this.empleadosFinanzas = empleadosFinanzas;
		this.empleadosDesarrollo = empleadosDesarrollo;
		this.operacion = operacion;
	}
	
	
	/* public MetodosEmpleados (String operacion) {
		
		this.operacion = operacion;
	}
	
	/*public MetodosEmpleados (int sector) {
	
	this.sector = sector;
     } */
	///
	
	public void getEmpleado() {
		
		for (Empleado empleadoIngresado: empleadosRRHH) {
			
			System.out.println(empleadoIngresado);
		}
	}
	
 
  // ELEGIR OPERACION 
 
  public void elegirOperacion (String operacion) {
	 
	 switch (operacion) {
		
		case "Ver": 
			
			verEmpleados();
			break;
			
		case "Agregar": 
			
			agregarEmpleados ();
			break;
			
		case "Despedir": 
			
			despedirEmpleado ();
			break;
			
		default: 
			
			System.out.println("Opcion invalida, vuelva a intentarlo");
			break;
    }
}
     //Ver 
  
    public void verEmpleados () {
    	
    	System.out.println("Eligio la opcion de Ver Empleados!");
    	
    	System.out.println("Elija el sector de empleados que desea ver, las opciones son: ");
    	System.out.println("1. RRHH");
    	System.out.println("2. Finanzas");
    	System.out.println("3. Desarrollo");
    	
    	int sector = scanner.nextInt();
    	
    	if (sector == 1) {
    		
    		System.out.println("Los empleados del area de RRHH son: ");
    		
    		for (Empleado empleadoIngresado: empleadosRRHH) {
    			
    		  System.out.println(empleadoIngresado);
    		}
    	}
    	else if (sector == 2) {
    		
    		System.out.println("Los empleados del area de Finanzas son: ");
    		
            for (Empleado empleadoIngresado: empleadosFinanzas) {
            	
    			System.out.println(empleadoIngresado);
    		}	
    	}
    	else if (sector == 3) {
    		
    		System.out.println("Los empleados del area de Desarrollo son: ");
    		
    		 for (Empleado empleadoIngresado: empleadosDesarrollo) {
     			
     			System.out.println(empleadoIngresado);
     		}	
    	}
    	else {
    		
    		System.out.println("Opcion invalida");
    	}
  }
 
     //Agregar
    
    public void agregarEmpleados () {
    	
    	System.out.println("Eligio la opcion de Agregar Empleados!");
    	
    	System.out.println("Ingrese el nombre del nuevo empleado");
    	String nombreEmpleado = scanner.nextLine();
    	
    	System.out.println("Ingrese el apellido del nuevo empleado");
    	String apellidoEmpleado = scanner.nextLine();
    	
    	System.out.println("Ingrese el email del nuevo empleado");
    	String emailEmpleado = scanner.nextLine();
    	
    	System.out.println("Ingrese el dni del nuevo empleado");
    	int dniEmpleado = scanner.nextInt();
    	
    	System.out.println("Ingrese el id del nuevo empleado");
    	int idEmpleado = scanner.nextInt();
    	
    	System.out.println("Ingrese el sueldo del nuevo empleado");
    	int sueldoEmpleado = scanner.nextInt();
    	
    	System.out.println("Ingrese el turno del nuevo empleado");
    	String turnoEmpleado = scanner.nextLine();
    	
    	System.out.println("Ingrese el sector del nuevo empleado, las opciones son:  'RRHH', 'Desarrollo', 'Finanzas' ");
    	String sectorEmpleado = scanner.nextLine();
    	
    	Empleado nuevoEmpleado = new Empleado
    			(nombreEmpleado, apellidoEmpleado, emailEmpleado, dniEmpleado, idEmpleado, sueldoEmpleado, turnoEmpleado, sectorEmpleado);
   
         if (sectorEmpleado.equals("RRHH")) {
    		
        	 empleadosRRHH [empleadosRRHH.length-1] = nuevoEmpleado; 
        	 
        	 System.out.println("El empleado: " + nombreEmpleado + " " + apellidoEmpleado + " fue cargad@ exitosamente!");
    	}
         
         else if (sectorEmpleado.equals("Desarrollo")) {
    		
        	 empleadosDesarrollo [empleadosDesarrollo.length-1] = nuevoEmpleado; 
        	 
        	 System.out.println("El empleado: " + nombreEmpleado + " " + apellidoEmpleado + " fue cargad@ exitosamente!");
    	}
         
        else if (sectorEmpleado.equals("Finanzas")) {
     		
        	 empleadosFinanzas [empleadosFinanzas.length-1] = nuevoEmpleado; 
        	 
        	 System.out.println("El empleado: " + nombreEmpleado + " " + apellidoEmpleado + " fue cargad@ exitosamente!");
    	}
         
        else {
        	System.out.println("El sector ingresado no existe");
        }
    
    }
    
     //Despedir
    
    public void despedirEmpleado () {
    	
    	System.out.println("Eligio la opcion de despedir empleado!");
    	
    	System.out.println("Elija el sector de empleados que desea ver, las opciones son: ");
    	System.out.println("1. RRHH");
    	System.out.println("2. Desarrollo");
    	System.out.println("3. Finanzas");
    	int sector = scanner.nextInt();
    	
    	
    	if (sector ==1 ) { //RRHH
    		
    		System.out.println("ingrese el id de la persona que desea despedir");
    		int idDespedido = scanner.nextInt();
    		
    		Empleado empleadosRRHHauxiliar [] = new Empleado [empleadosRRHH.length-1];
    		
    		for (int i = 0; i<empleadosRRHH.length; i++) {
    			
    			 if (idDespedido != empleadosRRHH [i].getIdEmpleado()); {
    				empleadosRRHH [i] = empleadosRRHHauxiliar [i];
    			}
    		}
    		empleadosRRHHauxiliar = empleadosRRHH;
    		
    		System.out.println("El empleado despedido ha sido eliminado del sistema exitosamente!");
    		System.out.println("Los actuales empleados en el area de RRHH son: ");
    		
    		for (int i = 0; i<empleadosRRHH.length; i++) {
    			
        		if (empleadosRRHH[i] == null ){
        				continue; 
        		} 
        		  System.out.println(empleadosRRHH[i]);
        		}
    	}
  
    	if (sector==2) { //Desarrollo
    		
    		System.out.println("ingrese el id de la persona que desea despedir");
    		int idDespedido = scanner.nextInt();
    		
    		Empleado empleadosDesarrolloAuxiliar [] = new Empleado [empleadosDesarrollo.length-1];
    		
    		for (int i = 0; i<empleadosDesarrollo.length; i++) {
    			
    			 if (idDespedido != empleadosDesarrollo [i].getIdEmpleado()); {
    				 empleadosDesarrollo [i] = empleadosDesarrolloAuxiliar [i];
    			}
    		}
    		empleadosDesarrolloAuxiliar = empleadosDesarrollo;
    		
    		System.out.println("El empleado despedido ha sido eliminado del sistema exitosamente!");
    		System.out.println("Los actuales empleados en el area de desarrollo son: ");
    		
    		for (int i = 0; i<empleadosDesarrollo.length; i++) {
    			
        		if (empleadosDesarrollo[i] == null ){
        				continue; 
        		} 
        		  System.out.println(empleadosDesarrollo[i]);
        		}
    		
    		
    	}
    	
    	if (sector==3) { //Finanzas
    		
    		System.out.println("ingrese el id de la persona que desea despedir");
    		int idDespedido = scanner.nextInt();
    		
    		Empleado empleadosFinanzasAuxiliar [] = new Empleado [empleadosFinanzas.length-1];
    		
    		for (int i = 0; i<empleadosFinanzas.length; i++) {
    			
    			 if (idDespedido != empleadosFinanzas [i].getIdEmpleado()); {
    				 empleadosFinanzas [i] = empleadosFinanzasAuxiliar [i];
    			}
    		}
    		empleadosFinanzasAuxiliar = empleadosFinanzas;
    		
    		System.out.println("El empleado despedido ha sido eliminado del sistema exitosamente!");
    		System.out.println("Los actuales empleados en el area de finanzas son: ");
    		
    		for (int i = 0; i<empleadosFinanzas.length; i++) {
    			
        		if (empleadosFinanzas[i] == null ){
        				continue; 
        		} 
        		  System.out.println(empleadosFinanzas[i]);
        		}	
    	}
    }
    
    

}
