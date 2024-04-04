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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ContextConfiguration(classes = {Application.class})
@WebMvcTest
@ExtendWith({SpringExtension.class, RestDocumentationExtension.class})
@AutoConfigureRestDocs(outputDir = "target/generated-snippets")
public class AlleleDocumentationTest {


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
    public void documentAllele() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getAlleleDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("allele-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("mgiAccessionId").description("The Mouse Genome Informatics (MGI) accession ID uniquely identifying the gene."),
                                fieldWithPath("dataType").description("The type of data, indicating the nature of the information (e.g., 'gene', 'allele')."),
                                fieldWithPath("markerType").description("The type of genetic marker, such as 'protein coding gene', 'non-coding RNA'."),
                                fieldWithPath("markerSymbol").description("The official symbol of the genetic marker."),
                                fieldWithPath("markerSynonym").description("A list of alternative names or symbols for the genetic marker."),
                                fieldWithPath("markerName").description("The full name of the genetic marker."),
                                fieldWithPath("humanGeneSymbol").description("A list of human gene symbols that are orthologous to the mouse gene."),
                                fieldWithPath("ensemblGeneId").description("A list of Ensembl gene IDs associated with the marker."),
                                fieldWithPath("imitsPhenotypeStarted").description("Indicates whether phenotyping has started for the marker ('true' or 'false')."),
                                fieldWithPath("imitsPhenotypeComplete").description("Indicates whether phenotyping has been completed for the marker ('true' or 'false')."),
                                fieldWithPath("imitsPhenotypeStatus").description("The current status of the phenotyping effort."),
                                fieldWithPath("status").description("The current status of the gene or allele."),
                                fieldWithPath("latestProductionStatus").description("The most recent production status of the gene or allele."),
                                fieldWithPath("geneLatestEsCellStatus").description("The latest status of ES cell production for the gene."),
                                fieldWithPath("latestEsCellStatus").description("The latest status of ES cell production."),
                                fieldWithPath("geneLatestMouseStatus").description("The latest status of mouse production for the gene."),
                                fieldWithPath("latestMouseStatus").description("The latest status of mouse production."),
                                fieldWithPath("legacyPhenotypeStatus").description("A status indicating the legacy phenotype information."),
                                fieldWithPath("latestPhenotypeStatus").description("The most recent phenotype status."),
                                fieldWithPath("latestProjectStatus").description("The most recent status of the project involving the gene or allele."),
                                fieldWithPath("latestProductionCentre").description("A list of centers where the latest production occurred."),
                                fieldWithPath("latestPhenotypingCentre").description("A list of centers where the latest phenotyping occurred."),
                                fieldWithPath("chrName").description("The name of the chromosome where the marker is located."),
                                fieldWithPath("chrStart").description("The start position of the marker on the chromosome."),
                                fieldWithPath("chrEnd").description("The end position of the marker on the chromosome."),
                                fieldWithPath("chrStrand").description("The strand of the chromosome where the marker is located ('+' or '-')."),
                                fieldWithPath("alleleName").description("A list of names for alleles associated with the gene."),
                                fieldWithPath("alleleAccessionId").description("A list of accession IDs for alleles associated with the gene."),
                                fieldWithPath("esCellStatus").description("A list of statuses for ES cell production for the gene."),
                                fieldWithPath("imitsMouseStatus").description("The IMPC status of mouse production."),
                                fieldWithPath("mouseStatus").description("A list of statuses for mouse production."),
                                fieldWithPath("phenotypeStatus").description("A list of phenotype statuses for the gene or allele."),
                                fieldWithPath("productionCentre").description("A list of centers involved in the production of the gene or allele."),
                                fieldWithPath("phenotypingCentre").description("A list of centers involved in the phenotyping of the gene or allele."),
                                fieldWithPath("goTermId").description("A list of Gene Ontology (GO) term IDs associated with the gene."),
                                fieldWithPath("goTermName").description("A list of names for the Gene Ontology (GO) terms associated with the gene."),
                                fieldWithPath("goTermDef").description("A list of definitions for the Gene Ontology (GO) terms associated with the gene."),
                                fieldWithPath("goTermEvid").description("A list of evidence codes for the Gene Ontology (GO) terms associated with the gene."),
                                fieldWithPath("goTermDomain").description("A list of domains (e.g., biological process, cellular component) for the GO terms associated with the gene."),
                                fieldWithPath("goCount").description("The count of Gene Ontology (GO) terms associated with the gene."),
                                fieldWithPath("goUniprot").description("A list of UniProt identifiers linked to the GO terms."),
                                fieldWithPath("evidCodeRank").description("A ranking of the evidence code for the Gene Ontology (GO) terms, indicating the strength of the evidence."),
                                fieldWithPath("pfamaJson").description("A JSON string or list of strings containing Pfam-A domain information."),
                                fieldWithPath("scdbId").description("A list of secondary database IDs related to the gene, providing external references."),
                                fieldWithPath("scdbLink").description("A list of links to secondary databases that provide additional information about the gene."),
                                fieldWithPath("clanId").description("A list of Pfam clan IDs associated with the gene, grouping similar protein families."),
                                fieldWithPath("clanAcc").description("A list of accession numbers for Pfam clans associated with the gene."),
                                fieldWithPath("clanDesc").description("A list of descriptions for the Pfam clans associated with the gene."),
                                fieldWithPath("pfamaId").description("A list of Pfam-A IDs associated with the gene, identifying protein families."),
                                fieldWithPath("pfamaAcc").description("A list of accession numbers for Pfam-A families associated with the gene."),
                                fieldWithPath("pfamaGoId").description("A list of Gene Ontology (GO) IDs related to Pfam-A families."),
                                fieldWithPath("pfamaGoTerm").description("A list of Gene Ontology (GO) terms related to Pfam-A families."),
                                fieldWithPath("pfamaGoCat").description("A list of categories for the GO terms related to Pfam-A families."),
                                fieldWithPath("gfAcc").description("A unique accession ID for the gene family to which the gene belongs."),
                                fieldWithPath("alleleMgiAccessionId").description("The MGI accession ID specifically for the allele of the gene."),
                                fieldWithPath("imitsEsCellStatus").description("A list of statuses regarding the production of ES cells for the allele."),
                                fieldWithPath("ikmcProject").description("The ID of the International Knockout Mouse Consortium project associated with the gene."),
                                fieldWithPath("geneAllele").description("The specific allele of the gene."),
                                fieldWithPath("diseaseHumanPhenotypes").description("A list of human phenotypes associated with the gene."),
                                fieldWithPath("type").description("The type of entity described, such as 'gene', 'allele', or 'disease'."),
                                fieldWithPath("diseaseId").description("A list of IDs for diseases associated with the gene."),
                                fieldWithPath("diseaseSource").description("A list of sources providing information about the diseases associated with the gene."),
                                fieldWithPath("diseaseTerm").description("A list of disease terms or names associated with the gene."),
                                fieldWithPath("diseaseAlts").description("A list of alternative names or synonyms for the diseases associated with the gene."),
                                fieldWithPath("diseaseClasses").description("A list of classifications for the diseases associated with the gene."),
                                fieldWithPath("humanCurated").description("Indicators of whether the disease association was curated by human experts."),
                                fieldWithPath("mouseCurated").description("Indicators of whether the disease association was curated based on mouse models."),
                                fieldWithPath("mgiPredicted").description("Indicators of whether the disease association is predicted by MGI."),
                                fieldWithPath("impcPredicted").description("Indicators of whether the disease association is predicted by IMPC."),
                                fieldWithPath("mgiPredictedKnownGene").description("Indicators of whether the known gene's disease association is predicted by MGI."),
                                fieldWithPath("impcPredictedKnownGene").description("Indicators of whether the known gene's disease association is predicted by IMPC."),
                                fieldWithPath("mgiNovelPredictedInLocus").description("Indicators of whether there is a novel prediction in the locus by MGI."),
                                fieldWithPath("impcNovelPredictedInLocus").description("Indicators of whether there is a novel prediction in the locus by IMPC."),
                                fieldWithPath("markerSymbolBf").description("A list of marker symbols used for Bloom filter indexing."),
                                fieldWithPath("markerSymbolLowercase").description("A list of marker symbols in lowercase for case-insensitive searches."),
                                fieldWithPath("markerSynonymLowercase").description("A list of marker synonyms in lowercase for case-insensitive searches."),
                                fieldWithPath("text").description("A general text field used for full-text search across multiple fields."),
                                fieldWithPath("autoSuggest").description("A text field optimized for auto-suggestion functionality."))
                ));
    }
}