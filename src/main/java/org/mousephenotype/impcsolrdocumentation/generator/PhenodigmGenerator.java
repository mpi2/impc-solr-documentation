package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Phenodigm;

import java.util.List;

public class PhenodigmGenerator {


    public static Phenodigm generateExamplePhenodigmResponse() {
        Phenodigm phenodigm = new Phenodigm();
        phenodigm.setType("TypeExample");
        phenodigm.setDiseaseId("D12345");
        phenodigm.setDiseaseSource("SourceExample");
        phenodigm.setDiseaseTerm("DiseaseTermExample");
        phenodigm.setDiseaseAlts(List.of("Alt1", "Alt2"));
        phenodigm.setDiseaseLocus("LocusExample");
        phenodigm.setDiseaseClasses(List.of("Class1", "Class2"));
        phenodigm.setDiseasePhenotypes(List.of("Phenotype1", "Phenotype2"));

        phenodigm.setGeneId("G12345");
        phenodigm.setGeneSymbol("GeneSymbolExample");
        phenodigm.setGeneSymbolsWithdrawn(List.of("Withdrawn1", "Withdrawn2"));
        phenodigm.setGeneLocus("GeneLocusExample");
        phenodigm.setHgncGeneId("HGNC123");
        phenodigm.setHgncGeneSymbol("HGNCGeneSymbolExample");
        phenodigm.setHgncGeneSymbolsWithdrawn(List.of("HGNCWithdrawn1"));
        phenodigm.setHgncGeneLocus("HGNCLocusExample");

        phenodigm.setMouseModel(true);
        phenodigm.setImpcModel(false);

        phenodigm.setModelId("Model12345");
        phenodigm.setModelSource("ModelSourceExample");
        phenodigm.setModelDescription("ModelDescriptionExample");
        phenodigm.setModelGeneticBackground("ModelGeneticBackgroundExample");
        phenodigm.setMarkerId("Marker12345");
        phenodigm.setMarkerSymbol("MarkerSymbolExample");
        phenodigm.setMarkerLocus("MarkerLocusExample");
        phenodigm.setMarkerNumModels(2);
        phenodigm.setModelPhenotypes(List.of("ModelPhenotype1", "ModelPhenotype2"));

        phenodigm.setOntology("OntologyExample");
        phenodigm.setPhenotypeId("PhenotypeID12345");
        phenodigm.setPhenotypeTerm("PhenotypeTermExample");
        phenodigm.setPhenotypeSynonym(List.of("Synonym1", "Synonym2"));

        phenodigm.setHpId("HP12345");
        phenodigm.setHpTerm("HPTermExample");
        phenodigm.setMpId("MP12345");
        phenodigm.setMpTerm("MPTermExample");

        phenodigm.setAssociationCurated(true);
        phenodigm.setAssociationOrtholog(false);
        phenodigm.setMarkerSymbolsWithdrawn(List.of("MarkerWithdrawn1"));

        phenodigm.setDiseaseMatchedPhenotypes(List.of("MatchedPhenotype1"));
        phenodigm.setModelMatchedPhenotypes(List.of("ModelMatchedPhenotype1"));
        phenodigm.setDiseaseModelAvgRaw(0.75);
        phenodigm.setDiseaseModelAvgNorm(0.85);
        phenodigm.setDiseaseModelMaxRaw(0.95);
        phenodigm.setDiseaseModelMaxNorm(1.00);

        phenodigm.setSearchQf(List.of("SearchQFExample1", "SearchQFExample2"));
        phenodigm.setHumanCuratedGene(true);
        phenodigm.setImpcModelWithCuratedGene(false);
        phenodigm.setMgiModelWithCuratedGene(true);
        phenodigm.setImpcModelWithComputedAssociation(false);
        phenodigm.setMgiModelWithComputedAssociation(true);

        return phenodigm;
    }

}
