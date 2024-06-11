/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bellezaapp.test;

import com.bellezaapp.dao.ProductoDAO;
import com.bellezaapp.model.Producto;

import java.util.List;

public class TestProductoDAO {
    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAO();

        // Insertar un producto
        Producto productoNuevo = new Producto();
        productoNuevo.setNombre("Lápiz Labial");
        productoNuevo.setDescripcion("Lápiz labial de larga duración");
        productoNuevo.setPrecio(9.99);
        productoDAO.insertarProducto(productoNuevo);
        System.out.println("Producto insertado");

        // Obtener un producto
        Producto productoObtenido = productoDAO.obtenerProducto(1);
        if (productoObtenido != null) {
            System.out.println("Producto obtenido: " + productoObtenido.getNombre());
        } else {
            System.out.println("Producto no encontrado");
        }

        // Obtener todos los productos
        List<Producto> productos = productoDAO.obtenerTodosLosProductos();
        System.out.println("Lista de productos:");
        for (Producto p : productos) {
            System.out.println(p.getNombre());
        }

        // Actualizar un producto
        if (productoObtenido != null) {
            productoObtenido.setPrecio(11.99);
            productoDAO.actualizarProducto(productoObtenido);
            System.out.println("Producto actualizado");
        }

        // Eliminar un producto
        if (productoObtenido != null) {
            productoDAO.eliminarProducto(productoObtenido.getId());
            System.out.println("Producto eliminado");
        }
    }
}
