package com.buzilov.lab4db.dao.culturepalace;

import com.buzilov.lab4db.model.CulturePalace;

import java.util.List;

public interface CulturePalaceDAO {
    CulturePalace insertCulturePalace(CulturePalace culturePalace);
    CulturePalace getCulturePalace(int id);
    CulturePalace updateCulturePalace(CulturePalace culturePalace);
    CulturePalace deleteCulturePalace(int id);
    List<CulturePalace> getAll();
}
