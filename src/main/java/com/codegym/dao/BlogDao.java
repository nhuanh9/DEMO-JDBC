package com.codegym.dao;

import com.codegym.model.Blog;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BlogDao implements IBlogDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo001";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";


    protected Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

        return connection;
    }
    @Override
    public List<Blog> findAll() {
        List<Blog> blogs = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from blog");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.beforeFirst();
            while (resultSet.next()) {
                int id = resultSet.getInt("idblog");
                int user_id = resultSet.getInt("user_id");
                String title = resultSet.getString("title");
                String content = resultSet.getString("content");
                blogs.add(new Blog(id, title, content, user_id));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return blogs;
    }
    public BlogDao() {
    }

    @Override
    public void insert(Blog blog) throws SQLException {

    }

    @Override
    public Blog findById(int id) {
        return null;
    }



    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Blog blog) throws SQLException {
        return false;
    }
}
