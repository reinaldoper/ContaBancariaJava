/**
 * Projeto Conta Bancária.
 * @author reinaldo
 * @since 06/05/24
 * @version 1.0
 */

import contas.ContaTerminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo!");
        System.out.println("Por favor, digite o número da sua conta!");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite a sua agencia!");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente!");
        String nome = scanner.next();
        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nome);
        System.out.println(contaTerminal.DadosConta());
    }
}