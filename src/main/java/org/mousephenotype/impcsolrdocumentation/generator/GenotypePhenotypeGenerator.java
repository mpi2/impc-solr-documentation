package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.GenotypePhenotype;

import java.util.List;

public class GenotypePhenotypeGenerator {


    public static GenotypePhenotype generateExampleGenotypePhenotypeResponse() {
        return new GenotypePhenotype(
            "DOC001",
            123456L,
            "Assertion Type Example",
            "ATID001",
            "MPATH:0000001",
            "Mpath Term Name Example",
            List.of("ATID001", "ATID002"),
            List.of("Anatomy Term 1", "Anatomy Term 2"),
            List.of("IATID001", "IATID002"),
            List.of("Intermediate Anatomy Term 1", "Intermediate Anatomy Term 2"),
            List.of("TLATID001", "TLATID002"),
            List.of("Top Level Anatomy Term 1", "Top Level Anatomy Term 2"),
            "MP:0000001",
            "MP Term Name Example",
            List.of("AMPID001", "AMPID002"),
            List.of("TLMPID001", "TLMPID002"),
            List.of("Top Level MP Term 1", "Top Level MP Term 2"),
            List.of("IMPID001", "IMPID002"),
            List.of("Intermediate MP Term 1", "Intermediate MP Term 2"),
            "MkSym",
            "MARK:000001",
            "Colony001",
            "Allele Name Example",
            "AlleleSym",
            "Allele:000001",
            "Strain Name Example",
            "Strain:000001",
            "Phenotyping Center Example",
            "ProjectExtID001",
            List.of("Project Name 1", "Project Name 2"),
            "Project Fullname Example",
            "Resource Name Example",
            "Resource Fullname Example",
            "Male",
            "Homozygote",
            "Pipeline Name Example",
            "PipelineStableID001",
            "PipelineStableKey001",
            "Procedure Name Example",
            List.of("ProcStableID001", "ProcStableID002"),
            List.of("ProcStableKey001", "ProcStableKey002"),
            "Parameter Name Example",
            "ParamStableID001",
            List.of("ParamStableKey001", "ParamStableKey002"),
            "Statistical Method Example",
            "10%",
            0.05,
            1.2,
            "ExternalID001",
            "LS:000001",
            "Life Stage Name Example"
        );
    }

}
