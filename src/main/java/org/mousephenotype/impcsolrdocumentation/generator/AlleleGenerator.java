package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Allele;

import java.util.List;

public class AlleleGenerator {


    public static Allele generateExampleAlleleResponse() {
        Allele allele = new Allele();
        allele.setData_type("gene");
        allele.setMgi_accession_id("MGI:123456");
        allele.setMarker_symbol("Abc1");
        allele.setHuman_gene_symbol(List.of("ABC1"));
        allele.setMarker_name("ABC transporter 1");
        allele.setMarker_synonym(List.of("ABC1 Synonym1", "ABC1 Synonym2"));
        allele.setMarker_type("protein coding");
        allele.setEnsembl_gene_id(List.of("ENSG00000123456"));
        allele.setImits_phenotype_started("true");
        allele.setImits_phenotype_complete("true");
        allele.setImits_phenotype_status("Complete");
        allele.setStatus("Active");
        allele.setLatest_production_status("Production Complete");
        allele.setGene_latest_es_cell_status("Available");
        allele.setLatest_es_cell_status("Produced");
        allele.setGene_latest_mouse_status("Available");
        allele.setLatest_mouse_status("Produced");
        allele.setLegacy_phenotype_status(1);
        allele.setLatest_phenotype_status("Phenotyping Complete");
        allele.setLatest_project_status("Project Complete");
        allele.setLatest_production_centre(List.of("Centre1"));
        allele.setLatest_phenotyping_centre(List.of("Centre2"));
        allele.setChr_name("1");
        allele.setChr_start(1000000);
        allele.setChr_end(2000000);
        allele.setChr_strand("+");
        allele.setAllele_name(List.of("Allele1"));
        allele.setAllele_accession_id(List.of("Acc1", "Acc2"));
        allele.setEs_cell_status(List.of("Status1"));
        allele.setImits_mouse_status("Status2");
        allele.setMouse_status(List.of("Status3"));
        allele.setPhenotype_status(List.of("Status4"));
        allele.setProduction_centre(List.of("Centre3"));
        allele.setPhenotyping_centre(List.of("Centre4"));
        allele.setGo_term_id(List.of("GO:0000001"));
        allele.setGo_term_name(List.of("cellular process"));
        allele.setGo_term_def(List.of("Definition1"));
        allele.setGo_term_evid(List.of("Evidence1"));
        allele.setGo_term_domain(List.of("Domain1"));
        allele.setGo_count(1);
        allele.setGo_uniprot(List.of("P12345"));
        allele.setEvid_code_rank(1);
        allele.setPfama_json(List.of("{\"pfam\":\"PF00001\"}"));
        allele.setScdb_id(List.of("SCDB1"));
        allele.setScdb_link(List.of("http://example.com"));
        allele.setClan_id(List.of("Clan1"));
        allele.setClan_acc(List.of("ClanAcc1"));
        allele.setClan_desc(List.of("ClanDesc1"));
        allele.setPfama_id(List.of("PfamA1"));
        allele.setPfama_acc(List.of("PfamAcc1"));
        allele.setPfama_go_id(List.of("GO:0000002"));
        allele.setPfama_go_term(List.of("biological process"));
        allele.setPfama_go_cat(List.of("Category1"));
        allele.setGf_acc("GF123456");
        allele.setAllele_mgi_accession_id("MGI:234567");
        allele.setImits_es_cell_status(List.of("Available"));
        allele.setIkmc_project("Project1");
        allele.setGene_allele("Allele2");
        allele.setDisease_human_phenotypes(List.of("Phenotype1", "Phenotype2"));
        allele.setType("Disease Type");
        allele.setDisease_id(List.of("Disease1", "Disease2"));
        allele.setDisease_source(List.of("Source1", "Source2"));
        allele.setDisease_term(List.of("Term1", "Term2"));
        allele.setDisease_alts(List.of("Alt1", "Alt2"));
        allele.setDisease_classes(List.of("Class1", "Class2"));
        allele.setHuman_curated(List.of(true, false));
        allele.setMouse_curated(List.of(false, true));
        allele.setMgi_predicted(List.of(true, false));
        allele.setImpc_predicted(List.of(false, true));
        allele.setMgi_predicted_known_gene(List.of(true, false));
        allele.setImpc_predicted_known_gene(List.of(true));
        allele.setMgi_novel_predicted_in_locus(List.of(false));
        allele.setImpc_novel_predicted_in_locus(List.of(true));
        allele.setMarker_symbol_bf(List.of("bf1", "bf2"));
        allele.setMarker_symbol_lowercase(List.of("abc1", "nubpl"));
        allele.setMarker_synonym_lowercase(List.of("synonym1", "synonym2"));
        allele.setText(List.of("text1", "text2"));
        allele.setAuto_suggest(List.of("suggest1", "suggest2"));
        return allele;
    }

}
