import javax.swing.*;
import java.awt.*;

public class BotaoImagem extends JFrame {
    JButton botao;
    ImageIcon img;

    public BotaoImagem() {
        super("Exemplo com JButton");
        Container tela = getContentPane();
        setLayout(null);

        img = new ImageIcon("halteres.png");
        botao = new JButton(img);
        botao.setBounds(50, 20, 100, 20);

        tela.add(botao);
        setSize(400, 250);
        setVisible(true);
    }

    public static void main(String args[]) {
        BotaoImagem app = new BotaoImagem();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}