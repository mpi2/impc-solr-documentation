package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Pipeline {
    private String fullyQualifiedName;
    private String dataType;
    private Long version;

    private Long parameterId;
    private String parameterStableId;
    private String parameterName;
    private Long parameterStableKey;

    private Long procedureId;
    private String procedureStableId;
    private String procedureName;
    private Long procedureStableKey;

    private Long pipelineId;
    private String pipelineStableId;
    private String pipelineName;
    private Long pipelineStableKey;

    private boolean required;
    private String observationType;
    private List<String> mpTerms;
    private String description;
    private String unitX;
    private String unitY;
    private boolean metadata;
    private boolean increment;
    private List<String> categories;
    private boolean hasOptions;
    private boolean derived;
    private boolean media;
    private boolean annotate;
    private String comparableParameterGroup;

    private String experimentLevel;
    private String stage;
    private String stageLabel;
    private Long scheduleKey;

    private List<String> mpId;
    private List<String> mpTerm;
    private List<String> mpTermSynonym;

    private List<String> topLevelMpId;
    private List<String> topLevelMpTerm;
    private List<String> topLevelMpTermSynonym;

    private List<String> intermediateMpId;
    private List<String> intermediateMpTerm;
    private List<String> intermediateMpTermSynonym;

    private List<String> abnormalMpId;
    private List<String> increasedMpId;
    private List<String> decreasedMpId;
    private List<String> abnormalMpTerm;
    private List<String> increasedMpTerm;
    private List<String> decreasedMpTerm;

    private List<String> hpId;
    private List<String> hpTerm;

    private String inferredMaId;
    private String inferredSelectedTopLevelMaId;
    private String inferredSelectedTopLevelMaTerm;

    private String maId;
    private String maTerm;
    private List<String> maTermSynonym;

    private String emapId;
    private String emapTerm;

    private String anatomyId;
    private String anatomyTerm;
    private List<String> anatomyTermSynonym;

    private String embryoAnatomyId;
    private String embryoAnatomyTerm;
    private List<String> topLevelEmbryoAnatomyId;
    private List<String> topLevelEmbryoAnatomyTerm;

    private String mouseAnatomyId;
    private String mouseAnatomyTerm;
    private List<String> topLevelMouseAnatomyId;
    private List<String> topLevelMouseAnatomyTerm;

    private List<String> imitsPhenotypeStarted;
    private List<String> imitsPhenotypeComplete;
    private List<String> imitsPhenotypeStatus;
}
