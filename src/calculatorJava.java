import javax.swing.*;

public class calculatorJava {
    private JPanel javaCalculator;
    private JTextField calculatorOnJava;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button1;
    private JButton button10;
    private JButton button15;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;

    public static void main(String[] args) {

        JFrame frame = new JFrame("calculatorJava");
        frame.setContentPane(new calculatorJava().javaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
