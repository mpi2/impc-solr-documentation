package org.mousephenotype.impcsolrdocumentation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Images {
    private String id;
    private String dataType;
    private Integer mouseId;
    private String gender;
    private String colonyName;
    private String genotype;
    private List<String> tagName;
    private List<String> tagValue;
    private List<Float> xStart;
    private List<Float> xEnd;
    private List<Float> yStart;
    private List<Float> yEnd;
    private List<String> annotationTermId;
    private List<String> annotationTermName;
    private String name;
    private String accession;
    private String alleleAccession;
    private List<String> expName;
    private List<String> procedureName;
    private List<String> expDescription;
    private List<String> liveSampleGroup;
    private String fullResolutionFilePath;
    private String largeThumbnailFilePath;
    private String originalFileName;
    private String smallThumbnailFilePath;
    private String ageInWeeks;
    private List<String> symbol;
    private String institute;
    private List<String> sangerSymbol;
    private List<String> geneName;
    private List<String> subtype;
    private List<String> geneSynonyms;
    private List<String> alleleName;
    private List<String> maTermName;
    private List<String> mpTermId;
    private List<String> mpTermName;
    private List<String> expNameExp;
    private List<String> symbolGene;
    private List<String> topLevel;
    private List<String> liveSampleId;
    private String dcfId;
    private String dcfExpId;
    private String sangerProcedureName;
    private Integer sangerProcedureId;
    private String genotypeString;
    private Boolean embryoDataAvailable;
    private Long phenotypingCenterId;
    private String phenotypingCenter;
    private String geneAccession;
    private String geneSymbol;
    private String zygosity;
    private String sex;
    private Long biologicalModelId;
    private Long biologicalSampleId;
    private String biologicalSampleGroup;
    private Integer colonyId;
    private String dateOfBirth;
    private String externalSampleId;
    private Long pipelineId;
    private String pipelineName;
    private String pipelineStableId;
    private Long procedureId;
    private String procedureStableId;
    private Long parameterId;
    private String parameterName;
    private String parameterStableId;
    private Long experimentId;
    private String experimentSourceId;
    private String dateOfExperiment;
    private List<Float> pValue;
    private List<String> mgiAccessionId;
    private List<String> markerSymbol;
    private List<String> markerName;
    private List<String> markerSynonym;
    private List<String> markerType;
    private List<String> humanGeneSymbol;
    private List<String> status;
    private List<String> latestProductionCentre;
    private List<String> latestPhenotypingCentre;
    private List<String> latestPhenotypeStatus;
    private Integer legacyPhenotypeStatus;
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
    private List<Boolean> mgiNovelPredictedInLocus;
    private List<Boolean> impcNovelPredictedInLocus;
    private List<String> mpId;
    private List<String> mpTerm;
    private List<String> mpTermSynonym;
    private List<String> topLevelMpId;
    private List<String> topLevelMpTerm;
    private List<String> topLevelMpTermSynonym;
    private List<String> intermediateMpId;
    private List<String> intermediateMpTerm;
    private List<String> intermediateMpTermSynonym;
    private List<String> childMpId;
    private List<String> childMpTerm;
    private List<String> childMpTermSynonym;
    private List<String> annotatedHigherLevelMpTermId;
    private List<String> annotatedHigherLevelMpTermName;
    private List<String> maId;
    private List<String> maTerm;
    private List<String> maTermSynonym;
    private List<String> selectedTopLevelMaId;
    private List<String> selectedTopLevelMaTerm;
    private List<String> selectedTopLevelMaTermSynonym;
    private List<String> childMaId;
    private List<String> childMaTerm;
    private List<String> childMaTermSynonym;
    private List<String> hpId;
    private List<String> hpTerm;
    private List<String> text;
    private List<String> autoSuggest;
    private List<String> textSearch;
    private List<String> geneQf;
    private List<String> mpQf;
    private List<String> diseaseQf;
    private List<String> maQf;

}