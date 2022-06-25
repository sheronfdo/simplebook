/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import database.DbConnect;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jamith
 */
public class Book {
    private int idbook;
    private String title;
    private double price;
    private int idauthor;

    public Book(int idbook, String title, double price, int idauthor) {
        this.idbook = idbook;
        this.title = title;
        this.price = price;
        this.idauthor = idauthor;
    }

    public Book(String title, double price, int idauthor) {
        this.title = title;
        this.price = price;
        this.idauthor = idauthor;
    }

    public int getIdbook() {
        return idbook;
    }

    public void setIdbook(int idbook) {
        this.idbook = idbook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdauthor() {
        return idauthor;
    }

    public void setIdauthor(int idauthor) {
        this.idauthor = idauthor;
    }
    
    public void bookInsert() {
        try {
            String query = "INSERT INTO `book`(`title`, `price`, `author_idauthor`) VALUES ('"+getTitle()+"','"+getPrice()+"','"+getIdauthor()+"')";
            DbConnect.pushToDB(query);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bookEdit() {
        try {
            String query = "UPDATE `book` SET `title`='"+getTitle()+"',`price`="+getPrice()+",`author_idauthor`="+getIdauthor()+" WHERE `idbook`="+getIdbook();
            DbConnect.pushToDB(query);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bookDelete() {
        try {
            String query = "UPDATE `book` SET status=0 WHERE `idbook`="+getIdbook();
            DbConnect.pushToDB(query);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
