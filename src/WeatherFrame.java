import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class WeatherFrame extends JFrame {
    private JTextField textFieldCiudad;
    private JTextArea textAreaPrediccion;
    private JButton buttonPredecir;

    public WeatherFrame() {
        // Configuración inicial del JFrame
        setTitle("Weather Predictor");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Crear y agregar componentes
        add(new JLabel("Ingrese Ciudad:"));
        textFieldCiudad = new JTextField(20);
        add(textFieldCiudad);
        
        buttonPredecir = new JButton("Predecir Tiempo");
        buttonPredecir.addActionListener((ActionEvent e) -> {
            predecirTiempo();
        });
        add(buttonPredecir);
        
        JButton buttonCerrar = new JButton("Cerrar");
        buttonCerrar.addActionListener((ActionEvent e) -> {
            cerrarAplicacion();
        });
        add(buttonCerrar);

        textAreaPrediccion = new JTextArea(5, 30);
        textAreaPrediccion.setEditable(false);
        add(new JScrollPane(textAreaPrediccion));

        setVisible(true);
    }

    private void cerrarAplicacion() {
        System.exit(0);  // Cierra la aplicación
    }

    private void predecirTiempo() {
        String ciudad = textFieldCiudad.getText();
        switch (ciudad.toLowerCase()) {
            case "madrid" -> textAreaPrediccion.setText("Sol con algunas nubes.");
            case "londres" -> textAreaPrediccion.setText("Probable lluvia.");
            case "cuenca" -> textAreaPrediccion.setText("Cielos parcialmente nublados.");
            case "guadalajara" -> textAreaPrediccion.setText("Soleado con ráfagas de viento.");
            case "barcelona" -> textAreaPrediccion.setText("Sol y nubes dispersas.");
            case "albacete" -> textAreaPrediccion.setText("Calor extremo.");
            case "sevilla" -> textAreaPrediccion.setText("Caluroso.");
            case "cádiz" -> textAreaPrediccion.setText("Ligeramente nublado.");
            case "almería" -> textAreaPrediccion.setText("Soleado.");
            case "alicante" -> textAreaPrediccion.setText("Temperaturas agradables.");
            case "valencia" -> textAreaPrediccion.setText("Húmedo con posibles lluvias.");
            case "ourense" -> textAreaPrediccion.setText("Lluvias esporádicas.");
            case "lugo" -> textAreaPrediccion.setText("Frío y lluvioso.");
            case "a coruña" -> textAreaPrediccion.setText("Viento fuerte del noroeste.");
            case "vigo" -> textAreaPrediccion.setText("Clima oceánico agradable.");
            case "pontevedra" -> textAreaPrediccion.setText("Niebla matinal, luego despejado.");
            case "asturias" -> textAreaPrediccion.setText("Lluvias moderadas.");
            case "badajoz" -> textAreaPrediccion.setText("Seco y soleado.");
            case "salamanca" -> textAreaPrediccion.setText("Frío por la noche.");
            case "cáceres" -> textAreaPrediccion.setText("Calor diurno, fresco por la noche.");
            case "jaén" -> textAreaPrediccion.setText("Oleadas de calor.");
            case "málaga" -> textAreaPrediccion.setText("Bruma marina temprano.");
            case "país vasco" -> textAreaPrediccion.setText("Lluvias constantes.");
            case "tarragona" -> textAreaPrediccion.setText("Cálido con brisas marinas.");
            case "nueva york" -> textAreaPrediccion.setText("Nieve ligera.");
            case "amsterdam" -> textAreaPrediccion.setText("Chubascos ocasionales.");
            case "luxor" -> textAreaPrediccion.setText("Desierto caliente.");
            default -> textAreaPrediccion.setText("Datos no disponibles para " + ciudad + ".");
        }
    }

    public static void main(String[] args) {
        new WeatherFrame();
    }
}

