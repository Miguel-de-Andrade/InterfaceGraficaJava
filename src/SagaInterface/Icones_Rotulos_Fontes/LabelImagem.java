import javax.swing.*;
import java.awt.*;

public class LabelImagem extends JFrame {

    JLabel img;
    public LabelImagem(){
        super("Uso do Jlabel como imagem");
        Container tela = getContentPane();

        ImageIcon icone = new ImageIcon("halteres.png");
        img = new JLabel(icone);

        tela.add(img);

        setSize(300,300);
        setVisible(true);

    }

    public static void main(String[] args) {
        LabelImagem app = new LabelImagem();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
