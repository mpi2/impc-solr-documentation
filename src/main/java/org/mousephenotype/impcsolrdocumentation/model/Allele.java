package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Allele {

    private String data_type;
    private String mgi_accession_id;
    private String marker_symbol;
    private List<String> human_gene_symbol;
    private String marker_name;
    private List<String> marker_synonym;
    private String marker_type;
    private List<String> ensembl_gene_id;
    private String imits_phenotype_started;
    private String imits_phenotype_complete;
    private String imits_phenotype_status;
    private String status;
    private String latest_production_status;
    private String gene_latest_es_cell_status;
    private String latest_es_cell_status;
    private String gene_latest_mouse_status;
    private String latest_mouse_status;
    private Integer legacy_phenotype_status;
    private String latest_phenotype_status;
    private String latest_project_status;
    private List<String> latest_production_centre;
    private List<String> latest_phenotyping_centre;
    private String chr_name;
    private Integer chr_start;
    private Integer chr_end;
    private String chr_strand;
    private List<String> allele_name;
    private List<String> allele_accession_id;
    private List<String> es_cell_status;
    private String imits_mouse_status;
    private List<String> mouse_status;
    private List<String> phenotype_status;
    private List<String> production_centre;
    private List<String> phenotyping_centre;
    private List<String> go_term_id;
    private List<String> go_term_name;
    private List<String> go_term_def;
    private List<String> go_term_evid;
    private List<String> go_term_domain;
    private Integer go_count; // pint
    private List<String> go_uniprot;
    private Integer evid_code_rank; // pint
    private List<String> pfama_json;
    private List<String> scdb_id;
    private List<String> scdb_link;
    private List<String> clan_id;
    private List<String> clan_acc;
    private List<String> clan_desc;
    private List<String> pfama_id;
    private List<String> pfama_acc;
    private List<String> pfama_go_id;
    private List<String> pfama_go_term;
    private List<String> pfama_go_cat;
    private String gf_acc;
    private String allele_mgi_accession_id;
    private List<String> imits_es_cell_status;
    private String ikmc_project;
    private String gene_allele;
    private List<String> disease_human_phenotypes;
    private String type;
    private List<String> disease_id;
    private List<String> disease_source;
    private List<String> disease_term;
    private List<String> disease_alts;
    private List<String> disease_classes;
    private List<Boolean> human_curated;
    private List<Boolean> mouse_curated;
    private List<Boolean> mgi_predicted;
    private List<Boolean> impc_predicted;
    private List<Boolean> mgi_predicted_known_gene;
    private List<Boolean> impc_predicted_known_gene;
    private List<Boolean> impc_novel_predicted_in_locus;
    private List<Boolean> mgi_novel_predicted_in_locus;
    private List<String> marker_symbol_bf;
    private List<String> marker_symbol_lowercase;
    private List<String> marker_synonym_lowercase;
    private List<String> text;
    private List<String> auto_suggest;
}
