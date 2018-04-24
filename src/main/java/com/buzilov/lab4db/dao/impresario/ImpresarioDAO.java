package com.buzilov.lab4db.dao.impresario;

import com.buzilov.lab4db.model.Impresario;

import java.util.List;

public interface ImpresarioDAO {
    Impresario insertImpresario(Impresario impresario);
    Impresario getImpresario(int id);
    Impresario updateImpresario(Impresario impresario);
    Impresario deleteImpresario(int id);
    List<Impresario> getAll();
}
