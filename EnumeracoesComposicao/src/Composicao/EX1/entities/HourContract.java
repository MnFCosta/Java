package Composicao.EX1.entities;

import java.time.LocalDate;

public class HourContract {
    private final LocalDate date;
    private final Double valuePerHour;
    private final Integer hours;

    public HourContract(LocalDate date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double totalValue(){
        return valuePerHour * hours;
    }

    public LocalDate getDate(){
        return this.date;
    }


}
