import javax.swing.*;
import java.awt.*;

public class TextField extends JTextField {
    public TextField(){
        super();
        setHorizontalAlignment(JTextField.RIGHT);
        Font font = getFont();
        setFont(new Font(font.getName(), font.getStyle(), 40));
        setBounds(25, 125, 326, 69);
        setBackground(Color.decode("#2A2426"));
        //setBorder(null);
        setForeground(Color.white);
        setEnabled(true);
    }
}
