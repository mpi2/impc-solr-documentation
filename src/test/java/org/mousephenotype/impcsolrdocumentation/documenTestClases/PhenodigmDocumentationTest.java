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
public class PhenodigmDocumentationTest {


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
    public void documentPhenodigm() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getPhenodigmDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("phenodigm-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("ontology").description("The ontology classification the experiment is associated with."),
                                fieldWithPath("phenotype_id").description("Unique identifier for the phenotype."),
                                fieldWithPath("phenotype_term").description("The term or description of the phenotype."),
                                fieldWithPath("phenotype_synonym").description("List of synonyms or alternate terms for the phenotype."),
                                fieldWithPath("hp_id").description("Unique identifier for the human phenotype ontology (HPO) term."),
                                fieldWithPath("hp_term").description("The term or description of the human phenotype (HP)."),
                                fieldWithPath("mp_id").description("Unique identifier for the mouse phenotype ontology (MPO) term."),
                                fieldWithPath("mp_term").description("The term or description of the mouse phenotype (MP)."),
                                fieldWithPath("association_curated").description("Boolean indicating if the gene-disease association was curated."),
                                fieldWithPath("association_ortholog").description("Boolean indicating if the gene-disease association is based on orthology."),
                                fieldWithPath("marker_symbols_withdrawn").description("List of withdrawn or obsolete marker symbols."),
                                fieldWithPath("disease_matched_phenotypes").description("List of phenotypes matched between the disease and the model."),
                                fieldWithPath("model_matched_phenotypes").description("List of phenotypes matched within the model."),
                                fieldWithPath("disease_model_avg_raw").description("The average raw score of the disease-model match."),
                                fieldWithPath("disease_model_avg_norm").description("The average normalized score of the disease-model match."),
                                fieldWithPath("disease_model_max_raw").description("The maximum raw score of the disease-model match."),
                                fieldWithPath("disease_model_max_norm").description("The maximum normalized score of the disease-model match."),
                                fieldWithPath("search_qf").description("List of fields considered when performing a search query."),
                                fieldWithPath("human_curated_gene").description("Boolean indicating if the gene has been curated by human effort."),
                                fieldWithPath("impc_model_with_curated_gene").description("Boolean indicating if the IMPC model includes genes curated by human effort."),
                                fieldWithPath("mgi_model_with_curated_gene").description("Boolean indicating if the MGI model includes genes curated by human effort."),
                                fieldWithPath("impc_model_with_computed_association").description("Boolean indicating if the IMPC model includes computed gene-disease associations."),
                                fieldWithPath("mgi_model_with_computed_association").description("Boolean indicating if the MGI model includes computed gene-disease associations."),
                                fieldWithPath("type").description("The type classification of the experiment."),
                                fieldWithPath("disease_id").description("Unique identifier for the associated disease."),
                                fieldWithPath("disease_source").description("The source of the disease information."),
                                fieldWithPath("disease_term").description("The term or name of the disease."),
                                fieldWithPath("disease_alts").description("Alternative names or identifiers for the disease."),
                                fieldWithPath("disease_locus").description("The locus associated with the disease."),
                                fieldWithPath("disease_classes").description("Classification categories for the disease."),
                                fieldWithPath("disease_phenotypes").description("Phenotypic descriptions or identifiers associated with the disease."),
                                fieldWithPath("gene_id").description("Unique identifier for the gene."),
                                fieldWithPath("gene_symbol").description("The symbol representing the gene."),
                                fieldWithPath("gene_symbols_withdrawn").description("List of withdrawn or obsolete gene symbols."),
                                fieldWithPath("gene_locus").description("The locus associated with the gene."),
                                fieldWithPath("hgnc_gene_id").description("HGNC (HUGO Gene Nomenclature Committee) identifier for the gene."),
                                fieldWithPath("hgnc_gene_symbol").description("HGNC symbol for the gene."),
                                fieldWithPath("hgnc_gene_symbols_withdrawn").description("List of withdrawn or obsolete HGNC gene symbols."),
                                fieldWithPath("hgnc_gene_locus").description("The locus associated with the HGNC gene."),
                                fieldWithPath("mouse_model").description("Boolean indicating if a mouse model is used."),
                                fieldWithPath("impc_model").description("Boolean indicating if an IMPC (International Mouse Phenotyping Consortium) model is used."),
                                fieldWithPath("model_id").description("Unique identifier for the model."),
                                fieldWithPath("model_source").description("The source of the model."),
                                fieldWithPath("model_description").description("A description of the model."),
                                fieldWithPath("model_genetic_background").description("The genetic background of the model."),
                                fieldWithPath("marker_id").description("Unique identifier for the marker."),
                                fieldWithPath("marker_symbol").description("The symbol representing the marker."),
                                fieldWithPath("marker_locus").description("The locus associated with the marker."),
                                fieldWithPath("marker_num_models").description("The number of models associated with the marker."),
                                fieldWithPath("model_phenotypes").description("Phenotypic descriptions or identifiers associated with the model.")

                        )

                ));
    }
}