package gerardo_martinez.interfaces_graficas;

import javax.swing.*;
import java.awt.*;

public class EjerciciosRapidos extends JFrame {
    private JTextArea txtAreaResultado;
    private JPanel panelDinamico;
    
    public EjerciciosRapidos() {
        setTitle("Ejercicios de Bucles - Modo Rápido");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel izquierdo con los botones de los ejercicios de bucles
        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(new GridLayout(6, 1, 2, 2));
        panelMenu.setBackground(new Color(40, 40, 40));

        // Panel central para mostrar resultados
        panelDinamico = new JPanel();
        panelDinamico.setLayout(new BorderLayout());
        txtAreaResultado = new JTextArea();
        txtAreaResultado.setEditable(false);
        txtAreaResultado.setFont(new Font("Monospaced", Font.PLAIN, 14));
        panelDinamico.add(new JScrollPane(txtAreaResultado), BorderLayout.CENTER);

        // Crear botones para cada ejercicio basado en tus clases
        panelMenu.add(crearBotonMenu("1. Conteo Descendente (10 a 0)", e -> ejecutarDescendente()));
        panelMenu.add(crearBotonMenu("2. Lista de Números (0 a 20)", e -> ejecutarLista()));
        panelMenu.add(crearBotonMenu("3. Números Pares", e -> ejecutarPares()));
        panelMenu.add(crearBotonMenu("4. Promedio de 5 Calificaciones", e -> ejecutarPromedio()));
        
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

    // Lógica adaptada de tus clases desendente, lista, pares y promedio
    private void ejecutarDescendente() {
        StringBuilder sb = new StringBuilder("=== Descendentes ===\n");
        for(int i = 10; i >= 0; i--) {
            sb.append(i).append("\n");
        }
        txtAreaResultado.setText(sb.toString());
    }

    private void ejecutarLista() {
        StringBuilder sb = new StringBuilder("=== Lista de números 0 - 20 ===\n");
        for(int i = 0; i < 20; i++) {
            sb.append(i).append("\n");
        }
        txtAreaResultado.setText(sb.toString());
    }

    private void ejecutarPares() {
        StringBuilder sb = new StringBuilder("=== Pares ===\n");
        for (int i = 0; i < 11; i++) {
            sb.append(i * 2).append("\n");
        }
        txtAreaResultado.setText(sb.toString());
    }

    private void ejecutarPromedio() {
        try {
            double[] calificacion = new double[5];
            double suma = 0;
            StringBuilder sb = new StringBuilder("=== Verificación de Calificaciones ===\n");
            
            for(int i = 0; i < 5; i++) {
                String input = JOptionPane.showInputDialog("Ingresa la calificación " + (i + 1) + ":");
                if (input == null) return;
                calificacion[i] = Double.parseDouble(input);
                suma += calificacion[i];
            }
            
            double promedio = suma / 5;
            sb.append("Promedio obtenido: ").append(promedio).append("\n");
            
            if(promedio <= 10 && promedio >= 6){
                sb.append("Resultado: Has aprobado\n");
            } else {
                sb.append("Resultado: Has reprobado\n");
            }
            txtAreaResultado.setText(sb.toString());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error: Ingresa solo números válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EjerciciosRapidos().setVisible(true));
    }
}