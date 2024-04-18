package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Pipeline;

import java.util.List;

public class PipelineGenerator {


    public static Pipeline generateExamplePipelineResponse() {
        Pipeline pipeline = new Pipeline();
        pipeline.setFully_qualified_name("Pipeline");
        pipeline.setData_type("String");
        pipeline.setVersion(1L);

        pipeline.setParameter_id(101L);
        pipeline.setParameter_stable_id("PARAM_001");
        pipeline.setParameter_name("Parameter Name Example");
        pipeline.setParameter_stable_key(102L);

        pipeline.setProcedure_id(201L);
        pipeline.setProcedure_stable_id("PROC_001");
        pipeline.setProcedure_name("Procedure Name Example");
        pipeline.setProcedure_stable_key(202L);

        pipeline.setPipeline_id(301L);
        pipeline.setPipeline_stable_id("PIPE_001");
        pipeline.setPipeline_name("Pipeline Name Example");
        pipeline.setPipeline_stable_key(302L);

        pipeline.setRequired(true);
        pipeline.setObservation_type("Observation Type Example");
        pipeline.setMp_terms(List.of("MP:0000001", "MP:0000002"));
        pipeline.setDescription("Description Example");
        pipeline.setUnit_x("cm");
        pipeline.setUnit_y("kg");
        pipeline.setMetadata(true);
        pipeline.setIncrement(true);
        pipeline.setCategories(List.of("Category 1", "Category 2"));
        pipeline.setHas_options(false);
        pipeline.setDerived(false);
        pipeline.setMedia(true);
        pipeline.setAnnotate(false);
        pipeline.setComparable_parameter_group("Group Example");

        pipeline.setExperiment_level("Level Example");
        pipeline.setStage("Stage Example");
        pipeline.setStage_label("Stage Label Example");
        pipeline.setSchedule_key(401L);
        pipeline.setMp_id(List.of("MP:0000003", "MP:0000004"));
        pipeline.setMp_term(List.of("term1", "term2"));
        pipeline.setMp_term_synonym(List.of("synonym1", "synonym2"));

        pipeline.setTop_level_mp_id(List.of("MP:0000005"));
        pipeline.setTop_level_mp_term(List.of("top level term"));
        pipeline.setTop_level_mp_term_synonym(List.of("top level synonym"));

        pipeline.setIntermediate_mp_id(List.of("MP:0000006"));
        pipeline.setIntermediate_mp_term(List.of("intermediate term"));
        pipeline.setIntermediate_mp_term_synonym(List.of("intermediate synonym"));

        pipeline.setAbnormal_mp_id(List.of("MP:0000007"));
        pipeline.setIncreased_mp_id(List.of("MP:0000008"));
        pipeline.setDecreased_mp_id(List.of("MP:0000009"));
        pipeline.setAbnormal_mp_term(List.of("abnormal term"));
        pipeline.setIncreased_mp_term(List.of("increased term"));
        pipeline.setDecreased_mp_term(List.of("decreased term"));

        pipeline.setHp_id(List.of("HP:0000001", "HP:0000002"));
        pipeline.setHp_term(List.of("HP term 1", "HP term 2"));

        pipeline.setInferred_ma_id("MA:0000001");
        pipeline.setInferred_selected_top_level_ma_id("MA:0000002");
        pipeline.setInferred_selected_top_level_ma_term("top level MA term");

        pipeline.setMa_id("MA:0000003");
        pipeline.setMa_term("MA term");
        pipeline.setMa_term_synonym(List.of("MA synonym 1", "MA synonym 2"));

        pipeline.setEmap_id("EMAP:0000001");
        pipeline.setEmap_term("EMAP term");

        pipeline.setAnatomy_id("A:0000001");
        pipeline.setAnatomy_term("anatomy term");
        pipeline.setAnatomy_term_synonym(List.of("anatomy synonym"));

        pipeline.setEmbryo_anatomy_id("E:0000001");
        pipeline.setEmbryo_anatomy_term("embryo anatomy term");
        pipeline.setTop_level_embryo_anatomy_id(List.of("E:0000002"));
        pipeline.setTop_level_embryo_anatomy_term(List.of("top level embryo anatomy term"));

        pipeline.setMouse_anatomy_id("M:0000001");
        pipeline.setMouse_anatomy_term("mouse anatomy term");
        pipeline.setTop_level_mouse_anatomy_id(List.of("M:0000002"));
        pipeline.setTop_level_mouse_anatomy_term(List.of("top level mouse anatomy term"));

        pipeline.setImits_phenotype_started(List.of("started1", "started2"));
        pipeline.setImits_phenotype_complete(List.of("complete1", "complete2"));
        pipeline.setImits_phenotype_status(List.of("status1", "status2"));

        return pipeline;

    }

}
