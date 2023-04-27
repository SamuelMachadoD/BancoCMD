public class Conta {
    private Cliente cliente;
    private double saldo;

    private TipoConta tipoConta;


    public Conta(Cliente cliente, double saldo, TipoConta tipoConta){
        this.tipoConta = tipoConta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String depositar(int valor){
        this.saldo += valor;
        return "Deposito concluido!";
    }

    public String retirar(int valor){
        this.saldo -= valor;
        return "Retirada concluida!";
    }

    public String mostraDados(){
        String texto;
        texto = """
                *****************************************
                Cliente: %s
                Idade: %d
                Tipo de Conta: %s
                
                SALDO: %.2f
                *****************************************
                """.formatted(cliente.getNome(),
                cliente.getIdade(),
                tipoConta,
                saldo);
        return texto;
    }
    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }
}
