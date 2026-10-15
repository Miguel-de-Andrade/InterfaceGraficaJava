//Importa as bibliotecas swing, awt e awt.event
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Declara a classe Soma que herda a classe JFrame
public class Soma extends JFrame {

    //Declara os rótulos, sendo dois para os números e um para exibir o resultado
    JLabel rotulo1,rotulo2,exibir;

    //Declara as caixas de texto onde o usuário digita os dois números
    JTextField texto1, texto2;

    //Declara os botões para cada operação
    JButton somar,subtrair,dividir,multiplicar;

    //Método construtor que inicializará o objeto com essas
    // configurações quando instanciarmos ele sem nenhum parâmetro
    public Soma(){

        //Chama o construtor da superclasse JFrame, passando o título da janela
        super("Exemplo de soma");

        //Pega o container de dentro da janela e guarda na variável tela
        Container tela = getContentPane();

        //Deixa o layout nulo, para posicionarmos tudo com o setBounds
        setLayout(null);

        //Instancia os dois rótulos
        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");

        //Instancia as caixas de texto com 5 colunas
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);

        //Instancia o rótulo que vai exibir o resultado, que começa vazio
        exibir = new JLabel("");

        //Instancia os botões com o símbolo de cada operação
        somar = new JButton("+");
        subtrair = new JButton("-");
        dividir = new JButton("/");
        multiplicar = new JButton("*");

        //Define a posição e o tamanho dos rótulos
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);

        //Define a posição e o tamanho das caixas de texto
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);

        //Define posição, tamanho e cores do rótulo do resultado
        exibir.setBounds(50,180,200,20);
        exibir.setBackground(Color.black);
        exibir.setForeground(Color.white);
        exibir.setOpaque(true);

        //Define a posição e o tamanho dos botões
        somar.setBounds(100,100,80,20);
        subtrair.setBounds(100,150,80,20);
        dividir.setBounds(200,100,80,20);
        multiplicar.setBounds(200,150,80,20);

        //Ação do botão somar, que quando for clicado, executa o actionPerformed
        somar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Declara as variáveis da operação
                        int numero1,numero2,soma;
                        soma = 0;
                        //Pega o texto das caixas e converte para número inteiro
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());

                        //Faz a soma e mostra o resultado no rótulo
                        soma = numero1 + numero2;
                        exibir.setVisible(true);
                        exibir.setText(" Resultado: A soma é "+soma);
                    }
                }
        );

        //Ação do botão subtrair, que quando for clicado, executa o actionPerformed
        subtrair.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Declara as variáveis da operação
                        int numero1,numero2,sub;
                        sub = 0;
                        //Pega o texto das caixas e converte para número inteiro
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());

                        //Faz a subtração e mostra o resultado no rótulo
                        sub = numero1 - numero2;
                        exibir.setVisible(true);
                        exibir.setText(" Resultado: A subtração é "+sub);
                    }
                }
        );

        //Ação do botão dividir, que quando for clicado, executa o actionPerformed
        dividir.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Declara as variáveis da operação
                        double numero1,numero2,div;
                        div = 0;
                        //Pega o texto das caixas e converte para número decimal
                        numero1 = Double.parseDouble(texto1.getText());
                        numero2 = Double.parseDouble(texto2.getText());

                        //Faz a divisão
                        div = numero1 / numero2;
                        exibir.setVisible(true);

                        //Se o número 2 for 0, avisa o usuário, senão, mostra a divisão
                        if (numero2 == 0){
                            exibir.setText(" OPS! Não é possível dividir por zero!");
                        }else {
                            exibir.setText(" Resultado: A divisão é " + div);
                        }
                    }
                }
        );

        //Ação do botão multiplicar, que quando for clicado, executa o actionPerformed
        multiplicar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Declara as variáveis da operação
                        int numero1,numero2,mult;
                        mult = 0;
                        //Pega o texto das caixas e converte para número inteiro
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());

                        //Faz a multiplicação e mostra o resultado no rótulo
                        mult = numero1 * numero2;
                        exibir.setVisible(true);
                        exibir.setText(" Resultado: A multiplicação é "+mult);
                    }
                }
        );

        //Esconde o rótulo do resultado até que algum botão seja clicado
        exibir.setVisible(false);

        //Adiciona os rótulos, as caixas de texto e os botões no Container tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(dividir);
        tela.add(multiplicar);

        //Define a largura e a altura da janela
        setSize(400,250);

        //Centraliza a janela na tela
        setLocationRelativeTo(null);

        //Deixa a janela visível
        setVisible(true);

    }

    //Método main, que executa o programa
    public static void main(String[] args) {

        //Instancia um objeto da classe, que executa o construtor e abre a janela
        Soma app = new Soma();

        //Faz o programa terminar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
