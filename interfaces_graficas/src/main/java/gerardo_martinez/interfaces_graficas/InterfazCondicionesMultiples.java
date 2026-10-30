package gerardo_martinez.interfaces_graficas;

import javax.swing.*;
import java.awt.*;

public class InterfazCondicionesMultiples extends JFrame {
    private LogicaEjercicios3 logica;
    private JTextArea txtAreaResultado;
    private JPanel panelDinamico;
    
    public InterfazCondicionesMultiples() {
        logica = new LogicaEjercicios3();
        setTitle("Ejercicios de Lógica - Modo Rápido");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel izquierdo con los botones de los 14 ejercicios
        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(new GridLayout(15, 1, 2, 2));
        panelMenu.setBackground(new Color(40, 40, 40));

        // Panel central para mostrar resultados y controles
        panelDinamico = new JPanel();
        panelDinamico.setLayout(new BorderLayout());
        txtAreaResultado = new JTextArea();
        txtAreaResultado.setEditable(false);
        txtAreaResultado.setFont(new Font("Monospaced", Font.PLAIN, 14));
        panelDinamico.add(new JScrollPane(txtAreaResultado), BorderLayout.CENTER);

        // Crear botones para cada ejercicio
        panelMenu.add(crearBotonMenu("1. Perímetro de Triángulos", e -> ejecutarTriangulo()));
        panelMenu.add(crearBotonMenu("2. Valor Absoluto", e -> ejecutarAbsoluto()));
        panelMenu.add(crearBotonMenu("3. Menor de Dos", e -> ejecutarMenorDeDos()));
        panelMenu.add(crearBotonMenu("4. Tipo de Carácter", e -> ejecutarTipoCaracter()));
        panelMenu.add(crearBotonMenu("5. Validador de Contraseña", e -> ejecutarContrasena()));
        panelMenu.add(crearBotonMenu("6. Números del 1 al 10", e -> txtAreaResultado.setText(logica.generarNumeros1Al10())));
        panelMenu.add(crearBotonMenu("7. Pares del 26 al 10", e -> txtAreaResultado.setText(logica.generarParesDescendientes())));
        panelMenu.add(crearBotonMenu("8. Contar Cifras", e -> ejecutarContarCifras()));
        panelMenu.add(crearBotonMenu("9. Suma Positivos", e -> ejecutarSumaPositivos()));
        panelMenu.add(crearBotonMenu("10. Conteo Descendiente 2 en 2", e -> txtAreaResultado.setText(logica.generarDecrementoGrande())));
        panelMenu.add(crearBotonMenu("11. Acceso de Usuario", e -> ejecutarAcceso()));
        panelMenu.add(crearBotonMenu("12. Conteo del 15 al 5", e -> txtAreaResultado.setText(logica.generarConteo15Al5())));
        panelMenu.add(crearBotonMenu("13. Ocho Primeros Pares", e -> txtAreaResultado.setText(logica.generarOchoPares())));
        panelMenu.add(crearBotonMenu("14. Días de la Semana", e -> ejecutarDiaSemana()));
        
        // Botón Salir que regresa al MENUPRINCIPAL
        JButton btnSalir = new JButton("Salir al Menú");
        btnSalir.setBackground(new Color(180, 50, 50));
        btnSalir.setForeground(Color.WHITE);
        btnSalir.addActionListener(e -> {
            MENUPRINCIPAL cls = new MENUPRINCIPAL();
            cls.setVisible(true);
            this.dispose();
        });
        panelMenu.add(btnSalir);

        add(new JScrollPane(panelMenu), BorderLayout.WEST);
        add(panelDinamico, BorderLayout.CENTER);
    }

    private JButton crearBotonMenu(String texto, java.awt.event.ActionListener evento) {
        JButton btn = new JButton(texto);
        btn.setHorizontalAlignment(SwingConstants.LEFT);
        btn.addActionListener(evento);
        return btn;
    }

    // Métodos auxiliares de ejecución rápida
    private void ejecutarTriangulo() {
        try {
            String opStr = JOptionPane.showInputDialog("Elige triángulo:\n1. Equilátero\n2. Isósceles\n3. Escaleno");
            if (opStr == null) return;
            int op = Integer.parseInt(opStr);
            double l1=0, l2=0, l3=0;
            if (op == 1) {
                l1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado:"));
            } else if (op == 2) {
                l1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa lado igual:"));
                l2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa lado diferente:"));
            } else if (op == 3) {
                l1 = Double.parseDouble(JOptionPane.showInputDialog("Lado 1:"));
                l2 = Double.parseDouble(JOptionPane.showInputDialog("Lado 2:"));
                l3 = Double.parseDouble(JOptionPane.showInputDialog("Lado 3:"));
            }
            txtAreaResultado.setText(logica.calcularPerimetroTriangulo(op, l1, l2, l3));
        } catch(Exception e) { JOptionPane.showMessageDialog(this, "Error en los datos ingresados."); }
    }

    private void ejecutarAbsoluto() {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número entero:"));
            txtAreaResultado.setText(logica.calcularValorAbsoluto(num));
        } catch(Exception e) {}
    }

    private void ejecutarMenorDeDos() {
        try {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1:"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2:"));
            txtAreaResultado.setText(logica.calcularMenorDeDos(n1, n2));
        } catch(Exception e) {}
    }

    private void ejecutarTipoCaracter() {
        String c = JOptionPane.showInputDialog("Ingresa un carácter:");
        if (c != null && c.length() > 0) {
            txtAreaResultado.setText(logica.evaluarTipoCaracter(c.charAt(0)));
        }
    }

    private void ejecutarContrasena() {
        String pass = JOptionPane.showInputDialog("Ingresa la contraseña:");
        boolean res = logica.validarContrasena(pass);
        txtAreaResultado.setText("¿Contraseña correcta?: " + res);
    }

    private void ejecutarContarCifras() {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
            txtAreaResultado.setText(logica.contarCifras(num));
        } catch(Exception e) {}
    }

    private void ejecutarSumaPositivos() {
        try {
            String input = JOptionPane.showInputDialog("Ingresa números separados por coma (ej: 5,10,3,-1):");
            String[] partes = input.split(",");
            int[] nums = new int[partes.length];
            for(int i=0; i<partes.length; i++) nums[i] = Integer.parseInt(partes[i].trim());
            txtAreaResultado.setText(logica.sumarPositivos(nums));
        } catch(Exception e) { JOptionPane.showMessageDialog(this, "Formato incorrecto."); }
    }

    private void ejecutarAcceso() {
        String u = JOptionPane.showInputDialog("Usuario:");
        String p = JOptionPane.showInputDialog("Contraseña:");
        txtAreaResultado.setText(logica.validarAcceso(u, p));
    }

    private void ejecutarDiaSemana() {
        try {
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Número de día (1 al 7):"));
            txtAreaResultado.setText(logica.obtenerDiaSemana(dia));
        } catch(Exception e) {}
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazCondicionesMultiples().setVisible(true));
    }
}