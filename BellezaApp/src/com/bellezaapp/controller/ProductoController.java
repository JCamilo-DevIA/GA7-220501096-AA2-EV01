/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bellezaapp.controller;

import com.bellezaapp.dao.ProductoDAO;
import com.bellezaapp.model.Producto;

import java.util.List;

public class ProductoController {
    private ProductoDAO productoDAO = new ProductoDAO();

    public List<Producto> getAllProductos() {
        return productoDAO.getAllProductos();
    }

    public void addProducto(Producto producto) {
        productoDAO.addProducto(producto);
    }

    public void updateProducto(Producto producto) {
        productoDAO.updateProducto(producto);
    }

    public void deleteProducto(int id) {
        productoDAO.deleteProducto(id);
    }
}

