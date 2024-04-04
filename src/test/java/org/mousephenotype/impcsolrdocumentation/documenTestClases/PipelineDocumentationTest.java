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
                                fieldWithPath("fullyQualifiedName").description("The fully qualified name associated with the experiment."),
                                fieldWithPath("dataType").description("The data type of the experiment."),
                                fieldWithPath("version").description("The version of the experiment data."),
                                fieldWithPath("parameterId").description("The unique identifier for the parameter."),
                                fieldWithPath("parameterStableId").description("The stable identifier for the parameter."),
                                fieldWithPath("parameterName").description("The name of the parameter."),
                                fieldWithPath("parameterStableKey").description("The stable key of the parameter."),
                                fieldWithPath("procedureId").description("The unique identifier for the procedure."),
                                fieldWithPath("procedureStableId").description("The stable identifier for the procedure."),
                                fieldWithPath("procedureName").description("The name of the procedure."),
                                fieldWithPath("procedureStableKey").description("The stable key of the procedure."),
                                fieldWithPath("pipelineId").description("The unique identifier for the pipeline."),
                                fieldWithPath("pipelineStableId").description("The stable identifier for the pipeline."),
                                fieldWithPath("pipelineName").description("The name of the pipeline."),
                                fieldWithPath("pipelineStableKey").description("The stable key of the pipeline."),
                                fieldWithPath("required").description("Indicates whether the parameter is required."),
                                fieldWithPath("observationType").description("The type of observation made in the experiment."),
                                fieldWithPath("mpTerms[]").description("List of Mammalian Phenotype (MP) Ontology terms associated with the experiment."),
                                fieldWithPath("description").description("The description of the experiment."),
                                fieldWithPath("unitX").description("The unit of measurement for the X-axis."),
                                fieldWithPath("unitY").description("The unit of measurement for the Y-axis."),
                                fieldWithPath("metadata").description("Indicates whether the experiment includes metadata."),
                                fieldWithPath("increment").description("Indicates whether the parameter value increments."),
                                fieldWithPath("categories[]").description("The categories associated with the experiment."),
                                fieldWithPath("hasOptions").description("Indicates whether the experiment has options."),
                                fieldWithPath("derived").description("Indicates whether the experiment data is derived."),
                                fieldWithPath("media").description("Indicates whether the experiment includes media content."),
                                fieldWithPath("annotate").description("Indicates whether the experiment is annotated."),
                                fieldWithPath("comparableParameterGroup").description("The group of comparable parameters."),
                                fieldWithPath("experimentLevel").description("The level of the experiment."),
                                fieldWithPath("stage").description("The stage of the experiment."),
                                fieldWithPath("stageLabel").description("The label for the stage of the experiment."),
                                fieldWithPath("scheduleKey").description("The schedule key for the experiment."),
                                fieldWithPath("mpId[]").description("List of Mammalian Phenotype (MP) Ontology IDs."),
                                fieldWithPath("mpId[]").description("List of Mammalian Phenotype (MP) Ontology IDs."),
                                fieldWithPath("mpTerm[]").description("List of Mammalian Phenotype (MP) Ontology terms."),
                                fieldWithPath("mpTermSynonym[]").description("List of synonyms for Mammalian Phenotype (MP) Ontology terms."),
                                fieldWithPath("topLevelMpId[]").description("List of top-level MP Ontology IDs."),
                                fieldWithPath("topLevelMpTerm[]").description("List of top-level MP Ontology terms."),
                                fieldWithPath("topLevelMpTermSynonym[]").description("List of synonyms for top-level MP Ontology terms."),
                                fieldWithPath("intermediateMpId[]").description("List of intermediate MP Ontology IDs."),
                                fieldWithPath("intermediateMpTerm[]").description("List of intermediate MP Ontology terms."),
                                fieldWithPath("intermediateMpTermSynonym[]").description("List of synonyms for intermediate MP Ontology terms."),
                                fieldWithPath("abnormalMpId[]").description("List of IDs for abnormal MP Ontology terms."),
                                fieldWithPath("increasedMpId[]").description("List of IDs for increased MP Ontology terms."),
                                fieldWithPath("decreasedMpId[]").description("List of IDs for decreased MP Ontology terms."),
                                fieldWithPath("abnormalMpTerm[]").description("List of abnormal MP Ontology terms."),
                                fieldWithPath("increasedMpTerm[]").description("List of increased MP Ontology terms."),
                                fieldWithPath("decreasedMpTerm[]").description("List of decreased MP Ontology terms."),
                                fieldWithPath("hpId[]").description("List of Human Phenotype Ontology (HPO) IDs."),
                                fieldWithPath("hpTerm[]").description("List of Human Phenotype Ontology (HPO) terms."),
                                fieldWithPath("inferredMaId").description("The inferred Mouse Anatomy (MA) ID."),
                                fieldWithPath("inferredSelectedTopLevelMaId").description("The inferred selected top-level Mouse Anatomy (MA) ID."),
                                fieldWithPath("inferredSelectedTopLevelMaTerm").description("The inferred selected top-level Mouse Anatomy (MA) term."),
                                fieldWithPath("maId").description("The Mouse Anatomy (MA) ID."),
                                fieldWithPath("maTerm").description("The Mouse Anatomy (MA) term."),
                                fieldWithPath("maTermSynonym[]").description("List of synonyms for the Mouse Anatomy (MA) term."),
                                fieldWithPath("emapId").description("The EMAP ID for the embryonic mouse anatomy."),
                                fieldWithPath("emapTerm").description("The EMAP term for the embryonic mouse anatomy."),
                                fieldWithPath("anatomyId").description("The anatomy ID."),
                                fieldWithPath("anatomyTerm").description("The anatomy term."),
                                fieldWithPath("anatomyTermSynonym[]").description("List of synonyms for the anatomy term."),
                                fieldWithPath("embryoAnatomyId").description("The embryo anatomy ID."),
                                fieldWithPath("embryoAnatomyTerm").description("The embryo anatomy term."),
                                fieldWithPath("topLevelEmbryoAnatomyId[]").description("List of top-level embryo anatomy IDs."),
                                fieldWithPath("topLevelEmbryoAnatomyTerm[]").description("List of top-level embryo anatomy terms."),
                                fieldWithPath("mouseAnatomyId").description("The mouse anatomy ID."),
                                fieldWithPath("mouseAnatomyTerm").description("The mouse anatomy term."),
                                fieldWithPath("topLevelMouseAnatomyId[]").description("List of top-level mouse anatomy IDs."),
                                fieldWithPath("topLevelMouseAnatomyTerm[]").description("List of top-level mouse anatomy terms."),
                                fieldWithPath("imitsPhenotypeStarted[]").description("List indicating the start of phenotype analysis."),
                                fieldWithPath("imitsPhenotypeComplete[]").description("List indicating the completion of phenotype analysis."),
                                fieldWithPath("imitsPhenotypeStatus[]").description("List describing the status of phenotype analysis.")

                        )

                ));
    }
}