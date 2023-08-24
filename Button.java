import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Button extends JButton {
    private char op;
    private double valor1;
    private double valor2;

    public Button(String text){
        super(text);
        setBackground(Color.red);
        setForeground(Color.white);
        Font font = getFont();
        setFont(new Font(font.getName(), font.getStyle(), 0));
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);

    }

    public void posicionaBotao(int x, int y, int width, int height){
        this.setBounds(x, y, width, height);
    }

    public void adicionaNumbers(JTextField textField){
        this.addActionListener(e -> {

            if (textField.getText().length() == 10){
                return;
            }
            JButton btn = (JButton) e.getSource();
            String number = btn.getText();
            textField.setText(textField.getText() + number);
        });
    }


    public void adicionaOperator(JTextField textField){
        this.addActionListener( e -> {

            if(textField.getText().isEmpty()){
                return;
            }
            String btn = e.getActionCommand();
            switch (btn) {
                case "ac" -> System.out.println("limpar");
                case "+" -> System.out.println("Somar");
                case "-" -> System.out.println("menos");
                case "x" -> System.out.println("multiplicar");
                case "/" -> System.out.println("dividir");
            }



        });

    }
}
