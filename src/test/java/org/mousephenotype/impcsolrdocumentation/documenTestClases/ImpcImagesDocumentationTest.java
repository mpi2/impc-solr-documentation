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
public class ImpcImagesDocumentationTest {


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
    public void documentImpcImages() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getImpcImagesDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("impc-images-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("id").description("The unique identifier for the experiment."),
                                fieldWithPath("observation_id").description("The observation ID associated with this experiment."),
                                fieldWithPath("specimen_id").description("The specimen ID related to this experiment."),
                                fieldWithPath("phenotyping_center_id").description("The ID of the phenotyping center where the experiment was conducted."),
                                fieldWithPath("phenotyping_center").description("The name of the phenotyping center."),
                                fieldWithPath("production_center_id").description("The ID of the production center related to the specimen."),
                                fieldWithPath("production_center").description("The name of the production center."),
                                fieldWithPath("specimen_project_id").description("The project ID associated with the specimen."),
                                fieldWithPath("specimen_project_name").description("The name of the project associated with the specimen."),
                                fieldWithPath("gene_accession_id").description("The accession ID for the gene of interest."),
                                fieldWithPath("gene_symbol").description("The symbol representing the gene of interest."),
                                fieldWithPath("allele_accession_id").description("The accession ID for the allele of interest."),
                                fieldWithPath("allele_symbol").description("The symbol for the allele of interest."),
                                fieldWithPath("zygosity").description("The zygosity of the specimen."),
                                fieldWithPath("sex").description("The sex of the specimen."),
                                fieldWithPath("biological_model_id").description("The ID of the biological model used."),
                                fieldWithPath("biological_sample_id").description("The ID of the biological sample."),
                                fieldWithPath("biological_sample_group").description("The group classification of the biological sample."),
                                fieldWithPath("strain_accession_id").description("The accession ID for the strain."),
                                fieldWithPath("strain_name").description("The name of the strain."),
                                fieldWithPath("genetic_background").description("The genetic background of the specimen."),
                                fieldWithPath("allelic_composition").description("The allelic composition of the specimen."),
                                fieldWithPath("colony_id").description("The ID of the colony from which the specimen originates."),
                                fieldWithPath("litter_id").description("The ID of the litter from which the specimen originates."),
                                fieldWithPath("date_of_birth").description("The date of birth of the specimen."),
                                fieldWithPath("external_sample_id").description("An external identifier for the sample."),
                                fieldWithPath("life_stage_name").description("The life stage of the specimen."),
                                fieldWithPath("life_stage_acc").description("The accession number associated with the life stage."),
                                fieldWithPath("datasource_id").description("The ID of the data source."),
                                fieldWithPath("datasource_name").description("The name of the data source."),
                                fieldWithPath("project_id").description("The project ID."),
                                fieldWithPath("project_name").description("The name of the project."),
                                fieldWithPath("pipeline_id").description("The pipeline ID."),
                                fieldWithPath("pipeline_name").description("The name of the pipeline."),
                                fieldWithPath("pipeline_stable_id").description("The stable ID of the pipeline."),
                                fieldWithPath("procedure_id").description("The procedure ID."),
                                fieldWithPath("procedure_name").description("The name of the procedure."),
                                fieldWithPath("procedure_stable_id").description("The stable ID of the procedure."),
                                fieldWithPath("procedure_group").description("The procedure group."),
                                fieldWithPath("parameter_id").description("The parameter ID."),
                                fieldWithPath("parameter_name").description("The name of the parameter."),
                                fieldWithPath("parameter_stable_id").description("The stable ID of the parameter."),
                                fieldWithPath("procedure_sequence_id").description("The procedure sequence ID."),
                                fieldWithPath("experiment_id").description("The experiment ID."),
                                fieldWithPath("observation_type").description("The type of observation."),
                                fieldWithPath("data_type").description("The type of data."),
                                fieldWithPath("experiment_source_id").description("The source ID of the experiment."),
                                fieldWithPath("date_of_experiment").description("The date the experiment was conducted."),
                                fieldWithPath("weight_parameter_stable_id").description("The stable ID for the weight parameter."),
                                fieldWithPath("weight_date").description("The date of the weight measurement."),
                                fieldWithPath("weight_days_old").description("The age of the specimen in days at the time of the weight measurement."),
                                fieldWithPath("weight").description("The weight of the specimen."),
                                fieldWithPath("data_point").description("A data point associated with the experiment."),
                                fieldWithPath("order_index").description("The order index."),
                                fieldWithPath("dimension").description("The dimension of the data point."),
                                fieldWithPath("time_point").description("The time point at which the data was collected."),
                                fieldWithPath("discrete_point").description("A discrete data point."),
                                fieldWithPath("category").description("The category of the data."),
                                fieldWithPath("raw_category").description("The raw category of the data."),
                                fieldWithPath("metadata").description("Metadata associated with the experiment."),
                                fieldWithPath("metadata_group").description("The group of the metadata."),
                                fieldWithPath("mp_id[]").description("The MP IDs associated with the experiment."),
                                fieldWithPath("mp_term[]").description("The MP terms associated with the experiment."),
                                fieldWithPath("anatomy_id[]").description("The anatomy IDs related to the experiment."),
                                fieldWithPath("anatomy_term[]").description("The anatomy terms related to the experiment."),
                                fieldWithPath("anatomy_id_term[]").description("Combined anatomy ID and term related to the experiment."),
                                fieldWithPath("anatomy_term_synonym[]").description("Synonyms for the anatomy terms."),
                                fieldWithPath("top_level_anatomy_id[]").description("Top-level anatomy IDs related to the experiment."),
                                fieldWithPath("top_level_anatomy_term[]").description("Top-level anatomy terms related to the experiment."),
                                fieldWithPath("selected_top_level_anatomy_id[]").description("Selected top-level anatomy IDs."),
                                fieldWithPath("selected_top_level_anatomy_term[]").description("Selected top-level anatomy terms."),
                                fieldWithPath("intermediate_anatomy_id[]").description("Intermediate anatomy IDs."),
                                fieldWithPath("intermediate_anatomy_term[]").description("Intermediate anatomy terms."),
                                fieldWithPath("parent_anatomy_id[]").description("Parent anatomy IDs."),
                                fieldWithPath("parent_anatomy_term[]").description("Parent anatomy terms."),
                                fieldWithPath("child_anatomy_id[]").description("Child anatomy IDs."),
                                fieldWithPath("child_anatomy_term[]").description("Child anatomy terms."),
                                fieldWithPath("download_file_path").description("Path to download the file associated with the experiment."),
                                fieldWithPath("image_link").description("Link to the image associated with the experiment."),
                                fieldWithPath("file_type").description("The type of file."),
                                fieldWithPath("parameter_association_stable_id[]").description("Stable IDs for the parameter associations."),
                                fieldWithPath("parameter_association_sequence_id[]").description("Sequence IDs for the parameter associations."),
                                fieldWithPath("parameter_association_dim_id[]").description("Dimension IDs for the parameter associations."),
                                fieldWithPath("parameter_association_name[]").description("Names of the parameter associations."),
                                fieldWithPath("parameter_association_value[]").description("Values of the parameter associations."),
                                fieldWithPath("developmental_stage_acc").description("Accession number for the developmental stage."),
                                fieldWithPath("developmental_stage_name").description("Name of the developmental stage."),
                                fieldWithPath("text_value").description("Text value associated with the experiment."),
                                fieldWithPath("sub_term_id[]").description("Sub-term IDs related to the experiment."),
                                fieldWithPath("sub_term_name[]").description("Sub-term names related to the experiment."),
                                fieldWithPath("sub_term_description[]").description("Descriptions of the sub-terms."),
                                fieldWithPath("sequence_id").description("The sequence ID related to the experiment."),
                                fieldWithPath("age_in_days").description("Age of the specimen in days."),
                                fieldWithPath("age_in_weeks").description("Age of the specimen in weeks."),
                                fieldWithPath("download_url").description("URL to download data or resources associated with the experiment."),
                                fieldWithPath("jpeg_url").description("URL to a JPEG image related to the experiment."),
                                fieldWithPath("thumbnail_url").description("URL to a thumbnail image related to the experiment."),
                                fieldWithPath("omero_id").description("OMERO database ID for the image."),
                                fieldWithPath("top_level_mp_id[]").description("The top-level MP (Mouse Phenotype) IDs associated with the experiment."),
                                fieldWithPath("top_level_mp_term[]").description("The top-level MP terms associated with the experiment."),
                                fieldWithPath("intermediate_mp_id[]").description("The intermediate MP IDs associated with the experiment."),
                                fieldWithPath("intermediate_mp_term[]").description("The intermediate MP terms associated with the experiment."),
                                fieldWithPath("top_level_anatomy_term_synonym").description("Synonyms for the top-level anatomy terms."),
                                fieldWithPath("selected_top_level_anatomy_term_synonym").description("Synonyms for the selected top-level anatomy terms."),
                                fieldWithPath("intermediate_anatomy_term_synonym").description("Synonyms for the intermediate anatomy terms."),
                                fieldWithPath("parent_anatomy_term_synonym").description("Synonyms for the parent anatomy terms."),
                                fieldWithPath("child_anatomy_term_synonym").description("Synonyms for the child anatomy terms.")
                        )

                ));
    }
}