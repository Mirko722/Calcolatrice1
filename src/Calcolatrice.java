import javax.swing.*;

public class Calcolatrice {
    private JPanel calcolatrice;

    //casella testo
    private JLabel textField1;
    private String calcolo;
    private Double calcolo1;
    private int operazioni;

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

    //BOTTONI
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
    private JButton delete;
    private JButton segno;
    private JButton AC;
    private JButton dot;


    //TASTI NUMERI

    public Calcolatrice() {
        uno.addActionListener(a -> {
            String testo = textField1.getText() + 1;
            textField1.setText(testo);
            calcolo = testo;
        });

        due.addActionListener(a -> {
            String testo = textField1.getText() + 2;
            textField1.setText(testo);
            calcolo = testo;
        });

        tre.addActionListener(a -> {
            String testo = textField1.getText() + 3;
            textField1.setText(testo);
            calcolo = testo;
        });

        quattro.addActionListener(a -> {
            String testo = textField1.getText() + 4;
            textField1.setText(testo);
            calcolo = testo;
        });

        cinque.addActionListener(a -> {
            String testo = textField1.getText() + 5;
            textField1.setText(testo);
            calcolo = testo;
        });

        sei.addActionListener(a -> {
            String testo = textField1.getText() + 6;
            textField1.setText(testo);
            calcolo = testo;
        });

        sette.addActionListener(a -> {
            String testo = textField1.getText() + 7;
            textField1.setText(testo);
            calcolo = testo;
        });

        otto.addActionListener(a -> {
            String testo = textField1.getText() + 8;
            textField1.setText(testo);
            calcolo = testo;
        });

        nove.addActionListener(a -> {
            String testo = textField1.getText() + 9;
            textField1.setText(testo);
            calcolo = testo;
        });

        zero.addActionListener(a -> {
            String testo = textField1.getText() + 0;
            textField1.setText(testo);
            calcolo = testo;
        });


        Piu.addActionListener(actionEvent -> {
            operazioni = 1;
            calcolo1 = Double.parseDouble(calcolo);
            label.setText(textField1.getText() + "+");
            textField1.setText("");
        });
        Meno.addActionListener(actionEvent -> {
            operazioni = 2;
            calcolo1 = Double.parseDouble(calcolo);
            label.setText(textField1.getText() + "-");
            textField1.setText("");
        });

        Moltiplicazione.addActionListener(actionEvent -> {
            operazioni = 3;
            calcolo1 = Double.parseDouble(calcolo);
            label.setText(textField1.getText() + "*");
            textField1.setText("");

        });

        Divisione.addActionListener(actionEvent -> {
            operazioni = 4;
            calcolo1 = Double.parseDouble(calcolo);
            label.setText(textField1.getText() + ":");
            textField1.setText("");
        });

        Potenza.addActionListener(actionEvent -> {
            operazioni = 5;
            calcolo1 = Double.parseDouble(calcolo);
            label.setText(textField1.getText() + "^");
            textField1.setText("");

        });

        radice.addActionListener(actionEvent -> {
            calcolo1 = Double.parseDouble(calcolo);
            calcolo1 = Math.sqrt(calcolo1);
            textField1.setText(String.valueOf(calcolo1));
        });

        sin.addActionListener(actionEvent -> {
            calcolo1 = Double.parseDouble(calcolo);
            calcolo1 = Math.sin(calcolo1);
            textField1.setText(String.valueOf(calcolo1));
        });

        cos.addActionListener(actionEvent -> {
            calcolo1 = Double.parseDouble(calcolo);
            calcolo1 = Math.cos(calcolo1);
            textField1.setText(String.valueOf(calcolo1));
        });

        Uguale.addActionListener(actionEvent -> {
            switch (operazioni) {
                case 1:
                    calcolo1 = calcolo1 + Double.parseDouble(calcolo);
                    textField1.setText(String.valueOf(calcolo1));
                    label.setText(" ");
                    break;
                case 2:
                    calcolo1 = calcolo1 - Double.parseDouble(calcolo);
                    textField1.setText(String.valueOf(calcolo1));
                    label.setText(" ");
                    break;
                case 3:
                    calcolo1 = calcolo1 * Double.parseDouble(calcolo);
                    textField1.setText(String.valueOf(calcolo1));
                    label.setText(" ");
                    break;
                case 4:
                    calcolo1 = calcolo1 / Double.parseDouble(calcolo);
                    textField1.setText(String.valueOf(calcolo1));
                    label.setText(" ");
                    break;
                case 5:
                    calcolo1 = Math.pow(calcolo1, Double.parseDouble(calcolo));
                    textField1.setText(String.valueOf(calcolo1));
                    label.setText(" ");
            }
        });

        AC.addActionListener(actionEvent -> {
            textField1.setText("");
            calcolo = "";
            label.setText(" ");
        });

        delete.addActionListener(actionEvent -> {
            if(textField1.getText().isEmpty())
            {

            }
            else
                {
                calcolo = calcolo.substring(0, calcolo.length() - 1);
                textField1.setText(calcolo);
                }
        });

        segno.addActionListener(actionEvent -> {
            if (textField1.getText().contains("-")) {
                textField1.setText(textField1.getText().replace("-", ""));
            } else
                textField1.setText("-" + textField1.getText());
            calcolo = textField1.getText();
        });

        dot.addActionListener(actionEvent -> {
            if (!textField1.getText().contains("."))
            {
                textField1.setText(textField1.getText() + ".");
                calcolo=textField1.getText();
            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calcolatrice");
        frame.setContentPane(new Calcolatrice().calcolatrice);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


