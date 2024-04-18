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
public class ExperimentDocumentationTest {


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
    public void documentExperiment() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getExperimentDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("experiment-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("id").description("The unique identifier for the experiment."),
                                fieldWithPath("observation_id").description("The observation's unique identifier."),
                                fieldWithPath("specimen_id").description("The specimen's unique identifier."),
                                fieldWithPath("phenotyping_center_id").description("The unique identifier of the phenotyping center."),
                                fieldWithPath("phenotyping_center").description("The name of the phenotyping center."),
                                fieldWithPath("production_center_id").description("The unique identifier of the production center."),
                                fieldWithPath("production_center").description("The name of the production center."),
                                fieldWithPath("specimen_project_id").description("The unique identifier for the specimen project."),
                                fieldWithPath("specimen_project_name").description("The name of the specimen project."),
                                fieldWithPath("gene_accession_id").description("The accession ID of the gene."),
                                fieldWithPath("gene_symbol").description("The symbol of the gene."),
                                fieldWithPath("allele_accession_id").description("The accession ID of the allele."),
                                fieldWithPath("allele_symbol").description("The symbol of the allele."),
                                fieldWithPath("zygosity").description("The zygosity of the specimen."),
                                fieldWithPath("sex").description("The sex of the specimen."),
                                fieldWithPath("biological_model_id").description("The unique identifier for the biological model."),
                                fieldWithPath("biological_sample_id").description("The unique identifier for the biological sample."),
                                fieldWithPath("biological_sample_group").description("The group of the biological sample."),
                                fieldWithPath("strain_accession_id").description("The accession ID of the strain."),
                                fieldWithPath("strain_name").description("The name of the strain."),
                                fieldWithPath("genetic_background").description("The genetic background of the specimen."),
                                fieldWithPath("allelic_composition").description("The allelic composition of the specimen."),
                                fieldWithPath("colony_id").description("The unique identifier of the colony."),
                                fieldWithPath("litter_id").description("The unique identifier of the litter."),
                                fieldWithPath("date_of_birth").description("The date of birth of the specimen."),
                                fieldWithPath("external_sample_id").description("The external sample identifier."),
                                fieldWithPath("life_stage_name").description("The name of the life stage of the specimen."),
                                fieldWithPath("life_stage_acc").description("The accession code for the life stage."),
                                fieldWithPath("datasource_id").description("The unique identifier for the data source."),
                                fieldWithPath("datasource_name").description("The name of the data source."),
                                fieldWithPath("project_id").description("The unique identifier for the project."),
                                fieldWithPath("project_name").description("The name of the project."),
                                fieldWithPath("pipeline_id").description("The unique identifier for the pipeline."),
                                fieldWithPath("pipeline_name").description("The name of the pipeline."),
                                fieldWithPath("pipeline_stable_id").description("The stable identifier for the pipeline."),
                                fieldWithPath("procedure_id").description("The unique identifier for the procedure."),
                                fieldWithPath("procedure_name").description("The name of the procedure."),
                                fieldWithPath("procedure_stable_id").description("The stable identifier for the procedure."),
                                fieldWithPath("procedure_group").description("The group of the procedure."),
                                fieldWithPath("parameter_id").description("The unique identifier for the parameter."),
                                fieldWithPath("parameter_name").description("The name of the parameter."),
                                fieldWithPath("parameter_stable_id").description("The stable identifier for the parameter."),
                                fieldWithPath("procedure_sequence_id").description("The sequence identifier for the procedure."),
                                fieldWithPath("experiment_id").description("The unique identifier for the experiment."),
                                fieldWithPath("observation_type").description("The type of observation."),
                                fieldWithPath("data_type").description("Defines the general category or type of the data, such as gene, allele, etc."),
                                fieldWithPath("date_of_experiment").description("The date when the experiment was conducted."),
                                fieldWithPath("weight_parameter_stable_id").description("The stable identifier for the weight parameter."),
                                fieldWithPath("weight_date").description("The date corresponding to the weight measurement."),
                                fieldWithPath("weight_days_old").description("The age in days of the specimen at the time of the weight measurement."),
                                fieldWithPath("weight").description("The weight of the specimen."),
                                fieldWithPath("data_point").description("A specific data point from the experiment."),
                                fieldWithPath("order_index").description("The index ordering of the data point."),
                                fieldWithPath("dimension").description("The dimension to which the data point relates."),
                                fieldWithPath("time_point").description("The specific time point at which the data was collected."),
                                fieldWithPath("discrete_point").description("A discrete point measurement from the experiment."),
                                fieldWithPath("category").description("The category of the data point."),
                                fieldWithPath("raw_category").description("The raw category data before processing."),
                                fieldWithPath("metadata").description("A list of metadata entries associated with the experiment."),
                                fieldWithPath("anatomy_id").description("A list of anatomy IDs relevant to the experiment."),
                                fieldWithPath("anatomy_term").description("A list of anatomy terms relevant to the experiment."),
                                fieldWithPath("anatomy_id_term").description("A list combining anatomy IDs and terms."),
                                fieldWithPath("anatomy_term_synonym").description("A list of synonyms for the anatomy terms."),
                                fieldWithPath("top_level_anatomy_id").description("A list of top-level anatomy IDs."),
                                fieldWithPath("top_level_anatomy_term").description("A list of top-level anatomy terms."),
                                fieldWithPath("top_level_anatomy_term_synonym").description("A list of synonyms for the top-level anatomy terms."),
                                fieldWithPath("selected_top_level_anatomy_id").description("A list of selected top-level anatomy IDs."),
                                fieldWithPath("selected_top_level_anatomy_term").description("A list of selected top-level anatomy terms."),
                                fieldWithPath("selected_top_level_anatomy_term_synonym").description("A list of synonyms for the selected top-level anatomy terms."),
                                fieldWithPath("intermediate_anatomy_id").description("A list of intermediate anatomy IDs."),
                                fieldWithPath("intermediate_anatomy_term").description("A list of intermediate anatomy terms."),
                                fieldWithPath("intermediate_anatomy_term_synonym").description("A list of synonyms for the intermediate anatomy terms."),
                                fieldWithPath("parent_anatomy_id").description("A list of parent anatomy IDs."),
                                fieldWithPath("parent_anatomy_term").description("A list of parent anatomy terms."),
                                fieldWithPath("parent_anatomy_term_synonym").description("A list of synonyms for the parent anatomy terms."),
                                fieldWithPath("child_anatomy_id").description("A list of child anatomy IDs."),
                                fieldWithPath("child_anatomy_term").description("A list of child anatomy terms."),
                                fieldWithPath("child_anatomy_term_synonym").description("A list of synonyms for the child anatomy terms."),
                                fieldWithPath("download_file_path").description("The file path for downloading associated data."),
                                fieldWithPath("image_link").description("A link to an associated image."),
                                fieldWithPath("file_type").description("The file type of the associated data."),
                                fieldWithPath("increment_value").description("An increment value associated with the data."),
                                fieldWithPath("parameter_association_stable_id").description("A list of stable IDs for parameter associations."),
                                fieldWithPath("parameter_association_sequence_id").description("A list of sequence IDs for parameter associations."),
                                fieldWithPath("parameter_association_dim_id").description("A list of dimension IDs for parameter associations."),
                                fieldWithPath("parameter_association_name").description("A list of names for parameter associations."),
                                fieldWithPath("parameter_association_value").description("A list of values for parameter associations."),
                                fieldWithPath("developmental_stage_acc").description("The accession code for the developmental stage."),
                                fieldWithPath("developmental_stage_name").description("The name of the developmental stage."),
                                fieldWithPath("text_value").description("A text value associated with the experiment."),
                                fieldWithPath("sub_term_id").description("A list of sub-term IDs."),
                                fieldWithPath("sub_term_name").description("A list of sub-term names."),
                                fieldWithPath("sub_term_description").description("A list of descriptions for the sub-terms."),
                                fieldWithPath("age_in_days").description("The age in days of the specimen at the time of the experiment."),
                                fieldWithPath("age_in_weeks").description("The age in weeks of the specimen at the time of the experiment."),
                                fieldWithPath("metadata_group").description("A grouping identifier for the metadata, organizing it into logical groups."),
                                fieldWithPath("experiment_source_id").description("The unique identifier for the source of the experiment data.")

                        )

                ));
    }
}