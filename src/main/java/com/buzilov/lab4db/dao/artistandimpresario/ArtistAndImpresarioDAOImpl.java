package com.buzilov.lab4db.dao.artistandimpresario;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.model.Artist;
import com.buzilov.lab4db.model.ArtistAndImpresario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArtistAndImpresarioDAOImpl implements ArtistAndImpresarioDAO{
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public ArtistAndImpresario insertArtistAndImpresario(ArtistAndImpresario artistAndImpresario) {
        dataStorage.getArtistAndImpresarios().add(artistAndImpresario);
        return artistAndImpresario;
    }

    @Override
    public ArtistAndImpresario getArtistAndImpresario(int id) {
        return null;
    }

    @Override
    public ArtistAndImpresario updateArtistAndImpresario(ArtistAndImpresario artistAndImpresario) {
        return null;
    }

    @Override
    public ArtistAndImpresario deleteArtistAndImpresario(int id) {
        return null;
    }

    @Override
    public List<ArtistAndImpresario> getAll() {
        return dataStorage.getArtistAndImpresarios();
    }
}
