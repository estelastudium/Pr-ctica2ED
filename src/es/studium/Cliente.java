package es.studium;

/**
 * La clase Cliente representa la información personal de un cliente en el sistema.
 * Almacena detalles como el DNI, nombre y dirección del cliente.
 * Proporciona métodos para acceder y modificar estos atributos.
 * @author Estela Ortiz
 */
public class Cliente {

	// Atributos privados que almacenan la información personal del cliente
	private String dni;      // DNI del cliente
	private String Nombre;   // Nombre del cliente
	private String Direccion; // Dirección del cliente

	/**
	 * Constructor sin parámetros que inicializa los atributos con valores vacíos.
	 * Este constructor es utilizado cuando no se proporciona información al crear el cliente.
	 */
	public Cliente() {
		// Inicializa los atributos como cadenas vacías
		dni = "";        
		Nombre = "";     
		Direccion = "";  
	}

	/**
	 * Constructor con parámetros que permite inicializar los atributos de Cliente con valores específicos.
	 * 
	 * @param dni El DNI del cliente.
	 * @param nombre El nombre del cliente.
	 * @param direccion La dirección del cliente.
	 */
	public Cliente(String dni, String nombre, String direccion) {
		// Asigna los valores proporcionados a los atributos
		this.dni = dni;          
		Nombre = nombre;        
		Direccion = direccion; 
	}    

	/**
	 * Obtiene el DNI del cliente.
	 * 
	 * @return El DNI del cliente.
	 */
	public String getDni(){
		return dni; // Devuelve el valor del atributo dni
	}

	/**
	 * Establece un nuevo DNI para el cliente.
	 * 
	 * @param dni El nuevo DNI que se asignará al cliente.
	 */
	public void setDni(String dni){
		this.dni = dni; // Asigna el valor recibido al atributo dni
	}

	/**
	 * Obtiene el nombre del cliente.
	 * 
	 * @return El nombre del cliente.
	 */
	public String getNombre(){
		return Nombre; // Devuelve el valor del atributo Nombre
	}

	/**
	 * Establece un nuevo nombre para el cliente.
	 * 
	 * @param nombre El nuevo nombre que se asignará al cliente.
	 */
	public void setNombre(String nombre){
		Nombre = nombre; // Asigna el valor recibido al atributo Nombre
	}

	/**
	 * Obtiene la dirección del cliente.
	 * 
	 * @return La dirección del cliente.
	 */
	public String getDireccion(){
		return Direccion; // Devuelve el valor del atributo Direccion
	}

	/**
	 * Establece una nueva dirección para el cliente.
	 * 
	 * @param direccion La nueva dirección que se asignará al cliente.
	 */
	public void setDireccion(String direccion){
		Direccion = direccion; // Asigna el valor recibido al atributo Direccion
	}
}
