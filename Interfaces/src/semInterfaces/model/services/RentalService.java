package semInterfaces.model.services;

import semInterfaces.model.entitites.CarRental;
import semInterfaces.model.entitites.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private BrazilTaxService btS;

    public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService bts) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.btS = bts;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double basicPayment;

        if (Math.ceil(minutes / 60) <= 12){
            basicPayment = Math.ceil(minutes / 60) * this.pricePerHour;
        }else {
            basicPayment = (Math.ceil((minutes / 60) / 24)) * this.pricePerDay;
        }

        carRental.setInvoice(new Invoice(basicPayment, btS.tax(basicPayment)));
    }

}
