package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.ArtistAndImpresario;
import com.buzilov.lab4db.service.artistandimpresario.ArtistAndImpresarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/artistimpresario")
public class ArtistAndImpresarioController {
    @Autowired
    ArtistAndImpresarioServiceImpl artistAndImpresarioService;

    @RequestMapping("/showall")
    public List<ArtistAndImpresario> showArtistsAndImpresarios() throws SQLException{
        return artistAndImpresarioService.getAll();
    }
}
