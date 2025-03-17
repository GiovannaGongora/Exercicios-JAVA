public class ContaCorrente {
    private String numConta;
    private double saldo;
    private String nomeTitular;

    // Construtor corrigido
    public ContaCorrente(String numConta, String nomeTitular, double saldo) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;

        if (saldo < 0) {
            System.out.println("Não é permitido números negativos");
            this.saldo = 0; 
        } else {
            this.saldo = saldo;
        }
    }

   
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor deve ser maior que 0.");
        }
    }


    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }


    public void exibirDados() {
        System.out.println("Número da conta: " + numConta);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
    }
}