/*
Lista 01 - exercico 01

Enunciado: 
Dado as seguintes informações de um funcionário: Nome, idade cargo e o seu salário bruto considere:
a) O salário bruto teve um reajuste de 38%.
b) O funcionário receberá uma gratificação de 20% do salário bruto.
c) O Salário total é descontado em 15% de Imposto de Renda
Faça um programa para:
• Imprimir Nome, idade e cargo.
• Imprimir o salário bruto Anterior.
• Imprimir o salário bruto corrigido.
• Imprimir o valor da gratificação.
• Imprimir o valor do desconto.
• Imprimir o salário líquido. */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // Variaveis
        String nome;
        String cargo;
        int idade;
        float salario, salarioBrutoPosAjuste, gratificacao, desconto, salarioLiquido;

        // Input
        System.err.println("Digite o nome do funcionario:");
        nome = scan.nextLine();

        System.out.println("Digite a idade do funcionario:");
        idade = scan.nextInt();

        System.out.println("Digite o cargo do funcionario:");
        scan.nextLine(); // Le e manda pro void o enter que fica no buffer do teclado
        cargo = scan.nextLine();

        System.out.println("Digite o salario bruto do funcioanrio:");
        salario = scan.nextFloat();

        // Logica
        salarioBrutoPosAjuste = (float) (salario + (salario * 0.38));
        gratificacao = (float) (salarioBrutoPosAjuste * 0.20);
        desconto = (float) ((salarioBrutoPosAjuste + gratificacao) * 0.15);
        salarioLiquido = (salarioBrutoPosAjuste + gratificacao) - desconto;

        // print
        System.out.printf("""
                INFORMACOES DO FUNCIONARIO:
                Nome: %s
                Idade: %d
                Cargo: %s
                __________

                Salario bruto anterior: %.2f
                Salario bruto pos ajuste: %.2f
                Gratificacao: %.2f
                Desconto: %.2f
                Salario liquido pos descontos: %.2f
                """, nome, idade, cargo, salario, salarioBrutoPosAjuste, gratificacao, desconto, salarioLiquido);
    }
}
