package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.MgiPhenotype;

import java.util.List;

public class MgiPhenotypeGenerator {


    public static MgiPhenotype generateExampleMgiPhenotypeResponse() {
        MgiPhenotype mgiPhenotype = new MgiPhenotype();


        mgiPhenotype.setDocId("DOC001");
        mgiPhenotype.setAssertionType("Assertion Type Example");
        mgiPhenotype.setAssertionTypeId("ATID001");
        mgiPhenotype.setMpathTermId("MPATHID001");
        mgiPhenotype.setMpathTermName("MPath Term Name Example");
        mgiPhenotype.setEmapTermId("EMAPID001");
        mgiPhenotype.setEmapTermName("EMAP Term Name Example");
        mgiPhenotype.setMpTermId("MPID001");
        mgiPhenotype.setMpTermName("MP Term Name Example");
        mgiPhenotype.setAltMpTermId(List.of("ALTMPID001", "ALTMPID002"));
        mgiPhenotype.setTopLevelMpTermId(List.of("TLMPID001", "TLMPID002"));
        mgiPhenotype.setTopLevelMpTermName(List.of("Top Level MP Term Name 1", "Top Level MP Term Name 2"));
        mgiPhenotype.setTopLevelMpTermDefinition(List.of("Definition 1", "Definition 2"));
        mgiPhenotype.setTopLevelMpTermSynonym(List.of("Synonym 1", "Synonym 2"));
        mgiPhenotype.setIntermediateMpTermId(List.of("INTMPID001", "INTMPID002"));
        mgiPhenotype.setIntermediateMpTermName(List.of("Intermediate MP Term Name 1", "Intermediate MP Term Name 2"));
        mgiPhenotype.setIntermediateMpTermDefinition(List.of("Intermediate Definition 1", "Intermediate Definition 2"));
        mgiPhenotype.setIntermediateMpTermSynonym(List.of("Intermediate Synonym 1", "Intermediate Synonym 2"));
        mgiPhenotype.setMarkerSymbol("Marker Symbol Example");
        mgiPhenotype.setMarkerAccessionId("Marker Accession ID Example");
        mgiPhenotype.setColonyId("ColonyID001");
        mgiPhenotype.setAlleleName("Allele Name Example");
        mgiPhenotype.setAlleleSymbol("Allele Symbol Example");
        mgiPhenotype.setAlleleAccessionId("Allele Accession ID Example");
        mgiPhenotype.setStrainName("Strain Name Example");
        mgiPhenotype.setStrainAccessionId("Strain Accession ID Example");
        mgiPhenotype.setPhenotypingCenter("Phenotyping Center Example");
        mgiPhenotype.setProjectExternalId("Project External ID Example");
        mgiPhenotype.setProjectName("Project Name Example");
        mgiPhenotype.setProjectFullname("Project Full Name Example");
        mgiPhenotype.setResourceName("Resource Name Example");
        mgiPhenotype.setResourceFullname("Resource Full Name Example");
        mgiPhenotype.setSex("Sex Example");
        mgiPhenotype.setZygosity("Zygosity Example");
        mgiPhenotype.setPipelineName("Pipeline Name Example");
        mgiPhenotype.setPipelineStableId("Pipeline Stable ID Example");
        mgiPhenotype.setPipelineStableKey("Pipeline Stable Key Example");
        mgiPhenotype.setProcedureName("Procedure Name Example");
        mgiPhenotype.setProcedureStableId("Procedure Stable ID Example");
        mgiPhenotype.setProcedureStableKey("Procedure Stable Key Example");
        mgiPhenotype.setParameterName("Parameter Name Example");
        mgiPhenotype.setParameterStableId("Parameter Stable ID Example");
        mgiPhenotype.setParameterStableKey("Parameter Stable Key Example");
        mgiPhenotype.setStatisticalMethod("Statistical Method Example");
        mgiPhenotype.setPercentageChange("Percentage Change Example");
        mgiPhenotype.setPValue(0.05);
        mgiPhenotype.setEffectSize(1.25);
        mgiPhenotype.setExternalId("External ID Example");
        mgiPhenotype.setLifeStageAcc("Life Stage ACC Example");
        mgiPhenotype.setLifeStageName("Life Stage Name Example");

        return mgiPhenotype;
    }

}
