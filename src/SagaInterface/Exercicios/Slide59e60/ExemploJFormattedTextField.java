//Importa as bibliotecas para a realização do exercício
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.text.*;
import java.awt.event.*;

//Declara a classe ExemploJFormattedTextField que herda a classe JFrame
public class ExemploJFormattedTextField extends JFrame {

    // Declara os atributos do tipo JLabel que mostram o texto de cada campo
    // CEP, telefone, CPF e data
    JLabel rotulocep,rotulotel,rotulocpf,rotulodata;

    // Declara os atributos do tipo JFormattedTextField, que são caixas de texto que
    // receberão determinada formatação, onde o usuário digita os dados no formato definido
    JFormattedTextField cep,tel,cpf,data;

    // Declara os atributos do tipo MaskFormatter, que guardam as máscaras
    // que vão ser aplicadas em cada caixa de texto
    MaskFormatter mascaracep,mascaratel,mascaracpf,mascaradata;

    //Método construtor, que inicializará o objeto com essas configurações
    //quando instanciarmos ele sem nenhum parâmetro
    public ExemploJFormattedTextField(){

        //Chama o construtor da superclasse JFrame passando o título da janela
        super("Exemplo com JFormattedTextField");

        //Pega o container da janela e guarda na variável tela do tipo Container
        Container tela = getContentPane();

        //Deixa o layout nulo, para posicionarmos tudo com o setBounds
        setLayout(null);

        //Instancia os rótulos com os seus respectivos valores
        rotulocep = new JLabel("CEP: ");
        rotulotel = new JLabel("Telefone: ");
        rotulocpf = new JLabel("CPF: ");
        rotulodata = new JLabel("Data: ");

        //Define as posições e os tamanhos dos rótulos
        rotulocep.setBounds(50, 40, 100, 20);
        rotulotel.setBounds(50, 80, 100, 20);
        rotulocpf.setBounds(50, 120, 100, 20);
        rotulodata.setBounds(50, 160, 100, 20);


        try{
            //Instancia os objetos do tipo MaskFormatter, cada um com uma determinada configuração
            //para definir o formato das caixas de texto
            mascaracep = new MaskFormatter("#####-###");
            mascaratel  = new MaskFormatter("(##)####-####");
            mascaracpf  = new MaskFormatter("#########-##");
            mascaradata = new MaskFormatter("##/##/####");

            //Define o que vai aparecer nos espaços ainda não digitados
            mascaracep.setPlaceholderCharacter('_');
            mascaratel.setPlaceholderCharacter('_');
            mascaracpf.setPlaceholderCharacter('_');
            mascaradata.setPlaceholderCharacter('_');
        }
        //Se o bloco de código no try der erro, é direcionado para o catch
        //com o erro ParseException
        catch(ParseException excp){}

        //Inicia as caixas de texto com a formatação definida pelas mascaras
        cep = new JFormattedTextField(mascaracep);
        tel = new JFormattedTextField(mascaratel);
        cpf = new JFormattedTextField(mascaracpf);
        data = new JFormattedTextField(mascaradata);

        //Define o tamanho e as posições das caixas de texto
        cep.setBounds(150,40,100,20);
        tel.setBounds(150,80,100,20);
        cpf.setBounds(150,120,100,20);
        data.setBounds(150,160,100,20);

        //Adiciona os rótulos e as caixas de texto ao Container tela
        tela.add(rotulocep);
        tela.add(rotulotel);
        tela.add(rotulocpf);
        tela.add(rotulodata);
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(data);

        //Define a largura e altura da janela
        setSize(400, 250);

        //Deixa a janela visível
        setVisible(true);
    }

    //Método main, que executa o programa
    public static void main(String[] args){

        //Instancia um objeto da classe, que executa o construtor e abre a janela
        ExemploJFormattedTextField app = new ExemploJFormattedTextField();

        //Faz o programa terminar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




