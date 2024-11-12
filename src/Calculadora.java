import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtPrimeiroValor;
    private JTextField txtSegundoValor;
    private JButton btnSomar;
    private JTextField txtResultado;
    private JButton btnLimpar;
    private JPanel panelMain;
    private JButton btnSubtrair;
    private JButton btnDividir;
    private JButton btnMultiplicação;

    public Calculadora(){

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Peguei informação da tela
                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());

                //processei
                Integer soma = primeiro + segundo;
                //Mandei pra tela o resultado
                txtResultado.setText(soma.toString());


                System.out.println(primeiro);
                System.out.println(segundo);




            }
        });
        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());


                Integer subtracao= primeiro - segundo;

                txtResultado.setText(subtracao.toString());
                System.out.println(primeiro);
                System.out.println(segundo);



            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());


                Integer divisao = primeiro / segundo;

                txtResultado.setText(divisao.toString());
                System.out.println(primeiro);
                System.out.println(segundo);


            }
        });
        btnMultiplicação.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());


                Integer multiplicacao= primeiro * segundo;

                txtResultado.setText(multiplicacao.toString());
                System.out.println(primeiro);
                System.out.println(segundo);
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.setSize(400, 400);
        frame.setVisible(true);


    }
}
