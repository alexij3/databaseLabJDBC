package com.buzilov.lab4db.dao.artistandimpresario;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.datastorage.DataStorageJdbc;
import com.buzilov.lab4db.model.Artist;
import com.buzilov.lab4db.model.ArtistAndImpresario;
import com.buzilov.lab4db.model.Impresario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ArtistAndImpresarioDAOImpl implements ArtistAndImpresarioDAO{
    @Autowired
    DataStorageFake dataStorage;

    @Autowired
    DataStorageJdbc dataStorageJdbc;

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
    public List<ArtistAndImpresario> getAll() throws SQLException{
        List<ArtistAndImpresario> list = new ArrayList<>();
        ResultSet rs = dataStorageJdbc.executeQuery("SELECT artist.id, artist.name, impresario.id, impresario.name" +
                                                    "\nFROM artist_and_impresario JOIN artist ON artist.id = id_artist" +
                                                    "\nJOIN impresario ON impresario.id = id_impresario" +
                                                    "\nORDER BY artist.id, impresario.id");

        while (rs.next()){
            list.add(new ArtistAndImpresario(new Artist(rs.getInt("artist.id"), rs.getString("artist.name")),
                    new Impresario(rs.getInt("impresario.id"), rs.getString("impresario.name"))));

        }

        return list;
    }
}
