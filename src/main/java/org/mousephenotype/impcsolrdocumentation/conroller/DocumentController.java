package org.mousephenotype.impcsolrdocumentation.conroller;


import org.mousephenotype.impcsolrdocumentation.generator.*;
import org.mousephenotype.impcsolrdocumentation.model.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
@RestController
public class DocumentController {

    @GetMapping(value = "getAlleleDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Allele getAllele() {
        return AlleleGenerator.generateExampleAlleleResponse();
    }

    @GetMapping(value = "getAnatomyDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Anatomy getAnatomy() {
        return AnatomyGenerator.generateExampleAnatomyResponse();
    }

    @GetMapping(value = "getEssentialGenesDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public EssentialGenes getEssentialGenes() {
        return EssentialGenesGenerator.generateExampleEssentialGenesResponse();
    }

    @GetMapping(value = "getExperimentDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Experiment getExperiment() {
        return ExperimentGenerator.generateExampleExperimentResponse();
    }

    @GetMapping(value = "getGeneDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Gene getGene() {
        return GeneGenerator.generateExampleGeneResponse();
    }

    @GetMapping(value = "getGenotypePhenotypeDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public GenotypePhenotype getGenotypePhenotype() {
        return GenotypePhenotypeGenerator.generateExampleGenotypePhenotypeResponse();
    }

    @GetMapping(value = "getImagesDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Images getImages() {
        return ImagesGenerator.generateExampleImagesResponse();
    }

    @GetMapping(value = "getImpcImagesDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ImpcImages getImpcImages() {
        return ImpcImagesGenerator.generateExampleImpcImagesResponse();
    }

    @GetMapping(value = "getMgiPhenotypeDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public MgiPhenotype getMgiPhenotypes() {
        return MgiPhenotypeGenerator.generateExampleMgiPhenotypeResponse();
    }

    @GetMapping(value = "getMpDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Mp getMp() {
        return MpGenerator.generateExampleMpResponse();
    }

    @GetMapping(value = "getOrthologMappingDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public OrthologMapping getOrthologMapping() {
        return OrthologMappingGenerator.generateExampleOrthologMappingResponse();
    }

    @GetMapping(value = "getPhenodigmDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Phenodigm getPhenodigm() {
        return PhenodigmGenerator.generateExamplePhenodigmResponse();
    }

    @GetMapping(value = "getPipelineDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Pipeline getPipeline() {
        return PipelineGenerator.generateExamplePipelineResponse();
    }

    @GetMapping(value = "getProductDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Product getProduct() {
        return ProductGenerator.generateExampleProductResponse();
    }

    @GetMapping(value = "getStatisticalRawDataDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public StatisticalRawData getStatisticalRawData() {
        return StatisticalRawDataGenerator.generateExampleStatisticalRawDataResponse();
    }

    @GetMapping(value = "getStatisticalResultDoc", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public StatisticalResult getStatisticalResult() {
        return StatisticalResultGenerator.generateExampleStatisticalResultResponse();
    }


    @GetMapping(value = "/index", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> getIndexHtml() {
        Resource resource = new ClassPathResource("static/index.html");
        try {
            Path indexPath = resource.getFile().toPath();
            String htmlContent = Files.readString(indexPath);
            return ResponseEntity.ok(htmlContent);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Error reading HTML file");

        }
    }
}
