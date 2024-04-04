package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Pipeline;

import java.util.List;

public class PipelineGenerator {


    public static Pipeline generateExamplePipelineResponse() {
        Pipeline pipeline = new Pipeline();
        pipeline.setFullyQualifiedName("Pipeline");
        pipeline.setDataType("String");
        pipeline.setVersion(1L);

        pipeline.setParameterId(101L);
        pipeline.setParameterStableId("PARAM_001");
        pipeline.setParameterName("Parameter Name Example");
        pipeline.setParameterStableKey(102L);

        pipeline.setProcedureId(201L);
        pipeline.setProcedureStableId("PROC_001");
        pipeline.setProcedureName("Procedure Name Example");
        pipeline.setProcedureStableKey(202L);

        pipeline.setPipelineId(301L);
        pipeline.setPipelineStableId("PIPE_001");
        pipeline.setPipelineName("Pipeline Name Example");
        pipeline.setPipelineStableKey(302L);

        pipeline.setRequired(true);
        pipeline.setObservationType("Observation Type Example");
        pipeline.setMpTerms(List.of("MP:0000001", "MP:0000002"));
        pipeline.setDescription("Description Example");
        pipeline.setUnitX("cm");
        pipeline.setUnitY("kg");
        pipeline.setMetadata(true);
        pipeline.setIncrement(true);
        pipeline.setCategories(List.of("Category 1", "Category 2"));
        pipeline.setHasOptions(false);
        pipeline.setDerived(false);
        pipeline.setMedia(true);
        pipeline.setAnnotate(false);
        pipeline.setComparableParameterGroup("Group Example");

        pipeline.setExperimentLevel("Level Example");
        pipeline.setStage("Stage Example");
        pipeline.setStageLabel("Stage Label Example");
        pipeline.setScheduleKey(401L);
        pipeline.setMpId(List.of("MP:0000003", "MP:0000004"));
        pipeline.setMpTerm(List.of("term1", "term2"));
        pipeline.setMpTermSynonym(List.of("synonym1", "synonym2"));

        pipeline.setTopLevelMpId(List.of("MP:0000005"));
        pipeline.setTopLevelMpTerm(List.of("top level term"));
        pipeline.setTopLevelMpTermSynonym(List.of("top level synonym"));

        pipeline.setIntermediateMpId(List.of("MP:0000006"));
        pipeline.setIntermediateMpTerm(List.of("intermediate term"));
        pipeline.setIntermediateMpTermSynonym(List.of("intermediate synonym"));

        pipeline.setAbnormalMpId(List.of("MP:0000007"));
        pipeline.setIncreasedMpId(List.of("MP:0000008"));
        pipeline.setDecreasedMpId(List.of("MP:0000009"));
        pipeline.setAbnormalMpTerm(List.of("abnormal term"));
        pipeline.setIncreasedMpTerm(List.of("increased term"));
        pipeline.setDecreasedMpTerm(List.of("decreased term"));

        pipeline.setHpId(List.of("HP:0000001", "HP:0000002"));
        pipeline.setHpTerm(List.of("HP term 1", "HP term 2"));

        pipeline.setInferredMaId("MA:0000001");
        pipeline.setInferredSelectedTopLevelMaId("MA:0000002");
        pipeline.setInferredSelectedTopLevelMaTerm("top level MA term");

        pipeline.setMaId("MA:0000003");
        pipeline.setMaTerm("MA term");
        pipeline.setMaTermSynonym(List.of("MA synonym 1", "MA synonym 2"));

        pipeline.setEmapId("EMAP:0000001");
        pipeline.setEmapTerm("EMAP term");

        pipeline.setAnatomyId("A:0000001");
        pipeline.setAnatomyTerm("anatomy term");
        pipeline.setAnatomyTermSynonym(List.of("anatomy synonym"));

        pipeline.setEmbryoAnatomyId("E:0000001");
        pipeline.setEmbryoAnatomyTerm("embryo anatomy term");
        pipeline.setTopLevelEmbryoAnatomyId(List.of("E:0000002"));
        pipeline.setTopLevelEmbryoAnatomyTerm(List.of("top level embryo anatomy term"));

        pipeline.setMouseAnatomyId("M:0000001");
        pipeline.setMouseAnatomyTerm("mouse anatomy term");
        pipeline.setTopLevelMouseAnatomyId(List.of("M:0000002"));
        pipeline.setTopLevelMouseAnatomyTerm(List.of("top level mouse anatomy term"));

        pipeline.setImitsPhenotypeStarted(List.of("started1", "started2"));
        pipeline.setImitsPhenotypeComplete(List.of("complete1", "complete2"));
        pipeline.setImitsPhenotypeStatus(List.of("status1", "status2"));

        return pipeline;
    }

}
