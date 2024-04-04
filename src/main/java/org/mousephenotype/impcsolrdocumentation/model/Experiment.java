package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class Experiment {
    private String id;
    private String observationId;
    private String specimenId;
    private Long phenotypingCenterId;
    private String phenotypingCenter;
    private Long productionCenterId;
    private String productionCenter;
    private Long specimenProjectId;
    private String specimenProjectName;
    private String geneAccessionId;
    private String geneSymbol;
    private String alleleAccessionId;
    private String alleleSymbol;
    private String zygosity;
    private String sex;
    private Long biologicalModelId;
    private Long biologicalSampleId;
    private String biologicalSampleGroup;
    private String strainAccessionId;
    private String strainName;
    private String geneticBackground;
    private String allelicComposition;
    private String colonyId;
    private String litterId;
    private LocalDate dateOfBirth;
    private String externalSampleId;
    private String lifeStageName;
    private String lifeStageAcc;
    private Long datasourceId;
    private String datasourceName;
    private Long projectId;
    private String projectName;
    private Long pipelineId;
    private String pipelineName;
    private String pipelineStableId;
    private Long procedureId;
    private String procedureName;
    private String procedureStableId;
    private String procedureGroup;
    private Long parameterId;
    private String parameterName;
    private String parameterStableId;
    private String procedureSequenceId;
    private String experimentId;
    private String observationType;
    private String dataType;
    private String experimentSourceId;
    private LocalDate dateOfExperiment;
    private String weightParameterStableId;
    private LocalDate weightDate;
    private Integer weightDaysOld;
    private Float weight;
    private Float dataPoint;
    private Integer orderIndex;
    private String dimension;
    private String timePoint;
    private Float discretePoint;
    private String category;
    private String rawCategory;
    private List<String> metadata;
    private String metadataGroup;
    private List<String> anatomyId;
    private List<String> anatomyTerm;
    private List<String> anatomyIdTerm;
    private List<String> anatomyTermSynonym;
    private List<String> topLevelAnatomyId;
    private List<String> topLevelAnatomyTerm;
    private List<String> topLevelAnatomyTermSynonym;
    private List<String> selectedTopLevelAnatomyId;
    private List<String> selectedTopLevelAnatomyTerm;
    private List<String> selectedTopLevelAnatomyTermSynonym;
    private List<String> intermediateAnatomyId;
    private List<String> intermediateAnatomyTerm;
    private List<String> intermediateAnatomyTermSynonym;
    private List<String> parentAnatomyId;
    private List<String> parentAnatomyTerm;
    private List<String> parentAnatomyTermSynonym;
    private List<String> childAnatomyId;
    private List<String> childAnatomyTerm;
    private List<String> childAnatomyTermSynonym;
    private String downloadFilePath;
    private String imageLink;
    private String fileType;
    private String incrementValue;
    private List<String> parameterAssociationStableId;
    private List<String> parameterAssociationSequenceId;
    private List<String> parameterAssociationDimId;
    private List<String> parameterAssociationName;
    private List<String> parameterAssociationValue;
    private String developmentalStageAcc;
    private String developmentalStageName;
    private String textValue;
    private List<String> subTermId;
    private List<String> subTermName;
    private List<String> subTermDescription;
    private Integer ageInDays;
    private Integer ageInWeeks;

}
