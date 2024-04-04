package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.StatisticalResult;

import java.util.List;

public class StatisticalResultGenerator {


    public static StatisticalResult generateExampleStatisticalResultResponse() {
        StatisticalResult statisticalResult = new StatisticalResult();
        statisticalResult.setDocId("DOC123");
        statisticalResult.setDbId(100L);
        statisticalResult.setDataType("Gene Expression");

        // Anatomy terms mapped from MP
        statisticalResult.setAnatomyTermId(List.of("AID123", "AID456"));
        statisticalResult.setAnatomyTermName(List.of("Heart", "Liver"));
        statisticalResult.setIntermediateAnatomyTermId(List.of("IAID789", "IAID101"));
        statisticalResult.setIntermediateAnatomyTermName(List.of("Ventricle", "Lobe"));
        statisticalResult.setTopLevelAnatomyTermId(List.of("TAID112", "TAID113"));
        statisticalResult.setTopLevelAnatomyTermName(List.of("Circulatory System", "Digestive System"));

        // Information about the MP term
        statisticalResult.setMpTermIdOptions(List.of("MPID123", "MPID456"));
        statisticalResult.setMpTermNameOptions(List.of("Hypertrophy", "Necrosis"));
        statisticalResult.setMpTermId("MPID789");
        statisticalResult.setMpTermName("Atrophy");
        statisticalResult.setTopLevelMpTermId(List.of("TMPID123", "TMPID456"));
        statisticalResult.setTopLevelMpTermName(List.of("Muscle Structure", "Cell Death"));
        statisticalResult.setIntermediateMpTermId(List.of("IMPID789", "IMPID101"));
        statisticalResult.setIntermediateMpTermName(List.of("Muscle Size", "Apoptosis"));

        // Information about the male MP term
        statisticalResult.setMaleMpTermId("MMPID123");
        statisticalResult.setMaleMpTermName("Male Hypertrophy");
        statisticalResult.setMaleTopLevelMpTermId(List.of("MTMPID123", "MTMPID456"));
        statisticalResult.setMaleTopLevelMpTermName(List.of("Male Muscle Structure", "Male Cell Death"));
        statisticalResult.setMaleIntermediateMpTermId(List.of("MIMPID789", "MIMPID101"));
        statisticalResult.setMaleIntermediateMpTermName(List.of("Male Muscle Size", "Male Apoptosis"));

        // Information about the female MP term
        statisticalResult.setFemaleMpTermId("FMPID123");
        statisticalResult.setFemaleMpTermName("Female Hypertrophy");
        statisticalResult.setFemaleTopLevelMpTermId(List.of("FTMPID123", "FTMPID456"));
        statisticalResult.setFemaleTopLevelMpTermName(List.of("Female Muscle Structure", "Female Cell Death"));
        statisticalResult.setFemaleIntermediateMpTermId(List.of("FIMPID789", "FIMPID101"));
        statisticalResult.setFemaleIntermediateMpTermName(List.of("Female Muscle Size", "Female Apoptosis"));

        // Information about the data being processed
        statisticalResult.setResourceName("Resource Name");
        statisticalResult.setResourceFullname("Full Resource Name");
        statisticalResult.setResourceId(200L);
        statisticalResult.setProjectName(List.of("Project X", "Project Y"));
        statisticalResult.setPhenotypingCenter("Center Z");

        // Pipeline information
        statisticalResult.setPipelineStableId("PID123");
        statisticalResult.setPipelineStableKey(300L);
        statisticalResult.setPipelineName("Pipeline Name");
        statisticalResult.setPipelineId(400L);

        // Procedure information
        statisticalResult.setProcedureStableId(List.of("PRID123", "PRID456"));
        statisticalResult.setProcedureStableKey(List.of(500L, 600L));
        statisticalResult.setProcedureName("Procedure Name");
        statisticalResult.setProcedureId(700L);

        // Parameter information
        statisticalResult.setParameterStableId("PAID123");
        statisticalResult.setParameterStableKey(List.of(800L));
        statisticalResult.setParameterName("Parameter Name");
        statisticalResult.setParameterId(900L);

        // Genetic information
        statisticalResult.setColonyId("Colony123");
        statisticalResult.setMarkerSymbol("Gene123");
        statisticalResult.setMarkerAccessionId("M123456");
        statisticalResult.setAlleleSymbol("Allele123");
        statisticalResult.setAlleleName("Allele Name");
        statisticalResult.setAlleleAccessionId("A123456");
        statisticalResult.setStrainName("Strain Name");
        statisticalResult.setStrainAccessionId("S123456");
        statisticalResult.setSex("Male");
        statisticalResult.setZygosity("Homozygote");
        statisticalResult.setControlSelectionMethod("Random");
        statisticalResult.setDependentVariable("Weight");
        statisticalResult.setMetadataGroup("Group1");
        statisticalResult.setDataFrame("Frame1");
        statisticalResult.setGeneticBackground("C57BL/6N");
        statisticalResult.setProductionCenter("EMBL-EBI");

        statisticalResult.setExternalDbId(101L);
        statisticalResult.setId(102L);
        statisticalResult.setOrganisationId(103L);
        statisticalResult.setPhenotypingCenterId(104L);
        statisticalResult.setProjectId(105L);

        statisticalResult.setMaleControlMean(0.5);
        statisticalResult.setMaleMutantMean(1.5);
        statisticalResult.setFemaleControlMean(0.4);
        statisticalResult.setFemaleMutantMean(1.4);

        statisticalResult.setGenotypePValueLowVsNormalHigh(0.01);
        statisticalResult.setGenotypePValueLowNormalVsHigh(0.02);
        statisticalResult.setGenotypeEffectSizeLowVsNormalHigh(0.5);
        statisticalResult.setGenotypeEffectSizeLowNormalVsHigh(0.6);

        statisticalResult.setFemalePValueLowVsNormalHigh(0.03);
        statisticalResult.setFemalePValueLowNormalVsHigh(0.04);
        statisticalResult.setFemaleEffectSizeLowVsNormalHigh(0.7);
        statisticalResult.setFemaleEffectSizeLowNormalVsHigh(0.8);

        statisticalResult.setMalePValueLowVsNormalHigh(0.05);
        statisticalResult.setMalePValueLowNormalVsHigh(0.06);
        statisticalResult.setMaleEffectSizeLowVsNormalHigh(0.9);
        statisticalResult.setMaleEffectSizeLowNormalVsHigh(1.0);

        statisticalResult.setCategories(List.of("Category 1", "Category 2"));
        statisticalResult.setCategoricalPValue(0.07);
        statisticalResult.setCategoricalEffectSize(1.1);

        statisticalResult.setBatchSignificant(true);
        statisticalResult.setVarianceSignificant(false);
        statisticalResult.setNullTestPValue(0.08);
        statisticalResult.setGenotypeEffectPValue(0.09);
        statisticalResult.setGenotypeEffectStderrEstimate(0.10);
        statisticalResult.setGenotypeEffectParameterEstimate(0.11);

        statisticalResult.setMalePercentageChange("10%");
        statisticalResult.setFemalePercentageChange("20%");

        statisticalResult.setSexEffectPValue(0.12);
        statisticalResult.setSexEffectStderrEstimate(0.13);
        statisticalResult.setSexEffectParameterEstimate(0.14);

        statisticalResult.setWeightEffectPValue(0.15);
        statisticalResult.setWeightEffectStderrEstimate(0.16);
        statisticalResult.setWeightEffectParameterEstimate(0.17);

        statisticalResult.setGroup1Genotype("WT");
        statisticalResult.setGroup1ResidualsNormalityTest(0.18);
        statisticalResult.setGroup2Genotype("Mutant");
        statisticalResult.setGroup2ResidualsNormalityTest(0.19);

        statisticalResult.setBlupsTest(0.20);
        statisticalResult.setRotatedResidualsTest(0.21);

        statisticalResult.setInterceptEstimate(0.22);
        statisticalResult.setInterceptEstimateStderrEstimate(0.23);

        statisticalResult.setInteractionSignificant(true);
        statisticalResult.setInteractionEffectPValue(0.24);

        statisticalResult.setFemaleKoEffectPValue(0.25);
        statisticalResult.setFemaleKoEffectStderrEstimate(0.26);
        statisticalResult.setFemaleKoParameterEstimate(0.27);
        statisticalResult.setFemaleEffectSize(0.28);

        statisticalResult.setMaleKoEffectPValue(0.29);
        statisticalResult.setMaleKoEffectStderrEstimate(0.30);
        statisticalResult.setMaleKoParameterEstimate(0.31);
        statisticalResult.setMaleEffectSize(0.32);

        statisticalResult.setClassificationTag("Tag1");
        statisticalResult.setPhenotypeSex(List.of("Male", "Female"));

        statisticalResult.setLifeStageAcc("LS:001");
        statisticalResult.setLifeStageName("Adulthood");
        statisticalResult.setSignificant(true);

        // Soft windowing parameters
        statisticalResult.setSoftWindowingBandwidth("Medium");
        statisticalResult.setSoftWindowingShape("Gaussian");
        statisticalResult.setSoftWindowingPeaks("3");
        statisticalResult.setSoftWindowingMinObsRequired("10");
        statisticalResult.setSoftWindowingTotalObsOrWeight("50");
        statisticalResult.setSoftWindowingThreshold("0.05");
        statisticalResult.setSoftWindowingNumberOfDoe("5");
        statisticalResult.setSoftWindowingDoeNote("Doe Note Example");
        statisticalResult.setMetadata(List.of("Metadata1", "Metadata2"));

        return statisticalResult;
    }

}
