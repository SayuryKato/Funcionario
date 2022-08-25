package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Conta r1 = new Conta();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		r1.nome = sc.next();
		
		
		System.out.println("\nDiga lá o salario: ");
		r1.salarioBruto = sc.nextDouble();
		
		System.out.println("\nDigite o imposto: ");
		r1.imposto = sc.nextDouble();
		
		System.out.printf("Empregado: %s, $ %.2f", r1.nome, r1.dadosFuncionario());
		
		System.out.println("\nQual percentual para aumentar o salário? ");
		r1.aumentoSalario(sc.nextDouble());
		
		System.out.printf("Dados atualizados: %s, $ %.2f", r1.nome,r1.dadosFuncionario());
		
		sc.close();
		

	}

}
