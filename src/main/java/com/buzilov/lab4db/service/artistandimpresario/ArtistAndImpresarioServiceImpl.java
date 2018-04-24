package com.buzilov.lab4db.service.artistandimpresario;

import com.buzilov.lab4db.dao.artistandimpresario.ArtistAndImpresarioDAOImpl;
import com.buzilov.lab4db.model.ArtistAndImpresario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistAndImpresarioServiceImpl implements ArtistAndImpresarioService {
    @Autowired
    ArtistAndImpresarioDAOImpl artistAndImpresarioDAO;

    @Override
    public ArtistAndImpresario insertArtistAndImpresario(ArtistAndImpresario artistAndImpresario) {
        return artistAndImpresarioDAO.insertArtistAndImpresario(artistAndImpresario);
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
        return artistAndImpresarioDAO.getAll();
    }
}
