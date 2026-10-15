//Importa as bibliotecas swing, awt e awt.event
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Declara a classe OcultarExibir que herda a classe JFrame
public class OcultarExibir extends JFrame {

    //Declara os dois rótulos
    JLabel rotulo1,rotulo2;

    //Declara os dois botões, um para exibir, e o outro para ocultar
    //os dois rótulos
    JButton ocultar,exibir;

    //Método construtor que inicializará o objeto com essas
    // configurações quando instanciarmos ele sem nenhum parâmetro
    public OcultarExibir(){

        //Chama o construtor da superclasse JFrame, passando o título da janela
        super("Exemplo de ocultar e exibir componente ");

        //Pega o container de dentro da janela e guarda na variável tela
        Container tela = getContentPane();

        //Deixa o layout nulo, para posicionarmos tudo com o setBounds
        setLayout(null);

        //Instancia os dois rótulos
        rotulo1 = new JLabel("Rótulo 1");
        rotulo2 = new JLabel("Rótulo 2");

        //Instancia os dois botões
        ocultar = new JButton("Ocultar");
        exibir = new JButton("Exibir");

        //Define o tamanho e a posição dos rótulos e dos botões
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);

        ocultar.setBounds(100,100,80,20);
        exibir.setBounds(250,100,80,20);

        //Ação do botão ocultar, que quando for clicado, executa o actionPerformed
        ocultar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Oculta os dois rótulos com o setVisible(false)
                        rotulo1.setVisible(false);
                        rotulo2.setVisible(false);
                    }
                }
        );

        //Ação do botão exibir, que quando for clicado, executa o actionPerformed
        exibir.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Deixa os dois rótulos visíveis com o setVisible(true)
                        rotulo1.setVisible(true);
                        rotulo2.setVisible(true);
                    }
                }
        );

        //Adiciona os rótulos e os botões na tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(ocultar);
        tela.add(exibir);

        //Define a largura e a altura da janela
        setSize(400,250);

        //Deixa a janela visível
        setVisible(true);
    }

    //Método main, que executa o programa
    public static void main(String[] args) {

        //Instancia um objeto da classe, que executa o construtor e abre a janela
        OcultarExibir app = new OcultarExibir();

        //Faz o programa terminar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
