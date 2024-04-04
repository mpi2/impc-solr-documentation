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
public class ProductDocumentationTest {


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
    public void documentProduct() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getProductDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("product-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("alleleDesignProject").description("The design project associated with the allele."),
                                fieldWithPath("alleleHasIssues").description("Indicates whether the allele has any issues."),
                                fieldWithPath("alleleId").description("The unique identifier for the allele."),
                                fieldWithPath("alleleName").description("The name of the allele."),
                                fieldWithPath("alleleDescription").description("A description of the allele."),
                                // Note: allele_name_str and allele_symbol are indexed but not stored, thus might not be included in response documentation.
                                fieldWithPath("alleleType").description("The type of allele."),
                                // Note: allele_type_str is indexed but not stored, thus might not be included in response documentation.
                                fieldWithPath("associatedProductColonyName").description("The colony name associated with the product."),
                                fieldWithPath("associatedProductEsCellName").description("The ES cell name associated with the product."),
                                fieldWithPath("associatedProductVectorName").description("The vector name associated with the product."),
                                fieldWithPath("associatedProductsColonyNames[]").description("List of colony names associated with the product."),
                                fieldWithPath("associatedProductsEsCellNames[]").description("List of ES cell names associated with the product."),
                                fieldWithPath("associatedProductsVectorNames[]").description("List of vector names associated with the product."),
                                // Note: auto_suggest is indexed but not stored, thus might not be included in response documentation.
                                fieldWithPath("cassette").description("The cassette associated with the allele."),
                                // Note: cassette_str is indexed but not stored, thus might not be included in response documentation.
                                fieldWithPath("contactLinks[]").description("List of contact links."),
                                fieldWithPath("contactNames[]").description("List of contact names."),
                                fieldWithPath("designId").description("The design ID associated with the allele."),
                                // Note: design_id_str is indexed but not stored, thus might not be included in response documentation.
                                fieldWithPath("geneticInfo[]").description("List of genetic information associated with the allele."),
                                fieldWithPath("ikmcProjectId").description("The IKMC project ID associated with the allele."),
                                fieldWithPath("loaAssays[]").description("List of LOA assays associated with the allele."),
                                fieldWithPath("markerSymbol").description("The marker symbol associated with the allele."),
                                fieldWithPath("mgiAccessionId").description("The MGI accession ID associated with the allele."),
                                fieldWithPath("name").description("The name associated with the allele product."),
                                fieldWithPath("orderLinks[]").description("List of order links."),
                                fieldWithPath("orderNames[]").description("List of order names."),
                                fieldWithPath("otherLinks[]").description("List of other links."),
                                fieldWithPath("tissueEnquiryLinks[]").description("List of tissue enquiry links."),
                                fieldWithPath("tissueEnquiryTypes[]").description("List of tissue enquiry types."),
                                fieldWithPath("tissueDistributionCentres[]").description("List of tissue distribution centres."),
                                fieldWithPath("productId").description("The product ID."),
                                fieldWithPath("productIndex").description("The product index."),
                                fieldWithPath("productionCentre").description("The production centre."),
                                fieldWithPath("productionCompleted").description("Indicates whether production is completed."),
                                fieldWithPath("productionInfo[]").description("List of production information."),
                                fieldWithPath("productionPipeline").description("The production pipeline."),
                                fieldWithPath("qcData[]").description("List of QC data."),
                                fieldWithPath("status").description("The status of the allele product."),
                                fieldWithPath("statusDate").description("The date of the status."),
                                fieldWithPath("type").description("The type of the allele product.")
                        )

                ));
    }
}