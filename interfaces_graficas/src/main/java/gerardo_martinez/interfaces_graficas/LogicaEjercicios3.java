/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo_martinez.interfaces_graficas;



public class LogicaEjercicios3 {

    // 1. Perímetro de Triángulos
    public String calcularPerimetroTriangulo(int opcion, double l1, double l2, double l3) {
        switch(opcion) {
            case 1 -> { // Equilátero (l1 es el lado)
                double perimetro = l1 * 3;
                return "El perímetro del triángulo equilátero es: " + perimetro;
            }
            case 2 -> { // Isósceles (l1 = lado igual, l2 = lado diferente)
                double perimetro = (l1 * 2) + l2;
                return "El perímetro del triángulo isósceles es: " + perimetro;
            }
            case 3 -> { // Escaleno (l1, l2, l3)
                double perimetro = l1 + l2 + l3;
                return "El perímetro del triángulo escaleno es: " + perimetro;
            }
            default -> {
                return "Opción de triángulo no válida.";
            }
        }
    }

    // 2. Valor Absoluto
    public String calcularValorAbsoluto(int numero) {
        int resultado = (numero >= 0) ? numero : -numero;
        return "El valor absoluto de " + numero + " es: " + resultado;
    }

    // 3. Menor de Dos
    public String calcularMenorDeDos(int num1, int num2) {
        int menor = (num1 < num2) ? num1 : num2;
        return "Entre " + num1 + " y " + num2 + ", el número menor es: " + menor;
    }

    // 4. Tipo de Carácter
    public String evaluarTipoCaracter(char caracter) {
        char cMin = Character.toLowerCase(caracter);

        switch(cMin) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                return "El carácter '" + caracter + "' se trata de una vocal.";
            }
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                return "El carácter '" + caracter + "' se trata de una cifra numérica.";
            }
            default -> {
                if (cMin >= 'a' && cMin <= 'z') {
                    return "El carácter '" + caracter + "' se trata de una consonante.";
                } else {
                    return "El carácter '" + caracter + "' es otro tipo de símbolo.";
                }
            }
        }
    }

    // 5. Validador de Contraseña (Devuelve true o false para validar en bucle de interfaz)
    public boolean validarContrasena(String contrasena) {
        return contrasena.equals("clave");
    }

    // 6. Números del 1 al 10
    public String generarNumeros1Al10() {
        StringBuilder sb = new StringBuilder("Números del 1 al 10:\n");
        int i = 1;
        while(i <= 10) {
            sb.append(i).append("\n");
            i++;
        }
        return sb.toString();
    }

    // 7. Pares Descendientes (del 26 al 10)
    public String generarParesDescendientes() {
        StringBuilder sb = new StringBuilder("Pares del 26 al 10:\n");
        int i = 26;
        while (i >= 10) {
            if (i % 2 == 0) {
                sb.append(i).append("\n");
            }
            i--;
        }
        return sb.toString();
    }

    // 8. Contar Cifras
    public String contarCifras(int numero) {
        int cifras = 0;
        int aux = Math.abs(numero);

        while (aux > 0) {
            cifras++;
            aux = aux / 10;
        }
        if (numero == 0) {
            cifras = 1;
        }

        return "El número " + numero + " tiene " + cifras + " cifras.";
    }

    // 9. Suma de Números Positivos (Acumulador)
    public String sumarPositivos(int[] numeros) {
        int suma = 0;
        for (int n : numeros) {
            if (n <= 0) break; // Termina si encuentra cero o negativo
            suma += n;
        }
        return "La suma total de los números positivos es: " + suma;
    }

    // 10. Conteo de 2 en 2 descendiente
    public String generarDecrementoGrande() {
        StringBuilder sb = new StringBuilder("Conteo descendiente de 2 en 2:\n");
        int i = 26;
        do {
            sb.append(i).append("\n");
            i -= 2;
        } while (i >= 10);
        return sb.toString();
    }

    // 11. Acceso de Usuario
    public String validarAcceso(String usuario, String password) {
        if (usuario.equals("Pedro") && password.equals("Peter")) {
            return "¡Acceso concedido, bienvenido Pedro!";
        } else {
            return "Acceso denegado. Credenciales incorrectas.";
        }
    }

    // 12. Conteo del 15 al 5
    public String generarConteo15Al5() {
        StringBuilder sb = new StringBuilder("Conteo del 15 al 5:\n");
        int i = 15;
        while (i >= 5) {
            sb.append(i).append("\n");
            i--;
        }
        return sb.toString();
    }

    // 13. Ocho Primeros Pares
    public String generarOchoPares() {
        StringBuilder sb = new StringBuilder("Primeros 8 números pares:\n");
        int i = 1;
        while (i <= 8) {
            sb.append(i * 2).append("\n");
            i++;
        }
        return sb.toString();
    }

    // 14. Días de la Semana
    public String obtenerDiaSemana(int dia) {
        return switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número no válido. Debe ser del 1 al 7.";
        };
    }
}