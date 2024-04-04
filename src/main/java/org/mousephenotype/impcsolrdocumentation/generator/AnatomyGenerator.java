package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.Anatomy;

import java.util.List;

public class AnatomyGenerator {


    public static Anatomy generateExampleAnatomyResponse() {
        Anatomy anatomy = new Anatomy();
        anatomy.setDataType("Example DataType");
        anatomy.setAnatomyId(List.of("ANAT:0001", "ANAT:0002"));
        anatomy.setAnatomyTerm("Heart");
        anatomy.setAnatomyTermSynonym(List.of("Cardiac", "Cor"));
        anatomy.setAnatomyNodeId(List.of(101, 102));
        anatomy.setAltAnatomyId(List.of("ALT:001", "ALT:002"));
        anatomy.setStage("adult");
        anatomy.setEfoId(List.of("EFO:0001", "EFO:0002"));
        anatomy.setAllAeMappedEfoId(List.of("EFO:0003", "EFO:0004"));
        anatomy.setUberonId(List.of("UBERON:0001", "UBERON:0002"));
        anatomy.setAllAeMappedUberonId(List.of("UBERON:0003", "UBERON:0004"));
        anatomy.setParentAnatomyId(List.of("PARENT:001", "PARENT:002"));
        anatomy.setParentAnatomyTerm(List.of("Parent Heart", "Parent Lung"));
        anatomy.setParentAnatomyTermSynonym(List.of("Parent Cardiac", "Parent Pulmonary"));
        anatomy.setChildAnatomyId(List.of("CHILD:001", "CHILD:002"));
        anatomy.setChildAnatomyTerm(List.of("Child Heart", "Child Lung"));
        anatomy.setChildAnatomyTermSynonym(List.of("Child Cardiac", "Child Pulmonary"));
        anatomy.setIntermediateAnatomyId(List.of("INTERMEDIATE:001", "INTERMEDIATE:002"));
        anatomy.setIntermediateAnatomyTerm(List.of("Intermediate Heart", "Intermediate Lung"));
        anatomy.setIntermediateAnatomyTermSynonym(List.of("Intermediate Cardiac", "Intermediate Pulmonary"));
        anatomy.setTopLevelAnatomyId(List.of("TOP:001", "TOP:002"));
        anatomy.setTopLevelAnatomyTerm(List.of("Top Level Heart", "Top Level Lung"));
        anatomy.setTopLevelAnatomyTermSynonym(List.of("Top Cardiac", "Top Pulmonary"));
        anatomy.setSelectedTopLevelAnatomyId(List.of("SELECTED:001", "SELECTED:002"));
        anatomy.setSelectedTopLevelAnatomyTerm(List.of("Selected Top Heart", "Selected Top Lung"));
        anatomy.setSelectedTopLevelAnatomyTermSynonym(List.of("Selected Top Cardiac", "Selected Top Pulmonary"));
        anatomy.setMpId(List.of("MP:0001", "MP:0002"));
        anatomy.setMpTerm(List.of("Phenotype 1", "Phenotype 2"));
        anatomy.setMpTermSynonym(List.of("Synonym 1", "Synonym 2"));
        anatomy.setTopLevelMpId(List.of("TOPMP:0001", "TOPMP:0002"));
        anatomy.setTopLevelMpTerm(List.of("Top Level Phenotype 1", "Top Level Phenotype 2"));
        anatomy.setTopLevelMpTermSynonym(List.of("Top Synonym 1", "Top Synonym 2"));
        anatomy.setIntermediateMpId(List.of("INTERMP:0001", "INTERMP:0002"));
        anatomy.setIntermediateMpTerm(List.of("Intermediate Phenotype 1", "Intermediate Phenotype 2"));
        anatomy.setIntermediateMpTermSynonym(List.of("Intermediate Synonym 1", "Intermediate Synonym 2"));
        anatomy.setChildMpId(List.of("CHILDMP:0001", "CHILDMP:0002"));
        anatomy.setChildMpTerm(List.of("Child Phenotype 1", "Child Phenotype 2"));
        anatomy.setChildMpTermSynonym(List.of("Child Synonym 1", "Child Synonym 2"));
        anatomy.setAnnotationTermId(List.of("TERMID:0001", "TERMID:0002"));
        anatomy.setAnnotationTermName(List.of("Term Name 1", "Term Name 2"));
        anatomy.setName(List.of("Name 1", "Name 2"));
        anatomy.setAccession(List.of("ACC:0001", "ACC:0002"));
        anatomy.setExpName(List.of("Experiment 1", "Experiment 2"));
        anatomy.setLargeThumbnailFilePath("/path/to/large/thumbnail.jpg");
        anatomy.setSmallThumbnailFilePath("/path/to/small/thumbnail.jpg");
        anatomy.setInferredMaTermId(List.of("MA:0001", "MA:0002"));
        anatomy.setInferredMaTermName(List.of("Ma Term 1", "Ma Term 2"));
        anatomy.setAnnotatedHigherLevelMaTermId(List.of("HMA:0001", "HMA:0002"));
        anatomy.setAnnotatedHigherLevelMaTermName(List.of("Higher Ma Term 1", "Higher Ma Term 2"));
        anatomy.setAnnotatedHigherLevelMpTermId(List.of("HMP:0001", "HMP:0002"));
        anatomy.setAnnotatedHigherLevelMpTermName(List.of("Higher Mp Term 1", "Higher Mp Term 2"));
        anatomy.setInferredHigherLevelMaTermId(List.of("IHMA:0001", "IHMA:0002"));
        anatomy.setInferredHigherLevelMaTermName(List.of("Inferred Higher MA 1", "Inferred Higher MA 2"));
        anatomy.setAnnotatedOrInferredHigherLevelMaTermName(List.of("Annotated/Inferred MA 1", "Annotated/Inferred MA 2"));
        anatomy.setAnnotatedOrInferredHigherLevelMaTermId(List.of("A/IHMA:0001", "A/IHMA:0002"));
        anatomy.setSymbol(List.of("Symbol 1", "Symbol 2"));
        anatomy.setSangerSymbol(List.of("Sanger 1", "Sanger 2"));
        anatomy.setGeneName(List.of("Gene Name 1", "Gene Name 2"));
        anatomy.setSubtype(List.of("Subtype 1", "Subtype 2"));
        anatomy.setGeneSynonyms(List.of("Synonym 1", "Synonym 2"));
        anatomy.setMaTermId(List.of("MATermID:0001", "MATermID:0002"));
        anatomy.setMaTermName(List.of("MA Term Name 1", "MA Term Name 2"));
        anatomy.setExpNameExp(List.of("Exp Name 1", "Exp Name 2"));
        anatomy.setSymbolGene(List.of("SymbolGene 1", "SymbolGene 2"));
        anatomy.setTopLevel(List.of("TopLevel 1", "TopLevel 2"));
        anatomy.setText(List.of("Text 1", "Text 2"));
        anatomy.setAutoSuggest(List.of("Suggest 1", "Suggest 2"));
        anatomy.setAnatomyQf(List.of("Anatomy Qf 1", "Anatomy Qf 2"));
        anatomy.setSearchTermJson("{\"searchTerm\":\"example\"}");
        anatomy.setChildrenJson("[{\"child\":\"example1\"}, {\"child\":\"example2\"}]");
        anatomy.setScrollNode("ScrollNodeExample");
        return anatomy;
    }

}
