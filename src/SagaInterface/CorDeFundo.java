import javax.swing.*;
import java.awt.*;

public class CorDeFundo extends JFrame {

    public CorDeFundo(){

        super("Cor de fundo");
        setSize(500, 150);
        setVisible(true);

        Container tela = getContentPane();
        tela.setBackground(Color.blue);
    }

    public static void main(String[] args) {
        CorDeFundo app = new CorDeFundo();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
