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
                                fieldWithPath("age_entrez_acc_id").description("The Entrez accession ID related to age studies."),
                                fieldWithPath("age_human_gene_id").description("The human gene ID associated with age studies."),
                                fieldWithPath("age_id").description("Unique identifier for the age-related study entry."),
                                fieldWithPath("age_mean_gene_effect").description("The mean gene effect observed in the age study."),
                                fieldWithPath("age_raw_data_id").description("Raw data identifier associated with age studies."),
                                fieldWithPath("cav_allele_accession_id").description("Allele accession ID in CAV repository."),
                                fieldWithPath("cav_allele_symbol").description("Symbol of the allele in the CAV repository."),
                                fieldWithPath("cav_category").description("Categories associated with the CAV allele."),
                                fieldWithPath("clin_date").description("Date associated with clinical data entry."),
                                fieldWithPath("clin_haploinsufficiency").description("Clinical haploinsufficiency score."),
                                fieldWithPath("clin_human_gene_id").description("Human gene ID related to clinical data."),
                                fieldWithPath("clin_id").description("Unique identifier for the clinical data entry."),
                                fieldWithPath("clin_report").description("Textual report associated with clinical data."),
                                fieldWithPath("clin_triplosensitivity").description("Clinical triplosensitivity score."),
                                fieldWithPath("f_bin").description("Functional binning data."),
                                fieldWithPath("f_bin_code").description("Code representing a functional bin."),
                                fieldWithPath("f_id").description("Unique identifier for functional data entry."),
                                fieldWithPath("f_ortholog_id").description("Ortholog ID associated with functional data."),
                                fieldWithPath("gnp_brain_expression").description("Genomic data pertaining to brain expression."),
                                fieldWithPath("gnp_cds_length").description("Length of the coding sequence in genomic data."),
                                fieldWithPath("gnp_chromosome").description("Chromosome location in genomic data."),
                                fieldWithPath("gnp_classic_caf").description("General Combined Annotation Dependent Depletion score for all populations."),
                                fieldWithPath("gnp_classic_caf_afr").description("CADD score for African population."),
                                fieldWithPath("gnp_classic_caf_amr").description("CADD score for American population."),
                                fieldWithPath("gnp_classic_caf_asj").description("CADD score for Ashkenazi Jewish population."),
                                fieldWithPath("gnp_classic_caf_eas").description("CADD score for East Asian population."),
                                fieldWithPath("gnp_classic_caf_fin").description("CADD score for Finnish population."),
                                fieldWithPath("gnp_classic_caf_nfe").description("CADD score for Non-Finnish European population."),
                                fieldWithPath("gnp_classic_caf_oth").description("CADD score for Other populations."),
                                fieldWithPath("gnp_classic_caf_sas").description("CADD score for South Asian population."),
                                fieldWithPath("gnp_constraint_flag").description("Flag indicating genomic constraint."),
                                fieldWithPath("gnp_defined").description("Indicator if genomic data is defined."),
                                fieldWithPath("gnp_end_position").description("End position of the gene in the genome."),
                                fieldWithPath("gnp_exac_exp_lof").description("Expected loss of function based on ExAC database."),
                                fieldWithPath("gnp_exac_obs_lof").description("Observed loss of function based on ExAC database."),
                                fieldWithPath("gnp_exac_oe_lof").description("Observed/Expected loss of function ratio based on ExAC database."),
                                fieldWithPath("gnp_exac_pli").description("Probability of being loss-of-function intolerant (pLI) based on ExAC database."),
                                fieldWithPath("gnp_exp_hom_lof").description("Expected homozygous loss of function."),
                                fieldWithPath("gnp_exp_lof").description("Expected loss of function."),
                                fieldWithPath("gnp_exp_mis").description("Expected missense mutation."),
                                fieldWithPath("gnp_exp_mis_pphen").description("Expected missense mutation with probably damaging phenotype."),
                                fieldWithPath("gnp_exp_syn").description("Expected synonymous mutation."),
                                fieldWithPath("gnp_gene_id").description("Gene ID in the Genomics England PanelApp."),
                                fieldWithPath("gnp_gene_length").description("Length of the gene in the genome."),
                                fieldWithPath("gnp_gene_symbol").description("Symbol of the gene in the genomic data."),
                                fieldWithPath("gnp_gene_type").description("Type of the gene in genomic data."),
                                fieldWithPath("gnp_human_gene_id").description("Human gene ID associated with the genomic data."),
                                fieldWithPath("gnp_id").description("Unique identifier for the genomic data entry."),
                                fieldWithPath("gnp_lof_z").description("Z-score for the loss of function (LoF) variant."),
                                fieldWithPath("gnp_max_af").description("Maximum allele frequency across all populations."),
                                fieldWithPath("gnp_mis_z").description("Z-score for missense variants."),
                                fieldWithPath("gnp_mu_lof").description("Mutation rate for loss of function."),
                                fieldWithPath("gnp_mu_mis").description("Mutation rate for missense variants."),
                                fieldWithPath("gnp_mu_syn").description("Mutation rate for synonymous variants."),
                                fieldWithPath("gnp_n_sites").description("Number of sites evaluated."),
                                fieldWithPath("gnp_no_lofs").description("Number of observed loss-of-function variants."),
                                fieldWithPath("gnp_num_coding_exons").description("Number of coding exons."),
                                fieldWithPath("gnp_obs_het_lof").description("Observed heterozygous loss of function variants."),
                                fieldWithPath("gnp_obs_hom_lof").description("Observed homozygous loss of function variants."),
                                fieldWithPath("gnp_obs_lof").description("Total observed loss of function variants."),
                                fieldWithPath("gnp_obs_mis").description("Observed missense variants."),
                                fieldWithPath("gnp_obs_mis_pphen").description("Observed missense variants predicted to be probably damaging."),
                                fieldWithPath("gnp_obs_syn").description("Observed synonymous variants."),
                                fieldWithPath("gnp_oe_lof").description("Observed/Expected ratio for loss of function variants."),
                                fieldWithPath("gnp_oe_lof_lower").description("Lower bound of the 95% confidence interval for the O/E ratio for LoF variants."),
                                fieldWithPath("gnp_oe_lof_upper").description("Upper bound of the 95% confidence interval for the O/E ratio for LoF variants."),
                                fieldWithPath("gnp_oe_lof_upper_bin").description("Bin value for the upper bound of O/E ratio for LoF variants."),
                                fieldWithPath("gnp_oe_lof_upper_bin6").description("Bin value for the upper bound of O/E ratio for LoF variants, using a different binning strategy."),
                                fieldWithPath("gnp_oe_lof_upper_rank").description("Rank of the gene based on the upper bound of O/E ratio for LoF variants."),
                                fieldWithPath("gnp_oe_mis").description("Observed/Expected ratio for missense variants."),
                                fieldWithPath("gnp_oe_mis_lower").description("Lower bound of the 95% confidence interval for the O/E ratio for missense variants."),
                                fieldWithPath("gnp_oe_mis_pphen").description("Observed/Expected ratio for probably damaging missense variants."),
                                fieldWithPath("gnp_oe_mis_upper").description("Upper bound of the 95% confidence interval for the O/E ratio for missense variants."),
                                fieldWithPath("gnp_oe_syn").description("Observed/Expected ratio for synonymous variants."),
                                fieldWithPath("gnp_oe_syn_lower").description("Lower bound of the 95% confidence interval for the O/E ratio for synonymous variants."),
                                fieldWithPath("gnp_oe_syn_upper").description("Upper bound of the 95% confidence interval for the O/E ratio for synonymous variants."),
                                fieldWithPath("gnp_p").description("P-value for statistical tests."),
                                fieldWithPath("gnp_p_afr").description("P-value for the African population."),
                                fieldWithPath("gnp_p_amr").description("P-value for the American population."),
                                fieldWithPath("gnp_p_asj").description("P-value for the Ashkenazi Jewish population."),
                                fieldWithPath("gnp_p_eas").description("P-value for the East Asian population."),
                                fieldWithPath("gnp_p_fin").description("P-value for the Finnish population."),
                                fieldWithPath("gnp_p_nfe").description("P-value for the Non-Finnish European population."),
                                fieldWithPath("gnp_p_oth").description("P-value for other populations."),
                                fieldWithPath("gnp_p_sas").description("P-value for the South Asian population."),
                                fieldWithPath("gnp_pli").description("pLI score indicating the probability of being loss-of-function intolerant."),
                                fieldWithPath("gnp_pnull").description("Probability of being functionally neutral."),
                                fieldWithPath("gnp_possible_lof").description("Possible loss-of-function variants."),
                                fieldWithPath("gnp_possible_mis").description("Possible missense variants."),
                                fieldWithPath("gnp_possible_mis_pphen").description("Possible probably damaging missense variants."),
                                fieldWithPath("gnp_possible_syn").description("Possible synonymous variants."),
                                fieldWithPath("gnp_prec").description("Precision of the genomic data."),
                                fieldWithPath("gnp_start_position").description("Start position of the gene in the genome."),
                                fieldWithPath("gnp_syn_z").description("Z-score for the synonymous variants."),
                                fieldWithPath("gnp_transcript").description("Transcript ID associated with the genomic data."),
                                fieldWithPath("gnp_transcript_level").description("Level of the transcript associated with the genomic data."),
                                fieldWithPath("gnp_transcript_type").description("Type of transcript recorded in the genomic data."),
                                fieldWithPath("hg_ensembl_gene_acc_id").description("Ensembl gene accession ID for the human gene."),
                                fieldWithPath("hg_entrez_gene_acc_id").description("Entrez gene accession ID for the human gene."),
                                fieldWithPath("hg_hgnc_acc_id").description("HGNC accession ID for the human gene."),
                                fieldWithPath("hg_id").description("Unique identifier for the human gene entry."),
                                fieldWithPath("hg_name").description("Name of the human gene."),
                                fieldWithPath("hg_symbol").description("Symbol representing the human gene."),
                                fieldWithPath("hgnc_agr_acc_id").description("Agronomy accession ID related to the human gene."),
                                fieldWithPath("hgnc_alias_name").description("Alias name(s) for the human gene."),
                                fieldWithPath("hgnc_alias_symbol").description("Alias symbol(s) for the human gene."),
                                fieldWithPath("hgnc_bioparadigms_slc").description("Bioparadigms SLC code for the human gene."),
                                fieldWithPath("hgnc_ccds_acc_id").description("CCDS accession ID for the human gene."),
                                fieldWithPath("hgnc_cd").description("CD marker for the human gene."),
                                fieldWithPath("hgnc_cosmic").description("COSMIC ID for the human gene."),
                                fieldWithPath("hgnc_date_approved_reserved").description("Date the gene was approved or reserved in HGNC."),
                                fieldWithPath("hgnc_date_modified").description("Date the gene information was last modified in HGNC."),
                                fieldWithPath("hgnc_date_name_changed").description("Date the gene name was changed in HGNC."),
                                fieldWithPath("hgnc_date_symbol_changed").description("Date the gene symbol was changed in HGNC."),
                                fieldWithPath("hgnc_ena").description("European Nucleotide Archive ID for the human gene."),
                                fieldWithPath("hgnc_ensembl_gene_acc_id").description("Ensembl gene accession ID associated with the HGNC entry."),
                                fieldWithPath("hgnc_entrez_acc_id").description("Entrez accession ID associated with the HGNC entry."),
                                fieldWithPath("hgnc_enzyme_acc_id").description("Enzyme accession ID associated with the human gene."),
                                fieldWithPath("hgnc_gencc").description("GenCC ID for the human gene."),
                                fieldWithPath("hgnc_gene_group").description("Gene group classification in HGNC."),
                                fieldWithPath("hgnc_gene_group_acc_id").description("Gene group accession ID in HGNC."),
                                fieldWithPath("hgnc_gtrnadb").description("tRNA database ID for the human gene."),
                                fieldWithPath("hgnc_hgnc_acc_id").description("HGNC accession ID for the human gene."),
                                fieldWithPath("hgnc_homeodb").description("Homeobox database ID for the human gene."),
                                fieldWithPath("hgnc_horde_acc_id").description("Horde ID for the human gene (related to olfactory receptors)."),
                                fieldWithPath("hgnc_human_gene_id").description("Human gene ID associated with HGNC."),
                                fieldWithPath("hgnc_id").description("Unique identifier for the HGNC entry."),
                                fieldWithPath("hgnc_imgt").description("Immunogenetics (IMGT) ID for the human gene."),
                                fieldWithPath("hgnc_intermediate_filament_db").description("Intermediate filament database ID for the human gene."),
                                fieldWithPath("hgnc_iuphar").description("International Union of Pharmacology (IUPHAR) ID for the human gene."),
                                fieldWithPath("hgnc_kznf_gene_catalog").description("KZNF gene catalog ID for the human gene."),
                                fieldWithPath("hgnc_lncipedia").description("Lncipedia ID for the human gene."),
                                fieldWithPath("hgnc_lncrnadb").description("lncRNA database ID for the human gene."),
                                fieldWithPath("hgnc_location").description("Chromosomal location of the human gene."),
                                fieldWithPath("hgnc_location_sortable").description("Sortable format of the chromosomal location of the human gene."),
                                fieldWithPath("hgnc_locus_group").description("Locus group classification of the human gene."),
                                fieldWithPath("hgnc_locus_type").description("Locus type classification of the human gene."),
                                fieldWithPath("hgnc_lsdb").description("Locus-specific database ID for the human gene."),
                                fieldWithPath("hgnc_mamit_trnadb").description("Mamit-tRNA database ID for the human gene."),
                                fieldWithPath("hgnc_mane_select").description("MANE Select ID for the human gene."),
                                fieldWithPath("hgnc_merops").description("MEROPS database ID for the human gene related to proteases."),
                                fieldWithPath("hgnc_mgi_gene_acc_id").description("MGI gene accession ID for the mouse ortholog of the human gene."),
                                fieldWithPath("hgnc_mirbase").description("miRBase ID for the human gene."),
                                fieldWithPath("hgnc_name").description("Official name of the human gene."),
                                fieldWithPath("hgnc_omim_acc_id").description("OMIM accession ID for the human gene, linking to the Online Mendelian Inheritance in Man database."),
                                fieldWithPath("hgnc_orphanet").description("Orphanet ID for the human gene, relevant for rare diseases."),
                                fieldWithPath("hgnc_prev_name").description("Previous name(s) of the human gene."),
                                fieldWithPath("hgnc_prev_symbol").description("Previous symbol(s) of the human gene."),
                                fieldWithPath("hgnc_pseudogene_org").description("Pseudogene.org identifier for the human gene if applicable."),
                                fieldWithPath("hgnc_pubmed_acc_id").description("PubMed accession ID(s) associated with the human gene."),
                                fieldWithPath("hgnc_refseq_accession").description("RefSeq accession number for the human gene."),
                                fieldWithPath("hgnc_rgd_acc_id").description("Rat Genome Database (RGD) ID for the rat ortholog of the human gene."),
                                fieldWithPath("hgnc_rna_central_acc_ids").description("RNAcentral IDs for the human gene, representing non-coding RNA sequences."),
                                fieldWithPath("hgnc_snornabase").description("snoRNABase ID for the human gene if it encodes a small nucleolar RNA (snoRNA)."),
                                fieldWithPath("hgnc_status").description("The status of the human gene in the HGNC database."),
                                fieldWithPath("hgnc_symbol").description("The official symbol of the human gene as designated by HGNC."),
                                fieldWithPath("hgnc_ucsc_acc_id").description("UCSC Genome Browser accession ID for the human gene."),
                                fieldWithPath("hgnc_uniprot_acc_ids").description("UniProt accession IDs for the protein products of the human gene."),
                                fieldWithPath("hgnc_vega_acc_id").description("VEGA database ID for the human gene."),
                                fieldWithPath("hgs_synonyms").description("List of synonyms for the human gene symbol."),
                                fieldWithPath("id").description("The primary identifier for the essential gene entry."),
                                fieldWithPath("idg_family").description("The Integrative Genomics Viewer (IDG) family the gene belongs to."),
                                fieldWithPath("idg_human_gene_id").description("The human gene ID according to IDG."),
                                fieldWithPath("idg_id").description("The IDG unique identifier for the gene."),
                                fieldWithPath("mg_ensembl_chromosome").description("The chromosome number from the Ensembl database for the mouse gene."),
                                fieldWithPath("mg_ensembl_gene_acc_id").description("Ensembl gene accession ID for the mouse gene."),
                                fieldWithPath("mg_ensembl_start").description("Start position of the mouse gene in the Ensembl database."),
                                fieldWithPath("mg_ensembl_stop").description("Stop position of the mouse gene in the Ensembl database."),
                                fieldWithPath("mg_ensembl_strand").description("Strand orientation of the mouse gene in the Ensembl database."),
                                fieldWithPath("mg_entrez_gene_acc_id").description("Entrez gene accession ID for the mouse gene."),
                                fieldWithPath("mg_genome_build").description("The genome build used for the mouse gene."),
                                fieldWithPath("mg_id").description("Unique identifier for the mouse gene entry."),
                                fieldWithPath("mg_mgi_chromosome").description("MGI chromosome number for the mouse gene."),
                                fieldWithPath("mg_mgi_cm").description("Centimorgan position on the MGI database for the mouse gene."),
                                fieldWithPath("mg_mgi_gene_acc_id").description("MGI gene accession ID for the mouse gene."),
                                fieldWithPath("mg_mgi_start").description("Start position of the mouse gene in the MGI database."),
                                fieldWithPath("mg_mgi_stop").description("Stop position of the mouse gene in the MGI database."),
                                fieldWithPath("mg_mgi_strand").description("Strand orientation of the mouse gene in the MGI database."),
                                fieldWithPath("mg_name").description("Name of the mouse gene."),
                                fieldWithPath("mg_ncbi_chromosome").description("NCBI chromosome location for the mouse gene."),
                                fieldWithPath("mg_ncbi_start").description("NCBI start position of the mouse gene."),
                                fieldWithPath("mg_ncbi_stop").description("NCBI stop position of the mouse gene."),
                                fieldWithPath("mg_ncbi_strand").description("NCBI strand orientation of the mouse gene."),
                                fieldWithPath("mg_subtype").description("Subtype classification of the mouse gene."),
                                fieldWithPath("mg_symbol").description("Symbol representing the mouse gene."),
                                fieldWithPath("mg_type").description("Type classification of the mouse gene."),
                                fieldWithPath("mgs_synonyms").description("List of synonyms for the mouse gene."),
                                fieldWithPath("o_category").description("Orthology category for gene comparison."),
                                fieldWithPath("o_human_gene_id").description("Human gene ID used in ortholog comparison."),
                                fieldWithPath("o_id").description("Unique identifier for the orthology data entry."),
                                fieldWithPath("o_is_max_human_to_mouse").description("Indicates if this is the maximum score from human to mouse."),
                                fieldWithPath("o_is_max_mouse_to_human").description("Indicates if this is the maximum score from mouse to human."),
                                fieldWithPath("o_mouse_gene_id").description("Mouse gene ID used in ortholog comparison."),
                                fieldWithPath("o_support").description("Support level for the orthology assertion, indicating the strength of evidence."),
                                fieldWithPath("o_support_count").description("Numerical support count for the orthology assertion, quantifying the evidence."),
                                fieldWithPath("o_support_raw").description("Raw support data for the orthology assertion, providing detailed evidence."),
                                fieldWithPath("pharos_chr").description("Pharos chromosome information for the human gene."),
                                fieldWithPath("pharos_family").description("Pharos family classification of the human gene."),
                                fieldWithPath("pharos_human_gene_id").description("Human gene ID according to Pharos."),
                                fieldWithPath("pharos_id").description("Unique identifier for the Pharos data entry."),
                                fieldWithPath("pharos_name").description("Gene name as listed in Pharos."),
                                fieldWithPath("pharos_symbol").description("Gene symbol as listed in Pharos."),
                                fieldWithPath("pharos_tdl").description("Target Development Level in Pharos, indicating the gene's research and development status."),
                                fieldWithPath("pharos_uniprot_acc_id").description("UniProt accession ID as recorded in Pharos for the human gene.")
                        )
                ));
    }
}