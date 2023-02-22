
package javaapplication36;
import java.util.Scanner;
public class JavaApplication36 {
    
public abstract class ProductoElectronico {
    protected double precio;
    protected String marca;
    protected String modelo;

    public ProductoElectronico(double precio, String marca, String modelo) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
}

public class TelefonoMovil extends ProductoElectronico {
    private int capacidadAlmacenamiento;
    private int duracionBateria;

    public TelefonoMovil(double precio, String marca, String modelo, int capacidadAlmacenamiento, int duracionBateria) {
        super(precio, marca, modelo);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.duracionBateria = duracionBateria;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }
}

public class Tableta extends ProductoElectronico {
    private int capacidadAlmacenamiento;
    private int duracionBateria;

    public Tableta(double precio, String marca, String modelo, int capacidadAlmacenamiento, int duracionBateria) {
        super(precio, marca, modelo);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.duracionBateria = duracionBateria;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }
}

public class OrdenadorPortatil extends ProductoElectronico {
    private int capacidadAlmacenamiento;
    private int velocidadProcesador;

    public OrdenadorPortatil(double precio, String marca, String modelo, int capacidadAlmacenamiento, int velocidadProcesador) {
        super(precio, marca, modelo);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.velocidadProcesador = velocidadProcesador;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(int velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }
}
public static void main(String[] args) {
        JavaApplication36 ppp = new JavaApplication36();
        System.out.println(ppp.getClass());
    }

    

    }
    

