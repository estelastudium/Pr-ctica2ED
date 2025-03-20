package es.studium;

public class Cliente
{
    // Declaración de atributos, alamacenan la información
    private String dni;      
    private String Nombre;    
    private String Direccion; 

    // Constructor sin parámetros
    public Cliente()
    {
    	// inicia los atributos como cadenas vacías
        dni = "";        
        Nombre = "";     
        Direccion = "";  
    }

    // Constructor con parámetros para iniciar Cliente
    public Cliente(String dni, String nombre, String direccion) {
    	// Asigna el valor recibido a los atributos
        this.dni = dni;          
        Nombre = nombre;        
        Direccion = direccion; 
    }    

    // Método getter para obtener el DNI
    public String getDni(){
        return dni; // Devuelve valor del atributo 
    }
    // Método setter para modificar el DNI
    public void setDni(String dni){
        this.dni = dni; // Asigna nuevo valor al atributo 
    }
    
    
    public String getNombre(){
        return Nombre; 
    }
    public void setNombre(String nombre){
        Nombre = nombre; 
    }
    
    
    public String getDireccion(){
        return Direccion;
    }
    public void setDireccion(String direccion){
        Direccion = direccion; 
    }
}
