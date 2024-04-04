package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrthologMapping {

    private String hgHgncAccId;
    private String hgSymbol;
    private String hmfCategoryForThreshold;
    private Long hmfHumanGeneId;
    private Long hmfId;
    private Long hmfOrthologsAboveThreshold;
    private Long hmfSupportCountThreshold;
    private String id;
    private String mgMgiGeneAccId;
    private String mgSymbol;
    private String mmfCategoryForThreshold;
    private Long mmfId;
    private Long mmfMouseGeneId;
    private Long mmfOrthologsAboveThreshold;
    private Long mmfSupportCountThreshold;
    private String oCategory;
    private Long oHumanGeneId;
    private Long oId;
    private String oIsMaxHumanToMouse;
    private String oIsMaxMouseToHuman;
    private Long oMouseGeneId;
    private String oSupport;
    private Long oSupportCount;
    private String oSupportRaw;
}
