import javax.swing.*;

public class PrimeiraJanela extends JFrame {

    public PrimeiraJanela(){
        super("Minha primeira janela");

        setSize(300,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        PrimeiraJanela janela = new PrimeiraJanela();

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
