package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.MgiPhenotype;

import java.util.List;

public class MgiPhenotypeGenerator {


    public static MgiPhenotype generateExampleMgiPhenotypeResponse() {
        MgiPhenotype mgiPhenotype = new MgiPhenotype();
        mgiPhenotype.setDoc_id("DOC001");
        mgiPhenotype.setAssertion_type("Assertion Type Example");
        mgiPhenotype.setAssertion_type_id("ATID001");
        mgiPhenotype.setMpath_term_id("MPATHID001");
        mgiPhenotype.setMpath_term_name("MPath Term Name Example");
        mgiPhenotype.setEmap_term_id("EMAPID001");
        mgiPhenotype.setEmap_term_name("EMAP Term Name Example");
        mgiPhenotype.setMp_term_id("MPID001");
        mgiPhenotype.setMp_term_name("MP Term Name Example");
        mgiPhenotype.setAlt_mp_term_id(List.of("ALTMPID001", "ALTMPID002"));
        mgiPhenotype.setTop_level_mp_term_id(List.of("TLMPID001", "TLMPID002"));
        mgiPhenotype.setTop_level_mp_term_name(List.of("Top Level MP Term Name 1", "Top Level MP Term Name 2"));
        mgiPhenotype.setTop_level_mp_term_definition(List.of("Definition 1", "Definition 2"));
        mgiPhenotype.setTop_level_mp_term_synonym(List.of("Synonym 1", "Synonym 2"));
        mgiPhenotype.setIntermediate_mp_term_id(List.of("INTMPID001", "INTMPID002"));
        mgiPhenotype.setIntermediate_mp_term_name(List.of("Intermediate MP Term Name 1", "Intermediate MP Term Name 2"));
        mgiPhenotype.setIntermediate_mp_term_definition(List.of("Intermediate Definition 1", "Intermediate Definition 2"));
        mgiPhenotype.setIntermediate_mp_term_synonym(List.of("Intermediate Synonym 1", "Intermediate Synonym 2"));
        mgiPhenotype.setMarker_symbol("Marker Symbol Example");
        mgiPhenotype.setMarker_accession_id("Marker Accession ID Example");
        mgiPhenotype.setColony_id("ColonyID001");
        mgiPhenotype.setAllele_name("Allele Name Example");
        mgiPhenotype.setAllele_symbol("Allele Symbol Example");
        mgiPhenotype.setAllele_accession_id("Allele Accession ID Example");
        mgiPhenotype.setStrain_name("Strain Name Example");
        mgiPhenotype.setStrain_accession_id("Strain Accession ID Example");
        mgiPhenotype.setPhenotyping_center("Phenotyping Center Example");
        mgiPhenotype.setProject_external_id("Project External ID Example");
        mgiPhenotype.setProject_name("Project Name Example");
        mgiPhenotype.setProject_fullname("Project Full Name Example");
        mgiPhenotype.setResource_name("Resource Name Example");
        mgiPhenotype.setResource_fullname("Resource Full Name Example");
        mgiPhenotype.setSex("Sex Example");
        mgiPhenotype.setZygosity("Zygosity Example");
        mgiPhenotype.setPipeline_name("Pipeline Name Example");
        mgiPhenotype.setPipeline_stable_id("Pipeline Stable ID Example");
        mgiPhenotype.setPipeline_stable_key("Pipeline Stable Key Example");
        mgiPhenotype.setProcedure_name("Procedure Name Example");
        mgiPhenotype.setProcedure_stable_id("Procedure Stable ID Example");
        mgiPhenotype.setProcedure_stable_key("Procedure Stable Key Example");
        mgiPhenotype.setParameter_name("Parameter Name Example");
        mgiPhenotype.setParameter_stable_id("Parameter Stable ID Example");
        mgiPhenotype.setParameter_stable_key("Parameter Stable Key Example");
        mgiPhenotype.setStatistical_method("Statistical Method Example");
        mgiPhenotype.setPercentage_change("Percentage Change Example");
        mgiPhenotype.setP_value(0.05);
        mgiPhenotype.setEffect_size(1.25);
        mgiPhenotype.setExternal_id("External ID Example");
        mgiPhenotype.setLife_stage_acc("Life Stage ACC Example");
        mgiPhenotype.setLife_stage_name("Life Stage Name Example");

        return mgiPhenotype;

    }

}
