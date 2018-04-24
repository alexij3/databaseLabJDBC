package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.CulturePalace;
import com.buzilov.lab4db.service.culturepalace.CulturePalaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CulturePalaceController{
        @Autowired
        CulturePalaceServiceImpl culturePalaceService;

        @RequestMapping("/culturepalace")
        public List<CulturePalace> showCulturePalaces(){
            return culturePalaceService.getAll();
        }

}
