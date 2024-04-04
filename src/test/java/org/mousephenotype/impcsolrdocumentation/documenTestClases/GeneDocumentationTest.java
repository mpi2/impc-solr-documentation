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
public class GeneDocumentationTest {


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

        mockMvc.perform(get("http://localhost:8080/getGeneDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("gene-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("alleleAccessionId").description("List of accession IDs for alleles."),
                                fieldWithPath("alleleName").description("List of names for alleles."),
                                fieldWithPath("altMpId").description("List of alternative Mouse Phenotype (MP) IDs."),
                                fieldWithPath("annotatedHigherLevelMaTermName").description("List of annotated higher level Mouse Anatomy (MA) term names."),
                                fieldWithPath("annotatedHigherLevelMpTermName").description("List of annotated higher level Mouse Phenotype (MP) term names."),
                                fieldWithPath("assignmentStatus").description("The assignment status."),
                                fieldWithPath("ccdsId").description("List of Consensus CDS (CCDS) IDs."),
                                fieldWithPath("childMaId").description("List of child Mouse Anatomy (MA) IDs."),
                                fieldWithPath("childMaTerm").description("List of child Mouse Anatomy (MA) terms."),
                                fieldWithPath("childMaTermSynonym").description("List of synonyms for child MA terms."),
                                fieldWithPath("childMpId").description("List of child Mouse Phenotype (MP) IDs."),
                                fieldWithPath("childMpTerm").description("List of child MP terms."),
                                fieldWithPath("childMpTermSynonym").description("List of synonyms for child MP terms."),
                                fieldWithPath("chrEnd").description("Chromosome end position."),
                                fieldWithPath("chrName").description("Name of the chromosome."),
                                fieldWithPath("chrStart").description("Chromosome start position."),
                                fieldWithPath("chrStrand").description("Chromosome strand."),
                                fieldWithPath("clanAcc").description("List of clan accession numbers."),
                                fieldWithPath("clanDesc").description("List of clan descriptions."),
                                fieldWithPath("clanId").description("List of clan IDs."),
                                fieldWithPath("conditionalAlleleProductionStatus").description("Production status of the conditional allele."),
                                fieldWithPath("crisprAlleleProductionStatus").description("Production status of the CRISPR allele."),
                                fieldWithPath("dataType").description("The type of data."),
                                fieldWithPath("datasetsRawData").description("Raw data from datasets."),
                                fieldWithPath("diseaseAlts").description("List of alternative disease names."),
                                fieldWithPath("diseaseClasses").description("List of disease classes."),
                                fieldWithPath("diseaseHumanPhenotypes").description("Human phenotypes related to the disease."),
                                fieldWithPath("diseaseId").description("List of disease IDs."),
                                fieldWithPath("diseaseSource").description("List of sources for disease data."),
                                fieldWithPath("diseaseTerm").description("List of disease terms."),
                                fieldWithPath("dmddImageDataAvailable").description("Indicates if DMDD image data is available."),
                                fieldWithPath("dmddLethalDataAvailable").description("Indicates if DMDD lethal data is available."),
                                fieldWithPath("embryoAnalysisViewName").description("Name of the embryo analysis view."),
                                fieldWithPath("embryoAnalysisViewUrl").description("URL for the embryo analysis view."),
                                fieldWithPath("embryoDataAvailable").description("Indicates if embryo data is available."),
                                fieldWithPath("embryoModalities").description("List of modalities for embryo analysis."),
                                fieldWithPath("ensemblGeneId").description("List of Ensembl gene IDs."),
                                fieldWithPath("esCellProductionStatus").description("Production status of the ES cell."),
                                fieldWithPath("evidCodeRank").description("Evidence code rank."),
                                fieldWithPath("expName").description("List of experiment names."),
                                fieldWithPath("goCount").description("Count of Gene Ontology (GO) terms associated."),
                                fieldWithPath("goTermDef").description("List of GO term definitions."),
                                fieldWithPath("goTermDomain").description("List of domains for GO terms."),
                                fieldWithPath("goTermEvid").description("List of evidence for GO terms."),
                                fieldWithPath("goTermId").description("List of GO term IDs."),
                                fieldWithPath("goTermName").description("List of GO term names."),
                                fieldWithPath("goUniprot").description("List of UniProt IDs associated with GO terms."),
                                fieldWithPath("hasQc").description("Indicates if quality control (QC) has been performed."),
                                fieldWithPath("hpId").description("List of Human Phenotype Ontology (HPO) IDs."),
                                fieldWithPath("hpTerm").description("List of HPO terms."),
                                fieldWithPath("humanCurated").description("Indicates if the gene has been curated by human experts."),
                                fieldWithPath("humanGeneSymbol").description("List of human gene symbols associated with the gene."),
                                fieldWithPath("humanSymbolSynonym").description("List of human gene Synonym associated with the gene."),
                                fieldWithPath("impcNovelPredictedInLocus").description("Indicates if novel IMPC predictions exist within the gene locus."),
                                fieldWithPath("impcPredicted").description("Indicates if there are IMPC predictions for the gene."),
                                fieldWithPath("impcPredictedInLocus").description("Specific locus for the IMPC predicted gene."),
                                fieldWithPath("impcPredictedKnownGene").description("Indicates if known genes are predicted by IMPC within the locus."),
                                fieldWithPath("inferredChildMaId").description("List of inferred child Mouse Anatomy (MA) IDs."),
                                fieldWithPath("inferredChildMaTerm").description("List of inferred child MA terms."),
                                fieldWithPath("inferredChildMaTermSynonym").description("List of synonyms for the inferred child MA terms."),
                                fieldWithPath("inferredMaId").description("List of inferred Mouse Anatomy (MA) IDs."),
                                fieldWithPath("inferredMaTerm").description("List of inferred MA terms."),
                                fieldWithPath("inferredMaTermSynonym").description("List of synonyms for the inferred MA terms."),
                                fieldWithPath("inferredSelectedTopLevelMaId").description("List of IDs for the inferred selected top-level MA terms."),
                                fieldWithPath("inferredSelectedTopLevelMaTerm").description("List of inferred selected top-level MA terms."),
                                fieldWithPath("inferredSelectedTopLevelMaTermSynonym").description("List of synonyms for the inferred selected top-level MA terms."),
                                fieldWithPath("intermediateMpId").description("List of intermediate Mouse Phenotype (MP) IDs."),
                                fieldWithPath("intermediateMpTerm").description("List of intermediate MP terms."),
                                fieldWithPath("intermediateMpTermSynonym").description("List of synonyms for the intermediate MP terms."),
                                fieldWithPath("isIdgGene").description("Indicates if the gene is part of the IDG (Illuminating the Druggable Genome) project."),
                                fieldWithPath("isUmassGene").description("Indicates if the gene is associated with the University of Massachusetts."),
                                fieldWithPath("maId").description("List of Mouse Anatomy (MA) IDs."),
                                fieldWithPath("maTerm").description("List of MA terms."),
                                fieldWithPath("maTermDefinition").description("List of definitions for the MA terms."),
                                fieldWithPath("maTermSynonym").description("List of synonyms for the MA terms."),
                                fieldWithPath("markerName").description("General name of the marker."),
                                fieldWithPath("markerSymbol").description("Symbol representing the marker."),
                                fieldWithPath("markerSynonym").description("List of synonyms for the marker."),
                                fieldWithPath("markerType").description("Type of marker."),
                                fieldWithPath("mgiAccessionId").description("MGI (Mouse Genome Informatics) accession ID for the gene."),
                                fieldWithPath("mgiNovelPredictedInLocus").description("Indicates if novel MGI predictions exist within the gene locus."),
                                fieldWithPath("mgiPredicted").description("Indicates if there are MGI predictions for the gene."),
                                fieldWithPath("mgiPredictedInLocus").description("Specific locus for the MGI predicted gene."),
                                fieldWithPath("mgiPredictedKnownGene").description("Indicates if known genes are predicted by MGI within the locus."),
                                fieldWithPath("mouseCurated").description("Indicates if the gene has been curated by mouse experts."),
                                fieldWithPath("mouseProductionStatus").description("The production status of the mouse model for the gene."),
                                fieldWithPath("mpId").description("List of Mouse Phenotype (MP) IDs."),
                                fieldWithPath("mpTerm").description("List of MP terms."),
                                fieldWithPath("mpTermDefinition").description("List of definitions for the MP terms."),
                                fieldWithPath("mpTermSynonym").description("List of synonyms for the MP terms."),
                                fieldWithPath("ncbiId").description("List of NCBI IDs associated with the gene."),
                                fieldWithPath("notSignificantTopLevelMpTerms").description("List of top-level MP terms not deemed significant."),
                                fieldWithPath("nullAlleleProductionStatus").description("Production status for null alleles."),
                                fieldWithPath("pvalue").description("List of p-values associated with statistical tests."),
                                fieldWithPath("parameterName").description("List of names for parameters used in experiments."),
                                fieldWithPath("parameterStableId").description("List of stable IDs for the experimental parameters."),
                                fieldWithPath("pfamaAcc").description("List of Pfam A accession numbers."),
                                fieldWithPath("pfamaGoCat").description("GO categories associated with Pfam A entries."),
                                fieldWithPath("pfamaGoId").description("GO IDs associated with Pfam A entries."),
                                fieldWithPath("pfamaGoTerm").description("GO terms associated with Pfam A entries."),
                                fieldWithPath("pfamaId").description("List of Pfam A IDs."),
                                fieldWithPath("pfamaJson").description("JSON data related to Pfam A entries."),
                                fieldWithPath("phenotypeStatus").description("Status of the phenotyping effort for the gene."),
                                fieldWithPath("phenotypingCentre").description("List of centres where phenotyping has been conducted."),
                                fieldWithPath("phenotypingDataAvailable").description("Indicates if phenotyping data is available for the gene."),
                                fieldWithPath("pipelineName").description("List of names for pipelines used in data generation."),
                                fieldWithPath("pipelineStableId").description("List of stable IDs for the pipelines."),
                                fieldWithPath("procParamName").description("List of names for procedure parameters."),
                                fieldWithPath("procParamStableId").description("List of stable IDs for the procedure parameters."),
                                fieldWithPath("procedureName").description("List of names for procedures."),
                                fieldWithPath("procedureStableId").description("List of stable IDs for the procedures."),
                                fieldWithPath("productionCentre").description("List of centres responsible for producing the models."),
                                fieldWithPath("scdbId").description("List of IDs from the Sanger Cancer Database."),
                                fieldWithPath("scdbLink").description("List of links to the Sanger Cancer Database."),
                                fieldWithPath("selectedTopLevelMaId").description("List of selected top-level Mouse Anatomy (MA) IDs."),
                                fieldWithPath("selectedTopLevelMaTerm").description("List of selected top-level MA terms."),
                                fieldWithPath("selectedTopLevelMaTermId").description("ID of the selected top-level MA term."),
                                fieldWithPath("selectedTopLevelMaTermSynonym").description("List of synonyms for the selected top-level MA terms."),
                                fieldWithPath("seqRegionEnd").description("End position on the sequence region."),
                                fieldWithPath("seqRegionId").description("ID of the sequence region."),
                                fieldWithPath("seqRegionStart").description("Start position on the sequence region."),
                                fieldWithPath("significantTopLevelMpTerms").description("List of significant top-level MP terms."),
                                fieldWithPath("subtype").description("List of subtypes associated with the gene."),
                                fieldWithPath("topLevelMpDefinition").description("Definition of the top-level MP term."),
                                fieldWithPath("topLevelMpId").description("List of top-level MP IDs."),
                                fieldWithPath("topLevelMpTerm").description("List of top-level MP terms."),
                                fieldWithPath("topLevelMpTermSynonym").description("List of synonyms for the top-level MP terms."),
                                fieldWithPath("type").description("The type of document or data."),
                                fieldWithPath("vegaId").description("List of VEGA IDs associated with the gene."),
                                fieldWithPath("xref").description("List of cross-references for the gene.")
                        )


                ));
    }
}