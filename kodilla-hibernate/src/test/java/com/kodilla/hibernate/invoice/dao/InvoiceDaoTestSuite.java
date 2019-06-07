package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");

        Item item1 = new Item(product1, new BigDecimal(5.5), 3);
        Item item2 = new Item(product2, new BigDecimal(10), 1);
        Item item3 = new Item(product1, new BigDecimal(7), 1);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product1);

        product1.getItemList().add(item1);
        product2.getItemList().add(item2);
        product1.getItemList().add(item3);

        Invoice invoice1 = new Invoice("invoice1");
        Invoice invoice2 = new Invoice("invoice2");

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice2);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice2.getItems().add(item3);

        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        int idInvoice1 = invoice1.getId();
        int idInvoice2 = invoice2.getId();
        System.out.println("idInvoice1 = " + idInvoice1);
        System.out.println("idInvoice2 = " + idInvoice2);

        Optional<Invoice> readInvoice = invoiceDao.findById(idInvoice1);
        List<Invoice> list = invoiceDao.findByNumber("invoice2");

        //Then
        Assert.assertTrue(readInvoice.isPresent());
        Assert.assertEquals(2, invoiceDao.count());
        Assert.assertEquals("invoice2", list.get(0).getNumber());

        //CleanUp
        try {
            invoiceDao.deleteById(idInvoice1);
            invoiceDao.deleteById(idInvoice2);
        }catch (Exception e){}
    }
}
