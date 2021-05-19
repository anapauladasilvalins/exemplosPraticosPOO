package contas.bancarias.aula05;

// classe principal
public class ModeloContasBancarias {
	
	// atributos 
	public int numConta;
	protected String tipo;
	private String Dono; 
	private float saldo;
	private boolean status;

	// Métodos Personalizados
	
	public void estadoAtual() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Conta:" + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Nome: " + this.getDono());
		System.out.println("Saldo:" + this.getSaldo());
		System.out.println("Status;" + this.getStatus());
	}
	
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC"){      // Ou assim: if("CC".equals(t)){
			this.setSaldo(50);  // ou this.saldo = 50;
		}else if (t == "CP"){  //("CP".equals(t))
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Esta conta não pode ser fechada pois ainda tem dinheiro.");
		} else if (this.getSaldo() < 0) {
			System.out.println("Esta conta não pode ser fechada pois tem débito.");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	
	public void depositar(float v) {
		if (this.getStatus()) {
			//this.saldo = this.saldo + v; // este mexe diretamente com os atributos
			this.setSaldo(this.getSaldo() + v); // este mexe diretamente com os métodos especiais.
			System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar! esta conta está fechada.");
		}
	}
	
	
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossível sacar! Esta conta está fechada.");
		}	
	}
	
	
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP"){
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso!" + this.getDono());
		} else {
			System.out.println("Impossível pagar conta! Esta conta está fechada. ");
		}
	}
	
	// Métodos Especiais
	
	public ModeloContasBancarias() {
		this.saldo = 0;
		this.status = false;
		//this.setSaldo(0);     // pode ser assim também.
		//this.setStatus(false);
	}
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDono() {
		return Dono;
	}
	public void setDono(String dono) {
		Dono = dono;
	}
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
	 
	
	
	