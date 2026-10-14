//Importa as bibliotecas swing, awt e awt.event
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Declara a classe SenhaDigitada que herda a classe JFrame
public class SenhaDigitada extends JFrame {

    //Declara o atributo caixa do tipo JPasswordField, pois vai ser uma
    //caixa de texto para senha
    JPasswordField caixa;

    //Declara os atributos rotulo e exibir do tipo JLabel, que vão ser
    //exibidos na tela
    JLabel rotulo, exibir;

    //Declara o atributo mostrar, do tipo JButton, que vai exibir
    //um botão na tela
    JButton mostrar;

    //Método construtor que inicializará o objeto com essas
    // configurações quando instanciarmos ele sem nenhum parâmetro
    public SenhaDigitada() {

        //Chama o construtor da superclasse JFrame, passando o título da janela
        super("Exemplo com JPasswordField");

        //Pega o container de dentro da janela e guarda na variável tela
        Container tela = getContentPane();

        //Deixa o layout nulo, para posicionarmos tudo com o setBounds
        setLayout(null);

        //Instancia os objetos, com os seus determinados valores
        rotulo = new JLabel("Senha: ");
        caixa = new JPasswordField(10);//(vai ocupar 10 colunas)
        exibir = new JLabel("A senha digitada é: ");
        mostrar = new JButton("Mostrar");


        //Deixa o rótulo exibir escondido, ele só vai aparecer quando clicarem no botão "mostrar"
        exibir.setVisible(false);

        //Define as posições e os tamanhos do rótulo, da caixa de senha,
        //do rótulo exibir e do botão mostrar
        rotulo.setBounds(50,20,100,20);
        caixa.setBounds(50,60,200,20);
        exibir.setBounds(50,120,200,20);
        mostrar.setBounds(150,100,80,20);

        //Adiciona uma ação no botão mostrar, quando o usuário clicar
        mostrar.addActionListener(
                //Cria a ação do botão
                new ActionListener() {
                    //Método que define o que acontece quando clicar no botão
                    public void actionPerformed(ActionEvent e) {

                        //Pega o que foi digitado na caixa e guarda na variável senha
                        String senha = new String(caixa.getPassword());

                        //Faz o rótulo exibir aparecer na tela, mostrando assim, a senha
                        exibir.setVisible(true);

                        //Coloca a senha digitada dentro do rótulo exibir
                        exibir.setText(senha);
                    }
                }
        );

        //Adiciona os rótulos, a caixa de texto e o botão no Container tela
        tela.add(rotulo);
        tela.add(caixa);
        tela.add(exibir);
        tela.add(mostrar);

        //Define a largura e a altura da janela
        setSize(400, 250);

        //Deixa a janela visível
        setVisible(true);
    }

    //Método main, que vai executar o programa
    public static void main(String[] args){

        // Instancia um objeto da classe SenhaDigitada, que executa o construtor e abre a janela
        SenhaDigitada app = new SenhaDigitada();

        //Faz o programa terminar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

