package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Allele;

import java.util.List;

public class AlleleGenerator {


    public static Allele generateExampleAlleleResponse() {
        Allele allele = new Allele();
        allele.setDataType("gene");
        allele.setMgiAccessionId("MGI:123456");
        allele.setMarkerSymbol("Abc1");
        allele.setHumanGeneSymbol(List.of("ABC1"));
        allele.setMarkerName("ABC transporter 1");
        allele.setMarkerSynonym(List.of("ABC1 Synonym1", "ABC1 Synonym2"));
        allele.setMarkerType("protein coding");
        allele.setEnsemblGeneId(List.of("ENSG00000123456"));
        allele.setImitsPhenotypeStarted("true");
        allele.setImitsPhenotypeComplete("true");
        allele.setImitsPhenotypeStatus("Complete");
        allele.setStatus("Active");
        allele.setLatestProductionStatus("Production Complete");
        allele.setGeneLatestEsCellStatus("Available");
        allele.setLatestEsCellStatus("Produced");
        allele.setGeneLatestMouseStatus("Available");
        allele.setLatestMouseStatus("Produced");
        allele.setLegacyPhenotypeStatus(1);
        allele.setLatestPhenotypeStatus("Phenotyping Complete");
        allele.setLatestProjectStatus("Project Complete");
        allele.setLatestProductionCentre(List.of("Centre1"));
        allele.setLatestPhenotypingCentre(List.of("Centre2"));
        allele.setChrName("1");
        allele.setChrStart(1000000);
        allele.setChrEnd(2000000);
        allele.setChrStrand("+");
        allele.setAlleleName(List.of("Allele1"));
        allele.setAlleleAccessionId(List.of("Acc1", "Acc2"));
        allele.setEsCellStatus(List.of("Status1"));
        allele.setImitsMouseStatus("Status2");
        allele.setMouseStatus(List.of("Status3"));
        allele.setPhenotypeStatus(List.of("Status4"));
        allele.setProductionCentre(List.of("Centre3"));
        allele.setPhenotypingCentre(List.of("Centre4"));
        allele.setGoTermId(List.of("GO:0000001"));
        allele.setGoTermName(List.of("cellular process"));
        allele.setGoTermDef(List.of("Definition1"));
        allele.setGoTermEvid(List.of("Evidence1"));
        allele.setGoTermDomain(List.of("Domain1"));
        allele.setGoCount(1);
        allele.setGoUniprot(List.of("P12345"));
        allele.setEvidCodeRank(1);
        allele.setPfamaJson(List.of("{\"pfam\":\"PF00001\"}"));
        allele.setScdbId(List.of("SCDB1"));
        allele.setScdbLink(List.of("http://example.com"));
        allele.setClanId(List.of("Clan1"));
        allele.setClanAcc(List.of("ClanAcc1"));
        allele.setClanDesc(List.of("ClanDesc1"));
        allele.setPfamaId(List.of("PfamA1"));
        allele.setPfamaAcc(List.of("PfamAcc1"));
        allele.setPfamaGoId(List.of("GO:0000002"));
        allele.setPfamaGoTerm(List.of("biological process"));
        allele.setPfamaGoCat(List.of("Category1"));
        allele.setGfAcc("GF123456");
        allele.setAlleleMgiAccessionId("MGI:234567");
        allele.setImitsEsCellStatus(List.of("Available"));
        allele.setIkmcProject("Project1");
       allele.setGeneAllele("Allele2");
       allele.setDiseaseHumanPhenotypes(List.of("Phenotype1", "Phenotype2"));
       allele.setType("Disease Type");
       allele.setDiseaseId(List.of("Disease1", "Disease2"));
       allele.setDiseaseSource(List.of("Source1", "Source2"));
       allele.setDiseaseTerm(List.of("Term1", "Term2"));
       allele.setDiseaseAlts(List.of("Alt1", "Alt2"));
       allele.setDiseaseClasses(List.of("Class1", "Class2"));
       allele.setHumanCurated(List.of(true, false));
       allele.setMouseCurated(List.of(false, true));
       allele.setMgiPredicted(List.of(true, false));
       allele.setImpcPredicted(List.of(false, true));
       allele.setMgiPredictedKnownGene(List.of(true, false));
       allele.setImpcPredictedKnownGene(List.of(true));
       allele.setMgiNovelPredictedInLocus(List.of(false));
       allele.setImpcNovelPredictedInLocus(List.of(true));
       allele.setMarkerSymbolBf(List.of("bf1", "bf2"));
       allele.setMarkerSymbolLowercase(List.of("abc1", "nubpl"));
       allele.setMarkerSynonymLowercase(List.of("synonym1", "synonym2"));
       allele.setText(List.of("text1", "text2"));
       allele.setAutoSuggest(List.of("suggest1", "suggest2"));
        return allele;
    }

}
