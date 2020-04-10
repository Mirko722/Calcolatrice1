import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcolatrice {
    private JPanel calcolatrice;

    //casella testo e totali casella
    private JTextField textField1;
    private JButton AC;
    private double totale1 = 0.0;
    private double totale2 = 0.0;
    //Numeri
    private JButton uno;
    private JButton due;
    private JButton tre;
    private JButton quattro;
    private JButton cinque;
    private JButton sei;
    private JButton sette;
    private JButton otto;
    private JButton nove;
    private JButton zero;
    private JButton Piu;
    private JButton Meno;
    private JButton Moltiplicazione;
    private JButton Divisione;


    private JButton Punto;
    private JButton Uguale;


    public Calcolatrice() {
        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 1;
                textField1.setText(testo);

            }
        });

        due.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 2;
                textField1.setText(testo);

            }
        });

        tre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 3;
                textField1.setText(testo);

            }
        });

        quattro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 4;
                textField1.setText(testo);

            }
        });

        cinque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 5;
                textField1.setText(testo);

            }
        });

        sei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 6;
                textField1.setText(testo);

            }
        });

        sette.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 7;
                textField1.setText(testo);

            }
        });

        otto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 8;
                textField1.setText(testo);

            }
        });

        nove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 9;
                textField1.setText(testo);

            }
        });

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 0;
                textField1.setText(testo);

            }
        });


        Piu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
            }
        });


    }
        public static void main (String[]args){
            JFrame frame = new JFrame("Calcolatrice");
            frame.setContentPane(new Calcolatrice().calcolatrice);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }


