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
                                fieldWithPath("docId").description("The unique identifier for the document."),
                                fieldWithPath("ontologyDbId").description("The database ID associated with the ontology entry."),
                                fieldWithPath("assertionType").description("The type of assertion made in the document."),
                                fieldWithPath("assertionTypeId").description("The unique identifier for the assertion type."),
                                fieldWithPath("mpathTermId").description("The identifier for the pathology (MPATH) term."),
                                fieldWithPath("mpathTermName").description("The name of the pathology (MPATH) term."),
                                fieldWithPath("anatomyTermId").description("List of anatomy term identifiers."),
                                fieldWithPath("anatomyTermName").description("List of anatomy term names."),
                                fieldWithPath("intermediateAnatomyTermId").description("List of intermediate anatomy term identifiers."),
                                fieldWithPath("intermediateAnatomyTermName").description("List of intermediate anatomy term names."),
                                fieldWithPath("topLevelAnatomyTermId").description("List of top-level anatomy term identifiers."),
                                fieldWithPath("topLevelAnatomyTermName").description("List of top-level anatomy term names."),
                                fieldWithPath("mpTermId").description("The identifier for the mouse phenotype (MP) term."),
                                fieldWithPath("mpTermName").description("The name of the mouse phenotype (MP) term."),
                                fieldWithPath("altMpTermId").description("List of alternative mouse phenotype (MP) term identifiers."),
                                fieldWithPath("topLevelMpTermId").description("List of top-level mouse phenotype (MP) term identifiers."),
                                fieldWithPath("topLevelMpTermName").description("List of top-level mouse phenotype (MP) term names."),
                                fieldWithPath("intermediateMpTermId").description("List of intermediate mouse phenotype (MP) term identifiers."),
                                fieldWithPath("intermediateMpTermName").description("List of intermediate mouse phenotype (MP) term names."),
                                fieldWithPath("markerSymbol").description("The symbol for the genetic marker."),
                                fieldWithPath("markerAccessionId").description("The accession ID for the genetic marker."),
                                fieldWithPath("colonyId").description("The identifier for the colony."),
                                fieldWithPath("alleleName").description("The name of the allele."),
                                fieldWithPath("alleleSymbol").description("The symbol of the allele."),
                                fieldWithPath("alleleAccessionId").description("The accession ID of the allele."),
                                fieldWithPath("strainName").description("The name of the strain."),
                                fieldWithPath("strainAccessionId").description("The accession ID of the strain."),
                                fieldWithPath("phenotypingCenter").description("The name of the phenotyping center."),
                                fieldWithPath("projectExternalId").description("The external ID of the project."),
                                fieldWithPath("projectName").description("List of names for the project."),
                                fieldWithPath("projectFullname").description("The full name of the project."),
                                fieldWithPath("resourceName").description("The name of the resource."),
                                fieldWithPath("resourceFullname").description("The full name of the resource."),
                                fieldWithPath("sex").description("The sex of the subject."),
                                fieldWithPath("zygosity").description("The zygosity of the subject."),
                                fieldWithPath("pipelineName").description("The name of the pipeline."),
                                fieldWithPath("pipelineStableId").description("The stable ID of the pipeline."),
                                fieldWithPath("pipelineStableKey").description("The stable key of the pipeline."),
                                fieldWithPath("procedureName").description("The name of the procedure."),
                                fieldWithPath("procedureStableId").description("List of stable IDs for the procedures."),
                                fieldWithPath("procedureStableKey").description("List of stable keys for the procedures."),
                                fieldWithPath("parameterName").description("The name of the parameter."),
                                fieldWithPath("parameterStableId").description("The stable ID of the parameter."),
                                fieldWithPath("parameterStableKey").description("List of stable keys for the parameter."),
                                fieldWithPath("statisticalMethod").description("The statistical method used."),
                                fieldWithPath("percentageChange").description("The percentage change observed."),
                                fieldWithPath("pvalue").description("The p-value resulting from statistical tests."),
                                fieldWithPath("effectSize").description("The effect size measured."),
                                fieldWithPath("externalId").description("The external identifier for the document."),
                                fieldWithPath("lifeStageAcc").description("The accession code for the life stage."),
                                fieldWithPath("lifeStageName").description("The name of the life stage.")
                                 )


                ));
    }
}