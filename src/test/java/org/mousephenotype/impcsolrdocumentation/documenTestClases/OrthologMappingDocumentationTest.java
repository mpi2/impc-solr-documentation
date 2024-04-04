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
                                fieldWithPath("hgHgncAccId").description("The HGNC accession ID."),
                                fieldWithPath("hgSymbol").description("The HGNC symbol."),
                                fieldWithPath("hmfCategoryForThreshold").description("The category for threshold."),
                                fieldWithPath("hmfHumanGeneId").description("The human gene ID."),
                                fieldWithPath("hmfId").description("The HMF ID."),
                                fieldWithPath("hmfOrthologsAboveThreshold").description("The number of orthologs above threshold."),
                                fieldWithPath("hmfSupportCountThreshold").description("The support count threshold."),
                                fieldWithPath("id").description("The unique identifier for the gene ortholog."),
                                fieldWithPath("mgMgiGeneAccId").description("The MGI gene accession ID."),
                                fieldWithPath("mgSymbol").description("The MGI symbol."),
                                fieldWithPath("mmfCategoryForThreshold").description("The category for threshold."),
                                fieldWithPath("mmfId").description("The MMF ID."),
                                fieldWithPath("mmfMouseGeneId").description("The mouse gene ID."),
                                fieldWithPath("mmfOrthologsAboveThreshold").description("The number of orthologs above threshold."),
                                fieldWithPath("mmfSupportCountThreshold").description("The support count threshold."),
                                fieldWithPath("ocategory").description("The category."),
                                fieldWithPath("ohumanGeneId").description("The human gene ID."),
                                fieldWithPath("oid").description("The O ID."),
                                fieldWithPath("oisMaxHumanToMouse").description("Indicates if it is max human to mouse."),
                                fieldWithPath("oisMaxMouseToHuman").description("Indicates if it is max mouse to human."),
                                fieldWithPath("omouseGeneId").description("The mouse gene ID."),
                                fieldWithPath("osupport").description("The support."),
                                fieldWithPath("osupportCount").description("The support count."),
                                fieldWithPath("osupportRaw").description("The raw support."))

                ));
    }
}