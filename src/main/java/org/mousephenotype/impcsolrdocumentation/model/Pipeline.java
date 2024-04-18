package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Pipeline {
    private String fully_qualified_name;
    private String data_type;
    private Long version;

    private Long parameter_id;
    private String parameter_stable_id;
    private String parameter_name;
    private Long parameter_stable_key;

    private Long procedure_id;
    private String procedure_stable_id;
    private String procedure_name;
    private Long procedure_stable_key;

    private Long pipeline_id;
    private String pipeline_stable_id;
    private String pipeline_name;
    private Long pipeline_stable_key;

    private boolean required;
    private String observation_type;
    private List<String> mp_terms;
    private String description;
    private String unit_x;
    private String unit_y;
    private boolean metadata;
    private boolean increment;
    private List<String> categories;
    private boolean has_options;
    private boolean derived;
    private boolean media;
    private boolean annotate;
    private String comparable_parameter_group;

    private String experiment_level;
    private String stage;
    private String stage_label;
    private Long schedule_key;

    private List<String> mp_id;
    private List<String> mp_term;
    private List<String> mp_term_synonym;

    private List<String> top_level_mp_id;
    private List<String> top_level_mp_term;
    private List<String> top_level_mp_term_synonym;

    private List<String> intermediate_mp_id;
    private List<String> intermediate_mp_term;
    private List<String> intermediate_mp_term_synonym;

    private List<String> abnormal_mp_id;
    private List<String> increased_mp_id;
    private List<String> decreased_mp_id;
    private List<String> abnormal_mp_term;
    private List<String> increased_mp_term;
    private List<String> decreased_mp_term;

    private List<String> hp_id;
    private List<String> hp_term;

    private String inferred_ma_id;
    private String inferred_selected_top_level_ma_id;
    private String inferred_selected_top_level_ma_term;

    private String ma_id;
    private String ma_term;
    private List<String> ma_term_synonym;

    private String emap_id;
    private String emap_term;

    private String anatomy_id;
    private String anatomy_term;
    private List<String> anatomy_term_synonym;

    private String embryo_anatomy_id;
    private String embryo_anatomy_term;
    private List<String> top_level_embryo_anatomy_id;
    private List<String> top_level_embryo_anatomy_term;

    private String mouse_anatomy_id;
    private String mouse_anatomy_term;
    private List<String> top_level_mouse_anatomy_id;
    private List<String> top_level_mouse_anatomy_term;

    private List<String> imits_phenotype_started;
    private List<String> imits_phenotype_complete;
    private List<String> imits_phenotype_status;

}
