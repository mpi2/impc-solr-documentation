package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Experiment;

import java.time.LocalDate;
import java.util.List;

public class ExperimentGenerator {


    public static Experiment generateExampleExperimentResponse() {
        Experiment experiment = new Experiment();
        experiment.setId("EXP001");
        experiment.setObservationId("OBS0001");
        experiment.setSpecimenId("SPEC0001");
        experiment.setPhenotypingCenterId(101L);
        experiment.setPhenotypingCenter("Pheno Center 1");
        experiment.setProductionCenterId(201L);
        experiment.setProductionCenter("Prod Center 2");
        experiment.setSpecimenProjectId(301L);
        experiment.setSpecimenProjectName("Specimen Project 1");
        experiment.setGeneAccessionId("ACC12345");
        experiment.setGeneSymbol("GeneX");
        experiment.setAlleleAccessionId("ALLELE123");
        experiment.setAlleleSymbol("AlleleX");
        experiment.setZygosity("Heterozygous");
        experiment.setSex("Female");
        experiment.setBiologicalModelId(401L);
        experiment.setBiologicalSampleId(501L);
        experiment.setBiologicalSampleGroup("Group A");
        experiment.setStrainAccessionId("STRAIN001");
        experiment.setStrainName("Strain X");
        experiment.setGeneticBackground("Background 1");
        experiment.setAllelicComposition("Comp1/Comp2");
        experiment.setColonyId("Colony001");
        experiment.setLitterId("Litter001");
        experiment.setDateOfBirth(LocalDate.of(2022, 1, 1));
        experiment.setExternalSampleId("External001");
        experiment.setLifeStageName("Adult");
        experiment.setLifeStageAcc("LS123");
        experiment.setDatasourceId(601L);
        experiment.setDatasourceName("DataSource 1");
        experiment.setProjectId(701L);
        experiment.setProjectName("Project Y");
        experiment.setPipelineId(801L);
        experiment.setPipelineName("Pipeline Z");
        experiment.setPipelineStableId("PipelineStable001");
        experiment.setProcedureId(901L);
        experiment.setProcedureName("Procedure 1");
        experiment.setProcedureStableId("ProcedureStable001");
        experiment.setProcedureGroup("Group 1");
        experiment.setParameterId(1001L);
        experiment.setParameterName("Parameter 1");
        experiment.setParameterStableId("ParamStable001");
        experiment.setProcedureSequenceId("Seq001");
        experiment.setExperimentId("Experiment001");
        experiment.setObservationType("Type 1");
        experiment.setDataType("DataType 1");
        experiment.setExperimentSourceId("Source001");
        experiment.setDateOfExperiment(LocalDate.of(2022, 6, 1));
        experiment.setWeightParameterStableId("WeightParam001");
        experiment.setWeightDate(LocalDate.of(2022, 6, 15));
        experiment.setWeightDaysOld(45);
        experiment.setWeight(15.5f);
        experiment.setDataPoint(5.2f);
        experiment.setOrderIndex(1);
        experiment.setDimension("Dimension 1");
        experiment.setTimePoint("Time 1");
        experiment.setDiscretePoint(2.2f);
        experiment.setCategory("Category 1");
        experiment.setRawCategory("Raw Category 1");

        // Multi-valued fields - setting with example lists
        List<String> exampleList = List.of("Item 1", "Item 2");
        experiment.setMetadata(exampleList);
        experiment.setAnatomyId((exampleList));
        experiment.setAnatomyTerm((exampleList));
        experiment.setAnatomyIdTerm((exampleList));
        experiment.setAnatomyTermSynonym((exampleList));
        experiment.setTopLevelAnatomyId((exampleList));
        experiment.setTopLevelAnatomyTerm((exampleList));
        experiment.setTopLevelAnatomyTermSynonym((exampleList));
        experiment.setSelectedTopLevelAnatomyId((exampleList));
        experiment.setSelectedTopLevelAnatomyTerm((exampleList));
        experiment.setSelectedTopLevelAnatomyTermSynonym(List.of("Term Synonym A", "Term Synonym B"));
        experiment.setIntermediateAnatomyId(List.of("Intermediate ID A", "Intermediate ID B"));
        experiment.setIntermediateAnatomyTerm(List.of("Intermediate Term A", "Intermediate Term B"));
        experiment.setIntermediateAnatomyTermSynonym(List.of("Intermediate Synonym A", "Intermediate Synonym B"));
        experiment.setParentAnatomyId(List.of("Parent ID A", "Parent ID B"));
        experiment.setParentAnatomyTerm(List.of("Parent Term A", "Parent Term B"));
        experiment.setParentAnatomyTermSynonym(List.of("Parent Synonym A", "Parent Synonym B"));
        experiment.setChildAnatomyId(List.of("Child ID A", "Child ID B"));
        experiment.setChildAnatomyTerm(List.of("Child Term A", "Child Term B"));
        experiment.setChildAnatomyTermSynonym(List.of("Child Synonym A", "Child Synonym B"));

        experiment.setDownloadFilePath("http://example.com/download/path");
        experiment.setImageLink("http://example.com/image/path");
        experiment.setFileType("JPEG");
        experiment.setIncrementValue("1");

        experiment.setParameterAssociationStableId(List.of("Param Assoc Stable ID A", "Param Assoc Stable ID B"));
        experiment.setParameterAssociationSequenceId(List.of("Param Assoc Seq ID A", "Param Assoc Seq ID B"));
        experiment.setParameterAssociationDimId(List.of("Param Assoc Dim ID A", "Param Assoc Dim ID B"));
        experiment.setParameterAssociationName(List.of("Param Assoc Name A", "Param Assoc Name B"));
        experiment.setParameterAssociationValue(List.of("Param Assoc Value A", "Param Assoc Value B"));

        experiment.setDevelopmentalStageAcc("Dev Stage ACC");
        experiment.setDevelopmentalStageName("Dev Stage Name");
        experiment.setTextValue("Some text value");

        experiment.setSubTermId(List.of("Sub Term ID A", "Sub Term ID B"));
        experiment.setSubTermName(List.of("Sub Term Name A", "Sub Term Name B"));
        experiment.setSubTermDescription(List.of("Sub Term Desc A", "Sub Term Desc B"));

        experiment.setAgeInDays(120);
        experiment.setAgeInWeeks(17);
        return experiment;
    }

}
