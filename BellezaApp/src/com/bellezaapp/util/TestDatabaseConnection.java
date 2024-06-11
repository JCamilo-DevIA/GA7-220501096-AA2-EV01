/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bellezaapp.test;

import com.bellezaapp.util.DatabaseUtil;
import java.sql.Connection;
import java.sql.SQLException;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        try {
            Connection connection = DatabaseUtil.getConnection();
            if (connection != null) {
                System.out.println("¡Conexión exitosa a la base de datos!");
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

