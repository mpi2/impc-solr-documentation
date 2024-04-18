package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrthologMapping {

    private String hg_hgnc_acc_id;
    private String hg_symbol;
    private String hmf_category_for_threshold;
    private Long hmf_human_gene_id;
    private Long hmf_id;
    private Long hmf_orthologs_above_threshold;
    private Long hmf_support_count_threshold;
    private String id;
    private String mg_mgi_gene_acc_id;
    private String mg_symbol;
    private String mmf_category_for_threshold;
    private Long mmf_id;
    private Long mmf_mouse_gene_id;
    private Long mmf_orthologs_above_threshold;
    private Long mmf_support_count_threshold;
    private String o_category;
    private Long o_human_gene_id;
    private Long o_id;
    private String o_is_max_human_to_mouse;
    private String o_is_max_mouse_to_human;
    private Long o_mouse_gene_id;
    private String o_support;
    private Long o_support_count;
    private String o_support_raw;

}
