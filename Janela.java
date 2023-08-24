import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    public Janela() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 387, 750);

        setLayout(null);
        getContentPane().setBackground(Color.decode("#2A2426"));
    }



    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("background.jpg");
        Janela janela = new Janela();
        MainLabel label = new MainLabel(icon);
        TextField textField = new TextField();


        Button buttonAC = new Button("ac");
        buttonAC.posicionaBotao(31, 282, 72, 73);
        label.add(buttonAC);
        buttonAC.adicionaOperator(textField);

        Button buttonPor = new Button("%");
        buttonPor.posicionaBotao(116, 282, 72, 73);
        label.add(buttonPor);
        buttonPor.adicionaOperator(textField);

        Button buttonDiv = new Button("/");
        buttonDiv.posicionaBotao(201, 282, 72, 73);
        label.add(buttonDiv);
        buttonDiv.adicionaOperator(textField);

        Button buttonErase = new Button("ER");
        buttonErase.posicionaBotao(286, 282, 72, 73);
        label.add(buttonErase);
        buttonErase.adicionaOperator(textField);




        Button button7 = new Button("7");
        button7.posicionaBotao(31, 370, 72, 73);
        label.add(button7);
        button7.adicionaNumbers(textField);

        Button button8 = new Button("8");
        button8.posicionaBotao(116, 370, 72, 73);
        label.add(button8);
        button8.adicionaNumbers(textField);

        Button button9 = new Button("9");
        button9.posicionaBotao(201, 370, 72, 73);
        label.add(button9);
        button9.adicionaNumbers(textField);

        Button buttonX = new Button("x");
        buttonX.posicionaBotao(286, 370, 72, 73);
        label.add(buttonX);
        buttonX.adicionaOperator(textField);




        Button button4 = new Button("4");
        button4.posicionaBotao(31, 459, 72, 73);
        label.add(button4);
        button4.adicionaNumbers(textField);

        Button button5 = new Button("5");
        button5.posicionaBotao(116, 459, 72, 73);
        label.add(button5);
        button5.adicionaNumbers(textField);

        Button button6 = new Button("6");
        button6.posicionaBotao(201, 459, 72, 73);
        label.add(button6);
        button6.adicionaNumbers(textField);

        Button buttonLess = new Button("-");
        buttonLess.posicionaBotao(286, 459, 72, 73);
        label.add(buttonLess);
        buttonLess.adicionaOperator(textField);




        Button button1 = new Button("1");
        button1.posicionaBotao(31, 540, 72, 73);
        label.add(button1);
        button1.adicionaNumbers(textField);

        Button button2 = new Button("2");
        button2.posicionaBotao(116, 540, 72, 73);
        label.add(button2);
        button2.adicionaNumbers(textField);

        Button button3 = new Button("3");
        button3.posicionaBotao(201, 540, 72, 73);
        label.add(button3);
        button3.adicionaNumbers(textField);

        Button buttonPlus = new Button("+");
        buttonPlus.posicionaBotao(286, 540, 72, 73);
        label.add(buttonPlus);
        buttonPlus.adicionaOperator(textField);




        janela.add(textField);
        janela.add(label);
        janela.setVisible(true);

    }





}
