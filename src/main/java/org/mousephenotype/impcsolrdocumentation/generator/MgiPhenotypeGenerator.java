package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.MgiPhenotype;

import java.util.List;

public class MgiPhenotypeGenerator {


    public static MgiPhenotype generateExampleMgiPhenotypeResponse() {
        return new MgiPhenotype(
            "DOC001",
            "Assertion Type Example",
            "ATID001",
            "MPATHID001",
            "MPath Term Name Example",
            "EMAPID001",
            "EMAP Term Name Example",
            "MPID001",
            "MP Term Name Example",
            List.of("ALTMPID001", "ALTMPID002"),
            List.of("TLMPID001", "TLMPID002"),
            List.of("Top Level MP Term Name 1", "Top Level MP Term Name 2"),
            List.of("Definition 1", "Definition 2"),
            List.of("Synonym 1", "Synonym 2"),
            List.of("INTMPID001", "INTMPID002"),
            List.of("Intermediate MP Term Name 1", "Intermediate MP Term Name 2"),
            List.of("Intermediate Definition 1", "Intermediate Definition 2"),
            List.of("Intermediate Synonym 1", "Intermediate Synonym 2"),
            "Marker Symbol Example",
            "Marker Accession ID Example",
            "ColonyID001",
            "Allele Name Example",
            "Allele Symbol Example",
            "Allele Accession ID Example",
            "Strain Name Example",
            "Strain Accession ID Example",
            "Phenotyping Center Example",
            "Project External ID Example",
            "Project Name Example",
            "Project Full Name Example",
            "Resource Name Example",
            "Resource Full Name Example",
            "Sex Example",
            "Zygosity Example",
            "Pipeline Name Example",
            "Pipeline Stable ID Example",
            "Pipeline Stable Key Example",
            "Procedure Name Example",
            "Procedure Stable ID Example",
            "Procedure Stable Key Example",
            "Parameter Name Example",
            "Parameter Stable ID Example",
            "Parameter Stable Key Example",
            "Statistical Method Example",
            "Percentage Change Example",
            0.05,
            1.25,
            "External ID Example",
            "Life Stage ACC Example",
            "Life Stage Name Example"
        );
    }

}
