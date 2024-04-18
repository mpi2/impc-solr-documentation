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
public class ImagesDocumentationTest {


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
    public void documentImages() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getImagesDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("images-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("id").description("The unique identifier for the experiment."),
                                fieldWithPath("data_type").description("The type of data for the experiment."),
                                fieldWithPath("mouse_id").description("The unique identifier of the mouse involved in the experiment."),
                                fieldWithPath("gender").description("The gender of the mouse."),
                                fieldWithPath("colony_name").description("The name of the colony from which the mouse originates."),
                                fieldWithPath("genotype").description("The genotype of the mouse."),
                                fieldWithPath("tag_name").description("A list of tags associated with the experiment."),
                                fieldWithPath("tag_value").description("A list of values corresponding to each tag associated with the experiment."),
                                fieldWithPath("x_start").description("A list of start positions on the x-axis for the experiment measurements."),
                                fieldWithPath("x_end").description("A list of end positions on the x-axis for the experiment measurements."),
                                fieldWithPath("y_start").description("A list of start positions on the y-axis for the experiment measurements."),
                                fieldWithPath("y_end").description("A list of end positions on the y-axis for the experiment measurements."),
                                fieldWithPath("annotation_term_id").description("A list of term IDs for annotations applied to the experiment data."),
                                fieldWithPath("annotation_term_name").description("A list of term names for annotations applied to the experiment data."),
                                fieldWithPath("name").description("The name of the experiment."),
                                fieldWithPath("accession").description("The accession number associated with the experiment."),
                                fieldWithPath("allele_accession").description("The accession number for the allele involved in the experiment."),
                                fieldWithPath("exp_name").description("A list of names for the experiment."),
                                fieldWithPath("procedure_name").description("A list of names of procedures involved in the experiment."),
                                fieldWithPath("exp_description").description("A list of descriptions for the experiment."),
                                fieldWithPath("live_sample_group").description("A list of live sample groups involved in the experiment."),
                                fieldWithPath("full_resolution_file_path").description("The file path for the full resolution image associated with the experiment."),
                                fieldWithPath("large_thumbnail_file_path").description("The file path for the large thumbnail image associated with the experiment."),
                                fieldWithPath("original_file_name").description("The original file name of the image associated with the experiment."),
                                fieldWithPath("small_thumbnail_file_path").description("The file path for the small thumbnail image associated with the experiment."),
                                fieldWithPath("age_in_weeks").description("The age of the mouse in weeks at the time of the experiment."),
                                fieldWithPath("symbol").description("A list of symbols associated with the gene involved in the experiment."),
                                fieldWithPath("institute").description("The name of the institute where the experiment was conducted."),
                                fieldWithPath("sanger_symbol").description("A list of Sanger symbols associated with the gene involved in the experiment."),
                                fieldWithPath("gene_name").description("A list of names for the gene involved in the experiment."),
                                fieldWithPath("subtype").description("A list of subtypes for the data involved in the experiment."),
                                fieldWithPath("gene_synonyms").description("A list of synonyms for the gene involved in the experiment."),
                                fieldWithPath("allele_name").description("A list of names for the allele involved in the experiment."),
                                fieldWithPath("ma_term_name").description("A list of Mouse Anatomy (MA) term names involved in the experiment."),
                                fieldWithPath("mp_term_id").description("A list of Mouse Phenotype (MP) term IDs involved in the experiment."),
                                fieldWithPath("mp_term_name").description("A list of Mouse Phenotype (MP) term names involved in the experiment."),
                                fieldWithPath("exp_name_exp").description("A list of experiment names associated with the experiment."),
                                fieldWithPath("symbol_gene").description("A list of gene symbols associated with the experiment."),
                                fieldWithPath("top_level").description("A list of top-level annotations or classifications."),
                                fieldWithPath("live_sample_id").description("A list of live sample identifiers associated with the experiment."),
                                fieldWithPath("dcf_id").description("The unique identifier for the data capture format."),
                                fieldWithPath("dcf_exp_id").description("The unique identifier for the experiment within the data capture format context."),
                                fieldWithPath("sanger_procedure_name").description("The name of the procedure as defined by Sanger institute."),
                                fieldWithPath("sanger_procedure_id").description("The unique identifier for the Sanger procedure."),
                                fieldWithPath("genotype_string").description("The genotype of the subject in string format."),
                                fieldWithPath("embryo_data_available").description("Indicator if data for embryos are available."),
                                fieldWithPath("phenotyping_center_id").description("The unique identifier for the phenotyping center."),
                                fieldWithPath("phenotyping_center").description("The name of the phenotyping center where the experiment was conducted."),
                                fieldWithPath("gene_accession").description("The accession number for the gene involved in the experiment."),
                                fieldWithPath("gene_symbol").description("The symbol for the gene involved in the experiment."),
                                fieldWithPath("zygosity").description("The zygosity of the subject involved in the experiment."),
                                fieldWithPath("sex").description("The sex of the subject involved in the experiment."),
                                fieldWithPath("biological_model_id").description("The unique identifier for the biological model used in the experiment."),
                                fieldWithPath("biological_sample_id").description("The unique identifier for the biological sample used in the experiment."),
                                fieldWithPath("biological_sample_group").description("The group classification for the biological sample."),
                                fieldWithPath("colony_id").description("The unique identifier for the colony from which the subject originated."),
                                fieldWithPath("date_of_birth").description("The date of birth of the subject."),
                                fieldWithPath("external_sample_id").description("The external identifier for the sample used in the experiment."),
                                fieldWithPath("pipeline_id").description("The unique identifier for the pipeline used in the experiment."),
                                fieldWithPath("pipeline_name").description("The name of the pipeline used in the experiment."),
                                fieldWithPath("pipeline_stable_id").description("The stable identifier for the pipeline."),
                                fieldWithPath("procedure_id").description("The unique identifier for the procedure used in the experiment."),
                                fieldWithPath("procedure_stable_id").description("The stable identifier for the procedure."),
                                fieldWithPath("parameter_id").description("The unique identifier for the parameter measured in the experiment."),
                                fieldWithPath("parameter_name").description("The name of the parameter measured."),
                                fieldWithPath("parameter_stable_id").description("The stable identifier for the parameter."),
                                fieldWithPath("experiment_id").description("The unique identifier for the experiment."),
                                fieldWithPath("experiment_source_id").description("The source identifier for the experiment."),
                                fieldWithPath("date_of_experiment").description("The date on which the experiment was conducted."),
                                fieldWithPath("p_value").description("A list of p-values calculated in the experiment."),
                                fieldWithPath("mgi_accession_id").description("A list of MGI accession IDs associated with the gene involved in the experiment."),
                                fieldWithPath("marker_symbol").description("A list of marker symbols associated with the gene."),
                                fieldWithPath("marker_name").description("A list of marker names associated with the gene."),
                                fieldWithPath("marker_synonym").description("A list of synonyms for the marker."),
                                fieldWithPath("marker_type").description("A list of marker types."),
                                fieldWithPath("human_gene_symbol").description("A list of human gene symbols associated with the experiment."),
                                fieldWithPath("status").description("A list of statuses reflecting the current state of the experiment or subject."),
                                fieldWithPath("latest_production_centre").description("A list of names for the latest production centres involved."),
                                fieldWithPath("latest_phenotyping_centre").description("A list of names for the latest phenotyping centres involved."),
                                fieldWithPath("latest_phenotype_status").description("A list of latest phenotype statuses."),
                                fieldWithPath("legacy_phenotype_status").description("The legacy phenotype status code."),
                                fieldWithPath("disease_id").description("A list of disease IDs associated with the experiment."),
                                fieldWithPath("disease_source").description("A list of sources for the disease data."),
                                fieldWithPath("disease_term").description("A list of disease terms associated with the experiment."),
                                fieldWithPath("disease_alts").description("A list of alternative names for the diseases."),
                                fieldWithPath("disease_classes").description("A list of disease classifications."),
                                fieldWithPath("human_curated").description("Indicators for whether the association was human-curated."),
                                fieldWithPath("mouse_curated").description("Indicators for whether the association was curated based on mouse data."),
                                fieldWithPath("mgi_predicted").description("Indicators for whether the gene association was predicted by MGI."),
                                fieldWithPath("impc_predicted").description("Indicators for whether the gene association was predicted by IMPC."),
                                fieldWithPath("mgi_predicted_known_gene").description("Indicators for whether the association with a known gene was predicted by MGI."),
                                fieldWithPath("impc_predicted_known_gene").description("Indicators for whether the association with a known gene was predicted by IMPC."),
                                fieldWithPath("mgi_novel_predicted_in_locus").description("Indicators for novel genes predicted in the locus by MGI."),
                                fieldWithPath("impc_novel_predicted_in_locus").description("Indicators for novel genes predicted in the locus by IMPC."),
                                fieldWithPath("mp_id").description("A list of Mouse Phenotype (MP) IDs."),
                                fieldWithPath("mp_term").description("A list of MP terms."),
                                fieldWithPath("mp_term_synonym").description("A list of synonyms for the MP terms."),
                                fieldWithPath("top_level_mp_id").description("A list of top-level MP IDs."),
                                fieldWithPath("top_level_mp_term").description("A list of top-level MP terms."),
                                fieldWithPath("top_level_mp_term_synonym").description("A list of synonyms for the top-level MP terms."),
                                fieldWithPath("intermediate_mp_id").description("A list of intermediate MP IDs."),
                                fieldWithPath("intermediate_mp_term").description("A list of intermediate MP terms."),
                                fieldWithPath("intermediate_mp_term_synonym").description("A list of synonyms for the intermediate MP terms."),
                                fieldWithPath("child_mp_id").description("A list of child MP IDs."),
                                fieldWithPath("child_mp_term").description("A list of child MP terms."),
                                fieldWithPath("child_mp_term_synonym").description("A list of synonyms for the child MP terms."),
                                fieldWithPath("annotated_higher_level_mp_term_id").description("A list of IDs for MP terms annotated at a higher level."),
                                fieldWithPath("annotated_higher_level_mp_term_name").description("A list of names for MP terms annotated at a higher level."),
                                fieldWithPath("ma_id").description("A list of Mouse Anatomy (MA) IDs."),
                                fieldWithPath("ma_term").description("A list of MA terms."),
                                fieldWithPath("ma_term_synonym").description("A list of synonyms for the MA terms."),
                                fieldWithPath("selected_top_level_ma_id").description("A list of selected top-level MA IDs."),
                                fieldWithPath("selected_top_level_ma_term").description("A list of selected top-level MA terms."),
                                fieldWithPath("selected_top_level_ma_term_synonym").description("A list of synonyms for the selected top-level MA terms."),
                                fieldWithPath("child_ma_id").description("A list of child MA IDs."),
                                fieldWithPath("child_ma_term").description("A list of child MA terms."),
                                fieldWithPath("child_ma_term_synonym").description("A list of synonyms for the child MA terms."),
                                fieldWithPath("hp_id").description("A list of Human Phenotype Ontology (HPO) IDs."),
                                fieldWithPath("hp_term").description("A list of HPO terms."),
                                fieldWithPath("text").description("A list of text fields for full-text search."),
                                fieldWithPath("auto_suggest").ignored(),
                                fieldWithPath("text_search").ignored(),
                                fieldWithPath("gene_qf").ignored(),
                                fieldWithPath("mp_qf").ignored(),
                                fieldWithPath("disease_qf").ignored(),
                                fieldWithPath("ma_qf").ignored())

                ));
    }
}