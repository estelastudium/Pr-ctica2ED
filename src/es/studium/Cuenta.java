package es.studium;

public class Cuenta
{
	// Atributos 
	private int numCuenta;  // Número de cuenta del cliente
	private double saldo;   // Saldo disponible en la cuenta
	private Cliente cliente; // Cliente asociado a la cuenta

	// Constructor sin parámetros
	public Cuenta()
	{
		// Inicia los atributos en 0 y vacío
		numCuenta = 0;        
		saldo = 0.0;          
		cliente = new Cliente(); 
	}

	// Constructor con parámetros para iniciar Cuenta con valores específicos
	public Cuenta(int numCuenta, double saldo, Cliente cliente){
		// Asigna el valor a los atributos
		this.numCuenta = numCuenta;  
		this.saldo = saldo;          
		this.cliente = cliente;      
	}
	
	// Método getter para obtener el número de cuenta
	public int getNumCuenta(){
		return numCuenta; // Devuelve el número de cuenta
	}
	// Método setter para modificar el número de cuenta
	public void setNumCuenta(int numCuenta){
		this.numCuenta = numCuenta; // Asigna un nuevo valor al número de cuenta
	}

	
	public double getSaldo(){
		return saldo; 
	}
	public void setSaldo(double saldo){
		this.saldo = saldo; 
	}

	
	public Cliente getCliente(){
		return cliente; 
	}
	public void setCliente(Cliente cliente){
		this.cliente = cliente; 
	}
}
