/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_.kevinrodriguez;

/**
 *
 * @author Kevin
 */
public class autos {
    public int vin,canp,capasima,precio,potencia;
    public String marca,modelo,tipo,color;

    public autos() {
    }

    public autos(int vin, int canp, int capasima, int precio, int potencia, String marca, String modelo, String tipo, String color) {
        this.vin = vin;
        this.canp = canp;
        this.capasima = capasima;
        this.precio = precio;
        this.potencia = potencia;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getCanp() {
        return canp;
    }

    public void setCanp(int canp) {
        this.canp = canp;
    }

    public int getCapasima() {
        return capasima;
    }

    public void setCapasima(int capasima) {
        this.capasima = capasima;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "autos{" + "marca=" + marca + '}';
    }
}
