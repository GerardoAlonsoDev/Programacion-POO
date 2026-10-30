/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo_martinez.interfaces_graficas;

public class LogicaEjercicios2 {

    // 1. Evaluar Edad (Año nacimiento y año actual)
    public String evaluarEdad(int anioNacimiento, int anioActual) {
        int calEdad = anioActual - anioNacimiento; // Corregido el orden de la resta para que dé la edad real
        
        if (calEdad >= 18) {
            if (calEdad < 30) {
                return "Eres un adulto (Edad: " + calEdad + ")";
            } else if (calEdad < 60) {
                return "Eres joven todavía (Edad: " + calEdad + ")";
            } else {
                return "Eres una persona mayor (Edad: " + calEdad + ")";
            }
        } else {
            return "Eres menor de edad (Edad: " + calEdad + ")";
        }
    }

    // 2. Par o Impar
    public String evaluarParImpar(int numero) {
        if (numero % 2 == 0) {
            return "El número " + numero + " es PAR.";
        } else {
            return "El número " + numero + " es IMPAR.";
        }
    }

    // 3. Promedio de Calificaciones (Arreglo de 5 calificaciones)
    public String evaluarPromedio(double[] calificaciones) {
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        double promedio = suma / calificaciones.length;

        if (promedio >= 9) {
            return "Alumno de excelencia. Promedio: " + promedio;
        } else if (promedio >= 8) {
            return "Muy bien. Promedio: " + promedio;
        } else if (promedio == 6) {
            return "Aprobado (Panzazo). Promedio: " + promedio;
        } else if (promedio > 6 && promedio < 8) {
            return "Bueno, pero se puede mejorar. Promedio: " + promedio;
        } else {
            return "Reprobado. Ya, hijo, échale ganas. Promedio: " + promedio;
        }
    }
}