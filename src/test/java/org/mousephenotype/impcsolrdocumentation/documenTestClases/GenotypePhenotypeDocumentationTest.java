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
public class GenotypePhenotypeDocumentationTest {


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

        mockMvc.perform(get("http://localhost:8080/getGenotypePhenotypeDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("genotype-phenotype-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("doc_id").description("The unique identifier for the document."),
                                fieldWithPath("ontology_db_id").description("The database ID associated with the ontology entry."),
                                fieldWithPath("assertion_type").description("The type of assertion made in the document."),
                                fieldWithPath("assertion_type_id").description("The unique identifier for the assertion type."),
                                fieldWithPath("mpath_term_id").description("The identifier for the pathology (MPATH) term."),
                                fieldWithPath("mpath_term_name").description("The name of the pathology (MPATH) term."),
                                fieldWithPath("anatomy_term_id").description("List of anatomy term identifiers."),
                                fieldWithPath("anatomy_term_name").description("List of anatomy term names."),
                                fieldWithPath("intermediate_anatomy_term_id").description("List of intermediate anatomy term identifiers."),
                                fieldWithPath("intermediate_anatomy_term_name").description("List of intermediate anatomy term names."),
                                fieldWithPath("top_level_anatomy_term_id").description("List of top-level anatomy term identifiers."),
                                fieldWithPath("top_level_anatomy_term_name").description("List of top-level anatomy term names."),
                                fieldWithPath("mp_term_id").description("The identifier for the mouse phenotype (MP) term."),
                                fieldWithPath("mp_term_name").description("The name of the mouse phenotype (MP) term."),
                                fieldWithPath("alt_mp_term_id").description("List of alternative mouse phenotype (MP) term identifiers."),
                                fieldWithPath("top_level_mp_term_id").description("List of top-level mouse phenotype (MP) term identifiers."),
                                fieldWithPath("top_level_mp_term_name").description("List of top-level mouse phenotype (MP) term names."),
                                fieldWithPath("intermediate_mp_term_id").description("List of intermediate mouse phenotype (MP) term identifiers."),
                                fieldWithPath("intermediate_mp_term_name").description("List of intermediate mouse phenotype (MP) term names."),
                                fieldWithPath("marker_symbol").description("The symbol for the genetic marker."),
                                fieldWithPath("marker_accession_id").description("The accession ID for the genetic marker."),
                                fieldWithPath("colony_id").description("The identifier for the colony."),
                                fieldWithPath("allele_name").description("The name of the allele."),
                                fieldWithPath("allele_symbol").description("The symbol of the allele."),
                                fieldWithPath("allele_accession_id").description("The accession ID of the allele."),
                                fieldWithPath("strain_name").description("The name of the strain."),
                                fieldWithPath("strain_accession_id").description("The accession ID of the strain."),
                                fieldWithPath("phenotyping_center").description("The name of the phenotyping center."),
                                fieldWithPath("project_external_id").description("The external ID of the project."),
                                fieldWithPath("project_name").description("List of names for the project."),
                                fieldWithPath("project_fullname").description("The full name of the project."),
                                fieldWithPath("resource_name").description("The name of the resource."),
                                fieldWithPath("resource_fullname").description("The full name of the resource."),
                                fieldWithPath("sex").description("The sex of the subject."),
                                fieldWithPath("zygosity").description("The zygosity of the subject."),
                                fieldWithPath("pipeline_name").description("The name of the pipeline."),
                                fieldWithPath("pipeline_stable_id").description("The stable ID of the pipeline."),
                                fieldWithPath("pipeline_stable_key").description("The stable key of the pipeline."),
                                fieldWithPath("procedure_name").description("The name of the procedure."),
                                fieldWithPath("procedure_stable_id").description("List of stable IDs for the procedures."),
                                fieldWithPath("procedure_stable_key").description("List of stable keys for the procedures."),
                                fieldWithPath("parameter_name").description("The name of the parameter."),
                                fieldWithPath("parameter_stable_id").description("The stable ID of the parameter."),
                                fieldWithPath("parameter_stable_key").description("List of stable keys for the parameter."),
                                fieldWithPath("statistical_method").description("The statistical method used."),
                                fieldWithPath("percentage_change").description("The percentage change observed."),
                                fieldWithPath("p_value").description("The p-value resulting from statistical tests."),
                                fieldWithPath("effect_size").description("The effect size measured."),
                                fieldWithPath("external_id").description("The external identifier for the document."),
                                fieldWithPath("life_stage_acc").description("The accession code for the life stage."),
                                fieldWithPath("life_stage_name").description("The name of the life stage.")
                        )


                ));
    }
}