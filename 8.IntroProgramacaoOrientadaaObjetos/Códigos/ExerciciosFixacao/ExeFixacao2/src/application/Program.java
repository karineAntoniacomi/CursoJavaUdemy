package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

/* Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). 
 * Em seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, 
 * aumentar o sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio 
 * bruto � afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. */

public class Program {
    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Employee funcionario = new Employee();
        
        System.out.println("Digite os dados do funcion�rio \nNome: ");
        funcionario.name = sc.nextLine();
        System.out.println("Sal�rio bruto: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.println("Imposto: ");
        funcionario.tax = sc.nextDouble();
        
        // Dados do funcion�rio          
        // funcionario.toString() - pode usar sem toString(), mesmo resultado pois o 
        // compilador automaticamente invoca o m�todo toString ao invocar um println
        System.out.println("Funcion�rio: " + funcionario);
        
        System.out.println("\nDigite a porcentagem de aumento do sal�rio: ");
        double percentage = sc.nextDouble();
        
        funcionario.increaseSalary(percentage);
        
        // Atualizando sal�rio do funcion�rio
        System.out.println("Dados do Funcion�rio atualizados: " + funcionario.toString());

        sc.close();
    }
}