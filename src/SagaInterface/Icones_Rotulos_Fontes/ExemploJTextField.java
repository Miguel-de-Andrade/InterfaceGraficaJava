//Importa as bibliotecas swing e awt para a utilização
//da interface gráfica

import javax.swing.*;
import java.awt.*;


//Declaração da classe ExemploJTextField que herda
//a classe Jframe
public class ExemploJTextField extends JFrame {

    //Declara os atributos das classes Jlabel e JTextField
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    JTextField texto1, texto2, texto3, texto4;

    //Declara o metodo construtor
    public ExemploJTextField(){

        //Utiliza a superclasse Jframe e declara o título
        super("Exemplo com JTextField");

        //Cria a variavel de refencia tela da classe container
        //Para armazenar os conteúdos
        Container tela = getContentPane();

        //Seta o container para nulo
        setLayout(null);


        //Mensagem que vai aparecer encima da caixa de texto
        rotulo1 = new JLabel("Nome");
        rotulo2 = new JLabel("Idade");
        rotulo3 = new JLabel("Telefone");
        rotulo4 = new JLabel("Celular");

        //Tamanho da caixa de texto
        texto1 = new JTextField(50);
        texto2 = new JTextField(3);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);

        //Define a posição dos rotulos
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,80,20);
        rotulo4.setBounds(50,140,80,20);

        //Define as posições do texto
        texto1.setBounds(110,20,200,20);
        texto2.setBounds(110,60,20,20);
        texto3.setBounds(110,100,80,20);
        texto4.setBounds(110,140,80,20);

        texto1.requestFocus();

        //Adciona os rotulos no container tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);

        //Adciona os textos no container tela
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);



        //Define o tamanho da janela
        setSize(400,250);

        //Deixa a janela visivel
        setVisible(true);

        //Deixa a tela centralizada
        setLocationRelativeTo(null);
    }

    //Metodo main para executar o programa
    public static void main(String[] args) {

        //Instancia um objeto da classe ExemploJTextField
        ExemploJTextField app = new ExemploJTextField();

        //Adciona funcionalidade para sair
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}