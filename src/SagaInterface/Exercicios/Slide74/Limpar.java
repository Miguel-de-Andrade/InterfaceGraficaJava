//Importa as bibliotecas swing, awt e awt.event
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Declara a classe Limpar que herda a classe JFrame
public class Limpar extends JFrame {

    //Declara dois rótulos, que são os dois números
    JLabel rotulo1,rotulo2;

    //Declara as caixas de texto onde o usuário digita os dois números
    JTextField texto1,texto2;

    //Declara o botão de limpar
    JButton limpar;

    //Método construtor que inicializará o objeto com essas
    // configurações quando instanciarmos ele sem nenhum parâmetro
    public Limpar(){

        //Chama o construtor da superclasse JFrame, passando o título da janela
        super("Exemplo limpar");

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

        //Instancia o botão, escrito limpar
        limpar = new JButton("Limpar");

        //Define o tamanho e a posição dos rótulos, caixas de texto e o botão
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);
        limpar.setBounds(150,100,80,20);


        //Ação do botão limpar, que quando for clicado, executa o actionPerformed
        limpar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        //Limpa as duas caixas de texto, e deixa o cursor com
                        //foco na primeira caixa de texto
                        texto1.setText(null);
                        texto2.setText(null);
                        texto1.requestFocus();
                    }
                }
        );

        //Adiciona os rótulos, caixas de texto e o botão no Container tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(limpar);

        //Define a largura e a altura da janela
        setSize(400,250);

        //Deixa a janela visível
        setVisible(true);

    }

    //Método main, que executa o programa
    public static void main(String[] args) {

        //Instancia um objeto da classe, que executa o construtor e abre a janela
        Limpar app = new Limpar();

        //Faz o programa terminar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

