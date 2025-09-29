package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Phenodigm;

import java.util.List;

public class PhenodigmGenerator {


    public static Phenodigm generateExamplePhenodigmResponse() {
        return new Phenodigm(
            "TypeExample",
            "D12345",
            "SourceExample",
            "DiseaseTermExample",
            List.of("Alt1", "Alt2"),
            "LocusExample",
            List.of("Class1", "Class2"),
            List.of("Phenotype1", "Phenotype2"),
            "G12345",
            "GeneSymbolExample",
            List.of("Withdrawn1", "Withdrawn2"),
            "GeneLocusExample",
            "HGNC123",
            "HGNCGeneSymbolExample",
            List.of("HGNCWithdrawn1"),
            "HGNCLocusExample",
            true,
            false,
            "Model12345",
            "ModelSourceExample",
            "ModelDescriptionExample",
            "GeneticBackgroundExample",
            "Marker12345",
            "MarkerSymbolExample",
            "MarkerLocusExample",
            2,
            List.of("ModelPhenotype1", "ModelPhenotype2"),
            "OntologyExample",
            "PhenotypeID12345",
            "PhenotypeTermExample",
            List.of("Synonym1", "Synonym2"),
            "HP12345",
            "HPTermExample",
            "MP12345",
            "MPTermExample",
            true,
            false,
            List.of("MarkerWithdrawn1"),
            List.of("MatchedPhenotype1"),
            List.of("ModelMatchedPhenotype1"),
            0.75,
            0.85,
            0.95,
            1.00,
            List.of("SearchQFExample1", "SearchQFExample2"),
            true,
            false,
            true,
            false,
            true
        );
    }

}
