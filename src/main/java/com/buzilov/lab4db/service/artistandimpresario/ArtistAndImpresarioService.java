package com.buzilov.lab4db.service.artistandimpresario;

import com.buzilov.lab4db.model.ArtistAndImpresario;

import java.sql.SQLException;
import java.util.List;

public interface ArtistAndImpresarioService {
    ArtistAndImpresario insertArtistAndImpresario(ArtistAndImpresario artistAndImpresario);
    ArtistAndImpresario getArtistAndImpresario(int id);
    ArtistAndImpresario updateArtistAndImpresario(ArtistAndImpresario artistAndImpresario);
    ArtistAndImpresario deleteArtistAndImpresario(int id);
    List<ArtistAndImpresario> getAll() throws SQLException;
}
