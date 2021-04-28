public class Conta {
    public double saldo;
    public int numero;
    public int agencia;
    public String titular;

    public boolean validasaca(double valorASacar)
    {
        if (valorASacar < this.saldo)
        {
            return true;
        }
        else
        {
            System.out.println("Valor indisponível para sacar");
            return false;
        }
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
        else
        {
            System.out.println("Favor, informar um valor válido para depositar");
            return false;
        }
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
}
