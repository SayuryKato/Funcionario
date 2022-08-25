package entidades;

public class Conta {
	public String nome;
	public double salarioBruto;
	public double imposto;

	
	public double dadosFuncionario() {
		 double salarioLiquido = salarioBruto-imposto;
		 return salarioLiquido;
	}
	public void aumentoSalario(double porcentagem) {
		this.salarioBruto += salarioBruto*porcentagem / 100.0;
	}

}
