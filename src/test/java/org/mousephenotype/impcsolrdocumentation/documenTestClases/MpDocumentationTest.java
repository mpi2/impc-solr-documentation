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
public class MpDocumentationTest {


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
    public void documentMp() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getMpDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("mp-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("text[]").description("A list of general text related to the document."),
                                fieldWithPath("autoSuggest[]").description("Suggestions for auto-complete features."),
                                fieldWithPath("mixSynQf[]").description("A mix of synonyms and quality factors for search optimization."),
                                fieldWithPath("searchTermJson").description("JSON representation of search terms."),
                                fieldWithPath("childrenJson").description("JSON representation of child elements related to the document."),
                                fieldWithPath("scrollNode").description("An identifier for a scroll node, possibly used in UI elements."),
                                fieldWithPath("geneVariantMaleCount").description("The count of male gene variants."),
                                fieldWithPath("geneVariantFemaleCount").description("The count of female gene variants."),
                                fieldWithPath("geneVariantCount").description("The total count of gene variants."),
                                fieldWithPath("mpId").description("The unique identifier for the MP term."),
                                fieldWithPath("mpTerm").description("The name of the MP term."),
                                fieldWithPath("mpDefinition").description("The definition of the MP term."),
                                fieldWithPath("mpTermSynonym[]").description("A list of synonyms for the MP term."),
                                fieldWithPath("altMpId[]").description("Alternative identifiers for MP terms."),
                                fieldWithPath("childMpId[]").description("Identifiers for child MP terms."),
                                fieldWithPath("childMpTerm[]").description("Names of child MP terms."),
                                fieldWithPath("parentMpId[]").description("Identifiers for parent MP terms."),
                                fieldWithPath("parentMpTerm[]").description("Names of parent MP terms."),
                                fieldWithPath("intermediateMpId[]").description("Identifiers for intermediate MP terms."),
                                fieldWithPath("intermediateMpTerm[]").description("Names of intermediate MP terms."),
                                fieldWithPath("topLevelMpId[]").description("Identifiers for top-level MP terms."),
                                fieldWithPath("topLevelMpTerm[]").description("Names of top-level MP terms."),
                                fieldWithPath("topLevelMpTermSynonym[]").description("Synonyms for top-level MP terms."),
                                fieldWithPath("topLevelMpTermId[]").description("Unique identifiers for top-level MP terms."),
                                fieldWithPath("hpId[]").description("A list of Human Phenotype Ontology (HPO) identifiers related to the gene."),
                                fieldWithPath("hpTerm[]").description("Names of the human phenotypes associated with the HPO identifiers."),
                                fieldWithPath("hpTermSynonym[]").description("Synonyms for the HPO terms."),
                                fieldWithPath("dataType").description("The type of data contained in the document."),
                                fieldWithPath("inferredMaId[]").description("A list of inferred Mouse Anatomy (MA) term identifiers."),
                                fieldWithPath("inferredMaTerm[]").description("Names of the inferred MA terms."),
                                fieldWithPath("inferredIntermediateMaId[]").description("Identifiers for intermediate MA terms that are inferred."),
                                fieldWithPath("inferredIntermediateMaTerm[]").description("Names of the inferred intermediate MA terms."),
                                fieldWithPath("inferredSelectedTopLevelMaId[]").description("Identifiers for selected top-level MA terms that are inferred."),
                                fieldWithPath("inferredSelectedTopLevelMaTerm[]").description("Names of the inferred selected top-level MA terms."),
                                fieldWithPath("goId[]").description("A list of Gene Ontology (GO) identifiers related to the gene."),
                                fieldWithPath("pvalue[]").description("A list of p-values associated with the statistical analysis of the gene."),
                                fieldWithPath("mgiAccessionId[]").description("A list of Mouse Genome Informatics (MGI) accession identifiers."),
                                fieldWithPath("markerSymbol[]").description("Symbols representing the gene markers."),
                                fieldWithPath("markerAccessionId").description("The accession ID for the gene marker."),
                                fieldWithPath("phenoCalls").description("The number of phenotype calls made for the gene."),
                                fieldWithPath("preqcGeneId[]").description("Pre-QC gene identifiers."),
                                fieldWithPath("markerName[]").description("Full names of the gene markers."),
                                fieldWithPath("markerSynonym[]").description("Synonyms for the gene markers."),
                                fieldWithPath("markerType[]").description("Types of gene markers."),
                                fieldWithPath("humanGeneSymbol[]").description("Symbols for human genes that are orthologous to the mouse gene."),
                                fieldWithPath("status[]").description("Statuses related to the gene."),
                                fieldWithPath("imitsPhenotypeStarted[]").description("Information on whether phenotyping has started for the gene, by center."),
                                fieldWithPath("imitsPhenotypeComplete[]").description("Information on whether phenotyping is complete for the gene, by center."),
                                fieldWithPath("imitsPhenotypeStatus[]").description("The phenotyping status for the gene, by center."),
                                fieldWithPath("latestProductionCentre[]").description("The latest centers to produce the gene."),
                                fieldWithPath("latestPhenotypingCentre[]").description("The latest centers to phenotype the gene."),
                                fieldWithPath("latestPhenotypeStatus[]").description("The latest phenotyping statuses for the gene."),
                                fieldWithPath("legacyPhenotypeStatus").description("Legacy phenotype status for the gene."),
                                fieldWithPath("alleleName[]").description("Names of alleles for the gene."),
                                fieldWithPath("embryoDataAvailable").description("Indicates if embryo data is available for the gene."),
                                fieldWithPath("type[]").description("Types of data or entities related to the gene."),
                                fieldWithPath("diseaseId[]").description("Identifiers for diseases related to the gene."),
                                fieldWithPath("diseaseSource[]").description("Sources of the disease information."),
                                fieldWithPath("diseaseTerm[]").description("Names of the diseases related to the gene."),
                                fieldWithPath("diseaseAlts[]").description("Alternative names or identifiers for the diseases."),
                                fieldWithPath("diseaseClasses[]").description("Classification of the diseases related to the gene."),
                                fieldWithPath("humanCurated[]").description("Indicates if the disease-gene association was curated by humans."),
                                fieldWithPath("mouseCurated[]").description("Indicates if the disease-gene association was curated based on mouse models."),
                                fieldWithPath("mgiPredicted[]").description("Indicates if the disease-gene association is predicted by MGI."),
                                fieldWithPath("impcPredicted[]").description("Indicates if the disease-gene association is predicted by IMPC."),
                                fieldWithPath("mgiPredictedKnownGene[]").description("Indicates if the prediction by MGI involves known genes."),
                                fieldWithPath("impcPredictedKnownGene[]").description("Indicates if the prediction by IMPC involves known genes."),
                                fieldWithPath("mgiNovelPredictedInLocus[]").description("Indicates if there are novel predictions by MGI within a specific locus."),
                                fieldWithPath("impcNovelPredictedInLocus[]").description("Indicates if there are novel predictions by IMPC within a specific locus."),
                                fieldWithPath("annotationTermId[]").description("A list of annotation term identifiers."),
                                fieldWithPath("annotationTermName[]").description("Names corresponding to the annotation term identifiers."),
                                fieldWithPath("name[]").description("A list of names related to the entity."),
                                fieldWithPath("accession[]").description("A list of accession numbers related to the entity."),
                                fieldWithPath("expName[]").description("A list of experiment names related to the entity."),
                                fieldWithPath("largeThumbnailFilePath").description("File path for the large thumbnail image."),
                                fieldWithPath("smallThumbnailFilePath").description("File path for the small thumbnail image."),
                                fieldWithPath("symbol[]").description("A list of symbols related to the entity."),
                                fieldWithPath("sangerSymbol[]").description("A list of Sanger symbols related to the entity."),
                                fieldWithPath("geneName[]").description("A list of gene names."),
                                fieldWithPath("subtype[]").description("A list of subtypes for the entity."),
                                fieldWithPath("geneSynonyms[]").description("A list of synonyms for the gene."),
                                fieldWithPath("expNameExp[]").description("A list of expanded experiment names related to the entity."),
                                fieldWithPath("symbolGene[]").description("A list of gene symbols."),
                                fieldWithPath("topLevel[]").description("A list indicating if the entity is at the top level."),
                                fieldWithPath("alleleSymbol[]").description("A list of allele symbols."),
                                fieldWithPath("alleleId[]").description("A list of allele identifiers."),
                                fieldWithPath("strainName[]").description("A list of strain names."),
                                fieldWithPath("strainAccessionId[]").description("A list of strain accession IDs."),
                                fieldWithPath("pipelineName[]").description("A list of pipeline names."),
                                fieldWithPath("pipelineStableId[]").description("A list of pipeline stable identifiers."),
                                fieldWithPath("pipelineStableKey[]").description("A list of pipeline stable keys."),
                                fieldWithPath("procedureName[]").description("A list of procedure names."),
                                fieldWithPath("procedureStableId[]").description("A list of procedure stable identifiers."),
                                fieldWithPath("procedureStableKey[]").description("A list of procedure stable keys."),
                                fieldWithPath("parameterName[]").description("A list of parameter names."),
                                fieldWithPath("parameterStableId[]").description("A list of parameter stable identifiers."),
                                fieldWithPath("parameterStableKey[]").description("A list of parameter stable keys."),
                                fieldWithPath("text[]").description("A catchall fifeld containing all searchable text fields."),
                                fieldWithPath("autoSuggest[]").description("Fields intended for use in auto-suggestion features."),
                                fieldWithPath("mixSynQf[]").description("Fields that mix synonyms and quality factors for search optimization."),
                                fieldWithPath("searchTermJson").description("JSON representation of search terms for ontology browser."),
                                fieldWithPath("childrenJson").description("JSON representation of child terms for ontology browser."),
                                fieldWithPath("scrollNode").description("Identifier for scrolling functionality in UI components."),
                                fieldWithPath("geneVariantMaleCount").description("Count of male variants of the gene."),
                                fieldWithPath("geneVariantFemaleCount").description("Count of female variants of the gene."),
                                fieldWithPath("geneVariantCount").description("Total count of gene variants.")
                        )

                ));
    }
}