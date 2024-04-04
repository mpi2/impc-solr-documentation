package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Product {
    private String alleleDesignProject;
    private Boolean alleleHasIssues;
    private String alleleId;
    private String alleleName;
    private String alleleDescription;
    private String alleleType;
    private String associatedProductColonyName;
    private String associatedProductEsCellName;
    private String associatedProductVectorName;
    private List<String> associatedProductsColonyNames;
    private List<String> associatedProductsEsCellNames;
    private List<String> associatedProductsVectorNames;
    private String cassette;
    private List<String> contactLinks;
    private List<String> contactNames;
    private String designId;
    private List<String> geneticInfo;
    private String ikmcProjectId;
    private List<String> loaAssays;
    private String markerSymbol;
    private String mgiAccessionId;
    private String name;
    private List<String> orderLinks;
    private List<String> orderNames;
    private List<String> otherLinks;
    private List<String> tissueEnquiryLinks;
    private List<String> tissueEnquiryTypes;
    private List<String> tissueDistributionCentres;
    private String productId;
    private String productIndex;
    private String productionCentre;
    private Boolean productionCompleted;
    private List<String> productionInfo;
    private String productionPipeline;
    private List<String> qcData;
    private String status;
    private String statusDate;
    private String type;
}
