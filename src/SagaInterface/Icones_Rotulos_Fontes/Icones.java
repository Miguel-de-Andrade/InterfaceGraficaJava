import javax.swing.*;

public class Icones  extends JFrame {

    public Icones(){
        super("Definido um ícone para a minha janela em JAVA");
        setSize(300,150);
        setVisible(true);

        ImageIcon img = new ImageIcon("halteres.png");
        setIconImage(img.getImage());
    }

    public static void main(String[] args) {
        Icones app = new Icones();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
