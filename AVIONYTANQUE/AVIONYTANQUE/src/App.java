import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class App extends JPanel {

    private int xAvion, yAvion;
    private double angulo;
    private boolean disparado = false;
    private boolean acierto = false;

    public App() {
        Random rand = new Random();
        xAvion = 100 + rand.nextInt(300); // avión en X entre 100 y 400
        yAvion = 50 + rand.nextInt(150);  // avión en Y entre 50 y 200

        JFrame frame = new JFrame("Tanque vs Avión");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);

        // Mostrar coordenadas del avión como ayuda
        JOptionPane.showMessageDialog(null, "📡 Coordenadas del avión: (" + xAvion + ", " + yAvion + ")");

        // Solicitar ángulo de disparo
        String input = JOptionPane.showInputDialog("Ingresa el ángulo de disparo (0° a 90°):");
        try {
            angulo = Double.parseDouble(input);
            if (angulo <= 0 || angulo >= 90) {
                JOptionPane.showMessageDialog(null, "Ángulo fuera de rango. Debe estar entre 0° y 90°.");
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida.");
            System.exit(0);
        }

        disparado = true;
        repaint();
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);
        Graphics2D g2 = (Graphics2D) g;

        // Coordenadas base
        int xTanque = 40;
        int yTanque = getHeight() - 30;

        // Dibujar tanque
        g2.setColor(Color.BLUE);
        g2.fillRect(xTanque - 20, yTanque - 10, 40, 20);

        // Dibujar avión
        int avionScreenX = xAvion;
        int avionScreenY = getHeight() - yAvion;
        g2.setColor(Color.RED);
        g2.fillOval(avionScreenX, avionScreenY, 20, 20);

        // Mostrar coordenadas del avión
        g2.setColor(Color.BLACK);
        g2.drawString("Avión en (" + xAvion + ", " + yAvion + ")", avionScreenX - 10, avionScreenY - 10);

        if (disparado) {
            // Calcular línea de disparo
            double m = Math.tan(Math.toRadians(angulo));

            int xEnd = xTanque + 500;
            int yEnd = (int) (yTanque - m * (xEnd - xTanque));

            // Dibujar línea de disparo
            g2.setColor(Color.GREEN);
            g2.setStroke(new BasicStroke(2));
            g2.drawLine(xTanque, yTanque, xEnd, yEnd);

            // Verificar si acertó (margen de ±10 pixeles)
            int avionCenterX = avionScreenX + 10;
            int avionCenterY = avionScreenY + 10;
            double yEsperado = yTanque - m * (avionCenterX - xTanque);

            if (Math.abs(yEsperado - avionCenterY) < 10) {
                acierto = true;
            }

            // Mostrar resultado
            g2.setColor(Color.BLACK);
            g2.setFont(new Font("Arial", Font.BOLD, 16));
            if (acierto) {
                g2.drawString("🎯¡Le diste al avión!", 200, 30);
            } else {
                g2.drawString(" Fallaste. Intenta de nuevo.", 200, 30);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}
