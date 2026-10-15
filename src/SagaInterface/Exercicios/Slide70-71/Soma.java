import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Soma extends JFrame {

    JLabel rotulo1,rotulo2,exibir;
    JTextField texto1, texto2;
    JButton somar,subtrair,dividir,multiplicar;

    public Soma(){

        super("Exemplo de soma");

        Container tela = getContentPane();
        setLayout(null);

        rotulo1 = new JLabel("1° Número");
        rotulo2 = new JLabel("2° Número");

        texto1 = new JTextField(5);
        texto2 = new JTextField(5);

        exibir = new JLabel("");

        somar = new JButton("+");
        subtrair = new JButton("-");
        dividir = new JButton("/");
        multiplicar = new JButton("*");

        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);

        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);

        exibir.setBounds(50,180,200,20);
        exibir.setBackground(Color.black);
        exibir.setForeground(Color.white);
        exibir.setOpaque(true);

        somar.setBounds(100,100,80,20);
        subtrair.setBounds(100,150,80,20);
        dividir.setBounds(200,100,80,20);
        multiplicar.setBounds(200,150,80,20);

        somar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int numero1,numero2,soma;
                        soma = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());

                        soma = numero1 + numero2;
                        exibir.setVisible(true);
                        exibir.setText(" Resulatdo: A soma é "+soma);
                    }
                }
        );

        subtrair.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int numero1,numero2,sub;
                        sub = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());

                        sub = numero1 - numero2;
                        exibir.setVisible(true);
                        exibir.setText(" Resulatdo: A subtração é "+sub);
                    }
                }
        );

        dividir.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double numero1,numero2,div;
                        div = 0;
                        numero1 = Double.parseDouble(texto1.getText());
                        numero2 = Double.parseDouble(texto2.getText());

                        div = numero1 / numero2;
                        exibir.setVisible(true);

                        if (numero2 == 0){
                            exibir.setText(" OPS! Não é possível divir por zero!");
                        }else {
                            exibir.setText(" Resulatdo: A divisão é " + div);
                        }
                    }
                }
        );

        multiplicar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int numero1,numero2,mult;
                        mult = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());

                        mult = numero1 * numero2;
                        exibir.setVisible(true);
                        exibir.setText(" Resulatdo: A multiplicação é "+mult);
                    }
                }
        );


        exibir.setVisible(false);

        tela.add(rotulo1);
        tela.add(rotulo2);

        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);

        tela.add(somar);
        tela.add(subtrair);
        tela.add(dividir);
        tela.add(multiplicar);

        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        Soma app = new Soma();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
