//Importa as bibliotecas swing, awt e awt.event
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Declara a classe ExemploJPasswordField que herda a classe JFrame
public class ExemploJPasswordField extends JFrame {

    //Declara o atributo caixa do tipo JPasswordField,
    //pois vai ser uma caixa de texto para senha
    JPasswordField caixa;

    //Declara o atributo rotulo do tipo JLabel, que vai ser
    //exibido na tela
    JLabel rotulo;

    //Método construtor que inicializará o objeto com essas
    // configurações quando instanciarmos ele sem nenhum parâmetro
    public ExemploJPasswordField(){

        //Chama o construtor da superclasse JFrame
        // passando o título da janela
        super("Exemplo com JPasswordField");

        //Pega o container de dentro da janela e guarda na variável tela
        Container tela = getContentPane();

        //Deixa o layout nulo, para posicionarmos tudo com o setBounds
        setLayout(null);

        //Instancia o rótulo com o valor "Senha: "
        rotulo = new JLabel("Senha: ");

        //Instancia a caixa de senha com a largura de 10 colunas
        caixa = new JPasswordField(10);

        //Define as posições e os tamanhos da caixa de senha e do rótulo
        rotulo.setBounds(50,20,100,20);
        caixa.setBounds(50,60,100,20);

        //Adiciona o rótulo e a caixa de texto no container
        tela.add(rotulo);
        tela.add(caixa);

        //Define o tamanho da janela
        setSize(400,250);

        //Deixa a janela visível
        setVisible(true);
    }

    //Método main, que vai executar o programa
    public static void main(String[] args) {

        // Instancia um objeto da classe, que executa o construtor e abre a janela
        ExemploJPasswordField app = new ExemploJPasswordField();

        //Faz o programa terminar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
