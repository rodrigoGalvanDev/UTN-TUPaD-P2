/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp_8;

/**
 *
 * @author rodri
 */
import java.util.ArrayList;
import java.util.List;

interface Pagable {

    double calcularTotal();
}

class Producto implements Pagable {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public double calcularTotal() {
        return precio;
    }
}

class Pedido implements Pagable {

    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificarCambio("El estado del pedido cambió a: " + nuevoEstado);
    }

    public String getEstado() {
        return estado;
    }
}

interface Pago {

    void procesarPago(double monto);
}

interface PagoConDescuento extends Pago {

    double aplicarDescuento(double monto);
}

class PagoTarjetaCredito implements PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta de crédito procesado por $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        double totalConDescuento = monto * 0.9; // 10% de descuento
        System.out.println("Descuento aplicado: total $" + totalConDescuento);
        return totalConDescuento;
    }
}

class PagoPayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal procesado por $" + monto);
    }
}

interface Notificable {

    void notificarCambio(String mensaje);
}

class Cliente implements Notificable {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificarCambio(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }
}

public class ECommerce {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Sofía");

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Mouse", 25.0));
        pedido.agregarProducto(new Producto("Teclado", 45.0));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        PagoTarjetaCredito pago = new PagoTarjetaCredito();
        double totalConDescuento = pago.aplicarDescuento(pedido.calcularTotal());
        pago.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Enviado");
    }
}
