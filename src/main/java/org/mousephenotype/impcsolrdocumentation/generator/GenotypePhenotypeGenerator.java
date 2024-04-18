package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.GenotypePhenotype;

import java.util.List;

public class GenotypePhenotypeGenerator {


    public static GenotypePhenotype generateExampleGenotypePhenotypeResponse() {
      GenotypePhenotype genotypePhenotype = new GenotypePhenotype();
      genotypePhenotype.setDoc_id("DOC001");
      genotypePhenotype.setOntology_db_id(123456L);
      genotypePhenotype.setAssertion_type("Assertion Type Example");
      genotypePhenotype.setAssertion_type_id("ATID001");
      genotypePhenotype.setMpath_term_id("MPATH:0000001");
      genotypePhenotype.setMpath_term_name("Mpath Term Name Example");
      genotypePhenotype.setAnatomy_term_id(List.of("ATID001", "ATID002"));
      genotypePhenotype.setAnatomy_term_name(List.of("Anatomy Term 1", "Anatomy Term 2"));
      genotypePhenotype.setIntermediate_anatomy_term_id(List.of("IATID001", "IATID002"));
      genotypePhenotype.setIntermediate_anatomy_term_name(List.of("Intermediate Anatomy Term 1", "Intermediate Anatomy Term 2"));
      genotypePhenotype.setTop_level_anatomy_term_id(List.of("TLATID001", "TLATID002"));
      genotypePhenotype.setTop_level_anatomy_term_name(List.of("Top Level Anatomy Term 1", "Top Level Anatomy Term 2"));
      genotypePhenotype.setMp_term_id("MP:0000001");
      genotypePhenotype.setMp_term_name("MP Term Name Example");
      genotypePhenotype.setAlt_mp_term_id(List.of("AMPID001", "AMPID002"));
      genotypePhenotype.setTop_level_mp_term_id(List.of("TLMPID001", "TLMPID002"));
      genotypePhenotype.setTop_level_mp_term_name(List.of("Top Level MP Term 1", "Top Level MP Term 2"));
      genotypePhenotype.setIntermediate_mp_term_id(List.of("IMPID001", "IMPID002"));
      genotypePhenotype.setIntermediate_mp_term_name(List.of("Intermediate MP Term 1", "Intermediate MP Term 2"));
      genotypePhenotype.setMarker_symbol("MkSym");
      genotypePhenotype.setMarker_accession_id("MARK:000001");
      genotypePhenotype.setColony_id("Colony001");
      genotypePhenotype.setAllele_name("Allele Name Example");
      genotypePhenotype.setAllele_symbol("AlleleSym");
      genotypePhenotype.setAllele_accession_id("Allele:000001");
      genotypePhenotype.setStrain_name("Strain Name Example");
      genotypePhenotype.setStrain_accession_id("Strain:000001");
      genotypePhenotype.setPhenotyping_center("Phenotyping Center Example");
      genotypePhenotype.setProject_external_id("ProjectExtID001");
      genotypePhenotype.setProject_name(List.of("Project Name 1", "Project Name 2"));
      genotypePhenotype.setProject_fullname("Project Fullname Example");
      genotypePhenotype.setResource_name("Resource Name Example");
      genotypePhenotype.setResource_fullname("Resource Fullname Example");
      genotypePhenotype.setSex("Male");
      genotypePhenotype.setZygosity("Homozygote");
      genotypePhenotype.setPipeline_name("Pipeline Name Example");
      genotypePhenotype.setPipeline_stable_id("PipelineStableID001");
      genotypePhenotype.setPipeline_stable_key("PipelineStableKey001");
      genotypePhenotype.setProcedure_name("Procedure Name Example");
      genotypePhenotype.setProcedure_stable_id(List.of("ProcStableID001", "ProcStableID002"));
      genotypePhenotype.setProcedure_stable_key(List.of("ProcStableKey001", "ProcStableKey002"));
      genotypePhenotype.setParameter_name("Parameter Name Example");
      genotypePhenotype.setParameter_stable_id("ParamStableID001");
      genotypePhenotype.setParameter_stable_key(List.of("ParamStableKey001", "ParamStableKey002"));
      genotypePhenotype.setStatistical_method("Statistical Method Example");
      genotypePhenotype.setPercentage_change("10%");
      genotypePhenotype.setP_value(0.05);
      genotypePhenotype.setEffect_size(1.2);
      genotypePhenotype.setExternal_id("ExternalID001");
      genotypePhenotype.setLife_stage_acc("LS:000001");
      genotypePhenotype.setLife_stage_name("Life Stage Name Example");

      return genotypePhenotype;

    }

}
