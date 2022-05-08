package poo2.abstractfactory.client;

import poo2.abstractfactory.factories.EmpleadoFactory;
import poo2.abstractfactory.factories.EmpleadoLocalFactory;
import poo2.abstractfactory.factories.EmpleadoRemotoFactory;
import poo2.abstractfactory.factories.EmpleadoTercerizadoFactory;
import poo2.abstractfactory.objects.Empleado;

public class AppClient {

	public static void main(String[] args) {
		
		AppClient app = new AppClient();
		
		EmpleadoFactory factory = app.configureApplication(2);
		
		
		Empleado emp = factory.crearEmpleado();
		emp.setEdad(5);
		
		emp = factory.crearEmpleado();
		emp.setEdad(7);
		
		emp = factory.crearEmpleado();
		emp.setEdad(8);
		
	}
	
	private EmpleadoFactory configureApplication(int parametro) {
		
		EmpleadoFactory factory = null;
		
		// Se simula la revisión de parámetros de configuracion
//		int random = ((new Random()).nextInt()*10);
		
		if(parametro==1)
			factory = new EmpleadoLocalFactory();
		else if(parametro==2)
			factory = new EmpleadoRemotoFactory();
		else 
			factory = new EmpleadoTercerizadoFactory();
		
		return factory;
		
	}
	
}
