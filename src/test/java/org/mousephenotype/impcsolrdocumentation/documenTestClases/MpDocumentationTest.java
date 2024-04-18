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
                                fieldWithPath("auto_suggest[]").description("Suggestions for auto-complete features."),
                                fieldWithPath("mix_syn_qf[]").description("A mix of synonyms and quality factors for search optimization."),
                                fieldWithPath("search_term_json").description("JSON representation of search terms."),
                                fieldWithPath("children_json").description("JSON representation of child elements related to the document."),
                                fieldWithPath("scroll_node").description("An identifier for a scroll node, possibly used in UI elements."),
                                fieldWithPath("gene_variant_male_count").description("The count of male gene variants."),
                                fieldWithPath("gene_variant_female_count").description("The count of female gene variants."),
                                fieldWithPath("gene_variant_count").description("The total count of gene variants."),
                                fieldWithPath("mp_id").description("The unique identifier for the MP term."),
                                fieldWithPath("mp_term").description("The name of the MP term."),
                                fieldWithPath("mp_definition").description("The definition of the MP term."),
                                fieldWithPath("mp_term_synonym[]").description("A list of synonyms for the MP term."),
                                fieldWithPath("alt_mp_id[]").description("Alternative identifiers for MP terms."),
                                fieldWithPath("child_mp_id[]").description("Identifiers for child MP terms."),
                                fieldWithPath("child_mp_term[]").description("Names of child MP terms."),
                                fieldWithPath("parent_mp_id[]").description("Identifiers for parent MP terms."),
                                fieldWithPath("parent_mp_term[]").description("Names of parent MP terms."),
                                fieldWithPath("intermediate_mp_id[]").description("Identifiers for intermediate MP terms."),
                                fieldWithPath("intermediate_mp_term[]").description("Names of intermediate MP terms."),
                                fieldWithPath("top_level_mp_id[]").description("Identifiers for top-level MP terms."),
                                fieldWithPath("top_level_mp_term[]").description("Names of top-level MP terms."),
                                fieldWithPath("top_level_mp_term_synonym[]").description("Synonyms for top-level MP terms."),
                                fieldWithPath("top_level_mp_term_id[]").description("Unique identifiers for top-level MP terms."),
                                fieldWithPath("hp_id[]").description("A list of Human Phenotype Ontology (HPO) identifiers related to the gene."),
                                fieldWithPath("hp_term[]").description("Names of the human phenotypes associated with the HPO identifiers."),
                                fieldWithPath("hp_term_synonym[]").description("Synonyms for the HPO terms."),
                                fieldWithPath("data_type").description("The type of data contained in the document."),
                                fieldWithPath("inferred_ma_id[]").description("A list of inferred Mouse Anatomy (MA) term identifiers."),
                                fieldWithPath("inferred_ma_term[]").description("Names of the inferred MA terms."),
                                fieldWithPath("inferred_intermediate_ma_id[]").description("Identifiers for intermediate MA terms that are inferred."),
                                fieldWithPath("inferred_intermediate_ma_term[]").description("Names of the inferred intermediate MA terms."),
                                fieldWithPath("inferred_selected_top_level_ma_id[]").description("Identifiers for selected top-level MA terms that are inferred."),
                                fieldWithPath("inferred_selected_top_level_ma_term[]").description("Names of the inferred selected top-level MA terms."),
                                fieldWithPath("go_id[]").description("A list of Gene Ontology (GO) identifiers related to the gene."),
                                fieldWithPath("p_value").description("A list of p-values associated with the statistical analysis of the gene."),
                                fieldWithPath("mgi_accession_id[]").description("A list of Mouse Genome Informatics (MGI) accession identifiers."),
                                fieldWithPath("marker_symbol[]").description("Symbols representing the gene markers."),
                                fieldWithPath("marker_accession_id").description("The accession ID for the gene marker."),
                                fieldWithPath("pheno_calls").description("The number of phenotype calls made for the gene."),
                                fieldWithPath("preqc_gene_id[]").description("Pre-QC gene identifiers."),
                                fieldWithPath("marker_name[]").description("Full names of the gene markers."),
                                fieldWithPath("marker_synonym[]").description("Synonyms for the gene markers."),
                                fieldWithPath("marker_type[]").description("Types of gene markers."),
                                fieldWithPath("human_gene_symbol[]").description("Symbols for human genes that are orthologous to the mouse gene."),
                                fieldWithPath("status[]").description("Statuses related to the gene."),
                                fieldWithPath("imits_phenotype_started[]").description("Information on whether phenotyping has started for the gene, by center."),
                                fieldWithPath("imits_phenotype_complete[]").description("Information on whether phenotyping is complete for the gene, by center."),
                                fieldWithPath("imits_phenotype_status[]").description("The phenotyping status for the gene, by center."),
                                fieldWithPath("latest_production_centre[]").description("The latest centers to produce the gene."),
                                fieldWithPath("latest_phenotyping_centre[]").description("The latest centers to phenotype the gene."),
                                fieldWithPath("latest_phenotype_status[]").description("The latest phenotyping statuses for the gene."),
                                fieldWithPath("legacy_phenotype_status").description("Legacy phenotype status for the gene."),
                                fieldWithPath("allele_name[]").description("Names of alleles for the gene."),
                                fieldWithPath("embryo_data_available").description("Indicates if embryo data is available for the gene."),
                                fieldWithPath("type[]").description("Types of data or entities related to the gene."),
                                fieldWithPath("disease_id[]").description("Identifiers for diseases related to the gene."),
                                fieldWithPath("disease_source[]").description("Sources of the disease information."),
                                fieldWithPath("disease_term[]").description("Names of the diseases related to the gene."),
                                fieldWithPath("disease_alts[]").description("Alternative names or identifiers for the diseases."),
                                fieldWithPath("disease_classes[]").description("Classification of the diseases related to the gene."),
                                fieldWithPath("human_curated[]").description("Indicates if the disease-gene association was curated by humans."),
                                fieldWithPath("mouse_curated[]").description("Indicates if the disease-gene association was curated based on mouse models."),
                                fieldWithPath("mgi_predicted[]").description("Indicates if the disease-gene association is predicted by MGI."),
                                fieldWithPath("impc_predicted[]").description("Indicates if the disease-gene association is predicted by IMPC."),
                                fieldWithPath("mgi_predicted_known_gene[]").description("Indicates if the prediction by MGI involves known genes."),
                                fieldWithPath("impc_predicted_known_gene[]").description("Indicates if the prediction by IMPC involves known genes."),
                                fieldWithPath("mgi_novel_predicted_in_locus[]").description("Indicates if there are novel predictions by MGI within a specific locus."),
                                fieldWithPath("impc_novel_predicted_in_locus[]").description("Indicates if there are novel predictions by IMPC within a specific locus."),
                                fieldWithPath("annotation_term_id[]").description("A list of annotation term identifiers."),
                                fieldWithPath("annotation_term_name[]").description("Names corresponding to the annotation term identifiers."),
                                fieldWithPath("name[]").description("A list of names related to the entity."),
                                fieldWithPath("accession[]").description("A list of accession numbers related to the entity."),
                                fieldWithPath("exp_name[]").description("A list of experiment names related to the entity."),
                                fieldWithPath("large_thumbnail_file_path").description("File path for the large thumbnail image."),
                                fieldWithPath("small_thumbnail_file_path").description("File path for the small thumbnail image."),
                                fieldWithPath("symbol[]").description("A list of symbols related to the entity."),
                                fieldWithPath("sanger_symbol[]").description("A list of Sanger symbols related to the entity."),
                                fieldWithPath("gene_name[]").description("A list of gene names."),
                                fieldWithPath("subtype[]").description("A list of subtypes for the entity."),
                                fieldWithPath("gene_synonyms[]").description("A list of synonyms for the gene."),
                                fieldWithPath("exp_name_exp[]").description("A list of expanded experiment names related to the entity."),
                                fieldWithPath("symbol_gene[]").description("A list of gene symbols."),
                                fieldWithPath("top_level[]").description("A list indicating if the entity is at the top level."),
                                fieldWithPath("allele_symbol[]").description("A list of allele symbols."),
                                fieldWithPath("allele_id[]").description("A list of allele identifiers."),
                                fieldWithPath("strain_name[]").description("A list of strain names."),
                                fieldWithPath("strain_accession_id[]").description("A list of strain accession IDs."),
                                fieldWithPath("pipeline_name[]").description("A list of pipeline names."),
                                fieldWithPath("pipeline_stable_id[]").description("A list of pipeline stable identifiers."),
                                fieldWithPath("pipeline_stable_key[]").description("A list of pipeline stable keys."),
                                fieldWithPath("procedure_name[]").description("A list of procedure names."),
                                fieldWithPath("procedure_stable_id[]").description("A list of procedure stable identifiers."),
                                fieldWithPath("procedure_stable_key[]").description("A list of procedure stable keys."),
                                fieldWithPath("parameter_name[]").description("A list of parameter names."),
                                fieldWithPath("parameter_stable_id[]").description("A list of parameter stable identifiers."),
                                fieldWithPath("parameter_stable_key[]").description("A list of parameter stable keys."),
                                fieldWithPath("text[]").description("A catchall fifeld containing all searchable text fields."),
                                fieldWithPath("auto_suggest[]").description("Fields intended for use in auto-suggestion features."),
                                fieldWithPath("mix_syn_qf[]").description("Fields that mix synonyms and quality factors for search optimization."),
                                fieldWithPath("search_term_json").description("JSON representation of search terms for ontology browser."),
                                fieldWithPath("children_json").description("JSON representation of child terms for ontology browser."),
                                fieldWithPath("scroll_node").description("Identifier for scrolling functionality in UI components."),
                                fieldWithPath("gene_variant_male_count").description("Count of male variants of the gene."),
                                fieldWithPath("gene_variant_female_count").description("Count of female variants of the gene."),
                                fieldWithPath("gene_variant_count").description("Total count of gene variants.")
                        )

                ));
    }
}