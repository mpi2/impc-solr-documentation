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
                                fieldWithPath("phenotypeId").description("Unique identifier for the phenotype."),
                                fieldWithPath("phenotypeTerm").description("The term or description of the phenotype."),
                                fieldWithPath("phenotypeSynonym").description("List of synonyms or alternate terms for the phenotype."),
                                fieldWithPath("hpId").description("Unique identifier for the human phenotype ontology (HPO) term."),
                                fieldWithPath("hpTerm").description("The term or description of the human phenotype (HP)."),
                                fieldWithPath("mpId").description("Unique identifier for the mouse phenotype ontology (MPO) term."),
                                fieldWithPath("mpTerm").description("The term or description of the mouse phenotype (MP)."),
                                fieldWithPath("associationCurated").description("Boolean indicating if the gene-disease association was curated."),
                                fieldWithPath("associationOrtholog").description("Boolean indicating if the gene-disease association is based on orthology."),
                                fieldWithPath("markerSymbolsWithdrawn").description("List of withdrawn or obsolete marker symbols."),
                                fieldWithPath("diseaseMatchedPhenotypes").description("List of phenotypes matched between the disease and the model."),
                                fieldWithPath("modelMatchedPhenotypes").description("List of phenotypes matched within the model."),
                                fieldWithPath("diseaseModelAvgRaw").description("The average raw score of the disease-model match."),
                                fieldWithPath("diseaseModelAvgNorm").description("The average normalized score of the disease-model match."),
                                fieldWithPath("diseaseModelMaxRaw").description("The maximum raw score of the disease-model match."),
                                fieldWithPath("diseaseModelMaxNorm").description("The maximum normalized score of the disease-model match."),
                                fieldWithPath("searchQf").description("List of fields considered when performing a search query."),
                                fieldWithPath("humanCuratedGene").description("Boolean indicating if the gene has been curated by human effort."),
                                fieldWithPath("impcModelWithCuratedGene").description("Boolean indicating if the IMPC model includes genes curated by human effort."),
                                fieldWithPath("mgiModelWithCuratedGene").description("Boolean indicating if the MGI model includes genes curated by human effort."),
                                fieldWithPath("impcModelWithComputedAssociation").description("Boolean indicating if the IMPC model includes computed gene-disease associations."),
                                fieldWithPath("mgiModelWithComputedAssociation").description("Boolean indicating if the MGI model includes computed gene-disease associations."),
                                fieldWithPath("type").description("The type classification of the experiment."),
                                fieldWithPath("diseaseId").description("Unique identifier for the associated disease."),
                                fieldWithPath("diseaseSource").description("The source of the disease information."),
                                fieldWithPath("diseaseTerm").description("The term or name of the disease."),
                                fieldWithPath("diseaseAlts").description("Alternative names or identifiers for the disease."),
                                fieldWithPath("diseaseLocus").description("The locus associated with the disease."),
                                fieldWithPath("diseaseClasses").description("Classification categories for the disease."),
                                fieldWithPath("diseasePhenotypes").description("Phenotypic descriptions or identifiers associated with the disease."),
                                fieldWithPath("geneId").description("Unique identifier for the gene."),
                                fieldWithPath("geneSymbol").description("The symbol representing the gene."),
                                fieldWithPath("geneSymbolsWithdrawn").description("List of withdrawn or obsolete gene symbols."),
                                fieldWithPath("geneLocus").description("The locus associated with the gene."),
                                fieldWithPath("hgncGeneId").description("HGNC (HUGO Gene Nomenclature Committee) identifier for the gene."),
                                fieldWithPath("hgncGeneSymbol").description("HGNC symbol for the gene."),
                                fieldWithPath("hgncGeneSymbolsWithdrawn").description("List of withdrawn or obsolete HGNC gene symbols."),
                                fieldWithPath("hgncGeneLocus").description("The locus associated with the HGNC gene."),
                                fieldWithPath("mouseModel").description("Boolean indicating if a mouse model is used."),
                                fieldWithPath("impcModel").description("Boolean indicating if an IMPC (International Mouse Phenotyping Consortium) model is used."),
                                fieldWithPath("modelId").description("Unique identifier for the model."),
                                fieldWithPath("modelSource").description("The source of the model."),
                                fieldWithPath("modelDescription").description("A description of the model."),
                                fieldWithPath("modelGeneticBackground").description("The genetic background of the model."),
                                fieldWithPath("markerId").description("Unique identifier for the marker."),
                                fieldWithPath("markerSymbol").description("The symbol representing the marker."),
                                fieldWithPath("markerLocus").description("The locus associated with the marker."),
                                fieldWithPath("markerNumModels").description("The number of models associated with the marker."),
                                fieldWithPath("modelPhenotypes").description("Phenotypic descriptions or identifiers associated with the model.")

                                )

                ));
    }
}