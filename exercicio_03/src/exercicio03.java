/*
Lista 01 - exercico 03

Enunciado:
 Um motorista de taxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço do
combustível é de R$ 5,24, escreva um algoritmo para ler: a marcação do hodômetro (Km) no início do dia, a
marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos
passageiros.
Apresentar como saída.:
• Marcação do Odômetro Inicial
• Marcação do Odômetro Final
• Quantidade de Quilômetros Percorridos no Dia.
• Lucro (líquido) do Dia.
• Média do Consumo em Km/L.
 */

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Variaveis
        float hodometroInicio, hodometroFinal, litrosGastos, valorRecebido, kmPercorridos, lucro, mediaConsumo;

        // Input user
        System.out.println("* Digite a marcacao do hodometro no inicio do dia: ");
        hodometroInicio = scanner.nextFloat();

        System.out.println("* Digite a marcacao do hodometro no final do dia: ");
        hodometroFinal = scanner.nextFloat();

        System.out.println("* Digite quantos litros de combustivel foram gastos: ");
        litrosGastos = scanner.nextFloat();

        System.out.println("* Digite o valor total recebido dos clientes: ");
        valorRecebido = scanner.nextFloat();

        // Logica
        kmPercorridos = hodometroFinal - hodometroInicio;

        lucro = (float) (valorRecebido - (litrosGastos * 5.25));

        mediaConsumo = kmPercorridos / litrosGastos;

        // Print
        System.out.println("______________________________");

        System.out.println("""

                • Marcação do Odômetro Inicial: %.2fKm
                • Marcação do Odômetro Final: %.2fKm

                • Quantidade de Quilômetros Percorridos no Dia: %.2fKm

                • Média do Consumo: %.2fKm/L

                • Lucro do Dia: R$%.2f
                """.formatted(hodometroInicio, hodometroFinal, kmPercorridos, mediaConsumo, lucro));

    }
}
