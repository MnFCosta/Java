package comInterfaces.model.services;

import comInterfaces.model.entitites.CarRental;
import comInterfaces.model.entitites.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private TaxService ts;

    public RentalService(double pricePerHour, double pricePerDay, TaxService ts) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.ts = ts;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double basicPayment;

        if (Math.ceil(minutes / 60) <= 12){
            basicPayment = Math.ceil(minutes / 60) * this.pricePerHour;
        }else {
            basicPayment = (Math.ceil((minutes / 60) / 24)) * this.pricePerDay;
        }

        carRental.setInvoice(new Invoice(basicPayment, ts.tax(basicPayment)));
    }

}
