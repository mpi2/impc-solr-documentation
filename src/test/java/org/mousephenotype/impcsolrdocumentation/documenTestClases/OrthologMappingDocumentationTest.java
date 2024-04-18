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
public class OrthologMappingDocumentationTest {


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
    public void documentOrthologMapping() throws Exception {

        mockMvc.perform(get("http://localhost:8080/getOrthologMappingDoc")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("ortholog-mapping-doc",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        responseFields(
                                fieldWithPath("hg_hgnc_acc_id").description("The HGNC accession ID."),
                                fieldWithPath("hg_symbol").description("The HGNC symbol."),
                                fieldWithPath("hmf_category_for_threshold").description("The category for threshold."),
                                fieldWithPath("hmf_human_gene_id").description("The human gene ID."),
                                fieldWithPath("hmf_id").description("The HMF ID."),
                                fieldWithPath("hmf_orthologs_above_threshold").description("The number of orthologs above threshold."),
                                fieldWithPath("hmf_support_count_threshold").description("The support count threshold."),
                                fieldWithPath("id").description("The unique identifier for the gene ortholog."),
                                fieldWithPath("mg_mgi_gene_acc_id").description("The MGI gene accession ID."),
                                fieldWithPath("mg_symbol").description("The MGI symbol."),
                                fieldWithPath("mmf_category_for_threshold").description("The category for threshold."),
                                fieldWithPath("mmf_id").description("The MMF ID."),
                                fieldWithPath("mmf_mouse_gene_id").description("The mouse gene ID."),
                                fieldWithPath("mmf_orthologs_above_threshold").description("The number of orthologs above threshold."),
                                fieldWithPath("mmf_support_count_threshold").description("The support count threshold."),
                                fieldWithPath("o_category").description("The category."),
                                fieldWithPath("o_human_gene_id").description("The human gene ID."),
                                fieldWithPath("o_id").description("The O ID."),
                                fieldWithPath("o_is_max_human_to_mouse").description("Indicates if it is max human to mouse."),
                                fieldWithPath("o_is_max_mouse_to_human").description("Indicates if it is max mouse to human."),
                                fieldWithPath("o_mouse_gene_id").description("The mouse gene ID."),
                                fieldWithPath("o_support").description("The support."),
                                fieldWithPath("o_support_count").description("The support count."),
                                fieldWithPath("o_support_raw").description("The raw support."))

                ));
    }
}