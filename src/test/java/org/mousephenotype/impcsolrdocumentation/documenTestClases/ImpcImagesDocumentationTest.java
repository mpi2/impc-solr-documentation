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
                                fieldWithPath("observationId").description("The observation ID associated with this experiment."),
                                fieldWithPath("specimenId").description("The specimen ID related to this experiment."),
                                fieldWithPath("phenotypingCenterId").description("The ID of the phenotyping center where the experiment was conducted."),
                                fieldWithPath("phenotypingCenter").description("The name of the phenotyping center."),
                                fieldWithPath("productionCenterId").description("The ID of the production center related to the specimen."),
                                fieldWithPath("productionCenter").description("The name of the production center."),
                                fieldWithPath("specimenProjectId").description("The project ID associated with the specimen."),
                                fieldWithPath("specimenProjectName").description("The name of the project associated with the specimen."),
                                fieldWithPath("geneAccessionId").description("The accession ID for the gene of interest."),
                                fieldWithPath("geneSymbol").description("The symbol representing the gene of interest."),
                                fieldWithPath("alleleAccessionId").description("The accession ID for the allele of interest."),
                                fieldWithPath("alleleSymbol").description("The symbol for the allele of interest."),
                                fieldWithPath("zygosity").description("The zygosity of the specimen."),
                                fieldWithPath("sex").description("The sex of the specimen."),
                                fieldWithPath("biologicalModelId").description("The ID of the biological model used."),
                                fieldWithPath("biologicalSampleId").description("The ID of the biological sample."),
                                fieldWithPath("biologicalSampleGroup").description("The group classification of the biological sample."),
                                fieldWithPath("strainAccessionId").description("The accession ID for the strain."),
                                fieldWithPath("strainName").description("The name of the strain."),
                                fieldWithPath("geneticBackground").description("The genetic background of the specimen."),
                                fieldWithPath("allelicComposition").description("The allelic composition of the specimen."),
                                fieldWithPath("colonyId").description("The ID of the colony from which the specimen originates."),
                                fieldWithPath("litterId").description("The ID of the litter from which the specimen originates."),
                                fieldWithPath("dateOfBirth").description("The date of birth of the specimen."),
                                fieldWithPath("externalSampleId").description("An external identifier for the sample."),
                                fieldWithPath("lifeStageName").description("The life stage of the specimen."),
                                fieldWithPath("lifeStageAcc").description("The accession number associated with the life stage."),
                                fieldWithPath("datasourceId").description("The ID of the data source."),
                                fieldWithPath("datasourceName").description("The name of the data source."),
                                fieldWithPath("projectId").description("The project ID."),
                                fieldWithPath("projectName").description("The name of the project."),
                                fieldWithPath("pipelineId").description("The pipeline ID."),
                                fieldWithPath("pipelineName").description("The name of the pipeline."),
                                fieldWithPath("pipelineStableId").description("The stable ID of the pipeline."),
                                fieldWithPath("procedureId").description("The procedure ID."),
                                fieldWithPath("procedureName").description("The name of the procedure."),
                                fieldWithPath("procedureStableId").description("The stable ID of the procedure."),
                                fieldWithPath("procedureGroup").description("The procedure group."),
                                fieldWithPath("parameterId").description("The parameter ID."),
                                fieldWithPath("parameterName").description("The name of the parameter."),
                                fieldWithPath("parameterStableId").description("The stable ID of the parameter."),
                                fieldWithPath("procedureSequenceId").description("The procedure sequence ID."),
                                fieldWithPath("experimentId").description("The experiment ID."),
                                fieldWithPath("observationType").description("The type of observation."),
                                fieldWithPath("dataType").description("The type of data."),
                                fieldWithPath("experimentSourceId").description("The source ID of the experiment."),
                                fieldWithPath("dateOfExperiment").description("The date the experiment was conducted."),
                                fieldWithPath("weightParameterStableId").description("The stable ID for the weight parameter."),
                                fieldWithPath("weightDate").description("The date of the weight measurement."),
                                fieldWithPath("weightDaysOld").description("The age of the specimen in days at the time of the weight measurement."),
                                fieldWithPath("weight").description("The weight of the specimen."),
                                fieldWithPath("dataPoint").description("A data point associated with the experiment."),
                                fieldWithPath("orderIndex").description("The order index."),
                                fieldWithPath("dimension").description("The dimension of the data point."),
                                fieldWithPath("timePoint").description("The time point at which the data was collected."),
                                fieldWithPath("discretePoint").description("A discrete data point."),
                                fieldWithPath("category").description("The category of the data."),
                                fieldWithPath("rawCategory").description("The raw category of the data."),
                                fieldWithPath("metadata").description("Metadata associated with the experiment."),
                                fieldWithPath("metadataGroup").description("The group of the metadata."),
                                // Assuming multiValued fields are represented as arrays in the response
                                fieldWithPath("mpId[]").description("The MP IDs associated with the experiment."),
                                fieldWithPath("mpTerm[]").description("The MP terms associated with the experiment."),
                                fieldWithPath("anatomyId[]").description("The anatomy IDs related to the experiment."),
                                fieldWithPath("anatomyTerm[]").description("The anatomy terms related to the experiment."),
                                fieldWithPath("anatomyIdTerm[]").description("Combined anatomy ID and term related to the experiment."),
                                fieldWithPath("anatomyTermSynonym[]").description("Synonyms for the anatomy terms."),
                                fieldWithPath("topLevelAnatomyId[]").description("Top-level anatomy IDs related to the experiment."),
                                fieldWithPath("topLevelAnatomyTerm[]").description("Top-level anatomy terms related to the experiment."),
                                fieldWithPath("selectedTopLevelAnatomyId[]").description("Selected top-level anatomy IDs."),
                                fieldWithPath("selectedTopLevelAnatomyTerm[]").description("Selected top-level anatomy terms."),
                                fieldWithPath("intermediateAnatomyId[]").description("Intermediate anatomy IDs."),
                                fieldWithPath("intermediateAnatomyTerm[]").description("Intermediate anatomy terms."),
                                fieldWithPath("parentAnatomyId[]").description("Parent anatomy IDs."),
                                fieldWithPath("parentAnatomyTerm[]").description("Parent anatomy terms."),
                                fieldWithPath("childAnatomyId[]").description("Child anatomy IDs."),
                                fieldWithPath("childAnatomyTerm[]").description("Child anatomy terms."),
                                fieldWithPath("downloadFilePath").description("Path to download the file associated with the experiment."),
                                fieldWithPath("imageLink").description("Link to the image associated with the experiment."),
                                fieldWithPath("fileType").description("The type of file."),
                                fieldWithPath("parameterAssociationStableId[]").description("Stable IDs for the parameter associations."),
                                fieldWithPath("parameterAssociationSequenceId[]").description("Sequence IDs for the parameter associations."),
                                fieldWithPath("parameterAssociationDimId[]").description("Dimension IDs for the parameter associations."),
                                fieldWithPath("parameterAssociationName[]").description("Names of the parameter associations."),
                                fieldWithPath("parameterAssociationValue[]").description("Values of the parameter associations."),
                                fieldWithPath("developmentalStageAcc").description("Accession number for the developmental stage."),
                                fieldWithPath("developmentalStageName").description("Name of the developmental stage."),
                                fieldWithPath("textValue").description("Text value associated with the experiment."),
                                fieldWithPath("subTermId[]").description("Sub-term IDs related to the experiment."),
                                fieldWithPath("subTermName[]").description("Sub-term names related to the experiment."),
                                fieldWithPath("subTermDescription[]").description("Descriptions of the sub-terms."),
                                fieldWithPath("sequenceId").description("The sequence ID related to the experiment."),
                                fieldWithPath("ageInDays").description("Age of the specimen in days."),
                                fieldWithPath("ageInWeeks").description("Age of the specimen in weeks."),
                                fieldWithPath("downloadUrl").description("URL to download data or resources associated with the experiment."),
                                fieldWithPath("jpegUrl").description("URL to a JPEG image related to the experiment."),
                                fieldWithPath("thumbnailUrl").description("URL to a thumbnail image related to the experiment."),
                                fieldWithPath("omeroId").description("OMERO database ID for the image."),
                                fieldWithPath("topLevelMpId[]").description("The top-level MP (Mouse Phenotype) IDs associated with the experiment."),
                                fieldWithPath("topLevelMpTerm[]").description("The top-level MP terms associated with the experiment."),
                                fieldWithPath("intermediateMpId[]").description("The intermediate MP IDs associated with the experiment."),
                                fieldWithPath("intermediateMpTerm[]").description("The intermediate MP terms associated with the experiment."),
                                fieldWithPath("topLevelAnatomyTermSynonym").description("Synonyms for the top-level anatomy terms."),
                                fieldWithPath("selectedTopLevelAnatomyTermSynonym").description("Synonyms for the selected top-level anatomy terms."),
                                fieldWithPath("intermediateAnatomyTermSynonym").description("Synonyms for the intermediate anatomy terms."),
                                fieldWithPath("parentAnatomyTermSynonym").description("Synonyms for the parent anatomy terms."),
                                fieldWithPath("childAnatomyTermSynonym").description("Synonyms for the child anatomy terms.")
                                )

                ));
    }
}