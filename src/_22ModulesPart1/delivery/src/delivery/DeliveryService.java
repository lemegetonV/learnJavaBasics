package _22ModulesPart1.delivery.src.delivery;

import _22ModulesPart1.invoicing.src.invoicing.model.Invoice;
import _22ModulesPart1.invoicing.src.invoicing.services.InvoiceService;

import java.util.List;

public class DeliveryService {

    private InvoiceService service = InvoiceService.build();

    public List<Invoice> deliver() {
        List<Invoice> invoices = service.generateInvoices();
        invoices.forEach(System.out::println);
        return invoices;
    }
}
