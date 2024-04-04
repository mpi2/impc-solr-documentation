package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class StatisticalResult {
    private String docId;
    private Long dbId;
    private String dataType;

    private List<String> anatomyTermId;
    private List<String> anatomyTermName;
    private List<String> intermediateAnatomyTermId;
    private List<String> intermediateAnatomyTermName;
    private List<String> topLevelAnatomyTermId;
    private List<String> topLevelAnatomyTermName;

    private List<String> mpTermIdOptions;
    private List<String> mpTermNameOptions;
    private String mpTermId;
    private String mpTermName;
    private List<String> topLevelMpTermId;
    private List<String> topLevelMpTermName;
    private List<String> intermediateMpTermId;
    private List<String> intermediateMpTermName;

    private String maleMpTermId;
    private String maleMpTermName;
    private List<String> maleTopLevelMpTermId;
    private List<String> maleTopLevelMpTermName;
    private List<String> maleIntermediateMpTermId;
    private List<String> maleIntermediateMpTermName;

    private String femaleMpTermId;
    private String femaleMpTermName;
    private List<String> femaleTopLevelMpTermId;
    private List<String> femaleTopLevelMpTermName;
    private List<String> femaleIntermediateMpTermId;
    private List<String> femaleIntermediateMpTermName;

    private String resourceName;
    private String resourceFullname;
    private Long resourceId;
    private List<String> projectName;
    private String phenotypingCenter;

    private String pipelineStableId;
    private Long pipelineStableKey;
    private String pipelineName;
    private Long pipelineId;

    private List<String> procedureStableId;
    private List<Long> procedureStableKey;
    private String procedureName;
    private Long procedureId;

    private String parameterStableId;
    private List<Long> parameterStableKey;
    private String parameterName;
    private Long parameterId;

    private String colonyId;
    private String markerSymbol;
    private String markerAccessionId;
    private String alleleSymbol;
    private String alleleName;
    private String alleleAccessionId;
    private String strainName;
    private String strainAccessionId;
    private String sex;
    private String zygosity;
    private String controlSelectionMethod;
    private String dependentVariable;
    private String metadataGroup;
    private String dataFrame;

    private String geneticBackground;
    private String productionCenter;

    private Long externalDbId;
    private Long id;
    private Long organisationId;
    private Long phenotypingCenterId;
    private Long projectId;
    private Double maleControlMean;
    private Double maleMutantMean;
    private Double femaleControlMean;
    private Double femaleMutantMean;

    private Double genotypePValueLowVsNormalHigh;
    private Double genotypePValueLowNormalVsHigh;
    private Double genotypeEffectSizeLowVsNormalHigh;
    private Double genotypeEffectSizeLowNormalVsHigh;

    private Double femalePValueLowVsNormalHigh;
    private Double femalePValueLowNormalVsHigh;
    private Double femaleEffectSizeLowVsNormalHigh;
    private Double femaleEffectSizeLowNormalVsHigh;

    private Double malePValueLowVsNormalHigh;
    private Double malePValueLowNormalVsHigh;
    private Double maleEffectSizeLowVsNormalHigh;
    private Double maleEffectSizeLowNormalVsHigh;

    private List<String> categories;
    private Double categoricalPValue;
    private Double categoricalEffectSize;

    private Boolean batchSignificant;
    private Boolean varianceSignificant;
    private Double nullTestPValue;
    private Double genotypeEffectPValue;
    private Double genotypeEffectStderrEstimate;
    private Double genotypeEffectParameterEstimate;

    private String malePercentageChange;
    private String femalePercentageChange;

    private Double sexEffectPValue;
    private Double sexEffectStderrEstimate;
    private Double sexEffectParameterEstimate;

    private Double weightEffectPValue;
    private Double weightEffectStderrEstimate;
    private Double weightEffectParameterEstimate;

    private String group1Genotype;
    private Double group1ResidualsNormalityTest;
    private String group2Genotype;
    private Double group2ResidualsNormalityTest;

    private Double blupsTest;
    private Double rotatedResidualsTest;

    private Double interceptEstimate;
    private Double interceptEstimateStderrEstimate;

    private Boolean interactionSignificant;
    private Double interactionEffectPValue;

    private Double femaleKoEffectPValue;
    private Double femaleKoEffectStderrEstimate;
    private Double femaleKoParameterEstimate;
    private Double femaleEffectSize;

    private Double maleKoEffectPValue;
    private Double maleKoEffectStderrEstimate;
    private Double maleKoParameterEstimate;
    private Double maleEffectSize;

    private String classificationTag;
    private List<String> phenotypeSex;

    private String lifeStageAcc;
    private String lifeStageName;
    private Boolean significant;

    // Soft windowing parameters
    private String softWindowingBandwidth;
    private String softWindowingShape;
    private String softWindowingPeaks;
    private String softWindowingMinObsRequired;
    private String softWindowingTotalObsOrWeight;
    private String softWindowingThreshold;
    private String softWindowingNumberOfDoe;
    private String softWindowingDoeNote;

    // Metadata and dynamic fields
    private List<String> metadata;

}
