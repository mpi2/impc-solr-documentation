package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Phenodigm;

import java.util.List;

public class PhenodigmGenerator {


    public static Phenodigm generateExamplePhenodigmResponse() {
        Phenodigm phenodigm = new Phenodigm();
        phenodigm.setType("TypeExample");
        phenodigm.setDisease_id("D12345");
        phenodigm.setDisease_source("SourceExample");
        phenodigm.setDisease_term("DiseaseTermExample");
        phenodigm.setDisease_alts(List.of("Alt1", "Alt2"));
        phenodigm.setDisease_locus("LocusExample");
        phenodigm.setDisease_classes(List.of("Class1", "Class2"));
        phenodigm.setDisease_phenotypes(List.of("Phenotype1", "Phenotype2"));

        phenodigm.setGene_id("G12345");
        phenodigm.setGene_symbol("GeneSymbolExample");
        phenodigm.setGene_symbols_withdrawn(List.of("Withdrawn1", "Withdrawn2"));
        phenodigm.setGene_locus("GeneLocusExample");
        phenodigm.setHgnc_gene_id("HGNC123");
        phenodigm.setHgnc_gene_symbol("HGNCGeneSymbolExample");
        phenodigm.setHgnc_gene_symbols_withdrawn(List.of("HGNCWithdrawn1"));
        phenodigm.setHgnc_gene_locus("HGNCLocusExample");

        phenodigm.setMouse_model(true);
        phenodigm.setImpc_model(false);

        phenodigm.setModel_id("Model12345");
        phenodigm.setModel_source("ModelSourceExample");
        phenodigm.setModel_description("ModelDescriptionExample");
        phenodigm.setModel_genetic_background("GeneticBackgroundExample");
        phenodigm.setMarker_id("Marker12345");
        phenodigm.setMarker_symbol("MarkerSymbolExample");
        phenodigm.setMarker_locus("MarkerLocusExample");
        phenodigm.setMarker_num_models(2);
        phenodigm.setModel_phenotypes(List.of("ModelPhenotype1", "ModelPhenotype2"));

        phenodigm.setOntology("OntologyExample");
        phenodigm.setPhenotype_id("PhenotypeID12345");
        phenodigm.setPhenotype_term("PhenotypeTermExample");
        phenodigm.setPhenotype_synonym(List.of("Synonym1", "Synonym2"));

        phenodigm.setHp_id("HP12345");
        phenodigm.setHp_term("HPTermExample");
        phenodigm.setMp_id("MP12345");
        phenodigm.setMp_term("MPTermExample");

        phenodigm.setAssociation_curated(true);
        phenodigm.setAssociation_ortholog(false);
        phenodigm.setMarker_symbols_withdrawn(List.of("MarkerWithdrawn1"));

        phenodigm.setDisease_matched_phenotypes(List.of("MatchedPhenotype1"));
        phenodigm.setModel_matched_phenotypes(List.of("ModelMatchedPhenotype1"));
        phenodigm.setDisease_model_avg_raw(0.75);
        phenodigm.setDisease_model_avg_norm(0.85);
        phenodigm.setDisease_model_max_raw(0.95);
        phenodigm.setDisease_model_max_norm(1.00);

        phenodigm.setSearch_qf(List.of("SearchQFExample1", "SearchQFExample2"));
        phenodigm.setHuman_curated_gene(true);
        phenodigm.setImpc_model_with_curated_gene(false);
        phenodigm.setMgi_model_with_curated_gene(true);
        phenodigm.setImpc_model_with_computed_association(false);
        phenodigm.setMgi_model_with_computed_association(true);

        return phenodigm;

    }

}
