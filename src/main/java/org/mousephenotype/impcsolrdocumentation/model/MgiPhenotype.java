package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class MgiPhenotype {
    private String doc_id;
    private String assertion_type;
    private String assertion_type_id;
    private String mpath_term_id;
    private String mpath_term_name;
    private String emap_term_id;
    private String emap_term_name;
    private String mp_term_id;
    private String mp_term_name;
    private List<String> alt_mp_term_id;
    private List<String> top_level_mp_term_id;
    private List<String> top_level_mp_term_name;
    private List<String> top_level_mp_term_definition;
    private List<String> top_level_mp_term_synonym;
    private List<String> intermediate_mp_term_id;
    private List<String> intermediate_mp_term_name;
    private List<String> intermediate_mp_term_definition;
    private List<String> intermediate_mp_term_synonym;
    private String marker_symbol;
    private String marker_accession_id;
    private String colony_id;
    private String allele_name;
    private String allele_symbol;
    private String allele_accession_id;
    private String strain_name;
    private String strain_accession_id;
    private String phenotyping_center;
    private String project_external_id;
    private String project_name;
    private String project_fullname;
    private String resource_name;
    private String resource_fullname;
    private String sex;
    private String zygosity;
    private String pipeline_name;
    private String pipeline_stable_id;
    private String pipeline_stable_key;
    private String procedure_name;
    private String procedure_stable_id;
    private String procedure_stable_key;
    private String parameter_name;
    private String parameter_stable_id;
    private String parameter_stable_key;
    private String statistical_method;
    private String percentage_change;
    private Double p_value;
    private Double effect_size;
    private String external_id;
    private String life_stage_acc;
    private String life_stage_name;

}
