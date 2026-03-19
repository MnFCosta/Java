package EX1.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int contractNumber;
    private LocalDate contractDate;
    private double totalContractValue;
    private List<Installment> installments = new ArrayList<>();

    public Contract(int contractNumber, LocalDate contractDate, double totalContractValue) {
        this.contractNumber = contractNumber;
        this.contractDate = contractDate;
        this.totalContractValue = totalContractValue;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public double getTotalContractValue(){
        return this.totalContractValue;
    }

    public LocalDate getContractDate(){
        return this.contractDate;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallment(Installment installment) {
        this.installments.add(installment);
    }


}
