package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.OrthologMapping;

public class OrthologMappingGenerator {


    public static OrthologMapping generateExampleOrthologMappingResponse() {
        OrthologMapping orthologMapping = new OrthologMapping();
        orthologMapping.setHg_hgnc_acc_id("hg123");
        orthologMapping.setHg_symbol("HG");
        orthologMapping.setHmf_category_for_threshold("Category");
        orthologMapping.setHmf_human_gene_id(456L);
        orthologMapping.setHmf_id(789L);
        orthologMapping.setHmf_orthologs_above_threshold(3L);
        orthologMapping.setHmf_support_count_threshold(10L);
        orthologMapping.setId("exampleId");
        orthologMapping.setMg_mgi_gene_acc_id("mg123");
        orthologMapping.setMg_symbol("MG");
        orthologMapping.setMmf_category_for_threshold("Category");
        orthologMapping.setMmf_id(987L);
        orthologMapping.setMmf_mouse_gene_id(654L);
        orthologMapping.setMmf_orthologs_above_threshold(5L);
        orthologMapping.setMmf_support_count_threshold(8L);
        orthologMapping.setO_category("Category");
        orthologMapping.setO_human_gene_id(321L);
        orthologMapping.setO_id(654L);
        orthologMapping.setO_is_max_human_to_mouse("Yes");
        orthologMapping.setO_is_max_mouse_to_human("No");
        orthologMapping.setO_mouse_gene_id(987L);
        orthologMapping.setO_support("Support");
        orthologMapping.setO_support_count(12L);
        orthologMapping.setO_support_raw("Raw Support");

        return orthologMapping;

    }

}
