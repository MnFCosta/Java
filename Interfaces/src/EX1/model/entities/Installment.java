package EX1.model.entities;

import java.time.LocalDate;

public class Installment {
    private LocalDate paymentDate;
    private double value;

    public Installment(double value, LocalDate paymentDate) {
        this.value = value;
        this.paymentDate = paymentDate;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public double getValue() {
        return value;
    }
}
