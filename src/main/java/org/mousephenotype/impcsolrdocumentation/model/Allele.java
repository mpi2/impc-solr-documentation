package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Allele {

    private String dataType;
    private String mgiAccessionId;
    private String markerSymbol;
    private List<String> humanGeneSymbol;
    private String markerName;
    private List<String> markerSynonym;
    private String markerType;
    private List<String> ensemblGeneId;
    private String imitsPhenotypeStarted;
    private String imitsPhenotypeComplete;
    private String imitsPhenotypeStatus;
    private String status;
    private String latestProductionStatus;
    private String geneLatestEsCellStatus;
    private String latestEsCellStatus;
    private String geneLatestMouseStatus;
    private String latestMouseStatus;
    private Integer legacyPhenotypeStatus;
    private String latestPhenotypeStatus;
    private String latestProjectStatus;
    private List<String> latestProductionCentre;
    private List<String> latestPhenotypingCentre;
    private String chrName;
    private Integer chrStart;
    private Integer chrEnd;
    private String chrStrand;
    private List<String> alleleName;
    private List<String> alleleAccessionId;
    private List<String> esCellStatus;
    private String imitsMouseStatus;
    private List<String> mouseStatus;
    private List<String> phenotypeStatus;
    private List<String> productionCentre;
    private List<String> phenotypingCentre;
    private List<String> goTermId;
    private List<String> goTermName;
    private List<String> goTermDef;
    private List<String> goTermEvid;
    private List<String> goTermDomain;
    private Integer goCount; // pint
    private List<String> goUniprot;
    private Integer evidCodeRank; // pint
    private List<String> pfamaJson;
    private List<String> scdbId;
    private List<String> scdbLink;
    private List<String> clanId;
    private List<String> clanAcc;
    private List<String> clanDesc;
    private List<String> pfamaId;
    private List<String> pfamaAcc;
    private List<String> pfamaGoId;
    private List<String> pfamaGoTerm;
    private List<String> pfamaGoCat;
    private String gfAcc;
    private String alleleMgiAccessionId;
    private List<String> imitsEsCellStatus;
    private String ikmcProject;
    private String geneAllele;
    private List<String> diseaseHumanPhenotypes;
    private String type;
    private List<String> diseaseId;
    private List<String> diseaseSource;
    private List<String> diseaseTerm;
    private List<String> diseaseAlts;
    private List<String> diseaseClasses;
    private List<Boolean> humanCurated;
    private List<Boolean> mouseCurated;
    private List<Boolean> mgiPredicted;
    private List<Boolean> impcPredicted;
    private List<Boolean> mgiPredictedKnownGene;
    private List<Boolean> impcPredictedKnownGene;
    private List<Boolean> impcNovelPredictedInLocus;
    private List<Boolean> mgiNovelPredictedInLocus;
    private List<String> markerSymbolBf;
    private List<String> markerSymbolLowercase;
    private List<String> markerSynonymLowercase;
    private List<String> text;
    private List<String> autoSuggest;
}
