package org.mousephenotype.impcsolrdocumentation.generator;

import org.mousephenotype.impcsolrdocumentation.model.OrthologMapping;

public class OrthologMappingGenerator {


    public static OrthologMapping generateExampleOrthologMappingResponse() {
        OrthologMapping orthologMapping = new OrthologMapping();
        orthologMapping.setHgHgncAccId("hg123");
        orthologMapping.setHgSymbol("HG");
        orthologMapping.setHmfCategoryForThreshold("Category");
        orthologMapping.setHmfHumanGeneId(456L);
        orthologMapping.setHmfId(789L);
        orthologMapping.setHmfOrthologsAboveThreshold(3L);
        orthologMapping.setHmfSupportCountThreshold(10L);
        orthologMapping.setId("exampleId");
        orthologMapping.setMgMgiGeneAccId("mg123");
        orthologMapping.setMgSymbol("MG");
        orthologMapping.setMmfCategoryForThreshold("Category");
        orthologMapping.setMmfId(987L);
        orthologMapping.setMmfMouseGeneId(654L);
        orthologMapping.setMmfOrthologsAboveThreshold(5L);
        orthologMapping.setMmfSupportCountThreshold(8L);
        orthologMapping.setOCategory("Category");
        orthologMapping.setOHumanGeneId(321L);
        orthologMapping.setOId(654L);
        orthologMapping.setOIsMaxHumanToMouse("Yes");
        orthologMapping.setOIsMaxMouseToHuman("No");
        orthologMapping.setOMouseGeneId(987L);
        orthologMapping.setOSupport("Support");
        orthologMapping.setOSupportCount(12L);
        orthologMapping.setOSupportRaw("Raw Support");
        return orthologMapping;
    }

}
