package org.mousephenotype.impcsolrdocumentation.documenTestClases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mousephenotype.impcsolrdocumentation.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration(classes = {Application.class})
@WebMvcTest
@ExtendWith({SpringExtension.class, RestDocumentationExtension.class})
@AutoConfigureRestDocs(outputDir = "target/generated-snippets")
public class StatisticalResultDocumentationTest {


    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp(RestDocumentationContextProvider restDocumentation) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac)
                .apply(documentationConfiguration(restDocumentation))
                .build();
    }

    @Test
    public void documentStatisticalResult() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getStatisticalResultDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("statistical-result-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("doc_id").description("The document identifier unique to this dataset."),
                                fieldWithPath("db_id").description("The database identifier for the dataset."),
                                fieldWithPath("data_type").description("The type of data represented in this dataset."),
                                fieldWithPath("anatomy_term_id[]").description("List of anatomy term identifiers related to the dataset."),
                                fieldWithPath("anatomy_term_name[]").description("List of anatomy term names related to the dataset."),
                                fieldWithPath("intermediate_anatomy_term_id[]").description("List of intermediate anatomy term identifiers."),
                                fieldWithPath("intermediate_anatomy_term_name[]").description("List of intermediate anatomy term names."),
                                fieldWithPath("top_level_anatomy_term_id[]").description("List of top-level anatomy term identifiers."),
                                fieldWithPath("top_level_anatomy_term_name[]").description("List of top-level anatomy term names."),
                                fieldWithPath("mp_term_id_options[]").description("List of optional MP term identifiers."),
                                fieldWithPath("mp_term_name_options[]").description("List of optional MP term names."),
                                fieldWithPath("mp_term_id").description("The identifier for the MP term."),
                                fieldWithPath("mp_term_name").description("The name of the MP term."),
                                fieldWithPath("top_level_mp_term_id[]").description("List of top-level MP term identifiers."),
                                fieldWithPath("top_level_mp_term_name[]").description("List of top-level MP term names."),
                                fieldWithPath("intermediate_mp_term_id[]").description("List of intermediate MP term identifiers."),
                                fieldWithPath("intermediate_mp_term_name[]").description("List of intermediate MP term names."),
                                fieldWithPath("male_mp_term_id").description("The identifier for the male MP term."),
                                fieldWithPath("male_mp_term_name").description("The name of the male MP term."),
                                fieldWithPath("male_top_level_mp_term_id[]").description("List of male top-level MP term identifiers."),
                                fieldWithPath("male_top_level_mp_term_name[]").description("List of male top-level MP term names."),
                                fieldWithPath("male_intermediate_mp_term_id[]").description("List of male intermediate MP term identifiers."),
                                fieldWithPath("male_intermediate_mp_term_name[]").description("List of male intermediate MP term names."),
                                fieldWithPath("female_mp_term_id").description("The identifier for the female MP term."),
                                fieldWithPath("female_mp_term_name").description("The name of the female MP term."),
                                fieldWithPath("female_top_level_mp_term_id[]").description("List of female top-level MP term identifiers."),
                                fieldWithPath("female_top_level_mp_term_name[]").description("List of female top-level MP term names."),
                                fieldWithPath("female_intermediate_mp_term_id[]").description("List of female intermediate MP term identifiers."),
                                fieldWithPath("female_intermediate_mp_term_name[]").description("List of female intermediate MP term names."),
                                fieldWithPath("genetic_background").description("The genetic background of the subjects in the dataset."),
                                fieldWithPath("production_center").description("The center where the data was produced."),
                                fieldWithPath("external_db_id").description("External database identifier associated with the dataset."),
                                fieldWithPath("id").description("Unique identifier for the dataset."),
                                fieldWithPath("organisation_id").description("Identifier of the organisation associated with the dataset."),
                                fieldWithPath("phenotyping_center_id").description("Identifier of the phenotyping center where the data was generated."),
                                fieldWithPath("project_id").description("Project identifier associated with the dataset."),
                                fieldWithPath("male_control_mean").description("The mean value for male controls."),
                                fieldWithPath("male_mutant_mean").description("The mean value for male mutants."),
                                fieldWithPath("female_control_mean").description("The mean value for female controls."),
                                fieldWithPath("female_mutant_mean").description("The mean value for female mutants."),
                                fieldWithPath("genotype_p_value_low_vs_normal_high").description("P-value for genotype low versus normal/high comparison."),
                                fieldWithPath("genotype_p_value_low_normal_vs_high").description("P-value for genotype low/normal versus high comparison."),
                                fieldWithPath("genotype_effect_size_low_vs_normal_high").description("Effect size for genotype low versus normal/high comparison."),
                                fieldWithPath("genotype_effect_size_low_normal_vs_high").description("Effect size for genotype low/normal versus high comparison."),
                                fieldWithPath("female_p_value_low_vs_normal_high").description("P-value for female low versus normal/high comparison."),
                                fieldWithPath("female_p_value_low_normal_vs_high").description("P-value for female low/normal versus high comparison."),
                                fieldWithPath("female_effect_size_low_vs_normal_high").description("Effect size for female low versus normal/high comparison."),
                                fieldWithPath("female_effect_size_low_normal_vs_high").description("Effect size for female low/normal versus high comparison."),
                                fieldWithPath("male_p_value_low_vs_normal_high").description("P-value for male low versus normal/high comparison."),
                                fieldWithPath("male_p_value_low_normal_vs_high").description("P-value for male low/normal versus high comparison."),
                                fieldWithPath("male_effect_size_low_vs_normal_high").description("Effect size for male low versus normal/high comparison."),
                                fieldWithPath("male_effect_size_low_normal_vs_high").description("Effect size for male low/normal versus high comparison."),
                                fieldWithPath("categories[]").description("Categories used in the statistical analysis."),
                                fieldWithPath("categorical_p_value").description("P-value for the categorical analysis."),
                                fieldWithPath("categorical_effect_size").description("Effect size for the categorical analysis."),
                                fieldWithPath("batch_significant").description("Indicates if batch effects are significant."),
                                fieldWithPath("variance_significant").description("Indicates if variance is significant."),
                                fieldWithPath("null_test_p_value").description("P-value for the null hypothesis test."),
                                fieldWithPath("genotype_effect_p_value").description("P-value for the genotype effect."),
                                fieldWithPath("genotype_effect_stderr_estimate").description("Standard error estimate for the genotype effect."),
                                fieldWithPath("genotype_effect_parameter_estimate").description("Parameter estimate for the genotype effect."),
                                fieldWithPath("male_percentage_change").description("Percentage change for males."),
                                fieldWithPath("female_percentage_change").description("Percentage change for females."),
                                fieldWithPath("sex_effect_p_value").description("P-value for the sex effect."),
                                fieldWithPath("sex_effect_stderr_estimate").description("Standard error estimate for the sex effect."),
                                fieldWithPath("sex_effect_parameter_estimate").description("Parameter estimate for the sex effect."),
                                fieldWithPath("weight_effect_p_value").description("P-value for the weight effect."),
                                fieldWithPath("weight_effect_stderr_estimate").description("Standard error estimate for the weight effect."),
                                fieldWithPath("weight_effect_parameter_estimate").description("Parameter estimate for the weight effect."),
                                fieldWithPath("group1_genotype").description("Genotype for group 1."),
                                fieldWithPath("group1_residuals_normality_test").description("Results of the residuals normality test for group 1."),
                                fieldWithPath("group2_genotype").description("Genotype for group 2."),
                                fieldWithPath("group2_residuals_normality_test").description("Results of the residuals normality test for group 2."),
                                fieldWithPath("blups_test").description("Results of the BLUPs test."),
                                fieldWithPath("rotated_residuals_test").description("Results of the rotated residuals test."),
                                fieldWithPath("intercept_estimate").description("Estimate of the intercept."),
                                fieldWithPath("intercept_estimate_stderr_estimate").description("Standard error estimate of the intercept estimate."),
                                fieldWithPath("interaction_significant").description("Indicates if interaction effects are significant."),
                                fieldWithPath("interaction_effect_p_value").description("P-value for the interaction effect."),
                                fieldWithPath("soft_windowing_bandwidth").description("Bandwidth used in soft windowing."),
                                fieldWithPath("soft_windowing_shape").description("Shape used in soft windowing."),
                                fieldWithPath("soft_windowing_peaks").description("Peaks identified in soft windowing."),
                                fieldWithPath("soft_windowing_min_obs_required").description("Minimum observations required for soft windowing."),
                                fieldWithPath("soft_windowing_total_obs_or_weight").description("Total observations or weight for soft windowing."),
                                fieldWithPath("soft_windowing_threshold").description("Threshold used in soft windowing."),
                                fieldWithPath("soft_windowing_number_of_doe").description("Number of degrees of freedom in soft windowing."),
                                fieldWithPath("soft_windowing_doe_note").description("Notes on the degree of evidence in soft windowing."),
                                fieldWithPath("metadata[]").description("List of metadata associated with the dataset."),
                                fieldWithPath("resource_name").description("The name of the resource."),
                                fieldWithPath("resource_fullname").description("The full name of the resource."),
                                fieldWithPath("resource_id").description("The unique identifier for the resource."),
                                fieldWithPath("project_name[]").description("List of names of projects associated with the dataset."),
                                fieldWithPath("phenotyping_center").description("The name of the phenotyping center where the data was generated."),
                                fieldWithPath("pipeline_stable_id").description("The stable identifier for the pipeline."),
                                fieldWithPath("pipeline_stable_key").description("The stable key for the pipeline."),
                                fieldWithPath("pipeline_name").description("The name of the pipeline."),
                                fieldWithPath("pipeline_id").description("The unique identifier for the pipeline."),
                                fieldWithPath("procedure_stable_id[]").description("List of stable identifiers for the procedures."),
                                fieldWithPath("procedure_stable_key[]").description("List of stable keys for the procedures."),
                                fieldWithPath("procedure_name").description("The name of the procedure."),
                                fieldWithPath("procedure_id").description("The unique identifier for the procedure."),
                                fieldWithPath("parameter_stable_id").description("The stable identifier for the parameter."),
                                fieldWithPath("parameter_stable_key[]").description("List of stable keys for the parameter."),
                                fieldWithPath("parameter_name").description("The name of the parameter."),
                                fieldWithPath("parameter_id").description("The unique identifier for the parameter."),
                                fieldWithPath("colony_id").description("The identifier for the colony."),
                                fieldWithPath("marker_symbol").description("The symbol for the genetic marker."),
                                fieldWithPath("marker_accession_id").description("The accession ID for the genetic marker."),
                                fieldWithPath("allele_symbol").description("The symbol for the allele."),
                                fieldWithPath("allele_name").description("The name of the allele."),
                                fieldWithPath("allele_accession_id").description("The accession ID for the allele."),
                                fieldWithPath("strain_name").description("The name of the strain."),
                                fieldWithPath("strain_accession_id").description("The accession ID for the strain."),
                                fieldWithPath("sex").description("The sex of the organism."),
                                fieldWithPath("zygosity").description("The zygosity of the organism."),
                                fieldWithPath("control_selection_method").description("The method used for control selection."),
                                fieldWithPath("dependent_variable").description("The dependent variable being measured."),
                                fieldWithPath("metadata_group").description("The group classification of the metadata."),
                                fieldWithPath("data_frame").description("The frame of data being referred to."),
                                fieldWithPath("female_ko_effect_p_value").description("The P-value for the knockout effect in females."),
                                fieldWithPath("female_ko_effect_stderr_estimate").description("The standard error estimate for the knockout effect in females."),
                                fieldWithPath("female_ko_parameter_estimate").description("The parameter estimate for the knockout effect in females."),
                                fieldWithPath("female_effect_size").description("The effect size for females."),
                                fieldWithPath("male_ko_effect_p_value").description("The P-value for the knockout effect in males."),
                                fieldWithPath("male_ko_effect_stderr_estimate").description("The standard error estimate for the knockout effect in males."),
                                fieldWithPath("male_ko_parameter_estimate").description("The parameter estimate for the knockout effect in males."),
                                fieldWithPath("male_effect_size").description("The effect size for males."),
                                fieldWithPath("classification_tag").description("A classification tag for the dataset."),
                                fieldWithPath("phenotype_sex[]").description("List indicating the sex(es) for which phenotype data is available."),
                                fieldWithPath("life_stage_acc").description("The accession code for the life stage."),
                                fieldWithPath("life_stage_name").description("The name of the life stage."),
                                fieldWithPath("significant").description("Indicates whether the findings are statistically significant.")

                        )

                ));
    }
}