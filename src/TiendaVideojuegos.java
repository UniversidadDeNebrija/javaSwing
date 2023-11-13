import org.w3c.dom.events.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiendaVideojuegos {
    JDialog dialog;
    private class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Label dialogLabel = new Label();

            String titulo = "Titulo Dummy";
            String consola = "consola Dummy";
            System.out.println(titulo);
            System.out.println(consola);
            dialogLabel.setText(consola + "" + titulo);

            dialog.add(dialogLabel);
            dialog.setVisible(true);
        }

    }

    private void showDialog(ActionEvent e, JDialog dialog) {
        dialog.setVisible(true);
    }

    public void main(String[] args) {
        JFrame frame = new JFrame("Video Game Store");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Panel con Layout null
        JPanel panelNullLayout = new JPanel();
        panelNullLayout.setLayout(null);
        panelNullLayout.setBounds(0, 0, 300, 400);

        // Panel con FlowLayout
        JPanel panelFlowLayout = new JPanel(new FlowLayout());
        panelFlowLayout.setBounds(300, 0, 300, 400);

        // Elementos
        JButton button = new JButton("Comprar");
        button.setBounds(20, 20, 100, 30);

        JCheckBox checkBox = new JCheckBox("Nuevo");
        checkBox.setBounds(20, 60, 100, 30);

        String[] consolaList = new String[]{"PS5", "Xbox Series", "Nintendo Switch"};

        JComboBox<String> comboBox = new JComboBox<>(consolaList);
        comboBox.setBounds(20, 100, 150, 30);

        JList<String> list = new JList<>(new String[]{"FIFA 23", "COD", "Minecraft"});
        list.setBounds(180, 20, 100, 60);

        JMenu menu = new JMenu("Menú");
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        JRadioButton radioButton = new JRadioButton("Usado");
        radioButton.setBounds(20, 140, 100, 30);

        JSlider slider = new JSlider();
        slider.setBounds(20, 180, 150, 50);

        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        spinner.setBounds(20, 240, 50, 30);

        JTextField textField = new JTextField("Título del juego");
        textField.setBounds(20, 280, 150, 30);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 320, 150, 30);

        dialog = new JDialog(frame, "Confirmación", true);
        dialog.setLayout(new FlowLayout());
        dialog.setSize(200, 100);

        ClickListener clickListener = new ClickListener();

        button.addActionListener(clickListener);

        // Añadir elementos a los paneles
        panelNullLayout.add(button);
        panelNullLayout.add(checkBox);
        panelNullLayout.add(comboBox);
        panelNullLayout.add(list);
        panelNullLayout.add(radioButton);
        panelNullLayout.add(slider);
        panelNullLayout.add(spinner);
        panelNullLayout.add(textField);
        panelNullLayout.add(passwordField);

        panelFlowLayout.add(new JLabel("Zona de juegos"));

        // Añadir paneles al frame
        frame.add(panelNullLayout);
        frame.add(panelFlowLayout);

        frame.setVisible(true);
    }
}
