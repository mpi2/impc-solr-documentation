package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class StatisticalResult {
    private String doc_id;
    private Long db_id;
    private String data_type;
    private List<String> anatomy_term_id;
    private List<String> anatomy_term_name;
    private List<String> intermediate_anatomy_term_id;
    private List<String> intermediate_anatomy_term_name;
    private List<String> top_level_anatomy_term_id;
    private List<String> top_level_anatomy_term_name;
    private List<String> mp_term_id_options;
    private List<String> mp_term_name_options;
    private String mp_term_id;
    private String mp_term_name;
    private List<String> top_level_mp_term_id;
    private List<String> top_level_mp_term_name;
    private List<String> intermediate_mp_term_id;
    private List<String> intermediate_mp_term_name;
    private String male_mp_term_id;
    private String male_mp_term_name;
    private List<String> male_top_level_mp_term_id;
    private List<String> male_top_level_mp_term_name;
    private List<String> male_intermediate_mp_term_id;
    private List<String> male_intermediate_mp_term_name;
    private String female_mp_term_id;
    private String female_mp_term_name;
    private List<String> female_top_level_mp_term_id;
    private List<String> female_top_level_mp_term_name;
    private List<String> female_intermediate_mp_term_id;
    private List<String> female_intermediate_mp_term_name;
    private String resource_name;
    private String resource_fullname;
    private Long resource_id;
    private List<String> project_name;
    private String phenotyping_center;
    private String pipeline_stable_id;
    private Long pipeline_stable_key;
    private String pipeline_name;
    private Long pipeline_id;
    private List<String> procedure_stable_id;
    private List<Long> procedure_stable_key;
    private String procedure_name;
    private Long procedure_id;
    private String parameter_stable_id;
    private List<Long> parameter_stable_key;
    private String parameter_name;
    private Long parameter_id;
    private String colony_id;
    private String marker_symbol;
    private String marker_accession_id;
    private String allele_symbol;
    private String allele_name;
    private String allele_accession_id;
    private String strain_name;
    private String strain_accession_id;
    private String sex;
    private String zygosity;
    private String control_selection_method;
    private String dependent_variable;
    private String metadata_group;
    private String data_frame;
    private String genetic_background;
    private String production_center;
    private Long external_db_id;
    private Long id;
    private Long organisation_id;
    private Long phenotyping_center_id;
    private Long project_id;
    private Double male_control_mean;
    private Double male_mutant_mean;
    private Double female_control_mean;
    private Double female_mutant_mean;
    private Double genotype_effect_size_low_vs_normal_high;
    private Double genotype_effect_size_low_normal_vs_high;
    private Double female_effect_size_low_vs_normal_high;
    private Double female_effect_size_low_normal_vs_high;
    private Double male_effect_size_low_vs_normal_high;
    private Double male_effect_size_low_normal_vs_high;
    private List<String> categories;
    private Double categorical_p_value;
    private Double categorical_effect_size;
    private Boolean batch_significant;
    private Boolean variance_significant;
    private Double null_test_p_value;
    private Double genotype_effect_p_value;
    private Double genotype_effect_stderr_estimate;
    private Double genotype_effect_parameter_estimate;
    private String male_percentage_change;
    private String female_percentage_change;
    private Double sex_effect_p_value;
    private Double sex_effect_stderr_estimate;
    private Double sex_effect_parameter_estimate;
    private Double weight_effect_p_value;
    private Double weight_effect_stderr_estimate;
    private Double weight_effect_parameter_estimate;
    private Double blups_test;
    private Double rotated_residuals_test;
    private Double intercept_estimate;
    private Double intercept_estimate_stderr_estimate;
    private Boolean interaction_significant;
    private Double interaction_effect_p_value;
    private Double female_ko_effect_p_value;
    private Double female_ko_effect_stderr_estimate;
    private Double female_ko_parameter_estimate;
    private Double female_effect_size;
    private Double male_ko_effect_p_value;
    private Double male_ko_effect_stderr_estimate;
    private Double male_ko_parameter_estimate;
    private Double male_effect_size;
    private String classification_tag;
    private List<String> phenotype_sex;
    private String life_stage_acc;
    private String life_stage_name;
    private Boolean significant;
    private String soft_windowing_bandwidth;
    private String soft_windowing_shape;
    private String soft_windowing_peaks;
    private String soft_windowing_min_obs_required;
    private String soft_windowing_total_obs_or_weight;
    private String soft_windowing_threshold;
    private String soft_windowing_number_of_doe;
    private String soft_windowing_doe_note;
    private List<String> metadata;
    private Double effect_size;
    private Integer female_control_count;
    private Integer female_mutant_count;
    private Double female_pvalue_low_normal_vs_high;
    private Double female_pvalue_low_vs_normal_high;
    private Double genotype_pvalue_low_normal_vs_high;
    private Double genotype_pvalue_low_vs_normal_high;
    private String group_1_genotype;
    private Double group_1_residuals_normality_test;
    private String group_2_genotype;
    private Double group_2_residuals_normality_test;
    private Integer male_control_count;
    private Integer male_mutant_count;
    private Double male_pvalue_low_normal_vs_high;
    private Double male_pvalue_low_vs_normal_high;
    private Double p_value;
    private String statistical_method;
    private String status;


}
