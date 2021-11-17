package contas;

public class Conta {
	//atributos, variaveis
	protected String cliente;
	protected double saldo;
	//construtor
	public Conta() {
		System.out.println("Agencia 0261");
	}
	//metodos
	protected void exibirSaldo() {
		System.out.println("Saldo R$ " + saldo) ;
	}
	
	//metodo visivel apenas as classes no mesmo pacote, sem mod. de acesso
	void sacar (double valor) {
		saldo -= valor;
		System.out.println("Débito: R$ " + valor);
		
	}
	//parametros
	void depositar (double valor) {
		saldo += valor;
		System.out.println("Crédito: R$ " + valor);
		
	}
	//criar objeto dentro
	void transferir( Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferencia de : R$ " + valor);
		
	}
	
	//metodo com reotorno, q nao usam void :P <emitir relatorios>
	
	double soma(double cc1, double cc2) {
		double total = cc1+cc2;
		return total;
	}
	
	
	
}
