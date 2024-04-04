package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.ImpcImages;

import java.time.LocalDate;
import java.util.List;

public class ImpcImagesGenerator {


    public static ImpcImages generateExampleImpcImagesResponse() {
        ImpcImages impcImages = new ImpcImages();
        impcImages.setId("1");
        impcImages.setObservationId("obs-001");
        impcImages.setSpecimenId("spec-001");
        impcImages.setPhenotypingCenterId(100L);
        impcImages.setPhenotypingCenter("Center A");
        impcImages.setProductionCenterId(101L);
        impcImages.setProductionCenter("Center B");
        impcImages.setSpecimenProjectId(200L);
        impcImages.setSpecimenProjectName("Project X");
        impcImages.setGeneAccessionId("Gene-001");
        impcImages.setGeneSymbol("Gn1");
        impcImages.setAlleleAccessionId("Allele-001");
        impcImages.setAlleleSymbol("Al1");
        impcImages.setZygosity("Homozygous");
        impcImages.setSex("Male");
        impcImages.setBiologicalModelId(300L);
        impcImages.setBiologicalSampleId(301L);
        impcImages.setBiologicalSampleGroup("Group 1");
        impcImages.setStrainAccessionId("Strain-001");
        impcImages.setStrainName("Strain A");
        impcImages.setGeneticBackground("Background 1");
        impcImages.setAllelicComposition("Comp 1");
        impcImages.setColonyId("Colony-001");
        impcImages.setLitterId("Litter-001");
        impcImages.setDateOfBirth(LocalDate.of(2020, 1, 1));
        impcImages.setExternalSampleId("ExtSample-001");
        impcImages.setLifeStageName("Adult");
        impcImages.setLifeStageAcc("LS-001");
        impcImages.setDatasourceId(400L);
        impcImages.setDatasourceName("DataSource A");
        impcImages.setProjectId(500L);
        impcImages.setProjectName("Project Y");
        impcImages.setPipelineId(600L);
        impcImages.setPipelineName("Pipeline Z");
        impcImages.setPipelineStableId("PSI-001");
        impcImages.setProcedureId(700L);
        impcImages.setProcedureName("Procedure 1");
        impcImages.setProcedureStableId("PS-001");
        impcImages.setProcedureGroup("Group 2");
        impcImages.setParameterId(800L);
        impcImages.setParameterName("Parameter 1");
        impcImages.setParameterStableId("Param-001");
        impcImages.setProcedureSequenceId("Seq-001");
        impcImages.setExperimentId("Exp-001");
        impcImages.setObservationType("Type 1");
        impcImages.setDataType("Data Type 1");
        impcImages.setExperimentSourceId("Source-001");
        impcImages.setDateOfExperiment(LocalDate.now());
        impcImages.setWeightParameterStableId("WPID-001");
        impcImages.setWeightDate(LocalDate.of(2020, 6, 15));
        impcImages.setWeightDaysOld(100);
        impcImages.setWeight(20.5F);
        impcImages.setDataPoint(5.5F);
        impcImages.setOrderIndex(1);
        impcImages.setDimension("Dimension 1");
        impcImages.setTimePoint("Day 1");
        impcImages.setDiscretePoint(1.5F);
        impcImages.setCategory("Category 1");
        impcImages.setRawCategory("Raw Category 1");
        impcImages.setMetadata(List.of("Meta1", "Meta2"));
        impcImages.setMetadataGroup("Metadata Group 1");
        impcImages.setMpId(List.of("MPID-1", "MPID-2"));
        impcImages.setMpTerm(List.of("Term 1", "Term 2"));
        impcImages.setTopLevelMpId(List.of("TL-MPID-1", "TL-MPID-2"));
        impcImages.setTopLevelMpTerm(List.of("Top Level Term 1", "Top Level Term 2"));
        impcImages.setIntermediateMpId(List.of("IMPID-1", "IMPID-2"));
        impcImages.setIntermediateMpTerm(List.of("Intermediate Term 1", "Intermediate Term 2"));
        impcImages.setAnatomyId(List.of("AnatomyID-1", "AnatomyID-2"));
        impcImages.setAnatomyTerm(List.of("Anatomy Term 1", "Anatomy Term 2"));
        impcImages.setAnatomyIdTerm(List.of("AnatomyIDTerm-1", "AnatomyIDTerm-2"));
        impcImages.setAnatomyTermSynonym(List.of("Synonym 1", "Synonym 2"));
        impcImages.setTopLevelAnatomyId(List.of("TLAnatomyID-1", "TLAnatomyID-2"));
        impcImages.setTopLevelAnatomyTerm(List.of("TL Anatomy Term 1", "TL Anatomy Term 2"));
        impcImages.setSelectedTopLevelAnatomyId(List.of("STLAnatomyID-1", "STLAnatomyID-2"));
        impcImages.setSelectedTopLevelAnatomyTerm(List.of("Selected TL Anatomy Term 1", "Selected TL Anatomy Term 2"));
        impcImages.setIntermediateAnatomyId(List.of("IAnatomyID-1", "IAnatomyID-2"));
        impcImages.setIntermediateAnatomyTerm(List.of("Intermediate Anatomy Term 1", "Intermediate Anatomy Term 2"));
        impcImages.setParentAnatomyId(List.of("ParentAnatomyID-1", "ParentAnatomyID-2"));
        impcImages.setParentAnatomyTerm(List.of("Parent Anatomy Term 1", "Parent Anatomy Term 2"));
        impcImages.setChildAnatomyId(List.of("ChildAnatomyID-1", "ChildAnatomyID-2"));
        impcImages.setChildAnatomyTerm(List.of("Child Anatomy Term 1", "Child Anatomy Term 2"));
        impcImages.setDownloadFilePath("/path/to/download");
        impcImages.setImageLink("http://example.com/image");
        impcImages.setFileType("jpeg");
        impcImages.setParameterAssociationStableId(List.of("PAStableID-1", "PAStableID-2"));
        impcImages.setParameterAssociationSequenceId(List.of("PASeqID-1", "PASeqID-2"));
        impcImages.setParameterAssociationDimId(List.of("PADimID-1", "PADimID-2"));
        impcImages.setParameterAssociationName(List.of("PA Name 1", "PA Name 2"));
        impcImages.setParameterAssociationValue(List.of("PA Value 1", "PA Value 2"));
        impcImages.setDevelopmentalStageAcc("DevStageAcc-1");
        impcImages.setDevelopmentalStageName("Development Stage 1");
        impcImages.setTextValue("Some text value");
        impcImages.setSubTermId(List.of("SubTermID-1", "SubTermID-2"));
        impcImages.setSubTermName(List.of("SubTerm Name 1", "SubTerm Name 2"));
        impcImages.setSubTermDescription(List.of("SubTerm Description 1", "SubTerm Description 2"));
        impcImages.setSequenceId(123);
        impcImages.setAgeInDays(45);
        impcImages.setAgeInWeeks(6);
        impcImages.setDownloadUrl("http://example.com/download");
        impcImages.setJpegUrl("http://example.com/jpeg");
        impcImages.setThumbnailUrl("http://example.com/thumbnail");
        impcImages.setOmeroId("OmeroID-1");


        return impcImages;
    }

}
