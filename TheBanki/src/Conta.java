import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Conta {
    private double saldo;
    private int numero;
    private int agencia;
    private Cliente titular;
    private static int totaldeContas;

    public Conta (Cliente titular, int agencia, int numero) {
        System.out.println("Criando uma nova conta");
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        totaldeContas++;
        System.out.println("Total de contas criadas no sistema " + Conta.totaldeContas);
        System.out.println("Data de criação da Conta: " + Conta.Data());
    }
    
    private boolean validasaca(double valorASacar) {
        if (valorASacar < this.saldo) {
            return true;
        }
        System.out.println("Valor indisponível para sacar");
        return false;
    }

    public void saca(double valorASacar) {
        if (validasaca(valorASacar) == true) {
            this.saldo -= valorASacar;
            System.out.println("Você realizou um saque do valor de R$ " + valorASacar);
            System.out.println("Saldo atual em conta R$ " + this.saldo);
        }
    }

    private boolean validadeposita(double valorADepositar) {
        if (valorADepositar > 0) {
            return true;
        }
        System.out.println("Favor, informar um valor válido para depositar");
        return false;
    }

    public void deposita(double valorADepositar) {
        if (validadeposita(valorADepositar) == true) {
            this.saldo += valorADepositar;
            System.out.println("Você realizou um deposito com o valor de R$ " + valorADepositar);
            System.out.println("Saldo atual em conta R$ " + this.saldo);
        }
    }

    private boolean validatransferencia(double valoraTransferir, Conta destino) {
        if (valoraTransferir <= this.saldo) {
            return true;
        }
        System.out.println("Saldo em conta insuficiente para transferência");
        return false;
    }

    public void transfere(double valoraTransferir, Conta destino) {

        if (validatransferencia(valoraTransferir, destino) == true) {
            this.saldo -= valoraTransferir;
            destino.saldo += valoraTransferir;
            System.out.println(
                    "Você realizou a transferência de R$ " + valoraTransferir + " com sucesso para " + destino.titular);
        }
    }

    private static String Data() {
        LocalDate data = LocalDate.now();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatarData = data.format(formatoData);

        return formatarData;
    }
    
    public double pegarSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int gettotaldeContas() {
        return Conta.totaldeContas;
    }
}
