package com.arijit.moviecatelogservice.controller;

import com.arijit.moviecatelogservice.entity.MovieCatalog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class MovieCatalogController {

    @GetMapping(path = "/all")
    public List<MovieCatalog> findAllMovieCatalogs(){
        return Arrays.asList(
                new MovieCatalog(1,"Titanic", 5.0),
                new MovieCatalog(2,"Transformers",4.0)
        );
    }
}
