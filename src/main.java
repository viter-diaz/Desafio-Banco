
public class main {

	public static void main(String[] args) {
		
		Cliente joaosinho = new Cliente();
		joaosinho.setNome("Joaosinho");		
        Conta cc1 = new ContaCorrente(joaosinho);
        Conta cp1 = new ContaPoupanca(joaosinho);
        cc1.transferir(5000, cp1);   
        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
        
        
        Cliente neymar = new Cliente();
        neymar.setNome("Neymar");		
        Conta cc2 = new ContaCorrente(neymar);
        Conta cp2 = new ContaPoupanca(neymar);
        cc2.transferir(10000, cp2);   
        cc2.imprimirExtrato();
        cp2.imprimirExtrato();

	}

}
