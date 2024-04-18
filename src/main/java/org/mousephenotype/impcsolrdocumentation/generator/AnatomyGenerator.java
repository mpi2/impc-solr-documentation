package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Anatomy;

import java.util.List;

public class AnatomyGenerator {


    public static Anatomy generateExampleAnatomyResponse() {
        Anatomy anatomy = new Anatomy();
        anatomy.setData_type("Example DataType");
        anatomy.setAnatomy_id(List.of("ANAT:0001", "ANAT:0002"));
        anatomy.setAnatomy_term("Heart");
        anatomy.setAnatomy_term_synonym(List.of("Cardiac", "Cor"));
        anatomy.setAnatomy_node_id(List.of(101, 102));
        anatomy.setAlt_anatomy_id(List.of("ALT:001", "ALT:002"));
        anatomy.setStage("adult");
        anatomy.setEfo_id(List.of("EFO:0001", "EFO:0002"));
        anatomy.setAll_ae_mapped_efo_id(List.of("EFO:0003", "EFO:0004"));
        anatomy.setUberon_id(List.of("UBERON:0001", "UBERON:0002"));
        anatomy.setAll_ae_mapped_uberon_id(List.of("UBERON:0003", "UBERON:0004"));
        anatomy.setParent_anatomy_id(List.of("PARENT:001", "PARENT:002"));
        anatomy.setParent_anatomy_term(List.of("Parent Heart", "Parent Lung"));
        anatomy.setParent_anatomy_term_synonym(List.of("Parent Cardiac", "Parent Pulmonary"));
        anatomy.setChild_anatomy_id(List.of("CHILD:001", "CHILD:002"));
        anatomy.setChild_anatomy_term(List.of("Child Heart", "Child Lung"));
        anatomy.setChild_anatomy_term_synonym(List.of("Child Cardiac", "Child Pulmonary"));
        anatomy.setIntermediate_anatomy_id(List.of("INTERMEDIATE:001", "INTERMEDIATE:002"));
        anatomy.setIntermediate_anatomy_term(List.of("Intermediate Heart", "Intermediate Lung"));
        anatomy.setIntermediate_anatomy_term_synonym(List.of("Intermediate Cardiac", "Intermediate Pulmonary"));
        anatomy.setTop_level_anatomy_id(List.of("TOP:001", "TOP:002"));
        anatomy.setTop_level_anatomy_term(List.of("Top Level Heart", "Top Level Lung"));
        anatomy.setTop_level_anatomy_term_synonym(List.of("Top Cardiac", "Top Pulmonary"));
        anatomy.setSelected_top_level_anatomy_id(List.of("SELECTED:001", "SELECTED:002"));
        anatomy.setSelected_top_level_anatomy_term(List.of("Selected Top Heart", "Selected Top Lung"));
        anatomy.setSelected_top_level_anatomy_term_synonym(List.of("Selected Top Cardiac", "Selected Top Pulmonary"));
        anatomy.setMp_id(List.of("MP:0001", "MP:0002"));
        anatomy.setMp_term(List.of("Phenotype 1", "Phenotype 2"));
        anatomy.setMp_term_synonym(List.of("Synonym 1", "Synonym 2"));
        anatomy.setTop_level_mp_id(List.of("TOPMP:0001", "TOPMP:0002"));
        anatomy.setTop_level_mp_term(List.of("Top Level Phenotype 1", "Top Level Phenotype 2"));
        anatomy.setTop_level_mp_term_synonym(List.of("Top Synonym 1", "Top Synonym 2"));
        anatomy.setIntermediate_mp_id(List.of("INTERMP:0001", "INTERMP:0002"));
        anatomy.setIntermediate_mp_term(List.of("Intermediate Phenotype 1", "Intermediate Phenotype 2"));
        anatomy.setIntermediate_mp_term_synonym(List.of("Intermediate Synonym 1", "Intermediate Synonym 2"));
        anatomy.setChild_mp_id(List.of("CHILDMP:0001", "CHILDMP:0002"));
        anatomy.setChild_mp_term(List.of("Child Phenotype 1", "Child Phenotype 2"));
        anatomy.setChild_mp_term_synonym(List.of("Child Synonym 1", "Child Synonym 2"));
        anatomy.setAnnotation_term_id(List.of("TERMID:0001", "TERMID:0002"));
        anatomy.setAnnotation_term_name(List.of("Term Name 1", "Term Name 2"));
        anatomy.setName(List.of("Name 1", "Name 2"));
        anatomy.setAccession(List.of("ACC:0001", "ACC:0002"));
        anatomy.setExp_name(List.of("Experiment 1", "Experiment 2"));
        anatomy.setLarge_thumbnail_file_path("/path/to/large/thumbnail.jpg");
        anatomy.setSmall_thumbnail_file_path("/path/to/small/thumbnail.jpg");
        anatomy.setInferred_ma_term_id(List.of("MA:0001", "MA:0002"));
        anatomy.setInferred_ma_term_name(List.of("Ma Term 1", "Ma Term 2"));
        anatomy.setAnnotated_higher_level_ma_term_id(List.of("HMA:0001", "HMA:0002"));
        anatomy.setAnnotated_higher_level_ma_term_name(List.of("Higher Ma Term 1", "Higher Ma Term 2"));
        anatomy.setAnnotated_higher_level_mp_term_id(List.of("HMP:0001", "HMP:0002"));
        anatomy.setAnnotated_higher_level_mp_term_name(List.of("Higher Mp Term 1", "Higher Mp Term 2"));
        anatomy.setInferred_higher_level_ma_term_id(List.of("IHMA:0001", "IHMA:0002"));
        anatomy.setInferred_higher_level_ma_term_name(List.of("Inferred Higher MA 1", "Inferred Higher MA 2"));
        anatomy.setAnnotated_or_inferred_higher_level_ma_term_name(List.of("Annotated/Inferred MA 1", "Annotated/Inferred MA 2"));
        anatomy.setAnnotated_or_inferred_higher_level_ma_term_id(List.of("A/IHMA:0001", "A/IHMA:0002"));
        anatomy.setSymbol(List.of("Symbol 1", "Symbol 2"));
        anatomy.setSanger_symbol(List.of("Sanger 1", "Sanger 2"));
        anatomy.setGene_name(List.of("Gene Name 1", "Gene Name 2"));
        anatomy.setSubtype(List.of("Subtype 1", "Subtype 2"));
        anatomy.setGene_synonyms(List.of("Synonym 1", "Synonym 2"));
        anatomy.setMa_term_id(List.of("MATermID:0001", "MATermID:0002"));
        anatomy.setMa_term_name(List.of("MA Term Name 1", "MA Term Name 2"));
        anatomy.setExp_name_exp(List.of("Exp Name 1", "Exp Name 2"));
        anatomy.setSymbol_gene(List.of("SymbolGene 1", "SymbolGene 2"));
        anatomy.setTop_level(List.of("TopLevel 1", "TopLevel 2"));
        anatomy.setText(List.of("Text 1", "Text 2"));
        anatomy.setAuto_suggest(List.of("Suggest 1", "Suggest 2"));
        anatomy.setAnatomy_qf(List.of("Anatomy Qf 1", "Anatomy Qf 2"));
        anatomy.setSearch_term_json("{\"searchTerm\":\"example\"}");
        anatomy.setChildren_json("[{\"child\":\"example1\"}, {\"child\":\"example2\"}]");
        anatomy.setScroll_node("ScrollNodeExample");
        return anatomy;

    }

}
