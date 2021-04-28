public class Run {
    public static void main(String[] args) {
        Conta primeiraconta = new Conta();

        primeiraconta.titular = "Wasley Fernando";

        primeiraconta.deposita(10);

        System.out.println(primeiraconta.saldo);

    }
}
