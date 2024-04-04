package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.GenotypePhenotype;

import java.util.List;

public class GenotypePhenotypeGenerator {


    public static GenotypePhenotype generateExampleGenotypePhenotypeResponse() {
        GenotypePhenotype genotypePhenotype = new GenotypePhenotype();
      genotypePhenotype.setDocId("DOC001");
      genotypePhenotype.setOntologyDbId(123456L);
      genotypePhenotype.setAssertionType("Assertion Type Example");
      genotypePhenotype.setAssertionTypeId("ATID001");
      genotypePhenotype.setMpathTermId("MPATH:0000001");
      genotypePhenotype.setMpathTermName("Mpath Term Name Example");
      genotypePhenotype.setAnatomyTermId(List.of("ATID001", "ATID002"));
      genotypePhenotype.setAnatomyTermName(List.of("Anatomy Term 1", "Anatomy Term 2"));
      genotypePhenotype.setIntermediateAnatomyTermId(List.of("IATID001", "IATID002"));
      genotypePhenotype.setIntermediateAnatomyTermName(List.of("Intermediate Anatomy Term 1", "Intermediate Anatomy Term 2"));
      genotypePhenotype.setTopLevelAnatomyTermId(List.of("TLATID001", "TLATID002"));
      genotypePhenotype.setTopLevelAnatomyTermName(List.of("Top Level Anatomy Term 1", "Top Level Anatomy Term 2"));
      genotypePhenotype.setMpTermId("MP:0000001");
      genotypePhenotype.setMpTermName("MP Term Name Example");
      genotypePhenotype.setAltMpTermId(List.of("AMPID001", "AMPID002"));
      genotypePhenotype.setTopLevelMpTermId(List.of("TLMPID001", "TLMPID002"));
      genotypePhenotype.setTopLevelMpTermName(List.of("Top Level MP Term 1", "Top Level MP Term 2"));
      genotypePhenotype.setIntermediateMpTermId(List.of("IMPID001", "IMPID002"));
      genotypePhenotype.setIntermediateMpTermName(List.of("Intermediate MP Term 1", "Intermediate MP Term 2"));
      genotypePhenotype.setMarkerSymbol("MkSym");
      genotypePhenotype.setMarkerAccessionId("MARK:000001");
      genotypePhenotype.setColonyId("Colony001");
      genotypePhenotype.setAlleleName("Allele Name Example");
      genotypePhenotype.setAlleleSymbol("AlleleSym");
      genotypePhenotype.setAlleleAccessionId("Allele:000001");
      genotypePhenotype.setStrainName("Strain Name Example");
      genotypePhenotype.setStrainAccessionId("Strain:000001");
      genotypePhenotype.setPhenotypingCenter("Phenotyping Center Example");
      genotypePhenotype.setProjectExternalId("ProjectExtID001");
      genotypePhenotype.setProjectName(List.of("Project Name 1", "Project Name 2"));
      genotypePhenotype.setProjectFullname("Project Fullname Example");
      genotypePhenotype.setResourceName("Resource Name Example");
      genotypePhenotype.setResourceFullname("Resource Fullname Example");
      genotypePhenotype.setSex("Male");
      genotypePhenotype.setZygosity("Homozygote");
      genotypePhenotype.setPipelineName("Pipeline Name Example");
      genotypePhenotype.setPipelineStableId("PipelineStableID001");
      genotypePhenotype.setPipelineStableKey("PipelineStableKey001");
      genotypePhenotype.setProcedureName("Procedure Name Example");
      genotypePhenotype.setProcedureStableId(List.of("ProcStableID001", "ProcStableID002"));
      genotypePhenotype.setProcedureStableKey(List.of("ProcStableKey001", "ProcStableKey002"));
      genotypePhenotype.setParameterName("Parameter Name Example");
      genotypePhenotype.setParameterStableId("ParamStableID001");
      genotypePhenotype.setParameterStableKey(List.of("ParamStableKey001", "ParamStableKey002"));
      genotypePhenotype.setStatisticalMethod("Statistical Method Example");
      genotypePhenotype.setPercentageChange("10%");
      genotypePhenotype.setPValue(0.05);
      genotypePhenotype.setEffectSize(1.2);
      genotypePhenotype.setExternalId("ExternalID001");
      genotypePhenotype.setLifeStageAcc("LS:000001");
      genotypePhenotype.setLifeStageName("Life Stage Name Example");

        return genotypePhenotype;
    }

}
