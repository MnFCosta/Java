package HerancaMultiplaFalsa.app;

import HerancaMultiplaFalsa.model.entities.ComboDevice;
import HerancaMultiplaFalsa.model.entities.ConcretePrinter;
import HerancaMultiplaFalsa.model.entities.ConcreteScanner;

public class Main {
    static void main() {

        System.out.println("PRINTER: ");
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");

        System.out.println();

        System.out.println("SCANNER: ");
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();

        System.out.println("COMBO DEVICE: ");
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My Dissertation");
        c.print("My Dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
