import javax.swing.*;
import java.awt.*;

public class BotaoTextoImagem extends JFrame {
    JButton botao;
    ImageIcon img;

    public BotaoTextoImagem() {
        super("Imagem e texto com JButton");
        Container tela = getContentPane();
        setLayout(null);

        img = new ImageIcon("halteres.png");
        botao = new JButton("Treinar",img);
        botao.setBounds(50, 20, 100, 20);

        tela.add(botao);
        setSize(400, 250);
        setVisible(true);
    }

    public static void main(String args[]) {
        BotaoTextoImagem app = new BotaoTextoImagem();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}