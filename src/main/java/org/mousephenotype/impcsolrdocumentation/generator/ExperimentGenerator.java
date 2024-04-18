package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Experiment;

import java.time.LocalDate;
import java.util.List;

public class ExperimentGenerator {


    public static Experiment generateExampleExperimentResponse() {
        Experiment experiment = new Experiment();
        experiment.setObservation_id("OBS0001");
        experiment.setSpecimen_id("SPEC0001");
        experiment.setPhenotyping_center_id(101L);
        experiment.setPhenotyping_center("Pheno Center 1");
        experiment.setProduction_center_id(201L);
        experiment.setProduction_center("Prod Center 2");
        experiment.setSpecimen_project_id(301L);
        experiment.setSpecimen_project_name("Specimen Project 1");
        experiment.setGene_accession_id("ACC12345");
        experiment.setGene_symbol("GeneX");
        experiment.setAllele_accession_id("ALLELE123");
        experiment.setAllele_symbol("AlleleX");
        experiment.setMetadata_group("MetadataGroup1");
        experiment.setZygosity("Heterozygous");
        experiment.setSex("Female");
        experiment.setBiological_model_id(401L);
        experiment.setBiological_sample_id(501L);
        experiment.setBiological_sample_group("Group A");
        experiment.setStrain_accession_id("STRAIN001");
        experiment.setStrain_name("Strain X");
        experiment.setGenetic_background("Background 1");
        experiment.setAllelic_composition("Comp1/Comp2");
        experiment.setColony_id("Colony001");
        experiment.setLitter_id("Litter001");
        experiment.setDate_of_birth(LocalDate.of(2022, 1, 1));
        experiment.setExternal_sample_id("External001");
        experiment.setLife_stage_name("Adult");
        experiment.setLife_stage_acc("LS123");
        experiment.setDatasource_id(601L);
        experiment.setDatasource_name("DataSource 1");
        experiment.setProject_id(701L);
        experiment.setProject_name("Project Y");
        experiment.setPipeline_id(801L);
        experiment.setPipeline_name("Pipeline Z");
        experiment.setPipeline_stable_id("PipelineStable001");
        experiment.setProcedure_id(901L);
        experiment.setProcedure_name("Procedure 1");
        experiment.setProcedure_stable_id("ProcedureStable001");
        experiment.setProcedure_group("Group 1");
        experiment.setParameter_id(1001L);
        experiment.setParameter_name("Parameter 1");
        experiment.setParameter_stable_id("ParamStable001");
        experiment.setProcedure_sequence_id("Seq001");
        experiment.setExperiment_id("Experiment001");
        experiment.setObservation_type("Type 1");
        experiment.setData_type("DataType 1");
        experiment.setExperiment_source_id("Source001");
        experiment.setDate_of_experiment(LocalDate.of(2022, 6, 1));
        experiment.setWeight_parameter_stable_id("WeightParam001");
        experiment.setWeight_date(LocalDate.of(2022, 6, 15));
        experiment.setWeight_days_old(45);
        experiment.setWeight(15.5f);
        experiment.setData_point(5.2f);
        experiment.setOrder_index(1);
        experiment.setDimension("Dimension 1");
        experiment.setTime_point("Time 1");
        experiment.setDiscrete_point(2.2f);
        experiment.setCategory("Category 1");
        experiment.setRaw_category("Raw Category 1");

// Multi-valued fields - setting with example lists
        List<String> exampleList = List.of("Item 1", "Item 2");
        experiment.setMetadata(exampleList);
        experiment.setAnatomy_id((exampleList));
        experiment.setAnatomy_term((exampleList));
        experiment.setAnatomy_id_term((exampleList));
        experiment.setAnatomy_term_synonym((exampleList));
        experiment.setTop_level_anatomy_id((exampleList));
        experiment.setTop_level_anatomy_term((exampleList));
        experiment.setTop_level_anatomy_term_synonym((exampleList));
        experiment.setSelected_top_level_anatomy_id((exampleList));
        experiment.setSelected_top_level_anatomy_term((exampleList));
        experiment.setSelected_top_level_anatomy_term_synonym(List.of("Term Synonym A", "Term Synonym B"));
        experiment.setIntermediate_anatomy_id(List.of("Intermediate ID A", "Intermediate ID B"));
        experiment.setIntermediate_anatomy_term(List.of("Intermediate Term A", "Intermediate Term B"));
        experiment.setIntermediate_anatomy_term_synonym(List.of("Intermediate Synonym A", "Intermediate Synonym B"));
        experiment.setParent_anatomy_id(List.of("Parent ID A", "Parent ID B"));
        experiment.setParent_anatomy_term(List.of("Parent Term A", "Parent Term B"));
        experiment.setParent_anatomy_term_synonym(List.of("Parent Synonym A", "Parent Synonym B"));
        experiment.setChild_anatomy_id(List.of("Child ID A", "Child ID B"));
        experiment.setChild_anatomy_term(List.of("Child Term A", "Child Term B"));
        experiment.setChild_anatomy_term_synonym(List.of("Child Synonym A", "Child Synonym B"));

        experiment.setDownload_file_path("http://example.com/download/path");
        experiment.setImage_link("http://example.com/image/path");
        experiment.setFile_type("JPEG");
        experiment.setIncrement_value("1");

        experiment.setParameter_association_stable_id(List.of("Param Assoc Stable ID A", "Param Assoc Stable ID B"));
        experiment.setParameter_association_sequence_id(List.of("Param Assoc Seq ID A", "Param Assoc Seq ID B"));
        experiment.setParameter_association_dim_id(List.of("Param Assoc Dim ID A", "Param Assoc Dim ID B"));
        experiment.setParameter_association_name(List.of("Param Assoc Name A", "Param Assoc Name B"));
        experiment.setParameter_association_value(List.of("Param Assoc Value A", "Param Assoc Value B"));

        experiment.setDevelopmental_stage_acc("Dev Stage ACC");
        experiment.setDevelopmental_stage_name("Dev Stage Name");
        experiment.setText_value("Some text value");

        experiment.setSub_term_id(List.of("Sub Term ID A", "Sub Term ID B"));
        experiment.setSub_term_name(List.of("Sub Term Name A", "Sub Term Name B"));
        experiment.setSub_term_description(List.of("Sub Term Desc A", "Sub Term Desc B"));

        experiment.setAge_in_days(120);
        experiment.setAge_in_weeks(17);
        return experiment;


    }

}
