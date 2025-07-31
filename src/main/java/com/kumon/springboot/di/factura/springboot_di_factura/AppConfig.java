package com.kumon.springboot.di.factura.springboot_di_factura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.kumon.springboot.di.factura.springboot_di_factura.models.Item;
import com.kumon.springboot.di.factura.springboot_di_factura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean("default")
    List<Item> itemsInvoice() {

        Product p1 = new Product("Camara", 800);
        Product p2 = new Product("Parches", 60);
        Product p3 = new Product("Bicicleta", 1200);

        List<Item> listItems = Arrays.asList(new Item(p1, 2),
                new Item(p2, 4),
                new Item(p3, 2));

        return listItems;

    }

    @Bean
    List<Item> itemsInvoiceOficiona() {

        Product p1 = new Product("Monitor", 800);
        Product p2 = new Product("Teclado", 60);
        Product p3 = new Product("IPhone", 500);
        Product p4 = new Product("MacBook", 1200);
        Product p5 = new Product("Hojas", 190);

        List<Item> listItems = Arrays.asList(new Item(p1, 2),
                new Item(p2, 4),
                new Item(p3, 2),
                new Item(p4, 1),
                new Item(p5, 10));

        return listItems;

    }

}
