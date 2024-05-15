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
public class MgiPhenotypeDocumentationTest {


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
    public void documentMgiPhenotype() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getMgiPhenotypeDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("mgi-phenotype-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("doc_id").description("The unique identifier for the document."),
                                fieldWithPath("assertion_type").description("The type of assertion made in the document."),
                                fieldWithPath("assertion_type_id").description("The unique identifier for the assertion type."),
                                fieldWithPath("mpath_term_id").description("The identifier for the MPATH term."),
                                fieldWithPath("mpath_term_name").description("The name of the MPATH term."),
                                fieldWithPath("emap_term_id").description("The identifier for the EMAP term."),
                                fieldWithPath("emap_term_name").description("The name of the EMAP term."),
                                fieldWithPath("mp_term_id").description("The identifier for the MP term."),
                                fieldWithPath("mp_term_name").description("The name of the MP term."),
                                fieldWithPath("alt_mp_term_id").description("Alternative MP term identifiers."),
                                fieldWithPath("top_level_mp_term_id").description("Identifiers for top-level MP terms."),
                                fieldWithPath("top_level_mp_term_name").description("Names of top-level MP terms."),
                                fieldWithPath("top_level_mp_term_definition").description("Definitions of top-level MP terms."),
                                fieldWithPath("top_level_mp_term_synonym").description("Synonyms for top-level MP terms."),
                                fieldWithPath("intermediate_mp_term_id").description("Identifiers for intermediate MP terms."),
                                fieldWithPath("intermediate_mp_term_name").description("Names of intermediate MP terms."),
                                fieldWithPath("intermediate_mp_term_definition").description("Definitions of intermediate MP terms."),
                                fieldWithPath("intermediate_mp_term_synonym").description("Synonyms for intermediate MP terms."),
                                fieldWithPath("marker_symbol").description("The symbol for the marker."),
                                fieldWithPath("marker_accession_id").description("The accession ID for the marker."),
                                fieldWithPath("colony_id").description("The identifier for the colony."),
                                fieldWithPath("allele_name").description("The name of the allele."),
                                fieldWithPath("allele_symbol").description("The symbol for the allele."),
                                fieldWithPath("allele_accession_id").description("The accession ID for the allele."),
                                fieldWithPath("strain_name").description("The name of the strain."),
                                fieldWithPath("strain_accession_id").description("The accession ID for the strain."),
                                fieldWithPath("phenotyping_center").description("The name of the phenotyping center."),
                                fieldWithPath("project_external_id").description("The external identifier for the project."),
                                fieldWithPath("project_name").description("The name of the project."),
                                fieldWithPath("project_fullname").description("The full name of the project."),
                                fieldWithPath("resource_name").description("The name of the resource."),
                                fieldWithPath("resource_fullname").description("The full name of the resource."),
                                fieldWithPath("sex").description("The sex of the subjects in the experiment."),
                                fieldWithPath("zygosity").description("The zygosity of the subjects in the experiment."),
                                fieldWithPath("pipeline_name").description("The name of the pipeline used."),
                                fieldWithPath("pipeline_stable_id").description("The stable identifier for the pipeline."),
                                fieldWithPath("pipeline_stable_key").description("The stable key for the pipeline."),
                                fieldWithPath("procedure_name").description("The name of the procedure used."),
                                fieldWithPath("procedure_stable_id").description("The stable identifier for the procedure."),
                                fieldWithPath("procedure_stable_key").description("The stable key for the procedure."),
                                fieldWithPath("parameter_name").description("The name of the parameter measured."),
                                fieldWithPath("parameter_stable_id").description("The stable identifier for the parameter."),
                                fieldWithPath("parameter_stable_key").description("The stable key for the parameter."),
                                fieldWithPath("statistical_method").description("The statistical method used in the analysis."),
                                fieldWithPath("percentage_change").description("The percentage change measured in the experiment."),
                                fieldWithPath("p_value").description("The p-value resulting from the statistical analysis."),
                                fieldWithPath("effect_size").description("The effect size measured in the experiment."),
                                fieldWithPath("external_id").description("An external identifier associated with the document."),
                                fieldWithPath("life_stage_acc").description("The accession code for the life stage."),
                                fieldWithPath("life_stage_name").description("The name of the life stage of the subjects.")
                        )

                ));
    }
}