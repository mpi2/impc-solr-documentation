package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.OrthologMapping;

public class OrthologMappingGenerator {


    public static OrthologMapping generateExampleOrthologMappingResponse() {
        return new OrthologMapping(
            "hg123",
            "HG",
            "Category",
            456L,
            789L,
            3L,
            10L,
            "exampleId",
            "mg123",
            "MG",
            "Category",
            987L,
            654L,
            5L,
            8L,
            "Category",
            321L,
            654L,
            "Yes",
            "No",
            987L,
            "Support",
            12L,
            "Raw Support"
        );
    }

}
