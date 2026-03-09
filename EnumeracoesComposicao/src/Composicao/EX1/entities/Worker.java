package Composicao.EX1.entities;

import Composicao.EX1.entities.enums.WorkerLevel;


import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> hourContracts = new ArrayList<>();;

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department.getName();
    }

    public void addContract(HourContract contract){
        this.hourContracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.hourContracts.remove(contract);
    }

    public Double income(Integer month, Integer year){
        double income = baseSalary;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("M/yyyy");
        String date = String.format("%d/%d", month, year);

        List<HourContract> result = this.hourContracts.stream().filter(x ->
                x.getDate().format(format).equals(date)).toList();

        for (HourContract contract : result){
            income += contract.totalValue();
        }

        return income;
    }


}
