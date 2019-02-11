package com.epam.course.dao;

import com.epam.course.model.Entity.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BooksDao extends AbstractDao<Book> {

    public BooksDao(Connection connection) {
        super(connection);
    }

    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        String sql = "SELECT * FROM books";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setNameBook(resultSet.getString("NameBook"));
                book.setAuthor(resultSet.getString("Author"));
                book.setPublisher(resultSet.getString("Publisher"));
                book.setYear(resultSet.getInt("Year"));
                book.setPages(resultSet.getInt("Pages"));
                book.setPrice(resultSet.getInt("Price"));
                bookList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement != null){
                close(statement);
            }
        }
        return bookList;
    }

    @Override
    public Book findById(int id) {
        Book book = new Book();
        String sql = "SELECT * FROM books WHERE id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            book.setId(resultSet.getInt("id"));
            book.setNameBook(resultSet.getString("NameBook"));
            book.setAuthor(resultSet.getString("Author"));
            book.setPublisher(resultSet.getString("Publisher"));
            book.setYear(resultSet.getInt("Year"));
            book.setPages(resultSet.getInt("Pages"));
            book.setPrice(resultSet.getInt("Price"));

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null){
                close(preparedStatement);
            }
        }
        return book;
    }

    @Override
    public boolean create(Book entity) {
        String sql = "INSERT INTO books(id, NameBook, Author, Publisher, Year, Pages, Price) VALUES(?, ?, ?, ? , ?, ?, ?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, entity.getId());
            preparedStatement.setString(2,entity.getNameBook());
            preparedStatement.setString(3, entity.getAuthor());
            preparedStatement.setString(4, entity.getPublisher());
            preparedStatement.setInt(5, entity.getYear());
            preparedStatement.setInt(6, entity.getPages());
            preparedStatement.setDouble(7, entity.getPrice());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null){
                close(preparedStatement);
            }
        }
        return false;
    }

    @Override
    public Book update(Book entity) {
        String sql = "UPDATE books SET NameBook=?, Author=?, Publisher=?, Year=?, Pages=?, Price=? WHERE id=?";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, entity.getNameBook());
            preparedStatement.setString(2, entity.getAuthor());
            preparedStatement.setString(3, entity.getPublisher());
            preparedStatement.setInt(4, entity.getYear());
            preparedStatement.setInt(5, entity.getPages());
            preparedStatement.setDouble(6, entity.getPrice());
            preparedStatement.setInt(7, entity.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null){
                close(preparedStatement);
            }
        }
        return entity;
    }

    @Override
    public boolean delete(Book entity) {
        String sql = "DELETE FROM books WHERE id=?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, entity.getId());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null){
                close(preparedStatement);
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM books WHERE id=?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null){
                close(preparedStatement);
            }
        }
        return false;
    }
}
