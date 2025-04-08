package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado1, lado2, altura, area, perimetro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/***********************/");
        System.out.println("/* Cadastrando Triangulo */");
        System.out.println("/***********************/");
        System.out.println("Informe a base: ");
        base = scanner.nextDouble();
        System.out.print("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.print("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        altura = scanner.nextDouble();
        System.out.println("Triangulo Cadastrado com Sucesso !");
        System.out.println("/******************************/");
        return true;
    }

    public void calcularArea() { //morreu
        System.out.println("/************************/");
        System.out.println("/*   Calculando Area    */");
        System.out.println("/************************/");
        area = base * altura;
        System.out.println("A area é: " + area);
        System.out.println("/************************/");
    }

    public void calcularPerimetro() { //morreu
        System.out.println("/**************************/");
        System.out.println("/* Calculando Perimetro   */");
        System.out.println("/**************************/");
        perimetro = base + lado1 + lado2;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/**************************/");
    }

    public void definirTipo() {
        System.out.println("/**************************/");
        System.out.println("/* Definir Tipo   */");
        System.out.println("/**************************/");

        if(base == lado1 && base == lado2) {
            System.out.println("Esse Triângulo é Equilátero");
        } else if (base != lado1 && base != lado2 && lado1 != lado2) {
            System.out.println("Esse Triângulo é Escaleno");
        }
        else {
            System.out.println("Esse Triângulo é Isosceles");
        }
    }

    public void exibirTriangulo() {
        System.out.println("/************************/");
        System.out.println("/* Informações Triangulo  */");
        System.out.println("/************************/");
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/***************************/");
    }
}

//Triangulo e Retangulo - Pitagoas
/*Crie um Método para definir se esse triangulo é um triangulo retangulo
Ajeitar o menu para ter nas opções
Criar um Método para o Triângulo 3-4-5, criar um método para o Triângulo Retângulo
3-4-5 = Se esse lado for 3 ou 4, nao aplica pitagoras
 */
