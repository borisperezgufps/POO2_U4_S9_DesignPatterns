package poo2.abstractfactory.factories;

import poo2.abstractfactory.objects.Empleado;
import poo2.abstractfactory.objects.EmpleadoEnSitio;

public class EmpleadoLocalFactory implements EmpleadoFactory {

	@Override
	public Empleado crearEmpleado() {
		
		EmpleadoEnSitio emp = new EmpleadoEnSitio();
		
		return emp;
	}

}
