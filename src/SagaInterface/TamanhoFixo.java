import javax.swing.*;

public class TamanhoFixo  extends JFrame {

    public TamanhoFixo(){
        super("Tamanho Fixo");
        setSize(300,150);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        TamanhoFixo app = new TamanhoFixo();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
