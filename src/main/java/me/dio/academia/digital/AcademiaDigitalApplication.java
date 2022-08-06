package me.dio.academia.digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AcademiaDigitalApplication {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("********************************");
		System.out.println("Nome de Administrador: ");
		String admin = scan.next();
		System.out.println("********************************");
		System.out.println("Senha de Administrador: ");
		String senha = scan.next();
		System.out.println("********************************");

		if(admin.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("12345")) {
			System.out.println("********************************");
			System.out.println("ACESSO PERMITIDO");
			System.out.println("Aguarde ...");
			System.out.println("********************************");

			try {
				Thread.sleep(5000);
				SpringApplication.run(AcademiaDigitalApplication.class, args);
			}catch (Exception e) {
				e.printStackTrace();
			}

		}else {
			System.out.println("********************************");
			System.out.println("ACESSO NEGADO");
			System.out.println("********************************");

			try {
				Thread.sleep(5000);
				System.out.println("Tente mais uma vez");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
