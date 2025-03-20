package es.studium;

/**
 * La clase TestBanco simula las operaciones bancarias realizadas entre dos clientes, Antonio y Beatriz.
 * Las operaciones incluyen consultas de saldo, transferencias y actualizaciones de saldo.
 * @author Estela Ortiz
 */
public class TestBanco {

	private static Cuenta cuentaAntonio; // Cuenta de Antonio
	private static Cuenta cuentaBeatriz; // Cuenta de Beatriz

	/**
	 * Método principal donde se realizan las operaciones bancarias.
	 * En este método se crean las cuentas, se realizan las transferencias y se consultan los saldos.
	 * 
	 * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
	 */
	public static void main(String[] args) {
		// Crear clientes Antonio y Beatriz con sus respectivos datos
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");

		// Crear las cuentas bancarias con un saldo inicial de 100€
		cuentaAntonio = new Cuenta(48151, 100, antonio);
		cuentaBeatriz = new Cuenta(62342, 100, beatriz);

		// Mostrar los saldos iniciales de las cuentas
		String inicioSoyo = "La cuenta de ";
		consultarSaldo(inicioSoyo);

		// Beatriz transfiere 50€ a Antonio
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);

		// Mostrar los saldos después de la transferencia
		consultarSaldo(inicioSoyo);

		// Antonio gana 100€ en una rifa y lo ingresa en su cuenta
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);

		// Beatriz paga 30€ a Hacienda y retira el dinero
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);

		// Mostrar los saldos después de la actualización de Beatriz
		consultarSaldo(inicioSoyo);

		// Antonio transfiere 50€ a Beatriz
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);

		// Mostrar los saldos finales después de la transferencia de Antonio
		consultarSaldo(inicioSoyo);
	}

	/**
	 * Método para mostrar el saldo de las cuentas de Antonio y Beatriz.
	 * 
	 * @param inicioSoyo El prefijo que se muestra antes de cada nombre de cliente.
	 */
	private static void consultarSaldo(String inicioSoyo){
		// Mostrar el saldo de la cuenta de Antonio
		System.out.println(inicioSoyo + cuentaAntonio.getCliente().getNombre() + " tiene " + cuentaAntonio.getSaldo() + " euros.");
		// Mostrar el saldo de la cuenta de Beatriz
		System.out.println(inicioSoyo + cuentaBeatriz.getCliente().getNombre() + " tiene " + cuentaBeatriz.getSaldo() + " euros.");
	}
}
