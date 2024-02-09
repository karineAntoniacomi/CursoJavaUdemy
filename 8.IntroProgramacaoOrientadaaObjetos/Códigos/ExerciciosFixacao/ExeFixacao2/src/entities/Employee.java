package entities;

// Classe Employee, com atributos e m�todos relacionados a entidade / Objeto Employee
public class Employee {

    public String name;   
    public double grossSalary;  // sal�rio bruto
    public double tax;  // imposto

    // M�todo da classe - calcula sal�rio l�quido
    public double netSalary(){
        return grossSalary - tax;
    }
    
    // M�todo da classe - calcula aumento de sal�rio
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * (percentage / 100.0);
    }
    
    public String toString(){
        return "Nome: " + name + ", Sal�rio $ " + String.format("%.2f", netSalary());
    }
}


