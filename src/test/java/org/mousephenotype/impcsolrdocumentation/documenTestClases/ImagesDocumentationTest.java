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
public class ImagesDocumentationTest {


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
    public void documentImages() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getImagesDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("images-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("id").description("The unique identifier for the experiment."),
                                fieldWithPath("dataType").description("The type of data for the experiment."),
                                fieldWithPath("mouseId").description("The unique identifier of the mouse involved in the experiment."),
                                fieldWithPath("gender").description("The gender of the mouse."),
                                fieldWithPath("colonyName").description("The name of the colony from which the mouse originates."),
                                fieldWithPath("genotype").description("The genotype of the mouse."),
                                fieldWithPath("tagName").description("A list of tags associated with the experiment."),
                                fieldWithPath("tagValue").description("A list of values corresponding to each tag associated with the experiment."),
                                fieldWithPath("xstart").description("A list of start positions on the x-axis for the experiment measurements."),
                                fieldWithPath("xend").description("A list of end positions on the x-axis for the experiment measurements."),
                                fieldWithPath("ystart").description("A list of start positions on the y-axis for the experiment measurements."),
                                fieldWithPath("yend").description("A list of end positions on the y-axis for the experiment measurements."),
                                fieldWithPath("annotationTermId").description("A list of term IDs for annotations applied to the experiment data."),
                                fieldWithPath("annotationTermName").description("A list of term names for annotations applied to the experiment data."),
                                fieldWithPath("name").description("The name of the experiment."),
                                fieldWithPath("accession").description("The accession number associated with the experiment."),
                                fieldWithPath("alleleAccession").description("The accession number for the allele involved in the experiment."),
                                fieldWithPath("expName").description("A list of names for the experiment."),
                                fieldWithPath("procedureName").description("A list of names of procedures involved in the experiment."),
                                fieldWithPath("expDescription").description("A list of descriptions for the experiment."),
                                fieldWithPath("liveSampleGroup").description("A list of live sample groups involved in the experiment."),
                                fieldWithPath("fullResolutionFilePath").description("The file path for the full resolution image associated with the experiment."),
                                fieldWithPath("largeThumbnailFilePath").description("The file path for the large thumbnail image associated with the experiment."),
                                fieldWithPath("originalFileName").description("The original file name of the image associated with the experiment."),
                                fieldWithPath("smallThumbnailFilePath").description("The file path for the small thumbnail image associated with the experiment."),
                                fieldWithPath("ageInWeeks").description("The age of the mouse in weeks at the time of the experiment."),
                                fieldWithPath("symbol").description("A list of symbols associated with the gene involved in the experiment."),
                                fieldWithPath("institute").description("The name of the institute where the experiment was conducted."),
                                fieldWithPath("sangerSymbol").description("A list of Sanger symbols associated with the gene involved in the experiment."),
                                fieldWithPath("geneName").description("A list of names for the gene involved in the experiment."),
                                fieldWithPath("subtype").description("A list of subtypes for the data involved in the experiment."),
                                fieldWithPath("geneSynonyms").description("A list of synonyms for the gene involved in the experiment."),
                                fieldWithPath("alleleName").description("A list of names for the allele involved in the experiment."),
                                fieldWithPath("maTermName").description("A list of Mouse Anatomy (MA) term names involved in the experiment."),
                                fieldWithPath("mpTermId").description("A list of Mouse Phenotype (MP) term IDs involved in the experiment."),
                                fieldWithPath("mpTermName").description("A list of Mouse Phenotype (MP) term names involved in the experiment."),
                                fieldWithPath("expNameExp").description("A list of experiment names associated with the experiment."),
                                fieldWithPath("symbolGene").description("A list of gene symbols associated with the experiment."),
                                fieldWithPath("topLevel").description("A list of top-level annotations or classifications."),
                                fieldWithPath("liveSampleId").description("A list of live sample identifiers associated with the experiment."),
                                fieldWithPath("dcfId").description("The unique identifier for the data capture format."),
                                fieldWithPath("dcfExpId").description("The unique identifier for the experiment within the data capture format context."),
                                fieldWithPath("sangerProcedureName").description("The name of the procedure as defined by Sanger institute."),
                                fieldWithPath("sangerProcedureId").description("The unique identifier for the Sanger procedure."),
                                fieldWithPath("genotypeString").description("The genotype of the subject in string format."),
                                fieldWithPath("embryoDataAvailable").description("Indicator if data for embryos are available."),
                                fieldWithPath("phenotypingCenterId").description("The unique identifier for the phenotyping center."),
                                fieldWithPath("phenotypingCenter").description("The name of the phenotyping center where the experiment was conducted."),
                                fieldWithPath("geneAccession").description("The accession number for the gene involved in the experiment."),
                                fieldWithPath("geneSymbol").description("The symbol for the gene involved in the experiment."),
                                fieldWithPath("zygosity").description("The zygosity of the subject involved in the experiment."),
                                fieldWithPath("sex").description("The sex of the subject involved in the experiment."),
                                fieldWithPath("biologicalModelId").description("The unique identifier for the biological model used in the experiment."),
                                fieldWithPath("biologicalSampleId").description("The unique identifier for the biological sample used in the experiment."),
                                fieldWithPath("biologicalSampleGroup").description("The group classification for the biological sample."),
                                fieldWithPath("colonyId").description("The unique identifier for the colony from which the subject originated."),
                                fieldWithPath("dateOfBirth").description("The date of birth of the subject."),
                                fieldWithPath("externalSampleId").description("The external identifier for the sample used in the experiment."),
                                fieldWithPath("pipelineId").description("The unique identifier for the pipeline used in the experiment."),
                                fieldWithPath("pipelineName").description("The name of the pipeline used in the experiment."),
                                fieldWithPath("pipelineStableId").description("The stable identifier for the pipeline."),
                                fieldWithPath("procedureId").description("The unique identifier for the procedure used in the experiment."),
                                fieldWithPath("procedureStableId").description("The stable identifier for the procedure."),
                                fieldWithPath("parameterId").description("The unique identifier for the parameter measured in the experiment."),
                                fieldWithPath("parameterName").description("The name of the parameter measured."),
                                fieldWithPath("parameterStableId").description("The stable identifier for the parameter."),
                                fieldWithPath("experimentId").description("The unique identifier for the experiment."),
                                fieldWithPath("experimentSourceId").description("The source identifier for the experiment."),
                                fieldWithPath("dateOfExperiment").description("The date on which the experiment was conducted."),
                                fieldWithPath("pvalue").description("A list of p-values calculated in the experiment."),
                                fieldWithPath("mgiAccessionId").description("A list of MGI accession IDs associated with the gene involved in the experiment."),
                                fieldWithPath("markerSymbol").description("A list of marker symbols associated with the gene."),
                                fieldWithPath("markerName").description("A list of marker names associated with the gene."),
                                fieldWithPath("markerSynonym").description("A list of synonyms for the marker."),
                                fieldWithPath("markerType").description("A list of marker types."),
                                fieldWithPath("humanGeneSymbol").description("A list of human gene symbols associated with the experiment."),
                                fieldWithPath("status").description("A list of statuses reflecting the current state of the experiment or subject."),
                                fieldWithPath("latestProductionCentre").description("A list of names for the latest production centres involved."),
                                fieldWithPath("latestPhenotypingCentre").description("A list of names for the latest phenotyping centres involved."),
                                fieldWithPath("latestPhenotypeStatus").description("A list of latest phenotype statuses."),
                                fieldWithPath("legacyPhenotypeStatus").description("The legacy phenotype status code."),
                                fieldWithPath("diseaseId").description("A list of disease IDs associated with the experiment."),
                                fieldWithPath("diseaseSource").description("A list of sources for the disease data."),
                                fieldWithPath("diseaseTerm").description("A list of disease terms associated with the experiment."),
                                fieldWithPath("diseaseAlts").description("A list of alternative names for the diseases."),
                                fieldWithPath("diseaseClasses").description("A list of disease classifications."),
                                fieldWithPath("humanCurated").description("Indicators for whether the association was human-curated."),
                                fieldWithPath("mouseCurated").description("Indicators for whether the association was curated based on mouse data."),
                                fieldWithPath("mgiPredicted").description("Indicators for whether the gene association was predicted by MGI."),
                                fieldWithPath("impcPredicted").description("Indicators for whether the gene association was predicted by IMPC."),
                                fieldWithPath("mgiPredictedKnownGene").description("Indicators for whether the association with a known gene was predicted by MGI."),
                                fieldWithPath("impcPredictedKnownGene").description("Indicators for whether the association with a known gene was predicted by IMPC."),
                                fieldWithPath("mgiNovelPredictedInLocus").description("Indicators for novel genes predicted in the locus by MGI."),
                                fieldWithPath("impcNovelPredictedInLocus").description("Indicators for novel genes predicted in the locus by IMPC."),
                                fieldWithPath("mpId").description("A list of Mouse Phenotype (MP) IDs."),
                                fieldWithPath("mpTerm").description("A list of MP terms."),
                                fieldWithPath("mpTermSynonym").description("A list of synonyms for the MP terms."),
                                fieldWithPath("topLevelMpId").description("A list of top-level MP IDs."),
                                fieldWithPath("topLevelMpTerm").description("A list of top-level MP terms."),
                                fieldWithPath("topLevelMpTermSynonym").description("A list of synonyms for the top-level MP terms."),
                                fieldWithPath("intermediateMpId").description("A list of intermediate MP IDs."),
                                fieldWithPath("intermediateMpTerm").description("A list of intermediate MP terms."),
                                fieldWithPath("intermediateMpTermSynonym").description("A list of synonyms for the intermediate MP terms."),
                                fieldWithPath("childMpId").description("A list of child MP IDs."),
                                fieldWithPath("childMpTerm").description("A list of child MP terms."),
                                fieldWithPath("childMpTermSynonym").description("A list of synonyms for the child MP terms."),
                                fieldWithPath("annotatedHigherLevelMpTermId").description("A list of IDs for MP terms annotated at a higher level."),
                                fieldWithPath("annotatedHigherLevelMpTermName").description("A list of names for MP terms annotated at a higher level."),
                                fieldWithPath("maId").description("A list of Mouse Anatomy (MA) IDs."),
                                fieldWithPath("maTerm").description("A list of MA terms."),
                                fieldWithPath("maTermSynonym").description("A list of synonyms for the MA terms."),
                                fieldWithPath("selectedTopLevelMaId").description("A list of selected top-level MA IDs."),
                                fieldWithPath("selectedTopLevelMaTerm").description("A list of selected top-level MA terms."),
                                fieldWithPath("selectedTopLevelMaTermSynonym").description("A list of synonyms for the selected top-level MA terms."),
                                fieldWithPath("childMaId").description("A list of child MA IDs."),
                                fieldWithPath("childMaTerm").description("A list of child MA terms."),
                                fieldWithPath("childMaTermSynonym").description("A list of synonyms for the child MA terms."),
                                fieldWithPath("hpId").description("A list of Human Phenotype Ontology (HPO) IDs."),
                                fieldWithPath("hpTerm").description("A list of HPO terms."),
                                fieldWithPath("text").description("A list of text fields for full-text search."),
                                fieldWithPath("autoSuggest").ignored(),
                                fieldWithPath("textSearch").ignored(),
                                fieldWithPath("geneQf").ignored(),
                                fieldWithPath("mpQf").ignored(),
                                fieldWithPath("diseaseQf").ignored(),
                                fieldWithPath("maQf").ignored()                        )

                ));
    }
}