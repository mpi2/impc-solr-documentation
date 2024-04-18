package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.StatisticalResult;

import java.util.List;

public class StatisticalResultGenerator {


    public static StatisticalResult generateExampleStatisticalResultResponse() {
        StatisticalResult statisticalResult = new StatisticalResult();
        statisticalResult.setDoc_id("DOC123");
        statisticalResult.setDb_id(100L);
        statisticalResult.setData_type("Gene Expression");

// Anatomy terms mapped from MP
        statisticalResult.setAnatomy_term_id(List.of("AID123", "AID456"));
        statisticalResult.setAnatomy_term_name(List.of("Heart", "Liver"));
        statisticalResult.setIntermediate_anatomy_term_id(List.of("IAID789", "IAID101"));
        statisticalResult.setIntermediate_anatomy_term_name(List.of("Ventricle", "Lobe"));
        statisticalResult.setTop_level_anatomy_term_id(List.of("TAID112", "TAID113"));
        statisticalResult.setTop_level_anatomy_term_name(List.of("Circulatory System", "Digestive System"));

// Information about the MP term
        statisticalResult.setMp_term_id_options(List.of("MPID123", "MPID456"));
        statisticalResult.setMp_term_name_options(List.of("Hypertrophy", "Necrosis"));
        statisticalResult.setMp_term_id("MPID789");
        statisticalResult.setMp_term_name("Atrophy");
        statisticalResult.setTop_level_mp_term_id(List.of("TMPID123", "TMPID456"));
        statisticalResult.setTop_level_mp_term_name(List.of("Muscle Structure", "Cell Death"));
        statisticalResult.setIntermediate_mp_term_id(List.of("IMPID789", "IMPID101"));
        statisticalResult.setIntermediate_mp_term_name(List.of("Muscle Size", "Apoptosis"));

// Information about the male MP term
        statisticalResult.setMale_mp_term_id("MMPID123");
        statisticalResult.setMale_mp_term_name("Male Hypertrophy");
        statisticalResult.setMale_top_level_mp_term_id(List.of("MTMPID123", "MTMPID456"));
        statisticalResult.setMale_top_level_mp_term_name(List.of("Male Muscle Structure", "Male Cell Death"));
        statisticalResult.setMale_intermediate_mp_term_id(List.of("MIMPID789", "MIMPID101"));
        statisticalResult.setMale_intermediate_mp_term_name(List.of("Male Muscle Size", "Male Apoptosis"));

// Information about the female MP term
        statisticalResult.setFemale_mp_term_id("FMPID123");
        statisticalResult.setFemale_mp_term_name("Female Hypertrophy");
        statisticalResult.setFemale_top_level_mp_term_id(List.of("FTMPID123", "FTMPID456"));
        statisticalResult.setFemale_top_level_mp_term_name(List.of("Female Muscle Structure", "Female Cell Death"));
        statisticalResult.setFemale_intermediate_mp_term_id(List.of("FIMPID789", "FIMPID101"));
        statisticalResult.setFemale_intermediate_mp_term_name(List.of("Female Muscle Size", "Female Apoptosis"));

// Information about the data being processed
        statisticalResult.setResource_name("Resource Name");
        statisticalResult.setResource_fullname("Full Resource Name");
        statisticalResult.setResource_id(200L);
        statisticalResult.setProject_name(List.of("Project X", "Project Y"));
        statisticalResult.setPhenotyping_center("Center Z");

// Pipeline information
        statisticalResult.setPipeline_stable_id("PID123");
        statisticalResult.setPipeline_stable_key(300L);
        statisticalResult.setPipeline_name("Pipeline Name");
        statisticalResult.setPipeline_id(400L);

// Procedure information
        statisticalResult.setProcedure_stable_id(List.of("PRID123", "PRID456"));
        statisticalResult.setProcedure_stable_key(List.of(500L, 600L));
        statisticalResult.setProcedure_name("Procedure Name");
        statisticalResult.setProcedure_id(700L);

// Parameter information
        statisticalResult.setParameter_stable_id("PAID123");
        statisticalResult.setParameter_stable_key(List.of(800L));
        statisticalResult.setParameter_name("Parameter Name");
        statisticalResult.setParameter_id(900L);

// Genetic information
        statisticalResult.setColony_id("Colony123");
        statisticalResult.setMarker_symbol("Gene123");
        statisticalResult.setMarker_accession_id("M123456");
        statisticalResult.setAllele_symbol("Allele123");
        statisticalResult.setAllele_name("Allele Name");
        statisticalResult.setAllele_accession_id("A123456");
        statisticalResult.setStrain_name("Strain Name");
        statisticalResult.setStrain_accession_id("S123456");
        statisticalResult.setSex("Male");
        statisticalResult.setZygosity("Homozygote");
        statisticalResult.setControl_selection_method("Random");
        statisticalResult.setDependent_variable("Weight");
        statisticalResult.setMetadata_group("Group1");
        statisticalResult.setData_frame("Frame1");
        statisticalResult.setGenetic_background("C57BL/6N");
        statisticalResult.setProduction_center("EMBL-EBI");

        statisticalResult.setExternal_db_id(101L);
        statisticalResult.setId(102L);
        statisticalResult.setOrganisation_id(103L);
        statisticalResult.setPhenotyping_center_id(104L);
        statisticalResult.setProject_id(105L);

        statisticalResult.setMale_control_mean(0.5);
        statisticalResult.setMale_mutant_mean(1.5);
        statisticalResult.setFemale_control_mean(0.4);
        statisticalResult.setFemale_mutant_mean(1.4);

        statisticalResult.setGenotype_p_value_low_vs_normal_high(0.01);
        statisticalResult.setGenotype_p_value_low_normal_vs_high(0.02);
        statisticalResult.setGenotype_effect_size_low_vs_normal_high(0.5);
        statisticalResult.setGenotype_effect_size_low_normal_vs_high(0.6);

        statisticalResult.setFemale_p_value_low_vs_normal_high(0.03);
        statisticalResult.setFemale_p_value_low_normal_vs_high(0.04);
        statisticalResult.setFemale_effect_size_low_vs_normal_high(0.7);
        statisticalResult.setFemale_effect_size_low_normal_vs_high(0.8);

        statisticalResult.setMale_p_value_low_vs_normal_high(0.05);
        statisticalResult.setMale_p_value_low_normal_vs_high(0.06);
        statisticalResult.setMale_effect_size_low_vs_normal_high(0.9);
        statisticalResult.setMale_effect_size_low_normal_vs_high(1.0);

        statisticalResult.setCategories(List.of("Category 1", "Category 2"));
        statisticalResult.setCategorical_p_value(0.07);
        statisticalResult.setCategorical_effect_size(1.1);

        statisticalResult.setBatch_significant(true);
        statisticalResult.setVariance_significant(false);
        statisticalResult.setNull_test_p_value(0.08);
        statisticalResult.setGenotype_effect_p_value(0.09);
        statisticalResult.setGenotype_effect_stderr_estimate(0.10);
        statisticalResult.setGenotype_effect_parameter_estimate(0.11);

        statisticalResult.setMale_percentage_change("10%");
        statisticalResult.setFemale_percentage_change("20%");

        statisticalResult.setSex_effect_p_value(0.12);
        statisticalResult.setSex_effect_stderr_estimate(0.13);
        statisticalResult.setSex_effect_parameter_estimate(0.14);

        statisticalResult.setWeight_effect_p_value(0.15);
        statisticalResult.setWeight_effect_stderr_estimate(0.16);
        statisticalResult.setWeight_effect_parameter_estimate(0.17);

        statisticalResult.setGroup1_genotype("WT");
        statisticalResult.setGroup1_residuals_normality_test(0.18);
        statisticalResult.setGroup2_genotype("Mutant");
        statisticalResult.setGroup2_residuals_normality_test(0.19);

        statisticalResult.setBlups_test(0.20);
        statisticalResult.setRotated_residuals_test(0.21);

        statisticalResult.setIntercept_estimate(0.22);
        statisticalResult.setIntercept_estimate_stderr_estimate(0.23);

        statisticalResult.setInteraction_significant(true);
        statisticalResult.setInteraction_effect_p_value(0.24);

        statisticalResult.setFemale_ko_effect_p_value(0.25);
        statisticalResult.setFemale_ko_effect_stderr_estimate(0.26);
        statisticalResult.setFemale_ko_parameter_estimate(0.27);
        statisticalResult.setFemale_effect_size(0.28);

        statisticalResult.setMale_ko_effect_p_value(0.29);
        statisticalResult.setMale_ko_effect_stderr_estimate(0.30);
        statisticalResult.setMale_ko_parameter_estimate(0.31);
        statisticalResult.setMale_effect_size(0.32);

        statisticalResult.setClassification_tag("Tag1");
        statisticalResult.setPhenotype_sex(List.of("Male", "Female"));

        statisticalResult.setLife_stage_acc("LS:001");
        statisticalResult.setLife_stage_name("Adulthood");
        statisticalResult.setSignificant(true);

// Soft windowing parameters
        statisticalResult.setSoft_windowing_bandwidth("Medium");
        statisticalResult.setSoft_windowing_shape("Gaussian");
        statisticalResult.setSoft_windowing_peaks("3");
        statisticalResult.setSoft_windowing_min_obs_required("10");
        statisticalResult.setSoft_windowing_total_obs_or_weight("50");
        statisticalResult.setSoft_windowing_threshold("0.05");
        statisticalResult.setSoft_windowing_number_of_doe("5");
        statisticalResult.setSoft_windowing_doe_note("Doe Note Example");
        statisticalResult.setMetadata(List.of("Metadata1", "Metadata2"));


        return statisticalResult;
    }

}
