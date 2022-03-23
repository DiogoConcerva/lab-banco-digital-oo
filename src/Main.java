import java.util.List;

public class Main {
	public static void main(String[] args) {
		Cliente diogo = new Cliente();
		diogo.setNome("Diogo");

		Cliente gabriela = new Cliente();
		gabriela.setNome("Gabriela");
		
		Conta cc = new ContaCorrente(diogo);
		Conta cp = new ContaPoupanca(diogo);

		Conta cCorrente = new ContaCorrente(gabriela);
		Conta cPoupanca = new ContaPoupanca(gabriela);

		cc.depositar(100);
		cc.transferir(90, cCorrente);

		cCorrente.depositar(10);
		cCorrente.transferir(150, cc);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

		cCorrente.imprimirExtrato();
		cPoupanca.imprimirExtrato();
	}
}
