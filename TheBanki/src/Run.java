public class Run {
    public static void main(String[] args) {
        Cliente wasley = new Cliente();
        Conta contadoWasley = new Conta();

        contadoWasley.titular = wasley;

        contadoWasley.titular.nome = "Wasley Fernando";
        contadoWasley.titular.cpf = "111.111.111-11";
        contadoWasley.titular.profissao = "Analista";

        System.out.println(contadoWasley.titular.nome);
    }
}
