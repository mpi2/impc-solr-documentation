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
                                fieldWithPath("dataType").description("Defines the general category or type of the data, such as gene, allele, etc."),
                                fieldWithPath("anatomyId").description("A unique identifier for an anatomical structure."),
                                fieldWithPath("anatomyTerm").description("The official name of the anatomical structure."),
                                fieldWithPath("anatomyTermSynonym").description("Alternate names or synonyms for the anatomical structure."),
                                fieldWithPath("anatomyNodeId").description("Identifiers for nodes within an anatomical structure's hierarchical organization."),
                                fieldWithPath("altAnatomyId").description("Alternative identifiers for the anatomical structure."),
                                fieldWithPath("stage").description("Developmental stage, distinguishing between adult and embryonic structures."),
                                fieldWithPath("efoId").description("Experimental Factor Ontology (EFO) ID for anatomical structures, used for mapping."),
                                fieldWithPath("allAeMappedEfoId").description("All EFO IDs mapped to anatomical structures for extended annotations."),
                                fieldWithPath("uberonId").description("Uberon ID, a cross-species ontology identifier for anatomical structures."),
                                fieldWithPath("allAeMappedUberonId").description("All Uberon IDs mapped to anatomical structures for extended annotations."),
                                fieldWithPath("parentAnatomyId").description("IDs of parent anatomical structures in a hierarchical organization."),
                                fieldWithPath("parentAnatomyTerm").description("Names of parent anatomical structures."),
                                fieldWithPath("parentAnatomyTermSynonym").description("Synonyms for parent anatomical structures."),
                                fieldWithPath("childAnatomyId").description("IDs of child anatomical structures in a hierarchical organization."),
                                fieldWithPath("childAnatomyTerm").description("Names of child anatomical structures."),
                                fieldWithPath("childAnatomyTermSynonym").description("Synonyms for child anatomical structures."),
                                fieldWithPath("intermediateAnatomyId").description("IDs of intermediate anatomical structures within the hierarchy."),
                                fieldWithPath("intermediateAnatomyTerm").description("Names of intermediate anatomical structures."),
                                fieldWithPath("intermediateAnatomyTermSynonym").description("Synonyms for intermediate anatomical structures."),
                                fieldWithPath("topLevelAnatomyId").description("IDs of top-level anatomical structures within the hierarchy."),
                                fieldWithPath("topLevelAnatomyTerm").description("Names of top-level anatomical structures."),
                                fieldWithPath("topLevelAnatomyTermSynonym").description("Synonyms for top-level anatomical structures."),
                                fieldWithPath("selectedTopLevelAnatomyId").description("IDs of selected top-level anatomical structures for focused research."),
                                fieldWithPath("selectedTopLevelAnatomyTerm").description("Names of selected top-level anatomical structures."),
                                fieldWithPath("selectedTopLevelAnatomyTermSynonym").description("Synonyms for selected top-level anatomical structures."),
                                fieldWithPath("mpId").description("Mammalian Phenotype (MP) ontology IDs associated with the anatomical structure."),
                                fieldWithPath("mpTerm").description("Names of the mammalian phenotypes associated."),
                                fieldWithPath("mpTermSynonym").description("Synonyms for the mammalian phenotypes."),
                                fieldWithPath("topLevelMpId").description("IDs of top-level mammalian phenotypes within the MP ontology hierarchy."),
                                fieldWithPath("topLevelMpTerm").description("Names of top-level mammalian phenotypes."),
                                fieldWithPath("topLevelMpTermSynonym").description("Synonyms for top-level mammalian phenotypes."),
                                fieldWithPath("intermediateMpId").description("IDs of intermediate mammalian phenotypes within the MP ontology hierarchy."),
                                fieldWithPath("intermediateMpTerm").description("Names of intermediate mammalian phenotypes."),
                                fieldWithPath("intermediateMpTermSynonym").description("Synonyms for intermediate mammalian phenotypes."),
                                fieldWithPath("childMpId").description("IDs of child mammalian phenotypes within the MP ontology hierarchy."),
                                fieldWithPath("childMpTerm").description("Names of child mammalian phenotypes."),
                                fieldWithPath("childMpTermSynonym").description("Synonyms for child mammalian phenotypes."),
                                fieldWithPath("annotationTermId").description("Generic field for IDs of terms used in annotations."),
                                fieldWithPath("annotationTermName").description("Generic field for names of terms used in annotations."),
                                fieldWithPath("name").description("A general name field, applicable to various contexts."),
                                fieldWithPath("accession").description("Accession numbers or identifiers for database entries."),
                                fieldWithPath("expName").description("Names associated with specific experiments or experimental data."),
                                fieldWithPath("largeThumbnailFilePath").description("File path to the large version of a thumbnail image."),
                                fieldWithPath("smallThumbnailFilePath").description("File path to the small version of a thumbnail image."),
                                fieldWithPath("inferredMaTermId").description("Mouse Anatomy (MA) Term IDs inferred from annotations."),
                                fieldWithPath("inferredMaTermName").description("Names of mouse anatomy terms inferred from annotations."),
                                fieldWithPath("annotatedHigherLevelMaTermId").description("IDs of higher-level mouse anatomy terms that have been directly annotated."),
                                fieldWithPath("annotatedHigherLevelMaTermName").description("Names of higher-level mouse anatomy terms that have been directly annotated."),
                                fieldWithPath("annotatedHigherLevelMpTermId").description("IDs of higher-level mammalian phenotype (MP) terms that have been directly annotated."),
                                fieldWithPath("annotatedHigherLevelMpTermName").description("Names of higher-level mammalian phenotype (MP) terms that have been directly annotated."),
                                fieldWithPath("inferredHigherLevelMaTermId").description("IDs of higher-level mouse anatomy terms inferred from other data."),
                                fieldWithPath("inferredHigherLevelMaTermName").description("Names of higher-level mouse anatomy terms inferred from other data."),
                                fieldWithPath("annotatedOrInferredHigherLevelMaTermName").description("Names of higher-level mouse anatomy terms, either annotated directly or inferred."),
                                fieldWithPath("annotatedOrInferredHigherLevelMaTermId").description("IDs of higher-level mouse anatomy terms, either annotated directly or inferred."),
                                fieldWithPath("symbol").description("Gene symbols or other relevant symbols associated with the data."),
                                fieldWithPath("sangerSymbol").description("Sanger Institute-specific symbols associated with the gene."),
                                fieldWithPath("geneName").description("The full name of the gene associated with the data."),
                                fieldWithPath("subtype").description("A subtype classification for the data, providing further contextual details."),
                                fieldWithPath("geneSynonyms").description("Synonyms or alternative names for the gene."),
                                fieldWithPath("maTermId").description("Mouse Anatomy (MA) Term IDs associated with the data."),
                                fieldWithPath("maTermName").description("The actual mouse anatomy terms associated with the MA IDs."),
                                fieldWithPath("expNameExp").description("Experimental names or designations, potentially a more specific or experimental context."),
                                fieldWithPath("symbolGene").description("Gene symbols, potentially used in a specific or alternative context."),
                                fieldWithPath("topLevel").description("Indicates whether the data pertains to a top-level classification or categorization."),
                                fieldWithPath("text").description("A catch-all text field containing searchable text from various other fields."),
                                fieldWithPath("autoSuggest").description("A field optimized for auto-suggestion functionality, containing n-grams for improved partial match searches."),
                                fieldWithPath("anatomyQf").description("A field specifically designed for anatomical query functions, supporting n-gram based searches."),
                                fieldWithPath("searchTermJson").description("A JSON representation of search terms, possibly used for advanced search or filter functionalities."),
                                fieldWithPath("childrenJson").description("A JSON representation of child elements or structures, used for hierarchical data representation."),
                                fieldWithPath("scrollNode").description("An identifier used to maintain scroll position or context, especially in hierarchical or tree-structured data.")

                                )
                ));
    }
}