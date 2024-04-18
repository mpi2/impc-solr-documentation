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
public class AnatomyDocumentationTest {


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
    public void documentAnatomy() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getAnatomyDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("anatomy-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("data_type").description("Defines the general category or type of the data, such as gene, allele, etc."),
                                fieldWithPath("anatomy_id").description("A unique identifier for an anatomical structure."),
                                fieldWithPath("anatomy_term").description("The official name of the anatomical structure."),
                                fieldWithPath("anatomy_term_synonym").description("Alternate names or synonyms for the anatomical structure."),
                                fieldWithPath("anatomy_node_id").description("Identifiers for nodes within an anatomical structure's hierarchical organization."),
                                fieldWithPath("alt_anatomy_id").description("Alternative identifiers for the anatomical structure."),
                                fieldWithPath("stage").description("Developmental stage, distinguishing between adult and embryonic structures."),
                                fieldWithPath("efo_id").description("Experimental Factor Ontology (EFO) ID for anatomical structures, used for mapping."),
                                fieldWithPath("all_ae_mapped_efo_id").description("All EFO IDs mapped to anatomical structures for extended annotations."),
                                fieldWithPath("uberon_id").description("Uberon ID, a cross-species ontology identifier for anatomical structures."),
                                fieldWithPath("all_ae_mapped_uberon_id").description("All Uberon IDs mapped to anatomical structures for extended annotations."),
                                fieldWithPath("parent_anatomy_id").description("IDs of parent anatomical structures in a hierarchical organization."),
                                fieldWithPath("parent_anatomy_term").description("Names of parent anatomical structures."),
                                fieldWithPath("parent_anatomy_term_synonym").description("Synonyms for parent anatomical structures."),
                                fieldWithPath("child_anatomy_id").description("IDs of child anatomical structures in a hierarchical organization."),
                                fieldWithPath("child_anatomy_term").description("Names of child anatomical structures."),
                                fieldWithPath("child_anatomy_term_synonym").description("Synonyms for child anatomical structures."),
                                fieldWithPath("intermediate_anatomy_id").description("IDs of intermediate anatomical structures within the hierarchy."),
                                fieldWithPath("intermediate_anatomy_term").description("Names of intermediate anatomical structures."),
                                fieldWithPath("intermediate_anatomy_term_synonym").description("Synonyms for intermediate anatomical structures."),
                                fieldWithPath("top_level_anatomy_id").description("IDs of top-level anatomical structures within the hierarchy."),
                                fieldWithPath("top_level_anatomy_term").description("Names of top-level anatomical structures."),
                                fieldWithPath("top_level_anatomy_term_synonym").description("Synonyms for top-level anatomical structures."),
                                fieldWithPath("selected_top_level_anatomy_id").description("IDs of selected top-level anatomical structures for focused research."),
                                fieldWithPath("selected_top_level_anatomy_term").description("Names of selected top-level anatomical structures."),
                                fieldWithPath("selected_top_level_anatomy_term_synonym").description("Synonyms for selected top-level anatomical structures."),
                                fieldWithPath("mp_id").description("Mammalian Phenotype (MP) ontology IDs associated with the anatomical structure."),
                                fieldWithPath("mp_term").description("Names of the mammalian phenotypes associated."),
                                fieldWithPath("mp_term_synonym").description("Synonyms for the mammalian phenotypes."),
                                fieldWithPath("top_level_mp_id").description("IDs of top-level mammalian phenotypes within the MP ontology hierarchy."),
                                fieldWithPath("top_level_mp_term").description("Names of top-level mammalian phenotypes."),
                                fieldWithPath("top_level_mp_term_synonym").description("Synonyms for top-level mammalian phenotypes."),
                                fieldWithPath("intermediate_mp_id").description("IDs of intermediate mammalian phenotypes within the MP ontology hierarchy."),
                                fieldWithPath("intermediate_mp_term").description("Names of intermediate mammalian phenotypes."),
                                fieldWithPath("intermediate_mp_term_synonym").description("Synonyms for intermediate mammalian phenotypes."),
                                fieldWithPath("child_mp_id").description("IDs of child mammalian phenotypes within the MP ontology hierarchy."),
                                fieldWithPath("child_mp_term").description("Names of child mammalian phenotypes."),
                                fieldWithPath("child_mp_term_synonym").description("Synonyms for child mammalian phenotypes."),
                                fieldWithPath("annotation_term_id").description("Generic field for IDs of terms used in annotations."),
                                fieldWithPath("annotation_term_name").description("Generic field for names of terms used in annotations."),
                                fieldWithPath("name").description("A general name field, applicable to various contexts."),
                                fieldWithPath("accession").description("Accession numbers or identifiers for database entries."),
                                fieldWithPath("exp_name").description("Names associated with specific experiments or experimental data."),
                                fieldWithPath("large_thumbnail_file_path").description("File path to the large version of a thumbnail image."),
                                fieldWithPath("small_thumbnail_file_path").description("File path to the small version of a thumbnail image."),
                                fieldWithPath("inferred_ma_term_id").description("Mouse Anatomy (MA) Term IDs inferred from annotations."),
                                fieldWithPath("inferred_ma_term_name").description("Names of mouse anatomy terms inferred from annotations."),
                                fieldWithPath("annotated_higher_level_ma_term_id").description("IDs of higher-level mouse anatomy terms that have been directly annotated."),
                                fieldWithPath("annotated_higher_level_ma_term_name").description("Names of higher-level mouse anatomy terms that have been directly annotated."),
                                fieldWithPath("annotated_higher_level_mp_term_id").description("IDs of higher-level mammalian phenotype (MP) terms that have been directly annotated."),
                                fieldWithPath("annotated_higher_level_mp_term_name").description("Names of higher-level mammalian phenotype (MP) terms that have been directly annotated."),
                                fieldWithPath("inferred_higher_level_ma_term_id").description("IDs of higher-level mouse anatomy terms inferred from other data."),
                                fieldWithPath("inferred_higher_level_ma_term_name").description("Names of higher-level mouse anatomy terms inferred from other data."),
                                fieldWithPath("annotated_or_inferred_higher_level_ma_term_name").description("Names of higher-level mouse anatomy terms, either annotated directly or inferred."),
                                fieldWithPath("annotated_or_inferred_higher_level_ma_term_id").description("IDs of higher-level mouse anatomy terms, either annotated directly or inferred."),
                                fieldWithPath("symbol").description("Gene symbols or other relevant symbols associated with the data."),
                                fieldWithPath("sanger_symbol").description("Sanger Institute-specific symbols associated with the gene."),
                                fieldWithPath("gene_name").description("The full name of the gene associated with the data."),
                                fieldWithPath("subtype").description("A subtype classification for the data, providing further contextual details."),
                                fieldWithPath("gene_synonyms").description("Synonyms or alternative names for the gene."),
                                fieldWithPath("ma_term_id").description("Mouse Anatomy (MA) Term IDs associated with the data."),
                                fieldWithPath("ma_term_name").description("The actual mouse anatomy terms associated with the MA IDs."),
                                fieldWithPath("exp_name_exp").description("Experimental names or designations, potentially a more specific or experimental context."),
                                fieldWithPath("symbol_gene").description("Gene symbols, potentially used in a specific or alternative context."),
                                fieldWithPath("top_level").description("Indicates whether the data pertains to a top-level classification or categorization."),
                                fieldWithPath("text").description("A catch-all text field containing searchable text from various other fields."),
                                fieldWithPath("auto_suggest").description("A field optimized for auto-suggestion functionality, containing n-grams for improved partial match searches."),
                                fieldWithPath("anatomy_qf").description("A field specifically designed for anatomical query functions, supporting n-gram based searches."),
                                fieldWithPath("search_term_json").description("A JSON representation of search terms, possibly used for advanced search or filter functionalities."),
                                fieldWithPath("children_json").description("A JSON representation of child elements or structures, used for hierarchical data representation."),
                                fieldWithPath("scroll_node").description("An identifier used to maintain scroll position or context, especially in hierarchical or tree-structured data.")

                        )
                ));
    }
}