public class Conta {
    public double saldo;
    public int numero;
    public int agencia;
    public Cliente titular;

    public boolean validasaca(double valorASacar)
    {
        if (valorASacar < this.saldo)
        {
            return true;
        }
        System.out.println("Valor indisponível para sacar");
        return false;
    }

    public void saca(double valorASacar)
    {
        if (validasaca(valorASacar) == true)
        {
            this.saldo -= valorASacar;
            System.out.println("Você realizou um saque do valor de R$ " + valorASacar);
            System.out.println("Saldo atual em conta R$ " + this.saldo);
        }
    }
    
    public boolean validadeposita(double valorADepositar)
    {
        if (valorADepositar > 0)
        {
            return true;
        }
        System.out.println("Favor, informar um valor válido para depositar");
        return false;
    }
    
    public void deposita(double valorADepositar)
    {
        if(validadeposita(valorADepositar) == true)
        {
            this.saldo += valorADepositar;
            System.out.println("Você realizou um deposito com o valor de R$ " + valorADepositar);
            System.out.println("Saldo atual em conta R$ " + this.saldo);
        }
    }

    public boolean validatransferencia(double valoraTransferir, Conta destino)
    {
        if(valoraTransferir <= this.saldo)
        {
            return true;
        }
        System.out.println("Saldo em conta insuficiente para transferência");
        return false;
    }

    public void transfere(double valoraTransferir, Conta destino)
    {
        if (validatransferencia(valoraTransferir, destino) == true)
        {
            this.saldo -= valoraTransferir;
            destino.saldo += valoraTransferir;
            System.out.println("Você realizou a transferência de R$ " + valoraTransferir + " com sucesso para " + destino.titular);
        }
    }
}
