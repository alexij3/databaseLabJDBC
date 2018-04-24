package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.Impresario;
import com.buzilov.lab4db.service.impresario.ImpresarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ImpresarioController {
    @Autowired
    ImpresarioServiceImpl impresarioService;

    @RequestMapping("/impresario")
    public List<Impresario> showImpresarios(){
        return impresarioService.getAll();
    }
}
