/*
 * Copyright (C) 2024 Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package aula10;

import java.util.Scanner;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 15/03/2024
 * @brief Class Teste
 */
public class Teste {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
        
        boolean fechar = false;
        
        while(!fechar){
            System.out.println("Qual figura geometrica? \n" +
                                            "1 - Quadrado \n"+
                                            "2 - Triângulo \n" + 
                                            "3 - Cículo \n" +
                                            "4 - Retângulo \n" +
                                            "5 - Fechar programa!!");
            
            int opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Qual o valor do lado do Quadrado?");
                    quadrado.setLado1(sc.nextDouble());
                    System.out.println("Digite a cor do Quadrado?");
                    quadrado.setCor(sc.next());
                    System.out.println(quadrado);
                    break;
                 case 2:
                    System.out.println("Qual a base do Triângulo?");
                    triangulo.setBase(sc.nextDouble());
                    System.out.println("Qual a altura do Triângulo?");
                    triangulo.setAltura(sc.nextDouble());
                    System.out.println("Digite a cor desejada? (caso tenha)");
                    triangulo.setCor(sc.next());
                    System.out.println(triangulo);
                    break;
                case 3:
                    System.out.println("Qual o raio do Círculo?");
                    circulo.setRaio(sc.nextDouble());
                    System.out.println("Digite a cor desejada? (caso tenha)");
                    circulo.setCor(sc.next());
                    System.out.println(circulo);
                    break;
                case 4:
                    System.out.println("Qual o primeiro lado do Retângulo?");
                    retangulo.setLado1(sc.nextDouble());
                    System.out.println("Qual o segundo lado do Retângulo?");
                    retangulo.setLado2(sc.nextDouble());
                    System.out.println("Digite a cor desejada? (caso tenha)");
                    retangulo.setCor(sc.next());
                    System.out.println(retangulo);
                    break;
                case 5:
                    fechar = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
            System.out.println("Programa finalizado !!");
            sc.close();
        }
     }
}
