import java.util.Scanner;

import model.ClassificadoraIp;

public class Main {

	public static void main(String[] args) {
		

		  Scanner scanner = new Scanner(System.in);
	        boolean continuar = true;

	        while (continuar) {
	            ClassificadoraIp ci = new ClassificadoraIp();

	            ci.lerIpDoUsuario();
	            ci.mostrarDados();

	            continuar = ci.continuar(scanner, "Usuário");
	        }

	        System.out.println("Programa finalizado.");
	        scanner.close();
	}
}
