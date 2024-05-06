package contas;

/**
 * Projeto Conta Bancária.
 * @author reinaldo
 * @since 06/05/24
 * @version 1.0
 */

public class ContaTerminal {
    public int Numero = 0;
    public String Agencia = "";
    public String NomeCliente = "";
    public double Saldo = 200.0;

    public ContaTerminal(int Numero, String Agencia, String NomeCliente){
        this.Numero = Numero;
        this.Agencia = Agencia;
        this.NomeCliente = NomeCliente;
    }

    /**
     * Método que retorna os dados da conta.
     */

    public String DadosConta(){
        return "Olá " + this.NomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " +
                this.Agencia + ", conta " + this.Numero + " e seu saldo " + this.Saldo + " já está disponivel para saque.";
    }
}
