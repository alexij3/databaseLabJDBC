package com.buzilov.lab4db.dao.artistandimpresario;

import com.buzilov.lab4db.model.ArtistAndImpresario;

import java.util.List;

public interface ArtistAndImpresarioDAO {
    ArtistAndImpresario insertArtistAndImpresario(ArtistAndImpresario artistAndImpresario);
    ArtistAndImpresario getArtistAndImpresario(int id);
    ArtistAndImpresario updateArtistAndImpresario(ArtistAndImpresario artistAndImpresario);
    ArtistAndImpresario deleteArtistAndImpresario(int id);
    List<ArtistAndImpresario> getAll();
}
