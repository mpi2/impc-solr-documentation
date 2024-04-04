package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Mp;

import java.util.List;

public class MpGenerator {


    public static Mp generateExampleMpResponse() {
        Mp mp = new Mp();

        mp.setMpId("MP:0000001");
        mp.setAlleleName(List.of("Allele1"));
        mp.setMpTerm("example MP term");
        mp.setMpDefinition("An example definition of the MP term.");
        mp.setMpTermSynonym(List.of("synonym1", "synonym2"));
        mp.setAltMpId(List.of("MP:0000002", "MP:0000003"));
        mp.setChildMpId(List.of("MP:0000004"));
        mp.setChildMpTerm(List.of("child term"));
        mp.setParentMpId(List.of("MP:0000005"));
        mp.setParentMpTerm(List.of("parent term"));
        mp.setIntermediateMpId(List.of("MP:0000006"));
        mp.setIntermediateMpTerm(List.of("intermediate term"));
        mp.setTopLevelMpId(List.of("MP:0000007"));
        mp.setTopLevelMpTerm(List.of("top level term"));
        mp.setTopLevelMpTermSynonym(List.of("top level synonym"));
        mp.setTopLevelMpTermId(List.of("MP:0000008"));
        mp.setHpId(List.of("HP:0000001"));
        mp.setHpTerm(List.of("example HP term"));
        mp.setHpTermSynonym(List.of("HP synonym1", "HP synonym2"));
        mp.setDataType("example data type");
        mp.setInferredMaId(List.of("MA:0000001"));
        mp.setInferredMaTerm(List.of("inferred MA term"));
        mp.setInferredIntermediateMaId(List.of("MA:0000002"));
        mp.setInferredIntermediateMaTerm(List.of("intermediate MA term"));
        mp.setInferredSelectedTopLevelMaId(List.of("MA:0000003"));
        mp.setInferredSelectedTopLevelMaTerm(List.of("selected top level MA term"));
        mp.setGoId(List.of("GO:0000001"));
        mp.setPValue(List.of(0.01f, 0.05f));
        mp.setMgiAccessionId(List.of("MGI:0000001"));
        mp.setMarkerSymbol(List.of("Gene1", "Gene2"));
        mp.setMarkerAccessionId("MGI:0000002");
        mp.setPhenoCalls(42L);
        mp.setPreqcGeneId(List.of("Gene3", "Gene4"));
        mp.setMarkerName(List.of("Gene name 1", "Gene name 2"));
        mp.setMarkerSynonym(List.of("Gene synonym 1", "Gene synonym 2"));
        mp.setMarkerType(List.of("type 1", "type 2"));
        mp.setHumanGeneSymbol(List.of("HumanGene1", "HumanGene2"));
        mp.setStatus(List.of("status1", "status2"));
        mp.setImitsPhenotypeStarted(List.of("started1", "started2"));
        mp.setImitsPhenotypeComplete(List.of("complete1", "complete2"));
        mp.setImitsPhenotypeStatus(List.of("status1", "status2"));
        mp.setLatestProductionCentre(List.of("centre1", "centre2"));
        mp.setLatestPhenotypingCentre(List.of("centre3", "centre4"));
        mp.setLatestPhenotypeStatus(List.of("status3", "status4"));
        mp.setLegacyPhenotypeStatus(1);
        mp.setEmbryoDataAvailable(true);
        mp.setType(List.of("type3", "type4"));
        mp.setDiseaseId(List.of("Disease1", "Disease2"));
        mp.setDiseaseSource(List.of("source1", "source2"));
        mp.setDiseaseTerm(List.of("disease term 1", "disease term 2"));
        mp.setDiseaseAlts(List.of("alt1", "alt2"));
        mp.setDiseaseClasses(List.of("class1", "class2"));
        mp.setHumanCurated(List.of(false, true));
        mp.setMouseCurated(List.of(true, false));
        mp.setMgiPredicted(List.of(false));
        mp.setImpcPredicted(List.of(true));
        mp.setMgiPredictedKnownGene(List.of(true));
        mp.setImpcPredictedKnownGene(List.of(false));
        mp.setMgiNovelPredictedInLocus(List.of(true));
        mp.setImpcNovelPredictedInLocus(List.of(false));
        mp.setAnnotationTermId(List.of("Term1", "Term2"));
        mp.setAnnotationTermName(List.of("Annotation term name 1", "Annotation term name 2"));
        mp.setName(List.of("name1", "name2"));
        mp.setAccession(List.of("Accession1", "Accession2"));
        mp.setExpName(List.of("Exp name 1", "Exp name 2"));
        mp.setLargeThumbnailFilePath("/path/to/large/thumbnail");
        mp.setSmallThumbnailFilePath("/path/to/small/thumbnail");
        mp.setSymbol(List.of("Symbol1", "Symbol2"));
        mp.setSangerSymbol(List.of("Sanger1", "Sanger2"));
        mp.setGeneName(List.of("Gene name 3", "Gene name 4"));
        mp.setSubtype(List.of("subtype1", "subtype2"));
        mp.setGeneSynonyms(List.of("Gene synonym 3", "Gene synonym 4"));
        mp.setExpNameExp(List.of("Exp name 3", "Exp name 4"));
        mp.setSymbolGene(List.of("SymbolGene1", "SymbolGene2"));
        mp.setTopLevel(List.of("TopLevel1", "TopLevel2"));
        mp.setAlleleSymbol(List.of("Allele symbol 1", "Allele symbol 2"));
        mp.setAlleleId(List.of("Allele ID 1", "Allele ID 2"));
        mp.setStrainName(List.of("Strain name 1", "Strain name 2"));
        mp.setStrainAccessionId(List.of("Strain accession ID 1", "Strain accession ID 2"));
        mp.setPipelineName(List.of("Pipeline name 1", "Pipeline name 2"));
        mp.setPipelineStableId(List.of("Pipeline stable ID 1", "Pipeline stable ID 2"));
        mp.setPipelineStableKey(List.of("Pipeline stable key 1", "Pipeline stable key 2"));
        mp.setProcedureName(List.of("Procedure name 1", "Procedure name 2"));
        mp.setProcedureStableId(List.of("Procedure stable ID 1", "Procedure stable ID 2"));
        mp.setProcedureStableKey(List.of("Procedure stable key 1", "Procedure stable key 2"));
        mp.setParameterName(List.of("Parameter name 1", "Parameter name 2"));
        mp.setParameterStableId(List.of("Parameter stable ID 1", "Parameter stable ID 2"));
        mp.setParameterStableKey(List.of("Parameter stable key 1", "Parameter stable key 2"));
        mp.setText(List.of("Example text 1", "Example text 2"));
        mp.setAutoSuggest(List.of("Suggest 1", "Suggest 2"));
        mp.setMixSynQf(List.of("Mix synonym 1", "Mix synonym 2"));
        mp.setSearchTermJson("{\"searchTerm\":\"Example search term\"}");
        mp.setChildrenJson("[{\"childId\":\"C1\", \"childName\":\"Child 1\"}, {\"childId\":\"C2\", \"childName\":\"Child 2\"}]");
        mp.setScrollNode("ScrollNodeExample");
        mp.setGeneVariantMaleCount(100);
        mp.setGeneVariantFemaleCount(150);
        mp.setGeneVariantCount(250);
        return mp;
    }

}
