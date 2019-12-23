package com.gazi.Repository;
import com.gazi.Entity.Doctor;

import java.util.ArrayList;
import java.sql.SQLException;

public abstract interface IRepository<T> {
    public abstract ArrayList<T> getAll() throws SQLException;
    public void add(T doctor) throws SQLException;
    public void delete(String tc) throws SQLException;
}
