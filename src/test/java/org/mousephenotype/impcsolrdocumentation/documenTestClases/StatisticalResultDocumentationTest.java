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
public class StatisticalResultDocumentationTest {


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
    public void documentStatisticalResult() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getStatisticalResultDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("statistical-result-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("docId").description("The document identifier unique to this dataset."),
                                fieldWithPath("dbId").description("The database identifier for the dataset."),
                                fieldWithPath("dataType").description("The type of data represented in this dataset."),

                                fieldWithPath("anatomyTermId[]").description("List of anatomy term identifiers related to the dataset."),
                                fieldWithPath("anatomyTermName[]").description("List of anatomy term names related to the dataset."),
                                fieldWithPath("intermediateAnatomyTermId[]").description("List of intermediate anatomy term identifiers."),
                                fieldWithPath("intermediateAnatomyTermName[]").description("List of intermediate anatomy term names."),
                                fieldWithPath("topLevelAnatomyTermId[]").description("List of top-level anatomy term identifiers."),
                                fieldWithPath("topLevelAnatomyTermName[]").description("List of top-level anatomy term names."),

                                fieldWithPath("mpTermIdOptions[]").description("List of optional MP term identifiers."),
                                fieldWithPath("mpTermNameOptions[]").description("List of optional MP term names."),
                                fieldWithPath("mpTermId").description("The identifier for the MP term."),
                                fieldWithPath("mpTermName").description("The name of the MP term."),
                                fieldWithPath("topLevelMpTermId[]").description("List of top-level MP term identifiers."),
                                fieldWithPath("topLevelMpTermName[]").description("List of top-level MP term names."),
                                fieldWithPath("intermediateMpTermId[]").description("List of intermediate MP term identifiers."),
                                fieldWithPath("intermediateMpTermName[]").description("List of intermediate MP term names."),

                                fieldWithPath("maleMpTermId").description("The identifier for the male MP term."),
                                fieldWithPath("maleMpTermName").description("The name of the male MP term."),
                                fieldWithPath("maleTopLevelMpTermId[]").description("List of male top-level MP term identifiers."),
                                fieldWithPath("maleTopLevelMpTermName[]").description("List of male top-level MP term names."),
                                fieldWithPath("maleIntermediateMpTermId[]").description("List of male intermediate MP term identifiers."),
                                fieldWithPath("maleIntermediateMpTermName[]").description("List of male intermediate MP term names."),

                                fieldWithPath("femaleMpTermId").description("The identifier for the female MP term."),
                                fieldWithPath("femaleMpTermName").description("The name of the female MP term."),
                                fieldWithPath("femaleTopLevelMpTermId[]").description("List of female top-level MP term identifiers."),
                                fieldWithPath("femaleTopLevelMpTermName[]").description("List of female top-level MP term names."),
                                fieldWithPath("femaleIntermediateMpTermId[]").description("List of female intermediate MP term identifiers."),
                                fieldWithPath("femaleIntermediateMpTermName[]").description("List of female intermediate MP term names."),

                                fieldWithPath("geneticBackground").description("The genetic background of the subjects in the dataset."),
                                fieldWithPath("productionCenter").description("The center where the data was produced."),

                                fieldWithPath("externalDbId").description("External database identifier associated with the dataset."),
                                fieldWithPath("id").description("Unique identifier for the dataset."),
                                fieldWithPath("organisationId").description("Identifier of the organisation associated with the dataset."),
                                fieldWithPath("phenotypingCenterId").description("Identifier of the phenotyping center where the data was generated."),
                                fieldWithPath("projectId").description("Project identifier associated with the dataset."),
                                fieldWithPath("maleControlMean").description("The mean value for male controls."),
                                fieldWithPath("maleMutantMean").description("The mean value for male mutants."),
                                fieldWithPath("femaleControlMean").description("The mean value for female controls."),
                                fieldWithPath("femaleMutantMean").description("The mean value for female mutants."),

                                fieldWithPath("genotypePValueLowVsNormalHigh").description("P-value for genotype low versus normal/high comparison."),
                                fieldWithPath("genotypePValueLowNormalVsHigh").description("P-value for genotype low/normal versus high comparison."),
                                fieldWithPath("genotypeEffectSizeLowVsNormalHigh").description("Effect size for genotype low versus normal/high comparison."),
                                fieldWithPath("genotypeEffectSizeLowNormalVsHigh").description("Effect size for genotype low/normal versus high comparison."),

                                fieldWithPath("femalePValueLowVsNormalHigh").description("P-value for female low versus normal/high comparison."),
                                fieldWithPath("femalePValueLowNormalVsHigh").description("P-value for female low/normal versus high comparison."),
                                fieldWithPath("femaleEffectSizeLowVsNormalHigh").description("Effect size for female low versus normal/high comparison."),
                                fieldWithPath("femaleEffectSizeLowNormalVsHigh").description("Effect size for female low/normal versus high comparison."),

                                fieldWithPath("malePValueLowVsNormalHigh").description("P-value for male low versus normal/high comparison."),
                                fieldWithPath("malePValueLowNormalVsHigh").description("P-value for male low/normal versus high comparison."),
                                fieldWithPath("maleEffectSizeLowVsNormalHigh").description("Effect size for male low versus normal/high comparison."),
                                fieldWithPath("maleEffectSizeLowNormalVsHigh").description("Effect size for male low/normal versus high comparison."),

                                fieldWithPath("categories[]").description("Categories used in the statistical analysis."),
                                fieldWithPath("categoricalPValue").description("P-value for the categorical analysis."),
                                fieldWithPath("categoricalEffectSize").description("Effect size for the categorical analysis."),

                                fieldWithPath("batchSignificant").description("Indicates if batch effects are significant."),
                                fieldWithPath("varianceSignificant").description("Indicates if variance is significant."),
                                fieldWithPath("nullTestPValue").description("P-value for the null hypothesis test."),
                                fieldWithPath("genotypeEffectPValue").description("P-value for the genotype effect."),
                                fieldWithPath("genotypeEffectStderrEstimate").description("Standard error estimate for the genotype effect."),
                                fieldWithPath("genotypeEffectParameterEstimate").description("Parameter estimate for the genotype effect."),

                                fieldWithPath("malePercentageChange").description("Percentage change for males."),
                                fieldWithPath("femalePercentageChange").description("Percentage change for females."),

                                fieldWithPath("sexEffectPValue").description("P-value for the sex effect."),
                                fieldWithPath("sexEffectStderrEstimate").description("Standard error estimate for the sex effect."),
                                fieldWithPath("sexEffectParameterEstimate").description("Parameter estimate for the sex effect."),

                                fieldWithPath("weightEffectPValue").description("P-value for the weight effect."),
                                fieldWithPath("weightEffectStderrEstimate").description("Standard error estimate for the weight effect."),
                                fieldWithPath("weightEffectParameterEstimate").description("Parameter estimate for the weight effect."),

                                fieldWithPath("group1Genotype").description("Genotype for group 1."),
                                fieldWithPath("group1ResidualsNormalityTest").description("Results of the residuals normality test for group 1."),
                                fieldWithPath("group2Genotype").description("Genotype for group 2."),
                                fieldWithPath("group2ResidualsNormalityTest").description("Results of the residuals normality test for group 2."),

                                fieldWithPath("blupsTest").description("Results of the BLUPs test."),
                                fieldWithPath("rotatedResidualsTest").description("Results of the rotated residuals test."),

                                fieldWithPath("interceptEstimate").description("Estimate of the intercept."),
                                fieldWithPath("interceptEstimateStderrEstimate").description("Standard error estimate of the intercept estimate."),

                                fieldWithPath("interactionSignificant").description("Indicates if interaction effects are significant."),
                                fieldWithPath("interactionEffectPValue").description("P-value for the interaction effect."),

                                // Soft windowing parameters
                                fieldWithPath("softWindowingBandwidth").description("Bandwidth used in soft windowing."),
                                fieldWithPath("softWindowingShape").description("Shape used in soft windowing."),
                                fieldWithPath("softWindowingPeaks").description("Peaks identified in soft windowing."),
                                fieldWithPath("softWindowingMinObsRequired").description("Minimum observations required for soft windowing."),
                                fieldWithPath("softWindowingTotalObsOrWeight").description("Total observations or weight for soft windowing."),
                                fieldWithPath("softWindowingThreshold").description("Threshold used in soft windowing."),
                                fieldWithPath("softWindowingNumberOfDoe").description("Number of degrees of freedom in soft windowing."),
                                fieldWithPath("softWindowingDoeNote").description("Notes on the degree of evidence in soft windowing."),

                                // Metadata
                                fieldWithPath("metadata[]").description("List of metadata associated with the dataset."),

                                fieldWithPath("resourceName").description("The name of the resource."),
                                fieldWithPath("resourceFullname").description("The full name of the resource."),
                                fieldWithPath("resourceId").description("The unique identifier for the resource."),
                                fieldWithPath("projectName[]").description("List of names of projects associated with the dataset."),
                                fieldWithPath("phenotypingCenter").description("The name of the phenotyping center where the data was generated."),

                                fieldWithPath("pipelineStableId").description("The stable identifier for the pipeline."),
                                fieldWithPath("pipelineStableKey").description("The stable key for the pipeline."),
                                fieldWithPath("pipelineName").description("The name of the pipeline."),
                                fieldWithPath("pipelineId").description("The unique identifier for the pipeline."),

                                fieldWithPath("procedureStableId[]").description("List of stable identifiers for the procedures."),
                                fieldWithPath("procedureStableKey[]").description("List of stable keys for the procedures."),
                                fieldWithPath("procedureName").description("The name of the procedure."),
                                fieldWithPath("procedureId").description("The unique identifier for the procedure."),

                                fieldWithPath("parameterStableId").description("The stable identifier for the parameter."),
                                fieldWithPath("parameterStableKey[]").description("List of stable keys for the parameter."),
                                fieldWithPath("parameterName").description("The name of the parameter."),
                                fieldWithPath("parameterId").description("The unique identifier for the parameter."),

                                fieldWithPath("colonyId").description("The identifier for the colony."),
                                fieldWithPath("markerSymbol").description("The symbol for the genetic marker."),
                                fieldWithPath("markerAccessionId").description("The accession ID for the genetic marker."),
                                fieldWithPath("alleleSymbol").description("The symbol for the allele."),
                                fieldWithPath("alleleName").description("The name of the allele."),
                                fieldWithPath("alleleAccessionId").description("The accession ID for the allele."),
                                fieldWithPath("strainName").description("The name of the strain."),
                                fieldWithPath("strainAccessionId").description("The accession ID for the strain."),
                                fieldWithPath("sex").description("The sex of the organism."),
                                fieldWithPath("zygosity").description("The zygosity of the organism."),
                                fieldWithPath("controlSelectionMethod").description("The method used for control selection."),
                                fieldWithPath("dependentVariable").description("The dependent variable being measured."),
                                fieldWithPath("metadataGroup").description("The group classification of the metadata."),
                                fieldWithPath("dataFrame").description("The frame of data being referred to."),

                                fieldWithPath("femaleKoEffectPValue").description("The P-value for the knockout effect in females."),
                                fieldWithPath("femaleKoEffectStderrEstimate").description("The standard error estimate for the knockout effect in females."),
                                fieldWithPath("femaleKoParameterEstimate").description("The parameter estimate for the knockout effect in females."),
                                fieldWithPath("femaleEffectSize").description("The effect size for females."),

                                fieldWithPath("maleKoEffectPValue").description("The P-value for the knockout effect in males."),
                                fieldWithPath("maleKoEffectStderrEstimate").description("The standard error estimate for the knockout effect in males."),
                                fieldWithPath("maleKoParameterEstimate").description("The parameter estimate for the knockout effect in males."),
                                fieldWithPath("maleEffectSize").description("The effect size for males."),

                                fieldWithPath("classificationTag").description("A classification tag for the dataset."),
                                fieldWithPath("phenotypeSex[]").description("List indicating the sex(es) for which phenotype data is available."),

                                fieldWithPath("lifeStageAcc").description("The accession code for the life stage."),
                                fieldWithPath("lifeStageName").description("The name of the life stage."),
                                fieldWithPath("significant").description("Indicates whether the findings are statistically significant.")

                        )

                ));
    }
}