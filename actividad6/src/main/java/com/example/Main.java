package com.example;

public class Main {
    public static void main(String[] args) {
        String nombre = "Juan Zapata";
        int salarioBase = 1000000;
        int horasTrabajo = 192;
        int horasExtras = 10;
        double auxilioTransporte = 162000;
        // Cálculo de la nómina
        double salarioDevengado = calcularSalarioDevengado(salarioBase, horasTrabajo, horasExtras);
        double deducciones = calcularDeducciones(salarioDevengado, auxilioTransporte);
        double salarioNeto = salarioDevengado - deducciones;

        // Impresión de la nómina
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Auxilio transporte: $" + auxilioTransporte);
        System.out.println("Salario devengado: $" + salarioDevengado);
        System.out.println("Deducciones: $" + deducciones);
        System.out.println("Salario neto: $" + salarioNeto);
    }

    public static double calcularSalarioDevengado(int salarioBase, int horasTrabajo, int horasExtras) {
        // Implementar solución
        double horaTrabajo = salarioBase / horasExtras;
        double valorHoraExtra = horaTrabajo * 0.20;
        double salarioDevengado = salarioBase + horaTrabajo + valorHoraExtra;
        return salarioDevengado;
    }

    public static double calcularDeducciones(double salarioDevengado, double auxilioTransporte) {
        // Implementar solución
        double deducciones = auxilioTransporte;
        return deducciones;
    }
}
