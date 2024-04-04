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
                                fieldWithPath("docId").description("The unique identifier for the document."),
                                fieldWithPath("assertionType").description("The type of assertion made in the document."),
                                fieldWithPath("assertionTypeId").description("The unique identifier for the assertion type."),
                                fieldWithPath("mpathTermId").description("The identifier for the MPATH term."),
                                fieldWithPath("mpathTermName").description("The name of the MPATH term."),
                                fieldWithPath("emapTermId").description("The identifier for the EMAP term."),
                                fieldWithPath("emapTermName").description("The name of the EMAP term."),
                                fieldWithPath("mpTermId").description("The identifier for the MP term."),
                                fieldWithPath("mpTermName").description("The name of the MP term."),
                                fieldWithPath("altMpTermId[]").description("Alternative MP term identifiers."),
                                fieldWithPath("topLevelMpTermId[]").description("Identifiers for top-level MP terms."),
                                fieldWithPath("topLevelMpTermName[]").description("Names of top-level MP terms."),
                                fieldWithPath("topLevelMpTermDefinition[]").description("Definitions of top-level MP terms."),
                                fieldWithPath("topLevelMpTermSynonym[]").description("Synonyms for top-level MP terms."),
                                fieldWithPath("intermediateMpTermId[]").description("Identifiers for intermediate MP terms."),
                                fieldWithPath("intermediateMpTermName[]").description("Names of intermediate MP terms."),
                                fieldWithPath("intermediateMpTermDefinition[]").description("Definitions of intermediate MP terms."),
                                fieldWithPath("intermediateMpTermSynonym[]").description("Synonyms for intermediate MP terms."),
                                fieldWithPath("markerSymbol").description("The symbol for the marker."),
                                fieldWithPath("markerAccessionId").description("The accession ID for the marker."),
                                fieldWithPath("colonyId").description("The identifier for the colony."),
                                fieldWithPath("alleleName").description("The name of the allele."),
                                fieldWithPath("alleleSymbol").description("The symbol for the allele."),
                                fieldWithPath("alleleAccessionId").description("The accession ID for the allele."),
                                fieldWithPath("strainName").description("The name of the strain."),
                                fieldWithPath("strainAccessionId").description("The accession ID for the strain."),
                                fieldWithPath("phenotypingCenter").description("The name of the phenotyping center."),
                                fieldWithPath("projectExternalId").description("The external identifier for the project."),
                                fieldWithPath("projectName").description("The name of the project."),
                                fieldWithPath("projectFullname").description("The full name of the project."),
                                fieldWithPath("resourceName").description("The name of the resource."),
                                fieldWithPath("resourceFullname").description("The full name of the resource."),
                                fieldWithPath("sex").description("The sex of the subjects in the experiment."),
                                fieldWithPath("zygosity").description("The zygosity of the subjects in the experiment."),
                                fieldWithPath("pipelineName").description("The name of the pipeline used."),
                                fieldWithPath("pipelineStableId").description("The stable identifier for the pipeline."),
                                fieldWithPath("pipelineStableKey").description("The stable key for the pipeline."),
                                fieldWithPath("procedureName").description("The name of the procedure used."),
                                fieldWithPath("procedureStableId").description("The stable identifier for the procedure."),
                                fieldWithPath("procedureStableKey").description("The stable key for the procedure."),
                                fieldWithPath("parameterName").description("The name of the parameter measured."),
                                fieldWithPath("parameterStableId").description("The stable identifier for the parameter."),
                                fieldWithPath("parameterStableKey").description("The stable key for the parameter."),
                                fieldWithPath("statisticalMethod").description("The statistical method used in the analysis."),
                                fieldWithPath("percentageChange").description("The percentage change measured in the experiment."),
                                fieldWithPath("pvalue").description("The p-value resulting from the statistical analysis."),
                                fieldWithPath("effectSize").description("The effect size measured in the experiment."),
                                fieldWithPath("externalId").description("An external identifier associated with the document."),
                                fieldWithPath("lifeStageAcc").description("The accession code for the life stage."),
                                fieldWithPath("lifeStageName").description("The name of the life stage of the subjects.")
                                )

                ));
    }
}