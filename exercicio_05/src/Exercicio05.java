/*
Lista 01 - exercicio 05

Enunciado:
Uma loja vende bicicletas com um acréscimo de 50 % sobre o seu preço de custo. Ela paga a cada
vendedor 2 salários-mínimos mensais, mais uma comissão de 15 % sobre o preço de custo de cada
bicicleta vendida, dividida igualmente entre eles.
Escreva um programa que leia o número de empregados da loja, o valor do salário-
mínimo, o preço de custo de cada bicicleta, o número de bicicletas vendidas.
Calcule e escreva: O salário final de cada empregado e o lucro (líquido) da loja.
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Variaveis
        int numeroVendedores, numeroBicicletasVendidas;
        float precoCustoBicicleta, precoVendaBicicleta, valorSalarioMinimo, comissaoParaVendedores, salarioCadaVendedor,
                valorTotalVendido, custoTotal, lucroLoja;

        // Input user
        System.out.println("* Digite o numero de vendedores da loja: ");
        numeroVendedores = scanner.nextInt();

        System.out.println("* Digite o valor do salario minimo: ");
        valorSalarioMinimo = scanner.nextFloat();

        System.out.println("* Digite o numero de bicicletas vendidas: ");
        numeroBicicletasVendidas = scanner.nextInt();

        System.out.println("* Digite o custo de cada bicicleta: ");
        precoCustoBicicleta = scanner.nextFloat();

        // logica
        precoVendaBicicleta = (float) (precoCustoBicicleta + precoCustoBicicleta * 0.5);
        valorTotalVendido = precoVendaBicicleta * numeroBicicletasVendidas;

        comissaoParaVendedores = (float) ((precoCustoBicicleta * 0.15) * numeroBicicletasVendidas);
        salarioCadaVendedor = (valorSalarioMinimo * 2) + (comissaoParaVendedores / numeroVendedores);
        custoTotal = (salarioCadaVendedor * numeroVendedores) + (numeroBicicletasVendidas * precoCustoBicicleta);

        lucroLoja = valorTotalVendido - custoTotal;

        // Print
        System.out.println("""
                    Salario final de cada vendedor: R$%.2f

                    Custo total para a loja: R$%.2f
                    Lucro total da loja: R$%.2f
                """.formatted(salarioCadaVendedor, custoTotal, lucroLoja));

    }
}
