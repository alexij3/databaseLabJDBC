package com.buzilov.lab4db.dao.impresario;

import com.buzilov.lab4db.model.Impresario;

import java.sql.SQLException;
import java.util.List;

public interface ImpresarioDAO {
    Impresario insert(Impresario impresario) throws SQLException;
    Impresario get(int id) throws SQLException;
    Impresario update(Impresario impresario) throws SQLException;
    void delete(int id) throws SQLException;
    List<Impresario> getAll() throws SQLException;
}
