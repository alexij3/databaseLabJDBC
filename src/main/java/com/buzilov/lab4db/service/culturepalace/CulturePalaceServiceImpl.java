package com.buzilov.lab4db.service.culturepalace;

import com.buzilov.lab4db.dao.culturepalace.CulturePalaceDAOImpl;
import com.buzilov.lab4db.model.CulturePalace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CulturePalaceServiceImpl implements CulturePalaceService {
    @Autowired
    CulturePalaceDAOImpl culturePalaceDAO;

    @Override
    public CulturePalace insertCulturePalace(CulturePalace culturePalace) {
        return culturePalaceDAO.insertCulturePalace(culturePalace);
    }

    @Override
    public CulturePalace getCulturePalace(int id) {
        return culturePalaceDAO.getCulturePalace(id);
    }

    @Override
    public CulturePalace updateCulturePalace(CulturePalace culturePalace) {
        return culturePalaceDAO.updateCulturePalace(culturePalace);
    }

    @Override
    public CulturePalace deleteCulturePalace(int id) {
        return culturePalaceDAO.deleteCulturePalace(id);
    }

    @Override
    public List<CulturePalace> getAll() {
        return culturePalaceDAO.getAll();
    }
}
