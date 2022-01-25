
public class Main {

	public static void main(String[] args) {
		
		//Para realizar operações nas contas utilizar os comandos:
		//Conta.operacao(valor);
		//Exemplo => cc.depositar(valor);
		
		Cliente bruno = new Cliente();
		bruno.setNome("Bruno");
		
		Conta cc = new ContaCorrente(bruno);
		Conta poupanca = new ContaPoupanca(bruno);
		
		//Insira abaixo os comandos para realizar operações
		
		
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
