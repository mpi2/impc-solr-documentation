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
                                fieldWithPath("observationId").description("The observation's unique identifier."),
                                fieldWithPath("specimenId").description("The specimen's unique identifier."),
                                fieldWithPath("phenotypingCenterId").description("The unique identifier of the phenotyping center."),
                                fieldWithPath("phenotypingCenter").description("The name of the phenotyping center."),
                                fieldWithPath("productionCenterId").description("The unique identifier of the production center."),
                                fieldWithPath("productionCenter").description("The name of the production center."),
                                fieldWithPath("specimenProjectId").description("The unique identifier for the specimen project."),
                                fieldWithPath("specimenProjectName").description("The name of the specimen project."),
                                fieldWithPath("geneAccessionId").description("The accession ID of the gene."),
                                fieldWithPath("geneSymbol").description("The symbol of the gene."),
                                fieldWithPath("alleleAccessionId").description("The accession ID of the allele."),
                                fieldWithPath("alleleSymbol").description("The symbol of the allele."),
                                fieldWithPath("zygosity").description("The zygosity of the specimen."),
                                fieldWithPath("sex").description("The sex of the specimen."),
                                fieldWithPath("biologicalModelId").description("The unique identifier for the biological model."),
                                fieldWithPath("biologicalSampleId").description("The unique identifier for the biological sample."),
                                fieldWithPath("biologicalSampleGroup").description("The group of the biological sample."),
                                fieldWithPath("strainAccessionId").description("The accession ID of the strain."),
                                fieldWithPath("strainName").description("The name of the strain."),
                                fieldWithPath("geneticBackground").description("The genetic background of the specimen."),
                                fieldWithPath("allelicComposition").description("The allelic composition of the specimen."),
                                fieldWithPath("colonyId").description("The unique identifier of the colony."),
                                fieldWithPath("litterId").description("The unique identifier of the litter."),
                                fieldWithPath("dateOfBirth").description("The date of birth of the specimen."),
                                fieldWithPath("externalSampleId").description("The external sample identifier."),
                                fieldWithPath("lifeStageName").description("The name of the life stage of the specimen."),
                                fieldWithPath("lifeStageAcc").description("The accession code for the life stage."),
                                fieldWithPath("datasourceId").description("The unique identifier for the data source."),
                                fieldWithPath("datasourceName").description("The name of the data source."),
                                fieldWithPath("projectId").description("The unique identifier for the project."),
                                fieldWithPath("projectName").description("The name of the project."),
                                fieldWithPath("pipelineId").description("The unique identifier for the pipeline."),
                                fieldWithPath("pipelineName").description("The name of the pipeline."),
                                fieldWithPath("pipelineStableId").description("The stable identifier for the pipeline."),
                                fieldWithPath("procedureId").description("The unique identifier for the procedure."),
                                fieldWithPath("procedureName").description("The name of the procedure."),
                                fieldWithPath("procedureStableId").description("The stable identifier for the procedure."),
                                fieldWithPath("procedureGroup").description("The group of the procedure."),
                                fieldWithPath("parameterId").description("The unique identifier for the parameter."),
                                fieldWithPath("parameterName").description("The name of the parameter."),
                                fieldWithPath("parameterStableId").description("The stable identifier for the parameter."),
                                fieldWithPath("procedureSequenceId").description("The sequence identifier for the procedure."),
                                fieldWithPath("experimentId").description("The unique identifier for the experiment."),
                                fieldWithPath("observationType").description("The type of observation."),
                                fieldWithPath("dataType").description("Defines the general category or type of the data, such as gene, allele, etc."),
                                fieldWithPath("dateOfExperiment").description("The date when the experiment was conducted."),
                                fieldWithPath("weightParameterStableId").description("The stable identifier for the weight parameter."),
                                fieldWithPath("weightDate").description("The date corresponding to the weight measurement."),
                                fieldWithPath("weightDaysOld").description("The age in days of the specimen at the time of the weight measurement."),
                                fieldWithPath("weight").description("The weight of the specimen."),
                                fieldWithPath("dataPoint").description("A specific data point from the experiment."),
                                fieldWithPath("orderIndex").description("The index ordering of the data point."),
                                fieldWithPath("dimension").description("The dimension to which the data point relates."),
                                fieldWithPath("timePoint").description("The specific time point at which the data was collected."),
                                fieldWithPath("discretePoint").description("A discrete point measurement from the experiment."),
                                fieldWithPath("category").description("The category of the data point."),
                                fieldWithPath("rawCategory").description("The raw category data before processing."),
                                fieldWithPath("metadata").description("A list of metadata entries associated with the experiment."),
                                fieldWithPath("anatomyId").description("A list of anatomy IDs relevant to the experiment."),
                                fieldWithPath("anatomyTerm").description("A list of anatomy terms relevant to the experiment."),
                                fieldWithPath("anatomyIdTerm").description("A list combining anatomy IDs and terms."),
                                fieldWithPath("anatomyTermSynonym").description("A list of synonyms for the anatomy terms."),
                                fieldWithPath("topLevelAnatomyId").description("A list of top-level anatomy IDs."),
                                fieldWithPath("topLevelAnatomyTerm").description("A list of top-level anatomy terms."),
                                fieldWithPath("topLevelAnatomyTermSynonym").description("A list of synonyms for the top-level anatomy terms."),
                                fieldWithPath("selectedTopLevelAnatomyId").description("A list of selected top-level anatomy IDs."),
                                fieldWithPath("selectedTopLevelAnatomyTerm").description("A list of selected top-level anatomy terms."),
                                fieldWithPath("selectedTopLevelAnatomyTermSynonym").description("A list of synonyms for the selected top-level anatomy terms."),
                                fieldWithPath("intermediateAnatomyId").description("A list of intermediate anatomy IDs."),
                                fieldWithPath("intermediateAnatomyTerm").description("A list of intermediate anatomy terms."),
                                fieldWithPath("intermediateAnatomyTermSynonym").description("A list of synonyms for the intermediate anatomy terms."),
                                fieldWithPath("parentAnatomyId").description("A list of parent anatomy IDs."),
                                fieldWithPath("parentAnatomyTerm").description("A list of parent anatomy terms."),
                                fieldWithPath("parentAnatomyTermSynonym").description("A list of synonyms for the parent anatomy terms."),
                                fieldWithPath("childAnatomyId").description("A list of child anatomy IDs."),
                                fieldWithPath("childAnatomyTerm").description("A list of child anatomy terms."),
                                fieldWithPath("childAnatomyTermSynonym").description("A list of synonyms for the child anatomy terms."),
                                fieldWithPath("downloadFilePath").description("The file path for downloading associated data."),
                                fieldWithPath("imageLink").description("A link to an associated image."),
                                fieldWithPath("fileType").description("The file type of the associated data."),
                                fieldWithPath("incrementValue").description("An increment value associated with the data."),
                                fieldWithPath("parameterAssociationStableId").description("A list of stable IDs for parameter associations."),
                                fieldWithPath("parameterAssociationSequenceId").description("A list of sequence IDs for parameter associations."),
                                fieldWithPath("parameterAssociationDimId").description("A list of dimension IDs for parameter associations."),
                                fieldWithPath("parameterAssociationName").description("A list of names for parameter associations."),
                                fieldWithPath("parameterAssociationValue").description("A list of values for parameter associations."),
                                fieldWithPath("developmentalStageAcc").description("The accession code for the developmental stage."),
                                fieldWithPath("developmentalStageName").description("The name of the developmental stage."),
                                fieldWithPath("textValue").description("A text value associated with the experiment."),
                                fieldWithPath("subTermId").description("A list of sub-term IDs."),
                                fieldWithPath("subTermName").description("A list of sub-term names."),
                                fieldWithPath("subTermDescription").description("A list of descriptions for the sub-terms."),
                                fieldWithPath("ageInDays").description("The age in days of the specimen at the time of the experiment."),
                                fieldWithPath("ageInWeeks").description("The age in weeks of the specimen at the time of the experiment."),
                                fieldWithPath("metadataGroup").description("A grouping identifier for the metadata, organizing it into logical groups."),
                                fieldWithPath("experimentSourceId").description("The unique identifier for the source of the experiment data.")

                        )

                ));
    }
}