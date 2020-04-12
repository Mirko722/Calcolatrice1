import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Calcolatrice {
    private JPanel calcolatrice;

    //casella testo e totali casella
    private JTextField textField1;
    private JButton AC;
    private String totale1;
    private String totale2;
    private String calcolo;
    private Double calcolo1;
    private int operazioni;
    String testo;
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
    private JButton Uguale;
    private JButton Potenza;
    private JButton radice;
    private JButton sin;
    private JButton cos;
    private JLabel label;

    public Calcolatrice() {
        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 1;
                textField1.setText(testo);
                calcolo=testo;
            }
        });

        due.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 2;
                textField1.setText(testo);
                calcolo=testo;
            }
        });

        tre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 3;
                textField1.setText(testo);
                calcolo=testo;
            }
        });

        quattro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 4;
                textField1.setText(testo);
                calcolo=testo;
            }
        });

        cinque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 5;
                textField1.setText(testo);
                calcolo=testo;
            }
        });

        sei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 6;
                textField1.setText(testo);
                calcolo=testo;
            }
        });

        sette.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 7;
                textField1.setText(testo);
                calcolo=testo;
            }
        });

        otto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 8;
                textField1.setText(testo);
                calcolo=testo;
            }
        });

        nove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 9;
                textField1.setText(testo);
                calcolo=testo;
            }
        });

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String testo = textField1.getText() + 0;
                textField1.setText(testo);
                calcolo=testo;
            }
        });


        Piu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operazioni=1;
           calcolo1=Double.parseDouble(calcolo);
                label.setText(textField1.getText() + "+");
           textField1.setText("");
            }
        });
        Meno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operazioni=2;
                calcolo1=Double.parseDouble(calcolo);
                label.setText(textField1.getText() + "-");
                textField1.setText("");
            }
        });

        Moltiplicazione.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operazioni=3;
                calcolo1=Double.parseDouble(calcolo);
                label.setText(textField1.getText() + "*");
                textField1.setText("");

            }
        });

        Divisione.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operazioni=4;
                calcolo1=Double.parseDouble(calcolo);
                label.setText(textField1.getText() + ":");
                textField1.setText("");
            }
        });

        Potenza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operazioni=5;
                calcolo1=Double.parseDouble(calcolo);
                label.setText(textField1.getText() + "^");
                textField1.setText("");

            }
        });

        radice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolo1=Double.parseDouble(calcolo);
                calcolo1=Math.sqrt(calcolo1);
                textField1.setText(String.valueOf(calcolo1));
            }
        });

        sin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolo1=Double.parseDouble(calcolo);
                calcolo1=Math.sin(calcolo1);
                textField1.setText(String.valueOf(calcolo1));
            }
        });

        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolo1=Double.parseDouble(calcolo);
                calcolo1=Math.cos(calcolo1);
                textField1.setText(String.valueOf(calcolo1));
            }
        });

        Uguale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                switch(operazioni) {
                    case 1:
                    calcolo1 = calcolo1+Double.parseDouble(calcolo);
                    textField1.setText(String.valueOf(calcolo1));
                        label.setText("0");
                    break;
                    case 2:
                        calcolo1 = calcolo1-Double.parseDouble(calcolo) ;
                        textField1.setText(String.valueOf(calcolo1));
                        label.setText("0");
                        break;
                    case 3:
                        calcolo1 = calcolo1*Double.parseDouble(calcolo) ;
                        textField1.setText(String.valueOf(calcolo1));
                        label.setText("0");
                        break;
                    case 4:
                        calcolo1 = calcolo1/Double.parseDouble(calcolo) ;
                        textField1.setText(String.valueOf(calcolo1));
                        label.setText("0");
                        break;
                    case 5:
                        calcolo1=Math.pow(calcolo1,Double.parseDouble(calcolo));
                        textField1.setText(String.valueOf(calcolo1));
                        label.setText("0");
                }
            }
        });

        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText("");
                calcolo="";
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


