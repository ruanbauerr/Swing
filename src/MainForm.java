import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextField txtNome;
    private JButton btnValidar;
    private JLabel lblNome;
    private JLabel txtResultado;
    private JPanel MainPanel;

public MainForm(){

    btnValidar.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //obter nome do imput
                    String nomeDigitado = txtNome.getText();
                    txtResultado.setText(nomeDigitado);

                }
            }
    );

}

    public static void main(String[] args) {
        //Cria a minha tela (TV)
        JFrame frame = new JFrame("Minha primeira tela");
        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta a minha Tv no tamanho do meu painel
        //frame.pack();
        frame.setSize(500, 500);
        // Ligar a Tv

        frame.setVisible(true);

    }
}
