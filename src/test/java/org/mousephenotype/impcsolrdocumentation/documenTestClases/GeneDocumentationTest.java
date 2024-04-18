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
                                fieldWithPath("allele_accession_id").description("List of accession IDs for alleles."),
                                fieldWithPath("allele_name").description("List of names for alleles."),
                                fieldWithPath("alt_mp_id").description("List of alternative Mouse Phenotype (MP) IDs."),
                                fieldWithPath("annotated_higher_level_ma_term_name").description("List of annotated higher level Mouse Anatomy (MA) term names."),
                                fieldWithPath("annotated_higher_level_mp_term_name").description("List of annotated higher level Mouse Phenotype (MP) term names."),
                                fieldWithPath("assignment_status").description("The assignment status."),
                                fieldWithPath("ccds_id").description("List of Consensus CDS (CCDS) IDs."),
                                fieldWithPath("child_ma_id").description("List of child Mouse Anatomy (MA) IDs."),
                                fieldWithPath("child_ma_term").description("List of child Mouse Anatomy (MA) terms."),
                                fieldWithPath("child_ma_term_synonym").description("List of synonyms for child MA terms."),
                                fieldWithPath("child_mp_id").description("List of child Mouse Phenotype (MP) IDs."),
                                fieldWithPath("child_mp_term").description("List of child MP terms."),
                                fieldWithPath("child_mp_term_synonym").description("List of synonyms for child MP terms."),
                                fieldWithPath("chr_end").description("Chromosome end position."),
                                fieldWithPath("chr_name").description("Name of the chromosome."),
                                fieldWithPath("chr_start").description("Chromosome start position."),
                                fieldWithPath("chr_strand").description("Chromosome strand."),
                                fieldWithPath("clan_acc").description("List of clan accession numbers."),
                                fieldWithPath("clan_desc").description("List of clan descriptions."),
                                fieldWithPath("clan_id").description("List of clan IDs."),
                                fieldWithPath("conditional_allele_production_status").description("Production status of the conditional allele."),
                                fieldWithPath("crispr_allele_production_status").description("Production status of the CRISPR allele."),
                                fieldWithPath("data_type").description("The type of data."),
                                fieldWithPath("datasets_raw_data").description("Raw data from datasets."),
                                fieldWithPath("disease_alts").description("List of alternative disease names."),
                                fieldWithPath("disease_classes").description("List of disease classes."),
                                fieldWithPath("disease_human_phenotypes").description("Human phenotypes related to the disease."),
                                fieldWithPath("disease_id").description("List of disease IDs."),
                                fieldWithPath("disease_source").description("List of sources for disease data."),
                                fieldWithPath("disease_term").description("List of disease terms."),
                                fieldWithPath("dmdd_image_data_available").description("Indicates if DMDD image data is available."),
                                fieldWithPath("dmdd_lethal_data_available").description("Indicates if DMDD lethal data is available."),
                                fieldWithPath("embryo_analysis_view_name").description("Name of the embryo analysis view."),
                                fieldWithPath("embryo_analysis_view_url").description("URL for the embryo analysis view."),
                                fieldWithPath("embryo_data_available").description("Indicates if embryo data is available."),
                                fieldWithPath("embryo_modalities").description("List of modalities for embryo analysis."),
                                fieldWithPath("ensembl_gene_id").description("List of Ensembl gene IDs."),
                                fieldWithPath("es_cell_production_status").description("Production status of the ES cell."),
                                fieldWithPath("evid_code_rank").description("Evidence code rank."),
                                fieldWithPath("exp_name").description("List of experiment names."),
                                fieldWithPath("go_count").description("Count of Gene Ontology (GO) terms associated."),
                                fieldWithPath("go_term_def").description("List of GO term definitions."),
                                fieldWithPath("go_term_domain").description("List of domains for GO terms."),
                                fieldWithPath("go_term_evid").description("List of evidence for GO terms."),
                                fieldWithPath("go_term_id").description("List of GO term IDs."),
                                fieldWithPath("go_term_name").description("List of GO term names."),
                                fieldWithPath("go_uniprot").description("List of UniProt IDs associated with GO terms."),
                                fieldWithPath("has_qc").description("Indicates if quality control (QC) has been performed."),
                                fieldWithPath("hp_id").description("List of Human Phenotype Ontology (HPO) IDs."),
                                fieldWithPath("hp_term").description("List of HPO terms."),
                                fieldWithPath("human_curated").description("Indicates if the gene has been curated by human experts."),
                                fieldWithPath("human_gene_symbol").description("List of human gene symbols associated with the gene."),
                                fieldWithPath("human_symbol_synonym").description("List of human gene Synonym associated with the gene."),
                                fieldWithPath("impc_novel_predicted_in_locus").description("Indicates if novel IMPC predictions exist within the gene locus."),
                                fieldWithPath("impc_predicted").description("Indicates if there are IMPC predictions for the gene."),
                                fieldWithPath("impc_predicted_in_locus").description("Specific locus for the IMPC predicted gene."),
                                fieldWithPath("impc_predicted_known_gene").description("Indicates if known genes are predicted by IMPC within the locus."),
                                fieldWithPath("inferred_child_ma_id").description("List of inferred child Mouse Anatomy (MA) IDs."),
                                fieldWithPath("inferred_child_ma_term").description("List of inferred child MA terms."),
                                fieldWithPath("inferred_child_ma_term_synonym").description("List of synonyms for the inferred child MA terms."),
                                fieldWithPath("inferred_ma_id").description("List of inferred Mouse Anatomy (MA) IDs."),
                                fieldWithPath("inferred_ma_term").description("List of inferred MA terms."),
                                fieldWithPath("inferred_ma_term_synonym").description("List of synonyms for the inferred MA terms."),
                                fieldWithPath("inferred_selected_top_level_ma_id").description("List of IDs for the inferred selected top-level MA terms."),
                                fieldWithPath("inferred_selected_top_level_ma_term").description("List of inferred selected top-level MA terms."),
                                fieldWithPath("inferred_selected_top_level_ma_term_synonym").description("List of synonyms for the inferred selected top-level MA terms."),
                                fieldWithPath("intermediate_mp_id").description("List of intermediate Mouse Phenotype (MP) IDs."),
                                fieldWithPath("intermediate_mp_term").description("List of intermediate MP terms."),
                                fieldWithPath("intermediate_mp_term_synonym").description("List of synonyms for the intermediate MP terms."),
                                fieldWithPath("is_idg_gene").description("Indicates if the gene is part of the IDG (Illuminating the Druggable Genome) project."),
                                fieldWithPath("is_umass_gene").description("Indicates if the gene is associated with the University of Massachusetts."),
                                fieldWithPath("ma_id").description("List of Mouse Anatomy (MA) IDs."),
                                fieldWithPath("ma_term").description("List of MA terms."),
                                fieldWithPath("ma_term_definition").description("List of definitions for the MA terms."),
                                fieldWithPath("ma_term_synonym").description("List of synonyms for the MA terms."),
                                fieldWithPath("marker_name").description("General name of the marker."),
                                fieldWithPath("marker_symbol").description("Symbol representing the marker."),
                                fieldWithPath("marker_synonym").description("List of synonyms for the marker."),
                                fieldWithPath("marker_type").description("Type of marker."),
                                fieldWithPath("mgi_accession_id").description("MGI (Mouse Genome Informatics) accession ID for the gene."),
                                fieldWithPath("mgi_novel_predicted_in_locus").description("Indicates if novel MGI predictions exist within the gene locus."),
                                fieldWithPath("mgi_predicted").description("Indicates if there are MGI predictions for the gene."),
                                fieldWithPath("mgi_predicted_in_locus").description("Specific locus for the MGI predicted gene."),
                                fieldWithPath("mgi_predicted_known_gene").description("Indicates if known genes are predicted by MGI within the locus."),
                                fieldWithPath("mouse_curated").description("Indicates if the gene has been curated by mouse experts."),
                                fieldWithPath("mouse_production_status").description("The production status of the mouse model for the gene."),
                                fieldWithPath("mp_id").description("List of Mouse Phenotype (MP) IDs."),
                                fieldWithPath("mp_term").description("List of MP terms."),
                                fieldWithPath("mp_term_definition").description("List of definitions for the MP terms."),
                                fieldWithPath("mp_term_synonym").description("List of synonyms for the MP terms."),
                                fieldWithPath("ncbi_id").description("List of NCBI IDs associated with the gene."),
                                fieldWithPath("not_significant_top_level_mp_terms").description("List of top-level MP terms not deemed significant."),
                                fieldWithPath("null_allele_production_status").description("Production status for null alleles."),
                                fieldWithPath("p_value").description("List of p-values associated with statistical tests."),
                                fieldWithPath("parameter_name").description("List of names for parameters used in experiments."),
                                fieldWithPath("parameter_stable_id").description("List of stable IDs for the experimental parameters."),
                                fieldWithPath("pfama_acc").description("List of Pfam A accession numbers."),
                                fieldWithPath("pfama_go_cat").description("GO categories associated with Pfam A entries."),
                                fieldWithPath("pfama_go_id").description("GO IDs associated with Pfam A entries."),
                                fieldWithPath("pfama_go_term").description("GO terms associated with Pfam A entries."),
                                fieldWithPath("pfama_id").description("List of Pfam A IDs."),
                                fieldWithPath("pfama_json").description("JSON data related to Pfam A entries."),
                                fieldWithPath("phenotype_status").description("Status of the phenotyping effort for the gene."),
                                fieldWithPath("phenotyping_centre").description("List of centres where phenotyping has been conducted."),
                                fieldWithPath("phenotyping_data_available").description("Indicates if phenotyping data is available for the gene."),
                                fieldWithPath("pipeline_name").description("List of names for pipelines used in data generation."),
                                fieldWithPath("pipeline_stable_id").description("List of stable IDs for the pipelines."),
                                fieldWithPath("proc_param_name").description("List of names for procedure parameters."),
                                fieldWithPath("proc_param_stable_id").description("List of stable IDs for the procedure parameters."),
                                fieldWithPath("procedure_name").description("List of names for procedures."),
                                fieldWithPath("procedure_stable_id").description("List of stable IDs for the procedures."),
                                fieldWithPath("production_centre").description("List of centres responsible for producing the models."),
                                fieldWithPath("scdb_id").description("List of IDs from the Sanger Cancer Database."),
                                fieldWithPath("scdb_link").description("List of links to the Sanger Cancer Database."),
                                fieldWithPath("selected_top_level_ma_id").description("List of selected top-level Mouse Anatomy (MA) IDs."),
                                fieldWithPath("selected_top_level_ma_term").description("List of selected top-level MA terms."),
                                fieldWithPath("selected_top_level_ma_term_id").description("ID of the selected top-level MA term."),
                                fieldWithPath("selected_top_level_ma_term_synonym").description("List of synonyms for the selected top-level MA terms."),
                                fieldWithPath("seq_region_end").description("End position on the sequence region."),
                                fieldWithPath("seq_region_id").description("ID of the sequence region."),
                                fieldWithPath("seq_region_start").description("Start position on the sequence region."),
                                fieldWithPath("significant_top_level_mp_terms").description("List of significant top-level MP terms."),
                                fieldWithPath("subtype").description("List of subtypes associated with the gene."),
                                fieldWithPath("top_level_mp_definition").description("Definition of the top-level MP term."),
                                fieldWithPath("top_level_mp_id").description("List of top-level MP IDs."),
                                fieldWithPath("top_level_mp_term").description("List of top-level MP terms."),
                                fieldWithPath("top_level_mp_term_synonym").description("List of synonyms for the top-level MP terms."),
                                fieldWithPath("type").description("The type of document or data."),
                                fieldWithPath("vega_id").description("List of VEGA IDs associated with the gene."),
                                fieldWithPath("xref").description("List of cross-references for the gene.")
                        )


                ));
    }
}