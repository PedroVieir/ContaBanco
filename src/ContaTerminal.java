import java.util.Scanner;

public class ContaTerminal {
    private Scanner scanner = new Scanner(System.in);
    private int numero;
    private int saldo;
    private String agencia;
    private String nomeCliente;

    public ContaTerminal(String nomeCliente, String agencia, int numero, int saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void requisitos() {
        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Conta:");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o valor do seu Saldo:");
        saldo = scanner.nextInt();
    }

    // Métodos getters e setters para acessar e modificar os campos privados
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
