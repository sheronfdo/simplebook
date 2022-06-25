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
public class Author {

    private int idauthor;
    private String name;

    public Author(int idauthor, String name) {
        this.idauthor = idauthor;
        this.name = name;
    }

    public Author(String name) {
        this.name = name;
    }

    public int getIdauthor() {
        return idauthor;
    }

    public void setIdauthor(int idauthor) {
        this.idauthor = idauthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void authorInsert() {
        try {
            String query = "INSERT INTO `author`(`name`) VALUES ('" + getName() + "')";
            DbConnect.pushToDB(query);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void authorEdit() {
        try {
            String query = "UPDATE `author` SET `name`='" + getName() + "' WHERE `idauthor`=" + getIdauthor();
            DbConnect.pushToDB(query);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void authorDelete() {
        try {
            String query = "UPDATE `author` SET status=0 WHERE `idauthor`=" + getIdauthor();
            DbConnect.pushToDB(query);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
