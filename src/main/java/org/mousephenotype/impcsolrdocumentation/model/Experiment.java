package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class Experiment {
    private String id;
    private String observation_id;
    private String specimen_id;
    private Long phenotyping_center_id;
    private String phenotyping_center;
    private Long production_center_id;
    private String production_center;
    private Long specimen_project_id;
    private String specimen_project_name;
    private String gene_accession_id;
    private String gene_symbol;
    private String allele_accession_id;
    private String allele_symbol;
    private String zygosity;
    private String sex;
    private Long biological_model_id;
    private Long biological_sample_id;
    private String biological_sample_group;
    private String strain_accession_id;
    private String strain_name;
    private String genetic_background;
    private String allelic_composition;
    private String colony_id;
    private String litter_id;
    private LocalDate date_of_birth;
    private String external_sample_id;
    private String life_stage_name;
    private String life_stage_acc;
    private Long datasource_id;
    private String datasource_name;
    private Long project_id;
    private String project_name;
    private Long pipeline_id;
    private String pipeline_name;
    private String pipeline_stable_id;
    private Long procedure_id;
    private String procedure_name;
    private String procedure_stable_id;
    private String procedure_group;
    private Long parameter_id;
    private String parameter_name;
    private String parameter_stable_id;
    private String procedure_sequence_id;
    private String experiment_id;
    private String observation_type;
    private String data_type;
    private String experiment_source_id;
    private LocalDate date_of_experiment;
    private String weight_parameter_stable_id;
    private LocalDate weight_date;
    private Integer weight_days_old;
    private Float weight;
    private Float data_point;
    private Integer order_index;
    private String dimension;
    private String time_point;
    private Float discrete_point;
    private String category;
    private String raw_category;
    private List<String> metadata;
    private String metadata_group;
    private List<String> anatomy_id;
    private List<String> anatomy_term;
    private List<String> anatomy_id_term;
    private List<String> anatomy_term_synonym;
    private List<String> top_level_anatomy_id;
    private List<String> top_level_anatomy_term;
    private List<String> top_level_anatomy_term_synonym;
    private List<String> selected_top_level_anatomy_id;
    private List<String> selected_top_level_anatomy_term;
    private List<String> selected_top_level_anatomy_term_synonym;
    private List<String> intermediate_anatomy_id;
    private List<String> intermediate_anatomy_term;
    private List<String> intermediate_anatomy_term_synonym;
    private List<String> parent_anatomy_id;
    private List<String> parent_anatomy_term;
    private List<String> parent_anatomy_term_synonym;
    private List<String> child_anatomy_id;
    private List<String> child_anatomy_term;
    private List<String> child_anatomy_term_synonym;
    private String download_file_path;
    private String image_link;
    private String file_type;
    private String increment_value;
    private List<String> parameter_association_stable_id;
    private List<String> parameter_association_sequence_id;
    private List<String> parameter_association_dim_id;
    private List<String> parameter_association_name;
    private List<String> parameter_association_value;
    private String developmental_stage_acc;
    private String developmental_stage_name;
    private String text_value;
    private List<String> sub_term_id;
    private List<String> sub_term_name;
    private List<String> sub_term_description;
    private Integer age_in_days;
    private Integer age_in_weeks;

}
