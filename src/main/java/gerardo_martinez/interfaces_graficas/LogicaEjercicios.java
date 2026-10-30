package gerardo_martinez.interfaces_graficas;

public class LogicaEjercicios {

    // 1. Calculadora Básica (M/D/V - Operaciones segun ComboBox)
    public double calcularOperacionBasica(double num1, double num2, String operacion) {
        double resultado = 0;
        switch (operacion) {
            case "Suma":
            
                resultado = num1 + num2;
                break;
            case "Resta":
            
                resultado = num1 - num2;
                break;
            case "Multiplicación":
            
                resultado = num1 * num2;
                break;
            case "División":
            
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    resultado = 0; // Manejo rapido de division por cero
                }
                break;
            default:
                resultado = 0;
                break;
        }
        return resultado;
    }

    // 2. Área del Círculo (InputRadio)
    public double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // 3. Área del Trapecio (inputBM, inputBm, Altura)
    public double calcularAreaTrapecio(double bMayor, double bMenor, double altura) {
        return ((bMayor + bMenor) / 2) * altura;
    }

    // 4. Área del Cuadrado (inputLado)
    public double calcularAreaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    // 5. Área del Rectángulo (inputARec, InputBRec -> Base y Altura)
    public double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // 6. Área del Triángulo (BaseTri, AlturaTri)
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // 7. Fórmula General (FrmGA, FrmGB, FrmGC) -> Retorna un String con las dos raices o mensaje
    public String calcularFormulaGeneral(double a, double b, double c) {
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "X1: " + x1 + " | X2: " + x2;
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return "Raíz única: " + x;
        } else {
            return "Raíces imaginarias";
        }
    }

    // 8. Masa, Densidad, Volumen (InputMVD1, InputMVD2) -> Dependiendo de que calcule
    public double calcularMasaDensidadVolumen(double val1, double val2, String opcion) {
        // Ejemplo genérico rapido
        if (opcion.equalsIgnoreCase("Densidad")) {
            return val1 / val2; // Masa / Volumen
        } else if (opcion.equalsIgnoreCase("Masa")) {
            return val1 * val2; // Densidad * Volumen
        } else {
            return val1 / val2; // Volumen = Masa / Densidad
        }
    }
    // Distancia entre dos puntos
public double calcularDistancia(double x1, double x2, double y1, double y2) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
}
}