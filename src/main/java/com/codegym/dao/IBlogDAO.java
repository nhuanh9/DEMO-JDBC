package com.codegym.dao;

import com.codegym.model.Blog;
import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IBlogDAO {
    public void insert(Blog blog) throws SQLException;

    public Blog findById(int id);

    public List<Blog> findAll();

    public boolean delete(int id) throws SQLException;

    public boolean update(Blog blog) throws SQLException;
}
