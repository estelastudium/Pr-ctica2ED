package es.studium;

/**
 * La clase Cuenta representa una cuenta bancaria asociada a un cliente.
 * Esta clase gestiona el número de cuenta, el saldo de la cuenta y el cliente
 * que posee la cuenta.
 * @author Estela Ortiz
 */
public class Cuenta {

	// Atributos
	private int numCuenta;  // Número de cuenta del cliente
	private double saldo;   // Saldo disponible en la cuenta
	private Cliente cliente; // Cliente asociado a la cuenta

	/**
	 * Constructor sin parámetros que inicializa la cuenta con valores por defecto.
	 * El número de cuenta se inicializa en 0, el saldo en 0.0, y el cliente en un nuevo objeto de tipo Cliente.
	 */
	public Cuenta() {
		// Inicia los atributos con valores predeterminados
		numCuenta = 0;        
		saldo = 0.0;          
		cliente = new Cliente(); // Crea un nuevo objeto Cliente vacío
	}

	/**
	 * Constructor con parámetros que inicializa una cuenta con los valores proporcionados.
	 * 
	 * @param numCuenta El número de cuenta del cliente.
	 * @param saldo El saldo inicial de la cuenta.
	 * @param cliente El cliente asociado a esta cuenta.
	 */
	public Cuenta(int numCuenta, double saldo, Cliente cliente) {
		// Asigna los valores proporcionados a los atributos
		this.numCuenta = numCuenta;  
		this.saldo = saldo;          
		this.cliente = cliente;      
	}

	/**
	 * Obtiene el número de cuenta de esta cuenta bancaria.
	 * 
	 * @return El número de cuenta.
	 */
	public int getNumCuenta() {
		return numCuenta; // Devuelve el número de cuenta
	}

	/**
	 * Establece un nuevo número de cuenta.
	 * 
	 * @param numCuenta El nuevo número de cuenta que se asignará.
	 */
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta; // Asigna un nuevo valor al número de cuenta
	}

	/**
	 * Obtiene el saldo actual de la cuenta.
	 * 
	 * @return El saldo disponible en la cuenta.
	 */
	public double getSaldo() {
		return saldo; // Devuelve el saldo de la cuenta
	}

	/**
	 * Establece un nuevo saldo para la cuenta.
	 * 
	 * @param saldo El nuevo saldo que se asignará a la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo; // Asigna el nuevo saldo a la cuenta
	}

	/**
	 * Obtiene el cliente asociado a esta cuenta.
	 * 
	 * @return El cliente que posee la cuenta.
	 */
	public Cliente getCliente() {
		return cliente; // Devuelve el cliente asociado a la cuenta
	}

	/**
	 * Establece un nuevo cliente para esta cuenta.
	 * 
	 * @param cliente El nuevo cliente que se asociará a la cuenta.
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente; // Asigna el nuevo cliente a la cuenta
	}
}
