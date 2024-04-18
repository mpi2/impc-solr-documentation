package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Phenodigm {
    private String type;
    private String disease_id;
    private String disease_source;
    private String disease_term;
    private List<String> disease_alts;
    private String disease_locus;
    private List<String> disease_classes;
    private List<String> disease_phenotypes;

    private String gene_id;
    private String gene_symbol;
    private List<String> gene_symbols_withdrawn;
    private String gene_locus;
    private String hgnc_gene_id;
    private String hgnc_gene_symbol;
    private List<String> hgnc_gene_symbols_withdrawn;
    private String hgnc_gene_locus;

    private boolean mouse_model;
    private boolean impc_model;

    private String model_id;
    private String model_source;
    private String model_description;
    private String model_genetic_background;
    private String marker_id;
    private String marker_symbol;
    private String marker_locus;
    private int marker_num_models;
    private List<String> model_phenotypes;

    private String ontology;
    private String phenotype_id;
    private String phenotype_term;
    private List<String> phenotype_synonym;

    private String hp_id;
    private String hp_term;
    private String mp_id;
    private String mp_term;

    private boolean association_curated;
    private boolean association_ortholog;
    private List<String> marker_symbols_withdrawn;

    private List<String> disease_matched_phenotypes;
    private List<String> model_matched_phenotypes;
    private double disease_model_avg_raw;
    private double disease_model_avg_norm;
    private double disease_model_max_raw;
    private double disease_model_max_norm;

    private List<String> search_qf;
    private boolean human_curated_gene;
    private boolean impc_model_with_curated_gene;
    private boolean mgi_model_with_curated_gene;
    private boolean impc_model_with_computed_association;
    private boolean mgi_model_with_computed_association;

}
