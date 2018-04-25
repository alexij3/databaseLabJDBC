package com.buzilov.lab4db.dao.artistandimpresario;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.datastorage.DataStorageJdbc;
import com.buzilov.lab4db.model.Artist;
import com.buzilov.lab4db.model.ArtistAndImpresario;
import com.buzilov.lab4db.model.Impresario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class ArtistAndImpresarioDAOImpl implements ArtistAndImpresarioDAO{
    @Autowired
    DataStorageFake dataStorage;

    @Autowired
    DataStorageJdbc dataStorageJdbc;

    Connection con;
    Statement statement;

    @Override
    public ArtistAndImpresario insert(ArtistAndImpresario artistAndImpresario) throws SQLException {
        return null;
    }

    @Override
    public ArtistAndImpresario get(int id) throws SQLException {
        return null;
    }

    @Override
    public ArtistAndImpresario update(ArtistAndImpresario artistAndImpresario) throws SQLException {
        con = DriverManager.getConnection(dataStorageJdbc.getUrl(), dataStorageJdbc.getLogin(), dataStorageJdbc.getPassword());

        System.out.println(artistAndImpresario.getArtist().getId());
        System.out.println(artistAndImpresario.getImpresario().toString());
        PreparedStatement update;
        String updateArtistGenre = "UPDATE artist_and_impresario SET id_impresario = ? WHERE id_artist = ?";
        update = con.prepareStatement(updateArtistGenre);
        update.setInt(1, artistAndImpresario.getImpresario().getId());
        update.setInt(2, artistAndImpresario.getArtist().getId());
        System.out.println(update.executeUpdate());

        con.close();
        return artistAndImpresario;
    }

    @Override
    public void delete(int id, int impresarioId) throws SQLException {
        con = DriverManager.getConnection(dataStorageJdbc.getUrl(), dataStorageJdbc.getLogin(), dataStorageJdbc.getPassword());

        PreparedStatement delete;
        String deleteArtistGenre = "DELETE FROM artist_and_impresario WHERE id_artist = ? AND id_impresario = ?";
        delete = con.prepareStatement(deleteArtistGenre);
        delete.setInt(1, id);
        delete.setInt(2, impresarioId);
        delete.executeUpdate();

        con.close();
    }

    @Override
    public List<ArtistAndImpresario> getAll() throws SQLException {
        return null;
    }
}
