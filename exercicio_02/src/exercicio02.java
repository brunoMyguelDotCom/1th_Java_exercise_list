/*
Lista 01 - exercicio 02

Enunciado:
Escreva um programa que dado os litros de combustível gasto e os quilômetros percorridos por um
automóvel, calcule os gastos de combustível em Reais, calcule também qual a média de consumo que o
carro teve durante a viagem.
(Considerar que um litro custa R$ 5,24)
Calcular e Escrever.:
• Litros de Combustível Gasto.
• Total de Quilômetros Percorridos.
• Total gasto de combustível em Real.
• Consumo Médio de Combustível.
*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // variaveis
        float litros, quilometros, totalGastoEmReal, consumoMedio;

        // Input
        System.out.println("Digite quantos litros foram gastos: ");
        litros = scan.nextFloat();

        System.out.println("Digite quantos quilometros foram percorridos: ");
        quilometros = scan.nextFloat();

        // logica
        totalGastoEmReal = (float) (litros * 5.24);
        consumoMedio = quilometros / litros;

        // Print
        System.err.println("""
                Litros: %.2f
                Quilometros rodados: %.2f

                Consumo medio por litro: %.2f
                ______________________

                Total gasto em Reais: %.2f
            """.formatted(litros, quilometros, consumoMedio, totalGastoEmReal));
    }
}
