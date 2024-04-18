package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Mp;

import java.util.List;

public class MpGenerator {


    public static Mp generateExampleMpResponse() {
        Mp mp = new Mp();
        mp.setMp_id("MP:0000001");
        mp.setAllele_name(List.of("Allele1"));
        mp.setMp_term("example MP term");
        mp.setMp_definition("An example definition of the MP term.");
        mp.setMp_term_synonym(List.of("synonym1", "synonym2"));
        mp.setAlt_mp_id(List.of("MP:0000002", "MP:0000003"));
        mp.setChild_mp_id(List.of("MP:0000004"));
        mp.setChild_mp_term(List.of("child term"));
        mp.setParent_mp_id(List.of("MP:0000005"));
        mp.setParent_mp_term(List.of("parent term"));
        mp.setIntermediate_mp_id(List.of("MP:0000006"));
        mp.setIntermediate_mp_term(List.of("intermediate term"));
        mp.setTop_level_mp_id(List.of("MP:0000007"));
        mp.setTop_level_mp_term(List.of("top level term"));
        mp.setTop_level_mp_term_synonym(List.of("top level synonym"));
        mp.setTop_level_mp_term_id(List.of("MP:0000008"));
        mp.setHp_id(List.of("HP:0000001"));
        mp.setHp_term(List.of("example HP term"));
        mp.setHp_term_synonym(List.of("HP synonym1", "HP synonym2"));
        mp.setData_type("example data type");
        mp.setInferred_ma_id(List.of("MA:0000001"));
        mp.setInferred_ma_term(List.of("inferred MA term"));
        mp.setInferred_intermediate_ma_id(List.of("MA:0000002"));
        mp.setInferred_intermediate_ma_term(List.of("intermediate MA term"));
        mp.setInferred_selected_top_level_ma_id(List.of("MA:0000003"));
        mp.setInferred_selected_top_level_ma_term(List.of("selected top level MA term"));
        mp.setGo_id(List.of("GO:0000001"));
        mp.setP_value(List.of(0.01f, 0.05f));
        mp.setMgi_accession_id(List.of("MGI:0000001"));
        mp.setMarker_symbol(List.of("Gene1", "Gene2"));
        mp.setMarker_accession_id("MGI:0000002");
        mp.setPheno_calls(42L);
        mp.setPreqc_gene_id(List.of("Gene3", "Gene4"));
        mp.setMarker_name(List.of("Gene name 1", "Gene name 2"));
        mp.setMarker_synonym(List.of("Gene synonym 1", "Gene synonym 2"));
        mp.setMarker_type(List.of("type 1", "type 2"));
        mp.setHuman_gene_symbol(List.of("HumanGene1", "HumanGene2"));
        mp.setStatus(List.of("status1", "status2"));
        mp.setImits_phenotype_started(List.of("started1", "started2"));
        mp.setImits_phenotype_complete(List.of("complete1", "complete2"));
        mp.setImits_phenotype_status(List.of("status1", "status2"));
        mp.setLatest_production_centre(List.of("centre1", "centre2"));
        mp.setLatest_phenotyping_centre(List.of("centre3", "centre4"));
        mp.setLatest_phenotype_status(List.of("status3", "status4"));
        mp.setLegacy_phenotype_status(1);
        mp.setEmbryo_data_available(true);
        mp.setType(List.of("type3", "type4"));
        mp.setDisease_id(List.of("Disease1", "Disease2"));
        mp.setDisease_source(List.of("source1", "source2"));
        mp.setDisease_term(List.of("disease term 1", "disease term 2"));
        mp.setDisease_alts(List.of("alt1", "alt2"));
        mp.setDisease_classes(List.of("class1", "class2"));
        mp.setHuman_curated(List.of(false, true));
        mp.setMouse_curated(List.of(true, false));
        mp.setMgi_predicted(List.of(false));
        mp.setImpc_predicted(List.of(true));
        mp.setMgi_predicted_known_gene(List.of(true));
        mp.setImpc_predicted_known_gene(List.of(false));
        mp.setMgi_novel_predicted_in_locus(List.of(true));
        mp.setImpc_novel_predicted_in_locus(List.of(false));
        mp.setAnnotation_term_id(List.of("Term1", "Term2"));
        mp.setAnnotation_term_name(List.of("Annotation term name 1", "Annotation term name 2"));
        mp.setName(List.of("name1", "name2"));
        mp.setAccession(List.of("Accession1", "Accession2"));
        mp.setExp_name(List.of("Exp name 1", "Exp name 2"));
        mp.setLarge_thumbnail_file_path("/path/to/large/thumbnail");
        mp.setSmall_thumbnail_file_path("/path/to/small/thumbnail");
        mp.setSymbol(List.of("Symbol1", "Symbol2"));
        mp.setSanger_symbol(List.of("Sanger1", "Sanger2"));
        mp.setGene_name(List.of("Gene name 3", "Gene name 4"));
        mp.setSubtype(List.of("subtype1", "subtype2"));
        mp.setGene_synonyms(List.of("Gene synonym 3", "Gene synonym 4"));
        mp.setExp_name_exp(List.of("Exp name 3", "Exp name 4"));
        mp.setSymbol_gene(List.of("SymbolGene1", "SymbolGene2"));
        mp.setTop_level(List.of("TopLevel1", "TopLevel2"));
        mp.setAllele_symbol(List.of("Allele symbol 1", "Allele symbol 2"));
        mp.setAllele_id(List.of("Allele ID 1", "Allele ID 2"));
        mp.setStrain_name(List.of("Strain name 1", "Strain name 2"));
        mp.setStrain_accession_id(List.of("Strain accession ID 1", "Strain accession ID 2"));
        mp.setPipeline_name(List.of("Pipeline name 1", "Pipeline name 2"));
        mp.setPipeline_stable_id(List.of("Pipeline stable ID 1", "Pipeline stable ID 2"));
        mp.setPipeline_stable_key(List.of("Pipeline stable key 1", "Pipeline stable key 2"));
        mp.setProcedure_name(List.of("Procedure name 1", "Procedure name 2"));
        mp.setProcedure_stable_id(List.of("Procedure stable ID 1", "Procedure stable ID 2"));
        mp.setProcedure_stable_key(List.of("Procedure stable key 1", "Procedure stable key 2"));
        mp.setParameter_name(List.of("Parameter name 1", "Parameter name 2"));
        mp.setParameter_stable_id(List.of("Parameter stable ID 1", "Parameter stable ID 2"));
        mp.setParameter_stable_key(List.of("Parameter stable key 1", "Parameter stable key 2"));
        mp.setText(List.of("Example text 1", "Example text 2"));
        mp.setAuto_suggest(List.of("Suggest 1", "Suggest 2"));
        mp.setMix_syn_qf(List.of("Mix synonym 1", "Mix synonym 2"));
        mp.setSearch_term_json("{\"searchTerm\":\"Example search term\"}");
        mp.setChildren_json("[{\"childId\":\"C1\", \"childName\":\"Child 1\"}, {\"childId\":\"C2\", \"childName\":\"Child 2\"}]");
        mp.setScroll_node("ScrollNodeExample");
        mp.setGene_variant_male_count(100);
        mp.setGene_variant_female_count(150);
        mp.setGene_variant_count(250);

        return mp;
    }

}
