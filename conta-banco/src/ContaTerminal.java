import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Insira o número de sua conta:");
        int numero = Integer.valueOf(scanner.nextLine());
        System.out.println("Insira o número de sua agência com o dígito (xxx-x):");
        String agencia = scanner.nextLine();
        System.out.println("Insira seu nome completo:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Insira o saldo de sua conta:");
        Double saldo;
        String saldoString = scanner.nextLine();
        try {
            saldo = Double.valueOf(saldoString);
        } catch (NumberFormatException exception) {
            saldo = Double.valueOf(saldoString.replace(".", "").replace(",", "."));
        }

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque \n",
                nomeCliente, agencia, numero, saldo);
        scanner.close();
    }
}
