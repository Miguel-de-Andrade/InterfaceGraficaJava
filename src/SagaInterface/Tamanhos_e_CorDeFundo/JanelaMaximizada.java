import javax.swing.*;

public class JanelaMaximizada extends JFrame {

    public JanelaMaximizada(){
        super("Como exibir janela maximizada");
        setSize(300,15);
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
    }

    public static void main(String[] args) {
        JanelaMaximizada app = new JanelaMaximizada();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
