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
                                fieldWithPath("mgi_accession_id").description("The Mouse Genome Informatics (MGI) accession ID uniquely identifying the gene."),
                                fieldWithPath("data_type").description("The type of data, indicating the nature of the information (e.g., 'gene', 'allele')."),
                                fieldWithPath("marker_type").description("The type of genetic marker, such as 'protein coding gene', 'non-coding RNA'."),
                                fieldWithPath("marker_symbol").description("The official symbol of the genetic marker."),
                                fieldWithPath("marker_synonym").description("A list of alternative names or symbols for the genetic marker."),
                                fieldWithPath("marker_name").description("The full name of the genetic marker."),
                                fieldWithPath("human_gene_symbol").description("A list of human gene symbols that are orthologous to the mouse gene."),
                                fieldWithPath("ensembl_gene_id").description("A list of Ensembl gene IDs associated with the marker."),
                                fieldWithPath("imits_phenotype_started").description("Indicates whether phenotyping has started for the marker ('true' or 'false')."),
                                fieldWithPath("imits_phenotype_complete").description("Indicates whether phenotyping has been completed for the marker ('true' or 'false')."),
                                fieldWithPath("imits_phenotype_status").description("The current status of the phenotyping effort."),
                                fieldWithPath("status").description("The current status of the gene or allele."),
                                fieldWithPath("latest_production_status").description("The most recent production status of the gene or allele."),
                                fieldWithPath("gene_latest_es_cell_status").description("The latest status of ES cell production for the gene."),
                                fieldWithPath("latest_es_cell_status").description("The latest status of ES cell production."),
                                fieldWithPath("gene_latest_mouse_status").description("The latest status of mouse production for the gene."),
                                fieldWithPath("latest_mouse_status").description("The latest status of mouse production."),
                                fieldWithPath("legacy_phenotype_status").description("A status indicating the legacy phenotype information."),
                                fieldWithPath("latest_phenotype_status").description("The most recent phenotype status."),
                                fieldWithPath("latest_project_status").description("The most recent status of the project involving the gene or allele."),
                                fieldWithPath("latest_production_centre").description("A list of centers where the latest production occurred."),
                                fieldWithPath("latest_phenotyping_centre").description("A list of centers where the latest phenotyping occurred."),
                                fieldWithPath("chr_name").description("The name of the chromosome where the marker is located."),
                                fieldWithPath("chr_start").description("The start position of the marker on the chromosome."),
                                fieldWithPath("chr_end").description("The end position of the marker on the chromosome."),
                                fieldWithPath("chr_strand").description("The strand of the chromosome where the marker is located ('+' or '-')."),
                                fieldWithPath("allele_name").description("A list of names for alleles associated with the gene."),
                                fieldWithPath("allele_accession_id").description("A list of accession IDs for alleles associated with the gene."),
                                fieldWithPath("es_cell_status").description("A list of statuses for ES cell production for the gene."),
                                fieldWithPath("imits_mouse_status").description("The IMPC status of mouse production."),
                                fieldWithPath("mouse_status").description("A list of statuses for mouse production."),
                                fieldWithPath("phenotype_status").description("A list of phenotype statuses for the gene or allele."),
                                fieldWithPath("production_centre").description("A list of centers involved in the production of the gene or allele."),
                                fieldWithPath("phenotyping_centre").description("A list of centers involved in the phenotyping of the gene or allele."),
                                fieldWithPath("go_term_id").description("A list of Gene Ontology (GO) term IDs associated with the gene."),
                                fieldWithPath("go_term_name").description("A list of names for the Gene Ontology (GO) terms associated with the gene."),
                                fieldWithPath("go_term_def").description("A list of definitions for the Gene Ontology (GO) terms associated with the gene."),
                                fieldWithPath("go_term_evid").description("A list of evidence codes for the Gene Ontology (GO) terms associated with the gene."),
                                fieldWithPath("go_term_domain").description("A list of domains (e.g., biological process, cellular component) for the GO terms associated with the gene."),
                                fieldWithPath("go_count").description("The count of Gene Ontology (GO) terms associated with the gene."),
                                fieldWithPath("go_uniprot").description("A list of UniProt identifiers linked to the GO terms."),
                                fieldWithPath("evid_code_rank").description("A ranking of the evidence code for the Gene Ontology (GO) terms, indicating the strength of the evidence."),
                                fieldWithPath("pfama_json").description("A JSON string or list of strings containing Pfam-A domain information."),
                                fieldWithPath("scdb_id").description("A list of secondary database IDs related to the gene, providing external references."),
                                fieldWithPath("scdb_link").description("A list of links to secondary databases that provide additional information about the gene."),
                                fieldWithPath("clan_id").description("A list of Pfam clan IDs associated with the gene, grouping similar protein families."),
                                fieldWithPath("clan_acc").description("A list of accession numbers for Pfam clans associated with the gene."),
                                fieldWithPath("clan_desc").description("A list of descriptions for the Pfam clans associated with the gene."),
                                fieldWithPath("pfama_id").description("A list of Pfam-A IDs associated with the gene, identifying protein families."),
                                fieldWithPath("pfama_acc").description("A list of accession numbers for Pfam-A families associated with the gene."),
                                fieldWithPath("pfama_go_id").description("A list of Gene Ontology (GO) IDs related to Pfam-A families."),
                                fieldWithPath("pfama_go_term").description("A list of Gene Ontology (GO) terms related to Pfam-A families."),
                                fieldWithPath("pfama_go_cat").description("A list of categories for the GO terms related to Pfam-A families."),
                                fieldWithPath("gf_acc").description("A unique accession ID for the gene family to which the gene belongs."),
                                fieldWithPath("allele_mgi_accession_id").description("The MGI accession ID specifically for the allele of the gene."),
                                fieldWithPath("imits_es_cell_status").description("A list of statuses regarding the production of ES cells for the allele."),
                                fieldWithPath("ikmc_project").description("The ID of the International Knockout Mouse Consortium project associated with the gene."),
                                fieldWithPath("gene_allele").description("The specific allele of the gene."),
                                fieldWithPath("disease_human_phenotypes").description("A list of human phenotypes associated with the gene."),
                                fieldWithPath("type").description("The type of entity described, such as 'gene', 'allele', or 'disease'."),
                                fieldWithPath("disease_id").description("A list of IDs for diseases associated with the gene."),
                                fieldWithPath("disease_source").description("A list of sources providing information about the diseases associated with the gene."),
                                fieldWithPath("disease_term").description("A list of disease terms or names associated with the gene."),
                                fieldWithPath("disease_alts").description("A list of alternative names or synonyms for the diseases associated with the gene."),
                                fieldWithPath("disease_classes").description("A list of classifications for the diseases associated with the gene."),
                                fieldWithPath("human_curated").description("Indicators of whether the disease association was curated by human experts."),
                                fieldWithPath("mouse_curated").description("Indicators of whether the disease association was curated based on mouse models."),
                                fieldWithPath("mgi_predicted").description("Indicators of whether the disease association is predicted by MGI."),
                                fieldWithPath("impc_predicted").description("Indicators of whether the disease association is predicted by IMPC."),
                                fieldWithPath("mgi_predicted_known_gene").description("Indicators of whether the known gene's disease association is predicted by MGI."),
                                fieldWithPath("impc_predicted_known_gene").description("Indicators of whether the known gene's disease association is predicted by IMPC."),
                                fieldWithPath("mgi_novel_predicted_in_locus").description("Indicators of whether there is a novel prediction in the locus by MGI."),
                                fieldWithPath("impc_novel_predicted_in_locus").description("Indicators of whether there is a novel prediction in the locus by IMPC."),
                                fieldWithPath("marker_symbol_bf").description("A list of marker symbols used for Bloom filter indexing."),
                                fieldWithPath("marker_symbol_lowercase").description("A list of marker symbols in lowercase for case-insensitive searches."),
                                fieldWithPath("marker_synonym_lowercase").description("A list of marker synonyms in lowercase for case-insensitive searches."),
                                fieldWithPath("text").description("A general text field used for full-text search across multiple fields."),
                                fieldWithPath("auto_suggest").description("A text field optimized for auto-suggestion functionality."))
                ));
    }
}