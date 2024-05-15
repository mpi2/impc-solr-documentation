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
                                fieldWithPath("allele_design_project").description("The design project associated with the allele."),
                                fieldWithPath("allele_has_issues").description("Indicates whether the allele has any issues."),
                                fieldWithPath("allele_id").description("The unique identifier for the allele."),
                                fieldWithPath("allele_name").description("The name of the allele."),
                                fieldWithPath("allele_description").description("A description of the allele."),
                                fieldWithPath("allele_type").description("The type of allele."),
                                fieldWithPath("associated_product_colony_name").description("The colony name associated with the product."),
                                fieldWithPath("associated_product_es_cell_name").description("The ES cell name associated with the product."),
                                fieldWithPath("associated_product_vector_name").description("The vector name associated with the product."),
                                fieldWithPath("associated_products_colony_names").description("List of colony names associated with the product."),
                                fieldWithPath("associated_products_es_cell_names").description("List of ES cell names associated with the product."),
                                fieldWithPath("associated_products_vector_names").description("List of vector names associated with the product."),
                                fieldWithPath("cassette").description("The cassette associated with the allele."),
                                fieldWithPath("contact_links").description("List of contact links."),
                                fieldWithPath("contact_names").description("List of contact names."),
                                fieldWithPath("design_id").description("The design ID associated with the allele."),
                                fieldWithPath("genetic_info").description("List of genetic information associated with the allele."),
                                fieldWithPath("ikmc_project_id").description("The IKMC project ID associated with the allele."),
                                fieldWithPath("loa_assays").description("List of LOA assays associated with the allele."),
                                fieldWithPath("marker_symbol").description("The marker symbol associated with the allele."),
                                fieldWithPath("mgi_accession_id").description("The MGI accession ID associated with the allele."),
                                fieldWithPath("name").description("The name associated with the allele product."),
                                fieldWithPath("order_links").description("List of order links."),
                                fieldWithPath("order_names").description("List of order names."),
                                fieldWithPath("other_links").description("List of other links."),
                                fieldWithPath("tissue_enquiry_links").description("List of tissue enquiry links."),
                                fieldWithPath("tissue_enquiry_types").description("List of tissue enquiry types."),
                                fieldWithPath("tissue_distribution_centres").description("List of tissue distribution centres."),
                                fieldWithPath("product_id").description("The product ID."),
                                fieldWithPath("product_index").description("The product index."),
                                fieldWithPath("production_centre").description("The production centre."),
                                fieldWithPath("production_completed").description("Indicates whether production is completed."),
                                fieldWithPath("production_info").description("List of production information."),
                                fieldWithPath("production_pipeline").description("The production pipeline."),
                                fieldWithPath("qc_data").description("List of QC data."),
                                fieldWithPath("status").description("The status of the allele product."),
                                fieldWithPath("status_date").description("The date of the status."),
                                fieldWithPath("type").description("The type of the allele product.")
                        )

                ));
    }
}