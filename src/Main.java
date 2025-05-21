//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Hamburguesa con pan de papa (precio base $4500),
        // 1 medallón de pollo($1500)
        // y 1 de carne ($2900),
        // ingredientes extra:
        // cheddar ($600 )
        // y berenjena ($350).
        // Puede ser facturada ok y tendrá un precio total de $9850.

        Pan panPapa = new Pan("Pan de papa", 4500);
        Medallon medallonPollo = new Medallon(1500, "Medallon de pollo");
        Medallon medallonCarne = new Medallon(2900, "Medallon de carne");
        Extra cheddar = new Extra("Cheddar", 600);
        Extra berenjena = new Extra("Berenjena", 350);

        Hamburguesa hamb01 = new Hamburguesa();
        hamb01.agregarPan(panPapa);
        hamb01.agregarMedallon(medallonPollo);
        hamb01.agregarMedallon(medallonCarne);
        hamb01.agregarExtra(cheddar);
        hamb01.agregarExtra(berenjena);

        if(hamb01.facturar()){
            System.out.println(hamb01.calcularPrecio());
        }

        //Hamburguesa con pan de campo (precio base $5500).
        // 1 medallón vegetariano ($1890),
        // ingrediente extra berenjena ($350),
        // cheddar ($600).
        // No puede ser facturada porque tiene más ingredientes extras que medallones.
        // Se debería sacar un ingrediente extra o agregar un medallón.

        Pan panCampo = new Pan("Pan de campo", 5500);
        Medallon medallonVegetariano = new Medallon(1890, "Medallon vegetariano");

        Hamburguesa hamb02 = new Hamburguesa();
        hamb02.agregarPan(panCampo);
        hamb02.agregarMedallon(medallonVegetariano);
        hamb02.agregarExtra(berenjena);
        hamb02.agregarExtra(cheddar);

        if(hamb02.facturar()){
            System.out.println(hamb02.calcularPrecio());
        }

        hamb02.eliminarExtra(cheddar);
        if(hamb02.facturar()){
            System.out.println(hamb02.calcularPrecio());
        }
    }
}