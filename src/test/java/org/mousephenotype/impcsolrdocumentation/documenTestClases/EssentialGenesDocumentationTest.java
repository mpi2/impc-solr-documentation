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
public class EssentialGenesDocumentationTest {


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
    public void documentEssentialGenes() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getEssentialGenesDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("essential-genes-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("ageEntrezAccId").description("The Entrez accession ID related to age studies."),
                                fieldWithPath("ageHumanGeneId").description("The human gene ID associated with age studies."),
                                fieldWithPath("ageId").description("Unique identifier for the age-related study entry."),
                                fieldWithPath("ageMeanGeneEffect").description("The mean gene effect observed in the age study."),
                                fieldWithPath("ageRawDataId").description("Raw data identifier associated with age studies."),
                                fieldWithPath("cavAlleleAccessionId").description("Allele accession ID in CAV repository."),
                                fieldWithPath("cavAlleleSymbol").description("Symbol of the allele in the CAV repository."),
                                fieldWithPath("cavCategory").description("Categories associated with the CAV allele."),
                                fieldWithPath("clinDate").description("Date associated with clinical data entry."),
                                fieldWithPath("clinHaploinsufficiency").description("Clinical haploinsufficiency score."),
                                fieldWithPath("clinHumanGeneId").description("Human gene ID related to clinical data."),
                                fieldWithPath("clinId").description("Unique identifier for the clinical data entry."),
                                fieldWithPath("clinReport").description("Textual report associated with clinical data."),
                                fieldWithPath("clinTriplosensitivity").description("Clinical triplosensitivity score."),
                                fieldWithPath("fbin").description("Functional binning data."),
                                fieldWithPath("fbinCode").description("Code representing a functional bin."),
                                fieldWithPath("fid").description("Unique identifier for functional data entry."),
                                fieldWithPath("forthologId").description("Ortholog ID associated with functional data."),
                                fieldWithPath("gnpBrainExpression").description("Genomic data pertaining to brain expression."),
                                fieldWithPath("gnpCdsLength").description("Length of the coding sequence in genomic data."),
                                fieldWithPath("gnpChromosome").description("Chromosome location in genomic data."),
                                fieldWithPath("gnpClassicCaf").description("General Combined Annotation Dependent Depletion score for all populations."),
                                fieldWithPath("gnpClassicCafAfr").description("CADD score for African population."),
                                fieldWithPath("gnpClassicCafAmr").description("CADD score for American population."),
                                fieldWithPath("gnpClassicCafAsj").description("CADD score for Ashkenazi Jewish population."),
                                fieldWithPath("gnpClassicCafEas").description("CADD score for East Asian population."),
                                fieldWithPath("gnpClassicCafFin").description("CADD score for Finnish population."),
                                fieldWithPath("gnpClassicCafNfe").description("CADD score for Non-Finnish European population."),
                                fieldWithPath("gnpClassicCafOth").description("CADD score for Other populations."),
                                fieldWithPath("gnpClassicCafSas").description("CADD score for South Asian population."),
                                fieldWithPath("gnpConstraintFlag").description("Flag indicating genomic constraint."),
                                fieldWithPath("gnpDefined").description("Indicator if genomic data is defined."),
                                fieldWithPath("gnpEndPosition").description("End position of the gene in the genome."),
                                fieldWithPath("gnpExacExpLof").description("Expected loss of function based on ExAC database."),
                                fieldWithPath("gnpExacObsLof").description("Observed loss of function based on ExAC database."),
                                fieldWithPath("gnpExacOeLof").description("Observed/Expected loss of function ratio based on ExAC database."),
                                fieldWithPath("gnpExacPli").description("Probability of being loss-of-function intolerant (pLI) based on ExAC database."),
                                fieldWithPath("gnpExpHomLof").description("Expected homozygous loss of function."),
                                fieldWithPath("gnpExpLof").description("Expected loss of function."),
                                fieldWithPath("gnpExpMis").description("Expected missense mutation."),
                                fieldWithPath("gnpExpMisPphen").description("Expected missense mutation with probably damaging phenotype."),
                                fieldWithPath("gnpExpSyn").description("Expected synonymous mutation."),
                                fieldWithPath("gnpGeneId").description("Gene ID in the Genomics England PanelApp."),
                                fieldWithPath("gnpGeneLength").description("Length of the gene in the genome."),
                                fieldWithPath("gnpGeneSymbol").description("Symbol of the gene in the genomic data."),
                                fieldWithPath("gnpGeneType").description("Type of the gene in genomic data."),
                                fieldWithPath("gnpHumanGeneId").description("Human gene ID associated with the genomic data."),
                                fieldWithPath("gnpId").description("Unique identifier for the genomic data entry."),
                                fieldWithPath("gnpLofZ").description("Z-score for the loss of function (LoF) variant."),
                                fieldWithPath("gnpMaxAf").description("Maximum allele frequency across all populations."),
                                fieldWithPath("gnpMisZ").description("Z-score for missense variants."),
                                fieldWithPath("gnpMuLof").description("Mutation rate for loss of function."),
                                fieldWithPath("gnpMuMis").description("Mutation rate for missense variants."),
                                fieldWithPath("gnpMuSyn").description("Mutation rate for synonymous variants."),
                                fieldWithPath("gnpNSites").description("Number of sites evaluated."),
                                fieldWithPath("gnpNoLofs").description("Number of observed loss-of-function variants."),
                                fieldWithPath("gnpNumCodingExons").description("Number of coding exons."),
                                fieldWithPath("gnpObsHetLof").description("Observed heterozygous loss of function variants."),
                                fieldWithPath("gnpObsHomLof").description("Observed homozygous loss of function variants."),
                                fieldWithPath("gnpObsLof").description("Total observed loss of function variants."),
                                fieldWithPath("gnpObsMis").description("Observed missense variants."),
                                fieldWithPath("gnpObsMisPphen").description("Observed missense variants predicted to be probably damaging."),
                                fieldWithPath("gnpObsSyn").description("Observed synonymous variants."),
                                fieldWithPath("gnpOeLof").description("Observed/Expected ratio for loss of function variants."),
                                fieldWithPath("gnpOeLofLower").description("Lower bound of the 95% confidence interval for the O/E ratio for LoF variants."),
                                fieldWithPath("gnpOeLofUpper").description("Upper bound of the 95% confidence interval for the O/E ratio for LoF variants."),
                                fieldWithPath("gnpOeLofUpperBin").description("Bin value for the upper bound of O/E ratio for LoF variants."),
                                fieldWithPath("gnpOeLofUpperBin6").description("Bin value for the upper bound of O/E ratio for LoF variants, using a different binning strategy."),
                                fieldWithPath("gnpOeLofUpperRank").description("Rank of the gene based on the upper bound of O/E ratio for LoF variants."),
                                fieldWithPath("gnpOeMis").description("Observed/Expected ratio for missense variants."),
                                fieldWithPath("gnpOeMisLower").description("Lower bound of the 95% confidence interval for the O/E ratio for missense variants."),
                                fieldWithPath("gnpOeMisPphen").description("Observed/Expected ratio for probably damaging missense variants."),
                                fieldWithPath("gnpOeMisUpper").description("Upper bound of the 95% confidence interval for the O/E ratio for missense variants."),
                                fieldWithPath("gnpOeSyn").description("Observed/Expected ratio for synonymous variants."),
                                fieldWithPath("gnpOeSynLower").description("Lower bound of the 95% confidence interval for the O/E ratio for synonymous variants."),
                                fieldWithPath("gnpOeSynUpper").description("Upper bound of the 95% confidence interval for the O/E ratio for synonymous variants."),
                                fieldWithPath("gnpP").description("P-value for statistical tests."),
                                fieldWithPath("gnpPAfr").description("P-value for the African population."),
                                fieldWithPath("gnpPAmr").description("P-value for the American population."),
                                fieldWithPath("gnpPAsj").description("P-value for the Ashkenazi Jewish population."),
                                fieldWithPath("gnpPEas").description("P-value for the East Asian population."),
                                fieldWithPath("gnpPFin").description("P-value for the Finnish population."),
                                fieldWithPath("gnpPNfe").description("P-value for the Non-Finnish European population."),
                                fieldWithPath("gnpPOth").description("P-value for other populations."),
                                fieldWithPath("gnpPSas").description("P-value for the South Asian population."),
                                fieldWithPath("gnpPli").description("pLI score indicating the probability of being loss-of-function intolerant."),
                                fieldWithPath("gnpPnull").description("Probability of being functionally neutral."),
                                fieldWithPath("gnpPossibleLof").description("Possible loss-of-function variants."),
                                fieldWithPath("gnpPossibleMis").description("Possible missense variants."),
                                fieldWithPath("gnpPossibleMisPphen").description("Possible probably damaging missense variants."),
                                fieldWithPath("gnpPossibleSyn").description("Possible synonymous variants."),
                                fieldWithPath("gnpPrec").description("Precision of the genomic data."),
                                fieldWithPath("gnpStartPosition").description("Start position of the gene in the genome."),
                                fieldWithPath("gnpSynZ").description("Z-score for the synonymous variants."),
                                fieldWithPath("gnpTranscript").description("Transcript ID associated with the genomic data."),
                                fieldWithPath("gnpTranscriptLevel").description("Level of the transcript associated with the genomic data."),
                                fieldWithPath("gnpTranscriptType").description("Type of transcript recorded in the genomic data."),
                                fieldWithPath("hgEnsemblGeneAccId").description("Ensembl gene accession ID for the human gene."),
                                fieldWithPath("hgEntrezGeneAccId").description("Entrez gene accession ID for the human gene."),
                                fieldWithPath("hgHgncAccId").description("HGNC accession ID for the human gene."),
                                fieldWithPath("hgId").description("Unique identifier for the human gene entry."),
                                fieldWithPath("hgName").description("Name of the human gene."),
                                fieldWithPath("hgSymbol").description("Symbol representing the human gene."),
                                fieldWithPath("hgncAgrAccId").description("Agronomy accession ID related to the human gene."),
                                fieldWithPath("hgncAliasName").description("Alias name(s) for the human gene."),
                                fieldWithPath("hgncAliasSymbol").description("Alias symbol(s) for the human gene."),
                                fieldWithPath("hgncBioparadigmsSlc").description("Bioparadigms SLC code for the human gene."),
                                fieldWithPath("hgncCcdsAccId").description("CCDS accession ID for the human gene."),
                                fieldWithPath("hgncCd").description("CD marker for the human gene."),
                                fieldWithPath("hgncCosmic").description("COSMIC ID for the human gene."),
                                fieldWithPath("hgncDateApprovedReserved").description("Date the gene was approved or reserved in HGNC."),
                                fieldWithPath("hgncDateModified").description("Date the gene information was last modified in HGNC."),
                                fieldWithPath("hgncDateNameChanged").description("Date the gene name was changed in HGNC."),
                                fieldWithPath("hgncDateSymbolChanged").description("Date the gene symbol was changed in HGNC."),
                                fieldWithPath("hgncEna").description("European Nucleotide Archive ID for the human gene."),
                                fieldWithPath("hgncEnsemblGeneAccId").description("Ensembl gene accession ID associated with the HGNC entry."),
                                fieldWithPath("hgncEntrezAccId").description("Entrez accession ID associated with the HGNC entry."),
                                fieldWithPath("hgncEnzymeAccId").description("Enzyme accession ID associated with the human gene."),
                                fieldWithPath("hgncGencc").description("GenCC ID for the human gene."),
                                fieldWithPath("hgncGeneGroup").description("Gene group classification in HGNC."),
                                fieldWithPath("hgncGeneGroupAccId").description("Gene group accession ID in HGNC."),
                                fieldWithPath("hgncGtrnadb").description("tRNA database ID for the human gene."),
                                fieldWithPath("hgncHgncAccId").description("HGNC accession ID for the human gene."),
                                fieldWithPath("hgncHomeodb").description("Homeobox database ID for the human gene."),
                                fieldWithPath("hgncHordeAccId").description("Horde ID for the human gene (related to olfactory receptors)."),
                                fieldWithPath("hgncHumanGeneId").description("Human gene ID associated with HGNC."),
                                fieldWithPath("hgncId").description("Unique identifier for the HGNC entry."),
                                fieldWithPath("hgncImgt").description("Immunogenetics (IMGT) ID for the human gene."),
                                fieldWithPath("hgncIntermediateFilamentDb").description("Intermediate filament database ID for the human gene."),
                                fieldWithPath("hgncIuphar").description("International Union of Pharmacology (IUPHAR) ID for the human gene."),
                                fieldWithPath("hgncKznfGeneCatalog").description("KZNF gene catalog ID for the human gene."),
                                fieldWithPath("hgncLncipedia").description("Lncipedia ID for the human gene."),
                                fieldWithPath("hgncLncrnadb").description("lncRNA database ID for the human gene."),
                                fieldWithPath("hgncLocation").description("Chromosomal location of the human gene."),
                                fieldWithPath("hgncLocationSortable").description("Sortable format of the chromosomal location of the human gene."),
                                fieldWithPath("hgncLocusGroup").description("Locus group classification of the human gene."),
                                fieldWithPath("hgncLocusType").description("Locus type classification of the human gene."),
                                fieldWithPath("hgncLsdb").description("Locus-specific database ID for the human gene."),
                                fieldWithPath("hgncMamitTrnadb").description("Mamit-tRNA database ID for the human gene."),
                                fieldWithPath("hgncManeSelect").description("MANE Select ID for the human gene."),
                                fieldWithPath("hgncMerops").description("MEROPS database ID for the human gene related to proteases."),
                                fieldWithPath("hgncMgiGeneAccId").description("MGI gene accession ID for the mouse ortholog of the human gene."),
                                fieldWithPath("hgncMirbase").description("miRBase ID for the human gene."),
                                fieldWithPath("hgncName").description("Official name of the human gene."),
                                fieldWithPath("hgncOmimAccId").description("OMIM accession ID for the human gene, linking to the Online Mendelian Inheritance in Man database."),
                                fieldWithPath("hgncOrphanet").description("Orphanet ID for the human gene, relevant for rare diseases."),
                                fieldWithPath("hgncPrevName").description("Previous name(s) of the human gene."),
                                fieldWithPath("hgncPrevSymbol").description("Previous symbol(s) of the human gene."),
                                fieldWithPath("hgncPseudogeneOrg").description("Pseudogene.org identifier for the human gene if applicable."),
                                fieldWithPath("hgncPubmedAccId").description("PubMed accession ID(s) associated with the human gene."),
                                fieldWithPath("hgncRefseqAccession").description("RefSeq accession number for the human gene."),
                                fieldWithPath("hgncRgdAccId").description("Rat Genome Database (RGD) ID for the rat ortholog of the human gene."),
                                fieldWithPath("hgncRnaCentralAccIds").description("RNAcentral IDs for the human gene, representing non-coding RNA sequences."),
                                fieldWithPath("hgncSnornabase").description("snoRNABase ID for the human gene if it encodes a small nucleolar RNA (snoRNA)."),
                                fieldWithPath("hgncStatus").description("The status of the human gene in the HGNC database."),
                                fieldWithPath("hgncSymbol").description("The official symbol of the human gene as designated by HGNC."),
                                fieldWithPath("hgncUcscAccId").description("UCSC Genome Browser accession ID for the human gene."),
                                fieldWithPath("hgncUniprotAccIds").description("UniProt accession IDs for the protein products of the human gene."),
                                fieldWithPath("hgncVegaAccId").description("VEGA database ID for the human gene."),
                                fieldWithPath("hgsSynonyms").description("List of synonyms for the human gene symbol."),
                                fieldWithPath("id").description("The primary identifier for the essential gene entry."),
                                fieldWithPath("idgFamily").description("The Integrative Genomics Viewer (IDG) family the gene belongs to."),
                                fieldWithPath("idgHumanGeneId").description("The human gene ID according to IDG."),
                                fieldWithPath("idgId").description("The IDG unique identifier for the gene."),
                                fieldWithPath("mgEnsemblChromosome").description("The chromosome number from the Ensembl database for the mouse gene."),
                                fieldWithPath("mgEnsemblGeneAccId").description("Ensembl gene accession ID for the mouse gene."),
                                fieldWithPath("mgEnsemblStart").description("Start position of the mouse gene in the Ensembl database."),
                                fieldWithPath("mgEnsemblStop").description("Stop position of the mouse gene in the Ensembl database."),
                                fieldWithPath("mgEnsemblStrand").description("Strand orientation of the mouse gene in the Ensembl database."),
                                fieldWithPath("mgEntrezGeneAccId").description("Entrez gene accession ID for the mouse gene."),
                                fieldWithPath("mgGenomeBuild").description("The genome build used for the mouse gene."),
                                fieldWithPath("mgId").description("Unique identifier for the mouse gene entry."),
                                fieldWithPath("mgMgiChromosome").description("MGI chromosome number for the mouse gene."),
                                fieldWithPath("mgMgiCm").description("Centimorgan position on the MGI database for the mouse gene."),
                                fieldWithPath("mgMgiGeneAccId").description("MGI gene accession ID for the mouse gene."),
                                fieldWithPath("mgMgiStart").description("Start position of the mouse gene in the MGI database."),
                                fieldWithPath("mgMgiStop").description("Stop position of the mouse gene in the MGI database."),
                                fieldWithPath("mgMgiStrand").description("Strand orientation of the mouse gene in the MGI database."),
                                fieldWithPath("mgName").description("Name of the mouse gene."),
                                fieldWithPath("mgNcbiChromosome").description("NCBI chromosome location for the mouse gene."),
                                fieldWithPath("mgNcbiStart").description("NCBI start position of the mouse gene."),
                                fieldWithPath("mgNcbiStop").description("NCBI stop position of the mouse gene."),
                                fieldWithPath("mgNcbiStrand").description("NCBI strand orientation of the mouse gene."),
                                fieldWithPath("mgSubtype").description("Subtype classification of the mouse gene."),
                                fieldWithPath("mgSymbol").description("Symbol representing the mouse gene."),
                                fieldWithPath("mgType").description("Type classification of the mouse gene."),
                                fieldWithPath("mgsSynonyms").description("List of synonyms for the mouse gene."),
                                fieldWithPath("ocategory").description("Orthology category for gene comparison."),
                                fieldWithPath("ohumanGeneId").description("Human gene ID used in ortholog comparison."),
                                fieldWithPath("oid").description("Unique identifier for the orthology data entry."),
                                fieldWithPath("oisMaxHumanToMouse").description("Indicates if this is the maximum score from human to mouse."),
                                fieldWithPath("oisMaxMouseToHuman").description("Indicates if this is the maximum score from mouse to human."),
                                fieldWithPath("omouseGeneId").description("Mouse gene ID used in ortholog comparison."),
                                fieldWithPath("osupport").description("Support level for the orthology assertion, indicating the strength of evidence."),
                                fieldWithPath("osupportCount").description("Numerical support count for the orthology assertion, quantifying the evidence."),
                                fieldWithPath("osupportRaw").description("Raw support data for the orthology assertion, providing detailed evidence."),
                                fieldWithPath("pharosChr").description("Pharos chromosome information for the human gene."),
                                fieldWithPath("pharosFamily").description("Pharos family classification of the human gene."),
                                fieldWithPath("pharosHumanGeneId").description("Human gene ID according to Pharos."),
                                fieldWithPath("pharosId").description("Unique identifier for the Pharos data entry."),
                                fieldWithPath("pharosName").description("Gene name as listed in Pharos."),
                                fieldWithPath("pharosSymbol").description("Gene symbol as listed in Pharos."),
                                fieldWithPath("pharosTdl").description("Target Development Level in Pharos, indicating the gene's research and development status."),
                                fieldWithPath("pharosUniprotAccId").description("UniProt accession ID as recorded in Pharos for the human gene.")
                                )
                        ));
    }
}