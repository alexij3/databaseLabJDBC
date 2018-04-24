package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.ArtistAndImpresario;
import com.buzilov.lab4db.service.artistandimpresario.ArtistAndImpresarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArtistAndImpresarioController {
    @Autowired
    ArtistAndImpresarioServiceImpl artistAndImpresarioService;

    @RequestMapping("/artistimpresario")
    public List<ArtistAndImpresario> showArtistsAndImpresarios(){
        return artistAndImpresarioService.getAll();
    }
}
