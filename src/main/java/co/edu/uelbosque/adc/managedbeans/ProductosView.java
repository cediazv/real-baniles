/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.adc.managedbeans;

import co.edu.uelbosque.adc.entidades.Producto;
import java.util.List;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author carlosdiazvalbuena
 *
 */
@ManagedBean
public class ProductosView {

    private List<Producto> productos;

    @PostConstruct
    public void init() {
        productos = new ArrayList<Producto>();
        int cImagenes = 1;
        for (int i = 1; i <= 500; i++) {
            if (cImagenes % 251 == 0){
                cImagenes = 1;
            }
            productos.add(new Producto("Producto " + i, "Descripción del producto" + i + " para mostrar contenido", 1000d * i, i, "img (" + cImagenes + ").jpg"));
            cImagenes++;
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }
}