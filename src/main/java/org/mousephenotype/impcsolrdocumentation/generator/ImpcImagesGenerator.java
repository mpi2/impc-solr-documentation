package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.ImpcImages;

import java.time.LocalDate;
import java.util.List;

public class ImpcImagesGenerator {


    public static ImpcImages generateExampleImpcImagesResponse() {
        ImpcImages impcImages = new ImpcImages();
        impcImages.setId("1");
        impcImages.setObservation_id("obs-001");
        impcImages.setSpecimen_id("spec-001");
        impcImages.setPhenotyping_center_id(100L);
        impcImages.setPhenotyping_center("Center A");
        impcImages.setProduction_center_id(101L);
        impcImages.setProduction_center("Center B");
        impcImages.setSpecimen_project_id(200L);
        impcImages.setSpecimen_project_name("Project X");
        impcImages.setGene_accession_id("Gene-001");
        impcImages.setGene_symbol("Gn1");
        impcImages.setAllele_accession_id("Allele-001");
        impcImages.setAllele_symbol("Al1");
        impcImages.setZygosity("Homozygous");
        impcImages.setSex("Male");
        impcImages.setBiological_model_id(300L);
        impcImages.setBiological_sample_id(301L);
        impcImages.setBiological_sample_group("Group 1");
        impcImages.setStrain_accession_id("Strain-001");
        impcImages.setStrain_name("Strain A");
        impcImages.setGenetic_background("Background 1");
        impcImages.setAllelic_composition("Comp 1");
        impcImages.setColony_id("Colony-001");
        impcImages.setLitter_id("Litter-001");
        impcImages.setDate_of_birth(LocalDate.of(2020, 1, 1));
        impcImages.setExternal_sample_id("ExtSample-001");
        impcImages.setLife_stage_name("Adult");
        impcImages.setLife_stage_acc("LS-001");
        impcImages.setDatasource_id(400L);
        impcImages.setDatasource_name("DataSource A");
        impcImages.setProject_id(500L);
        impcImages.setProject_name("Project Y");
        impcImages.setPipeline_id(600L);
        impcImages.setPipeline_name("Pipeline Z");
        impcImages.setPipeline_stable_id("PSI-001");
        impcImages.setProcedure_id(700L);
        impcImages.setProcedure_name("Procedure 1");
        impcImages.setProcedure_stable_id("PS-001");
        impcImages.setProcedure_group("Group 2");
        impcImages.setParameter_id(800L);
        impcImages.setParameter_name("Parameter 1");
        impcImages.setParameter_stable_id("Param-001");
        impcImages.setProcedure_sequence_id("Seq-001");
        impcImages.setExperiment_id("Exp-001");
        impcImages.setObservation_type("Type 1");
        impcImages.setData_type("Data Type 1");
        impcImages.setExperiment_source_id("Source-001");
        impcImages.setDate_of_experiment(LocalDate.now());
        impcImages.setWeight_parameter_stable_id("WPID-001");
        impcImages.setWeight_date(LocalDate.of(2020, 6, 15));
        impcImages.setWeight_days_old(100);
        impcImages.setWeight(20.5F);
        impcImages.setData_point(5.5F);
        impcImages.setOrder_index(1);
        impcImages.setDimension("Dimension 1");
        impcImages.setTime_point("Day 1");
        impcImages.setDiscrete_point(1.5F);
        impcImages.setCategory("Category 1");
        impcImages.setRaw_category("Raw Category 1");
        impcImages.setMetadata(List.of("Meta1", "Meta2"));
        impcImages.setMetadata_group("Metadata Group 1");
        impcImages.setMp_id(List.of("MPID-1", "MPID-2"));
        impcImages.setMp_term(List.of("Term 1", "Term 2"));
        impcImages.setTop_level_mp_id(List.of("TL-MPID-1", "TL-MPID-2"));
        impcImages.setTop_level_mp_term(List.of("Top Level Term 1", "Top Level Term 2"));
        impcImages.setIntermediate_mp_id(List.of("IMPID-1", "IMPID-2"));
        impcImages.setIntermediate_mp_term(List.of("Intermediate Term 1", "Intermediate Term 2"));
        impcImages.setAnatomy_id(List.of("AnatomyID-1", "AnatomyID-2"));
        impcImages.setAnatomy_term(List.of("Anatomy Term 1", "Anatomy Term 2"));
        impcImages.setAnatomy_id_term(List.of("AnatomyIDTerm-1", "AnatomyIDTerm-2"));
        impcImages.setAnatomy_term_synonym(List.of("Synonym 1", "Synonym 2"));
        impcImages.setTop_level_anatomy_id(List.of("TLAnatomyID-1", "TLAnatomyID-2"));
        impcImages.setTop_level_anatomy_term(List.of("TL Anatomy Term 1", "TL Anatomy Term 2"));
        impcImages.setTop_level_anatomy_term_synonym(List.of("TL Anatomy Term 1", "TL Anatomy Term 2"));
        impcImages.setSelected_top_level_anatomy_id(List.of("STLAnatomyID-1", "STLAnatomyID-2"));
        impcImages.setSelected_top_level_anatomy_term(List.of("Selected TL Anatomy Term 1", "Selected TL Anatomy Term 2"));
        impcImages.setSelected_top_level_anatomy_term_synonym(List.of("Selected TL Anatomy Term 1", "Selected TL Anatomy Term 2"));
        impcImages.setIntermediate_anatomy_id(List.of("IAnatomyID-1", "IAnatomyID-2"));
        impcImages.setIntermediate_anatomy_term(List.of("Intermediate Anatomy Term 1", "Intermediate Anatomy Term 2"));
        impcImages.setIntermediate_anatomy_term_synonym(List.of("Intermediate Anatomy Term 1", "Intermediate Anatomy Term 2"));
        impcImages.setParent_anatomy_id(List.of("ParentAnatomyID-1", "ParentAnatomyID-2"));
        impcImages.setParent_anatomy_term(List.of("Parent Anatomy Term 1", "Parent Anatomy Term 2"));
        impcImages.setParent_anatomy_term_synonym(List.of("Parent Anatomy Term 1", "Parent Anatomy Term 2"));
        impcImages.setChild_anatomy_id(List.of("ChildAnatomyID-1", "ChildAnatomyID-2"));
        impcImages.setChild_anatomy_term(List.of("Child Anatomy Term 1", "Child Anatomy Term 2"));
        impcImages.setChild_anatomy_term_synonym(List.of("Child Anatomy Term 1", "Child Anatomy Term 2"));
        impcImages.setDownload_file_path("/path/to/download");
        impcImages.setImage_link("http://example.com/image");
        impcImages.setFile_type("jpeg");
        impcImages.setParameter_association_stable_id(List.of("PAStableID-1", "PAStableID-2"));
        impcImages.setParameter_association_sequence_id(List.of("PASeqID-1", "PASeqID-2"));
        impcImages.setParameter_association_dim_id(List.of("PADimID-1", "PADimID-2"));
        impcImages.setParameter_association_name(List.of("PA Name 1", "PA Name 2"));
        impcImages.setParameter_association_value(List.of("PA Value 1", "PA Value 2"));
        impcImages.setDevelopmental_stage_acc("DevStageAcc-1");
        impcImages.setDevelopmental_stage_name("Development Stage 1");
        impcImages.setText_value("Some text value");
        impcImages.setSub_term_id(List.of("SubTermID-1", "SubTermID-2"));
        impcImages.setSub_term_name(List.of("SubTerm Name 1", "SubTerm Name 2"));
        impcImages.setSub_term_description(List.of("SubTerm Description 1", "SubTerm Description 2"));
        impcImages.setSequence_id(123);
        impcImages.setAge_in_days(45);
        impcImages.setAge_in_weeks(6);
        impcImages.setDownload_url("http://example.com/download");
        impcImages.setJpeg_url("http://example.com/jpeg");
        impcImages.setThumbnail_url("http://example.com/thumbnail");
        impcImages.setOmero_id("OmeroID-1");

        return impcImages;

    }

}
