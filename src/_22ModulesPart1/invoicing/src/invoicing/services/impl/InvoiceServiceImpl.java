package _22ModulesPart1.invoicing.src.invoicing.services.impl;

import _22ModulesPart1.invoicing.src.invoicing.model.Invoice;
import _22ModulesPart1.invoicing.src.invoicing.services.InvoiceService;

import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public List<Invoice> generateInvoices() {
        var i = new Invoice();
        i.setAmount(10);
        return List.of(i);
    }
}
