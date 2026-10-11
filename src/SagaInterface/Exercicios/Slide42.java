
//Importa as bibliotecas swing e awt
import javax.swing.*;
import java.awt.*;

//Declara a calsse Slide 42, que herda a Classe JFrame
public class Slide42 extends JFrame {

    //Declarando os atributos dos tipos JLabel e JTextField para
    //Adicionar rótulos e caixas de texto
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,titulo;
    JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7;

    //Método construtor que inicializará o objeto
    //Com essas configurações quando instanciarmos ele
    //Sem nenhum parâmetro
    public Slide42 (){

        //Chama o construtor da super classe
        // JFrame passando o título da janela
        super("Exercício slide 42");

        // Pega o container que já existe dentro da janela e guarda na variável tela
        Container tela = getContentPane();

        //Zera o layout, para posicionar tudo com setBounds
        setLayout(null);

        // Define a cor de fundo do container
        tela.setBackground(new Color(212, 208, 200));

        // Cria os rótulos com os textos que vão aparecer na tela
        titulo = new JLabel("Cadastro de Cliente");
        rotulo1 = new JLabel("Nome");
        rotulo2 = new JLabel("CPF");
        rotulo3 = new JLabel("RG");
        rotulo4 = new JLabel("Endereço");
        rotulo5 = new JLabel("Cidade");
        rotulo6 = new JLabel("Estado");
        rotulo7 = new JLabel("CEP:");

        // Cria as caixas de texto, cada uma com a
        // quantidade de caracteres
        texto1 = new JTextField(50);
        texto2 = new JTextField(11);
        texto3 = new JTextField(9);
        texto4 = new JTextField(50);
        texto5 = new JTextField(15);
        texto6 = new JTextField(15);
        texto7 = new JTextField(8);

        // Posição e tamanho dos rótulos
        titulo.setBounds(140,20,200,20);
        rotulo1.setBounds(50,50,80,20);
        rotulo2.setBounds(50,100,80,20);
        rotulo3.setBounds(50,150,80,20);
        rotulo4.setBounds(50,200,80,20);
        rotulo5.setBounds(50,250,80,20);
        rotulo6.setBounds(50,300,80,20);
        rotulo7.setBounds(50,350,80,20);

        // Posição e tamanho das caixas de texto
        texto1.setBounds(50,70,280,20);
        texto2.setBounds(50,120,140,20);
        texto3.setBounds(50,170,100,20);
        texto4.setBounds(50,220,280,20);
        texto5.setBounds(50,270,260,20);
        texto6.setBounds(50,320,180,20);
        texto7.setBounds(50,370,100,20);

        // Define a fonte dos rótulos: Arial, normal, tamanho 12
        rotulo1.setFont(new Font("Arial", Font.PLAIN, 12));
        rotulo2.setFont(new Font("Arial", Font.PLAIN, 12));
        rotulo3.setFont(new Font("Arial", Font.PLAIN, 12));
        rotulo4.setFont(new Font("Arial", Font.PLAIN, 12));
        rotulo5.setFont(new Font("Arial", Font.PLAIN, 12));
        rotulo6.setFont(new Font("Arial", Font.PLAIN, 12));
        rotulo7.setFont(new Font("Arial", Font.PLAIN, 12));

        // Define a cor e a fonte do título
        titulo.setForeground(Color.red);
        titulo.setFont(new Font("Arial",Font.BOLD,16));

        // Adiciona os rótulos e o título dentro do container
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(titulo);

        // Adiciona as caixas de texto dentro do container
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);

        // Define o tamanho da janela
        setSize(450,450);

        // Centraliza a janela na tela do computador
        setLocationRelativeTo(null);

        // Deixa a janela visível
        setVisible(true);
    }

    // Método main que vai executar o programa
    public static void main(String[] args) {

        // Instancia um objeto da classe,que executa o construtor e abre a janela
        Slide42 app = new Slide42();

        //Faz o programa encerrar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
