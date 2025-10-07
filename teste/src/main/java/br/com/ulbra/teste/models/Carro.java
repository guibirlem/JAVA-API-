package br.com.ulbra.teste.models;

public class Carro {
    private static int contador = 1;
    private int id = contador;
    private String brand;
    private String year;
    private String color;
    private String power;

    public Carro(String brand, String year, String color, String power) {
        this.id = contador++;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getPower() {
        return power;
    }

    public int getId(){
        return id;  
    }
}
