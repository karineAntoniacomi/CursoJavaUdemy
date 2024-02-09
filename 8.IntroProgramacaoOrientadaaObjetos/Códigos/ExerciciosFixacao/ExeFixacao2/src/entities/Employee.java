package entities;

// Classe Employee, com atributos e métodos relacionados a entidade / Objeto Employee
public class Employee {

    public String name;   
    public double grossSalary;  // salário bruto
    public double tax;  // imposto

    // Método da classe - calcula salário líquido
    public double netSalary(){
        return grossSalary - tax;
    }
    
    // Método da classe - calcula aumento de salário
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * (percentage / 100.0);
    }
    
    public String toString(){
        return "Nome: " + name + ", Salário $ " + String.format("%.2f", netSalary());
    }
}


