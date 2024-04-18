package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Product {
    private String allele_design_project;
    private Boolean allele_has_issues;
    private String allele_id;
    private String allele_name;
    private String allele_description;
    private String allele_type;
    private String associated_product_colony_name;
    private String associated_product_es_cell_name;
    private String associated_product_vector_name;
    private List<String> associated_products_colony_names;
    private List<String> associated_products_es_cell_names;
    private List<String> associated_products_vector_names;
    private String cassette;
    private List<String> contact_links;
    private List<String> contact_names;
    private String design_id;
    private List<String> genetic_info;
    private String ikmc_project_id;
    private List<String> loa_assays;
    private String marker_symbol;
    private String mgi_accession_id;
    private String name;
    private List<String> order_links;
    private List<String> order_names;
    private List<String> other_links;
    private List<String> tissue_enquiry_links;
    private List<String> tissue_enquiry_types;
    private List<String> tissue_distribution_centres;
    private String product_id;
    private String product_index;
    private String production_centre;
    private Boolean production_completed;
    private List<String> production_info;
    private String production_pipeline;
    private List<String> qc_data;
    private String status;
    private String status_date;
    private String type;

}
