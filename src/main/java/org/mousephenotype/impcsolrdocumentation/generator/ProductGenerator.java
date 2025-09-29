package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Product;

import java.util.List;

public class ProductGenerator {


    public static Product generateExampleProductResponse() {
        return new Product(
            "Design Project Example",
            false,
            "Allele123",
            "Allele Name Example",
            "Allele Description Example",
            "Allele Type Example",
            "Colony Name Example",
            "ES Cell Name Example",
            "Vector Name Example",
            List.of("Colony1", "Colony2"),
            List.of("ES Cell1", "ES Cell2"),
            List.of("Vector1", "Vector2"),
            "Cassette Example",
            List.of("http://contact1.example.com", "http://contact2.example.com"),
            List.of("Contact Name 1", "Contact Name 2"),
            "Design123",
            List.of("Genetic Info 1", "Genetic Info 2"),
            "IKMC123",
            List.of("Assay1", "Assay2"),
            "Marker Symbol Example",
            "MGI:123456",
            "Name Example",
            List.of("http://order1.example.com", "http://order2.example.com"),
            List.of("Order Name 1", "Order Name 2"),
            List.of("http://other1.example.com", "http://other2.example.com"),
            List.of("http://tissue1.example.com", "http://tissue2.example.com"),
            List.of("Type 1", "Type 2"),
            List.of("Centre 1", "Centre 2"),
            "Product123",
            "Index123",
            "Centre Example",
            true,
            List.of("Production Info 1", "Production Info 2"),
            "Pipeline Example",
            List.of("QC Data 1", "QC Data 2"),
            "Status Example",
            "2023-01-01",
            "Type Example"
        );
    }

}
