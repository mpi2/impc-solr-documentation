package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Product;

import java.util.List;

public class ProductGenerator {


    public static Product generateExampleProductResponse() {
        Product product = new Product();
        product.setAllele_design_project("Design Project Example");
        product.setAllele_has_issues(false);
        product.setAllele_id("Allele123");
        product.setAllele_name("Allele Name Example");
        product.setAllele_description("Allele Description Example");
        product.setAllele_type("Allele Type Example");

        product.setAssociated_product_colony_name("Colony Name Example");
        product.setAssociated_product_es_cell_name("ES Cell Name Example");
        product.setAssociated_product_vector_name("Vector Name Example");
        product.setAssociated_products_colony_names(List.of("Colony1", "Colony2"));
        product.setAssociated_products_es_cell_names(List.of("ES Cell1", "ES Cell2"));
        product.setAssociated_products_vector_names(List.of("Vector1", "Vector2"));

        product.setCassette("Cassette Example");

        product.setContact_links(List.of("http://contact1.example.com", "http://contact2.example.com"));
        product.setContact_names(List.of("Contact Name 1", "Contact Name 2"));

        product.setDesign_id("Design123");

        product.setGenetic_info(List.of("Genetic Info 1", "Genetic Info 2"));
        product.setIkmc_project_id("IKMC123");
        product.setLoa_assays(List.of("Assay1", "Assay2"));
        product.setMarker_symbol("Marker Symbol Example");
        product.setMgi_accession_id("MGI:123456");
        product.setName("Name Example");

        product.setOrder_links(List.of("http://order1.example.com", "http://order2.example.com"));
        product.setOrder_names(List.of("Order Name 1", "Order Name 2"));

        product.setOther_links(List.of("http://other1.example.com", "http://other2.example.com"));
        product.setTissue_enquiry_links(List.of("http://tissue1.example.com", "http://tissue2.example.com"));
        product.setTissue_enquiry_types(List.of("Type 1", "Type 2"));
        product.setTissue_distribution_centres(List.of("Centre 1", "Centre 2"));

        product.setProduct_id("Product123");
        product.setProduct_index("Index123");
        product.setProduction_centre("Centre Example");
        product.setProduction_completed(true);
        product.setProduction_info(List.of("Production Info 1", "Production Info 2"));
        product.setProduction_pipeline("Pipeline Example");
        product.setQc_data(List.of("QC Data 1", "QC Data 2"));
        product.setStatus("Status Example");
        product.setStatus_date("2023-01-01");
        product.setType("Type Example");


        return product;
    }

}
