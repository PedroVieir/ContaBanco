public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal("", "", 0, 0);
        conta.requisitos();

        // Exemplo de uso dos dados fornecidos pelo usuário
        System.out.println("Nome do Cliente: " + conta.getNomeCliente());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número da Conta: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
