package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class GenotypePhenotype {
    private String docId;
    private Long ontologyDbId;
    private String assertionType;
    private String assertionTypeId;
    private String mpathTermId;
    private String mpathTermName;
    private List<String> anatomyTermId;
    private List<String> anatomyTermName;
    private List<String> intermediateAnatomyTermId;
    private List<String> intermediateAnatomyTermName;
    private List<String> topLevelAnatomyTermId;
    private List<String> topLevelAnatomyTermName;
    private String mpTermId;
    private String mpTermName;
    private List<String> altMpTermId;
    private List<String> topLevelMpTermId;
    private List<String> topLevelMpTermName;
    private List<String> intermediateMpTermId;
    private List<String> intermediateMpTermName;
    private String markerSymbol;
    private String markerAccessionId;
    private String colonyId;
    private String alleleName;
    private String alleleSymbol;
    private String alleleAccessionId;
    private String strainName;
    private String strainAccessionId;
    private String phenotypingCenter;
    private String projectExternalId;
    private List<String> projectName;
    private String projectFullname;
    private String resourceName;
    private String resourceFullname;
    private String sex;
    private String zygosity;
    private String pipelineName;
    private String pipelineStableId;
    private String pipelineStableKey;
    private String procedureName;
    private List<String> procedureStableId;
    private List<String> procedureStableKey;
    private String parameterName;
    private String parameterStableId;
    private List<String> parameterStableKey;
    private String statisticalMethod;
    private String percentageChange;
    private Double pValue;
    private Double effectSize;
    private String externalId;
    private String lifeStageAcc;
    private String lifeStageName;
}
