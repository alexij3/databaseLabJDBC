package com.buzilov.lab4db.service.culturepalace;

import com.buzilov.lab4db.model.CulturePalace;

import java.util.List;

public interface CulturePalaceService {
    CulturePalace insertCulturePalace(CulturePalace culturePalace);
    CulturePalace getCulturePalace(int id);
    CulturePalace updateCulturePalace(CulturePalace culturePalace);
    CulturePalace deleteCulturePalace(int id);
    List<CulturePalace> getAll();
}
