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
public class PipelineDocumentationTest {


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
    public void documentPipeline() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getPipelineDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("pipeline-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("fully_qualified_name").description("The fully qualified name associated with the experiment."),
                                fieldWithPath("data_type").description("The data type of the experiment."),
                                fieldWithPath("version").description("The version of the experiment data."),
                                fieldWithPath("parameter_id").description("The unique identifier for the parameter."),
                                fieldWithPath("parameter_stable_id").description("The stable identifier for the parameter."),
                                fieldWithPath("parameter_name").description("The name of the parameter."),
                                fieldWithPath("parameter_stable_key").description("The stable key of the parameter."),
                                fieldWithPath("procedure_id").description("The unique identifier for the procedure."),
                                fieldWithPath("procedure_stable_id").description("The stable identifier for the procedure."),
                                fieldWithPath("procedure_name").description("The name of the procedure."),
                                fieldWithPath("procedure_stable_key").description("The stable key of the procedure."),
                                fieldWithPath("pipeline_id").description("The unique identifier for the pipeline."),
                                fieldWithPath("pipeline_stable_id").description("The stable identifier for the pipeline."),
                                fieldWithPath("pipeline_name").description("The name of the pipeline."),
                                fieldWithPath("pipeline_stable_key").description("The stable key of the pipeline."),
                                fieldWithPath("required").description("Indicates whether the parameter is required."),
                                fieldWithPath("observation_type").description("The type of observation made in the experiment."),
                                fieldWithPath("mp_terms").description("List of Mammalian Phenotype (MP) Ontology terms associated with the experiment."),
                                fieldWithPath("description").description("The description of the experiment."),
                                fieldWithPath("unit_x").description("The unit of measurement for the X-axis."),
                                fieldWithPath("unit_y").description("The unit of measurement for the Y-axis."),
                                fieldWithPath("metadata").description("Indicates whether the experiment includes metadata."),
                                fieldWithPath("increment").description("Indicates whether the parameter value increments."),
                                fieldWithPath("categories").description("The categories associated with the experiment."),
                                fieldWithPath("has_options").description("Indicates whether the experiment has options."),
                                fieldWithPath("derived").description("Indicates whether the experiment data is derived."),
                                fieldWithPath("media").description("Indicates whether the experiment includes media content."),
                                fieldWithPath("annotate").description("Indicates whether the experiment is annotated."),
                                fieldWithPath("comparable_parameter_group").description("The group of comparable parameters."),
                                fieldWithPath("experiment_level").description("The level of the experiment."),
                                fieldWithPath("stage").description("The stage of the experiment."),
                                fieldWithPath("stage_label").description("The label for the stage of the experiment."),
                                fieldWithPath("schedule_key").description("The schedule key for the experiment."),
                                fieldWithPath("mp_id").description("List of Mammalian Phenotype (MP) Ontology IDs."),
                                fieldWithPath("mp_id").description("List of Mammalian Phenotype (MP) Ontology IDs."),
                                fieldWithPath("mp_term").description("List of Mammalian Phenotype (MP) Ontology terms."),
                                fieldWithPath("mp_term_synonym").description("List of synonyms for Mammalian Phenotype (MP) Ontology terms."),
                                fieldWithPath("top_level_mp_id").description("List of top-level MP Ontology IDs."),
                                fieldWithPath("top_level_mp_term").description("List of top-level MP Ontology terms."),
                                fieldWithPath("top_level_mp_term_synonym").description("List of synonyms for top-level MP Ontology terms."),
                                fieldWithPath("intermediate_mp_id").description("List of intermediate MP Ontology IDs."),
                                fieldWithPath("intermediate_mp_term").description("List of intermediate MP Ontology terms."),
                                fieldWithPath("intermediate_mp_term_synonym").description("List of synonyms for intermediate MP Ontology terms."),
                                fieldWithPath("abnormal_mp_id").description("List of IDs for abnormal MP Ontology terms."),
                                fieldWithPath("increased_mp_id").description("List of IDs for increased MP Ontology terms."),
                                fieldWithPath("decreased_mp_id").description("List of IDs for decreased MP Ontology terms."),
                                fieldWithPath("abnormal_mp_term").description("List of abnormal MP Ontology terms."),
                                fieldWithPath("increased_mp_term").description("List of increased MP Ontology terms."),
                                fieldWithPath("decreased_mp_term").description("List of decreased MP Ontology terms."),
                                fieldWithPath("hp_id").description("List of Human Phenotype Ontology (HPO) IDs."),
                                fieldWithPath("hp_term").description("List of Human Phenotype Ontology (HPO) terms."),
                                fieldWithPath("inferred_ma_id").description("The inferred Mouse Anatomy (MA) ID."),
                                fieldWithPath("inferred_selected_top_level_ma_id").description("The inferred selected top-level Mouse Anatomy (MA) ID."),
                                fieldWithPath("inferred_selected_top_level_ma_term").description("The inferred selected top-level Mouse Anatomy (MA) term."),
                                fieldWithPath("ma_id").description("The Mouse Anatomy (MA) ID."),
                                fieldWithPath("ma_term").description("The Mouse Anatomy (MA) term."),
                                fieldWithPath("ma_term_synonym").description("List of synonyms for the Mouse Anatomy (MA) term."),
                                fieldWithPath("emap_id").description("The EMAP ID for the embryonic mouse anatomy."),
                                fieldWithPath("emap_term").description("The EMAP term for the embryonic mouse anatomy."),
                                fieldWithPath("anatomy_id").description("The anatomy ID."),
                                fieldWithPath("anatomy_term").description("The anatomy term."),
                                fieldWithPath("anatomy_term_synonym").description("List of synonyms for the anatomy term."),
                                fieldWithPath("embryo_anatomy_id").description("The embryo anatomy ID."),
                                fieldWithPath("embryo_anatomy_term").description("The embryo anatomy term."),
                                fieldWithPath("top_level_embryo_anatomy_id").description("List of top-level embryo anatomy IDs."),
                                fieldWithPath("top_level_embryo_anatomy_term").description("List of top-level embryo anatomy terms."),
                                fieldWithPath("mouse_anatomy_id").description("The mouse anatomy ID."),
                                fieldWithPath("mouse_anatomy_term").description("The mouse anatomy term."),
                                fieldWithPath("top_level_mouse_anatomy_id").description("List of top-level mouse anatomy IDs."),
                                fieldWithPath("top_level_mouse_anatomy_term").description("List of top-level mouse anatomy terms."),
                                fieldWithPath("imits_phenotype_started").description("List indicating the start of phenotype analysis."),
                                fieldWithPath("imits_phenotype_complete").description("List indicating the completion of phenotype analysis."),
                                fieldWithPath("imits_phenotype_status").description("List describing the status of phenotype analysis.")

                        )

                ));
    }
}