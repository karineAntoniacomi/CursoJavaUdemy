package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	// Associações - composição de objetos
	
	// Worker tem um Department
	private Department department;
	
	// Um Worker tem vários contracts - lista instanciada por padrão vazia
	private List<HourContract> contracts = new ArrayList<>();
	
	// Construtores
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	// Método para adicionar um contrato associado ao trabalhador
	public void addContract(HourContract contract) {
		// adiciona na lista o contrato
		contracts.add(contract);
	}
	
	// Remove contratos
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	// Calcula quanto o trabalhador ganhou em um ano e mes
	public double income(int year, int month) {
		
		// income = Salario base + ganhos dos contratos do mes
		double sum = baseSalary;
		
		// Extrair ano e mes da data do contrato C com Calendar
		Calendar cal = Calendar.getInstance();
		
		// Para cada contrato 'c' na lista de contratos
		for (HourContract c : contracts) {
			// P/ cada Contrato c setar nesse calendário a data
			cal.setTime(c.getDate()); // Define a data do contrato como sendo a data do calendário
			
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1+ cal.get(Calendar.MONTH); // + 1 pois o mes de Calendar inicia em 0
			
			// verifica se o contrato é desse ano e mês
			// Se o ano informado como argumento == ano do contrato analisado
			if(year == c_year && month == c_month) {
				// caso seja, acrescenta o valor dele na soma
				sum += c.totalValue();
			}
		}
		return sum;
	}
} 
