package EX1.model.services;

import EX1.model.entities.Contract;
import EX1.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private PaymentService ps;

    public ContractService(PaymentService ps) {
        this.ps = ps;
    }

    public void addInstallment(Contract contract, int numMonths) {

        double installmentBaseValue = contract.getTotalContractValue() / numMonths;

        for (int i = 1; i <= numMonths; i++) {

            LocalDate paymentDate = contract.getContractDate().plusMonths(i);

            double interest = ps.interest(installmentBaseValue, i);

            double value = ps.paymentFee(interest);

            contract.addInstallment(new Installment(value, paymentDate));
        }
    }

}
