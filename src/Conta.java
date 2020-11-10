
public class Conta {
	private int id;
	private String titular;
	private int conta, agencia;
	private double limite, saldo;
	
	public Conta(String titular, int conta, int agencia, double limite, double saldo) {
		super();
		this.titular = titular;
		this.conta = conta;
		this.agencia = agencia;
		this.limite = limite;
		this.saldo = saldo;
	}
	
	public Conta() {
		super();
	}
	
	public Conta(int id, String titular, int conta, int agencia, double limite, double saldo) {
		super();
		this.id = id;
		this.titular = titular;
		this.conta = conta;
		this.agencia = agencia;
		this.limite = limite;
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
