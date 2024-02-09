package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

/* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, 
 * aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário 
 * bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. */

public class Program {
    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Employee funcionario = new Employee();
        
        System.out.println("Digite os dados do funcionário \nNome: ");
        funcionario.name = sc.nextLine();
        System.out.println("Salário bruto: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.println("Imposto: ");
        funcionario.tax = sc.nextDouble();
        
        // Dados do funcionário          
        // funcionario.toString() - pode usar sem toString(), mesmo resultado pois o 
        // compilador automaticamente invoca o método toString ao invocar um println
        System.out.println("Funcionário: " + funcionario);
        
        System.out.println("\nDigite a porcentagem de aumento do salário: ");
        double percentage = sc.nextDouble();
        
        funcionario.increaseSalary(percentage);
        
        // Atualizando salário do funcionário
        System.out.println("Dados do Funcionário atualizados: " + funcionario.toString());

        sc.close();
    }
}