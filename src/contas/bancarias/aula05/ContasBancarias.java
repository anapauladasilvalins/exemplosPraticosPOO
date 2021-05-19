package contas.bancarias.aula05;

public class ContasBancarias {
	public static void main(String[]args) {
	
		ModeloContasBancarias cliente1 = new ModeloContasBancarias();
		cliente1.setNumConta(123);
		cliente1.setDono("Jubileu");
		cliente1.abrirConta("CC");
		cliente1.depositar(100);
		cliente1.estadoAtual();
		
		//cliente1.sacar(150);
		cliente1.fecharConta();
		
		System.out.println("============================================================");
		
		ModeloContasBancarias cliente2 = new ModeloContasBancarias();
		
		cliente2.setNumConta(456);
		cliente2.setDono("Jubiléia");
		cliente2.abrirConta("CP");
		cliente2.depositar(500);
		cliente2.sacar(100);
		cliente2.estadoAtual();
		
	}

}

