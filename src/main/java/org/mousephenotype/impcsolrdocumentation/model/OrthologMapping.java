package org.mousephenotype.impcsolrdocumentation.model;

public record OrthologMapping(
    String hg_hgnc_acc_id,
    String hg_symbol,
    String hmf_category_for_threshold,
    Long hmf_human_gene_id,
    Long hmf_id,
    Long hmf_orthologs_above_threshold,
    Long hmf_support_count_threshold,
    String id,
    String mg_mgi_gene_acc_id,
    String mg_symbol,
    String mmf_category_for_threshold,
    Long mmf_id,
    Long mmf_mouse_gene_id,
    Long mmf_orthologs_above_threshold,
    Long mmf_support_count_threshold,
    String o_category,
    Long o_human_gene_id,
    Long o_id,
    String o_is_max_human_to_mouse,
    String o_is_max_mouse_to_human,
    Long o_mouse_gene_id,
    String o_support,
    Long o_support_count,
    String o_support_raw
) {}
