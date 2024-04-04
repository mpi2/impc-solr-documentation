package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Phenodigm {
    private String type;
    private String diseaseId;
    private String diseaseSource;
    private String diseaseTerm;
    private List<String> diseaseAlts;
    private String diseaseLocus;
    private List<String> diseaseClasses;
    private List<String> diseasePhenotypes;

    private String geneId;
    private String geneSymbol;
    private List<String> geneSymbolsWithdrawn;
    private String geneLocus;
    private String hgncGeneId;
    private String hgncGeneSymbol;
    private List<String> hgncGeneSymbolsWithdrawn;
    private String hgncGeneLocus;

    private boolean mouseModel;
    private boolean impcModel;

    private String modelId;
    private String modelSource;
    private String modelDescription;
    private String modelGeneticBackground;
    private String markerId;
    private String markerSymbol;
    private String markerLocus;
    private int markerNumModels;
    private List<String> modelPhenotypes;

    private String ontology;
    private String phenotypeId;
    private String phenotypeTerm;
    private List<String> phenotypeSynonym;

    private String hpId;
    private String hpTerm;
    private String mpId;
    private String mpTerm;

    private boolean associationCurated;
    private boolean associationOrtholog;
    private List<String> markerSymbolsWithdrawn;

    private List<String> diseaseMatchedPhenotypes;
    private List<String> modelMatchedPhenotypes;
    private double diseaseModelAvgRaw;
    private double diseaseModelAvgNorm;
    private double diseaseModelMaxRaw;
    private double diseaseModelMaxNorm;

    private List<String> searchQf;
    private boolean humanCuratedGene;
    private boolean impcModelWithCuratedGene;
    private boolean mgiModelWithCuratedGene;
    private boolean impcModelWithComputedAssociation;
    private boolean mgiModelWithComputedAssociation;
}
