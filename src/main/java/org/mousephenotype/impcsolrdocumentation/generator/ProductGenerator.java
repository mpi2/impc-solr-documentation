package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Product;

import java.util.List;

public class ProductGenerator {


    public static Product generateExampleProductResponse() {
        Product product = new Product();
        product.setAlleleDesignProject("Design Project Example");
        product.setAlleleHasIssues(false);
        product.setAlleleId("Allele123");
        product.setAlleleName("Allele Name Example");
        product.setAlleleDescription("Allele Description Example");
        product.setAlleleType("Allele Type Example");

        product.setAssociatedProductColonyName("Colony Name Example");
        product.setAssociatedProductEsCellName("ES Cell Name Example");
        product.setAssociatedProductVectorName("Vector Name Example");
        product.setAssociatedProductsColonyNames(List.of("Colony1", "Colony2"));
        product.setAssociatedProductsEsCellNames(List.of("ES Cell1", "ES Cell2"));
        product.setAssociatedProductsVectorNames(List.of("Vector1", "Vector2"));

        product.setCassette("Cassette Example");

        product.setContactLinks(List.of("http://contact1.example.com", "http://contact2.example.com"));
        product.setContactNames(List.of("Contact Name 1", "Contact Name 2"));

        product.setDesignId("Design123");

        product.setGeneticInfo(List.of("Genetic Info 1", "Genetic Info 2"));
        product.setIkmcProjectId("IKMC123");
        product.setLoaAssays(List.of("Assay1", "Assay2"));
        product.setMarkerSymbol("Marker Symbol Example");
        product.setMgiAccessionId("MGI:123456");
        product.setName("Name Example");

        product.setOrderLinks(List.of("http://order1.example.com", "http://order2.example.com"));
        product.setOrderNames(List.of("Order Name 1", "Order Name 2"));

        product.setOtherLinks(List.of("http://other1.example.com", "http://other2.example.com"));
        product.setTissueEnquiryLinks(List.of("http://tissue1.example.com", "http://tissue2.example.com"));
        product.setTissueEnquiryTypes(List.of("Type 1", "Type 2"));
        product.setTissueDistributionCentres(List.of("Centre 1", "Centre 2"));

        product.setProductId("Product123");
        product.setProductIndex("Index123");
        product.setProductionCentre("Centre Example");
        product.setProductionCompleted(true);
        product.setProductionInfo(List.of("Production Info 1", "Production Info 2"));
        product.setProductionPipeline("Pipeline Example");
        product.setQcData(List.of("QC Data 1", "QC Data 2"));
        product.setStatus("Status Example");
        product.setStatusDate("2023-01-01");
        product.setType("Type Example");

        return product;
    }

}
