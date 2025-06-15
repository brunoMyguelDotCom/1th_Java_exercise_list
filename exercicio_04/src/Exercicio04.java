/*
Lista 01 - exercicio 04

Enunciado:
Uma empresa tem para um determinado funcionário uma ficha contendo o nome, número de horas
trabalhadas e o nº de dependentes de um funcionário. Considerando que:
a) A empresa paga 12 reais por hora e 40 reais por dependentes.
b) Sobre o salário são feitos descontos de 8,5% para o INSS e 5% para IR.
Faça um programa para ler o Nome, número de horas trabalhadas e número de dependentes de um
funcionário.

Após a leitura, escreva qual o Nome, salário bruto, os valores descontados para cada tipo de imposto e
finalmente qual o salário líquido do funcionário.
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Variaveis
        String nomeFuncionario;
        int horasTrabalhadas, dependentesDoFunc;
        float salarioBruto, salarioLiquido, descontoINSS, descontoIR;

        // Input user
        System.out.println("* Digite o nome do funcionario: ");
        nomeFuncionario = scanner.nextLine();

        System.out.println("* Digite o numero de horas trabalhadas pelo funcionario: ");
        horasTrabalhadas = scanner.nextInt();

        System.out.println("* Digite o numero de dependentes do funcionario: ");
        dependentesDoFunc = scanner.nextInt();

        // Logica
        salarioBruto = (12 * horasTrabalhadas) + (40 * dependentesDoFunc);
        descontoINSS = (float) (salarioBruto * 0.085);
        descontoIR = (float) (salarioBruto * 0.05);

        salarioLiquido = salarioBruto - descontoINSS - descontoIR;

        // Print
        System.out.println("""
        Nome do funcionario: %s
        Numero de horas trabalhadas: %d
        Numero de dependentes do funcionario: %d
        
        Salario bruto do funcionario: R$%.2f
        
        Desconto de INSS: R$%.2f
        Desconto de Imposto de Renda: R$%.2f

        Salario liquido do funcionario: R$%.2f
        """.formatted(nomeFuncionario, horasTrabalhadas, dependentesDoFunc, salarioBruto, descontoINSS, descontoIR, salarioLiquido));

    }
}
