package _22ModulesPart1.invoicing.src.invoicing.services;

import _22ModulesPart1.invoicing.src.invoicing.model.Invoice;
import _22ModulesPart1.invoicing.src.invoicing.services.impl.InvoiceServiceImpl;

import java.util.List;

public interface InvoiceService {

    List<Invoice> generateInvoices();

    static InvoiceService build() {
        return new InvoiceServiceImpl();
    }
}
