package _22ModulesPart1.main;

import _22ModulesPart1.delivery.src.delivery.DeliveryService;
import _22ModulesPart1.invoicing.src.invoicing.model.Invoice;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();
        List<Invoice> invoices = service.deliver();
    }
}
