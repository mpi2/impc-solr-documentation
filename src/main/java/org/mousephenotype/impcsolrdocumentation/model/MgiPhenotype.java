package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class MgiPhenotype {
    private String docId;
    private String assertionType;
    private String assertionTypeId;
    private String mpathTermId;
    private String mpathTermName;
    private String emapTermId;
    private String emapTermName;
    private String mpTermId;
    private String mpTermName;
    private List<String> altMpTermId;
    private List<String> topLevelMpTermId;
    private List<String> topLevelMpTermName;
    private List<String> topLevelMpTermDefinition;
    private List<String> topLevelMpTermSynonym;
    private List<String> intermediateMpTermId;
    private List<String> intermediateMpTermName;
    private List<String> intermediateMpTermDefinition;
    private List<String> intermediateMpTermSynonym;
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
    private String projectName;
    private String projectFullname;
    private String resourceName;
    private String resourceFullname;
    private String sex;
    private String zygosity;
    private String pipelineName;
    private String pipelineStableId;
    private String pipelineStableKey;
    private String procedureName;
    private String procedureStableId;
    private String procedureStableKey;
    private String parameterName;
    private String parameterStableId;
    private String parameterStableKey;
    private String statisticalMethod;
    private String percentageChange;
    private Double pValue;
    private Double effectSize;
    private String externalId;
    private String lifeStageAcc;
    private String lifeStageName;
}
