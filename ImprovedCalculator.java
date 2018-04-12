import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImprovedCalculator extends JFrame  {
    JTextField first,second,result;
    JButton plus,minus,multiply,divide,one,two,three,four,five,six,seven,eight,nine,zero,clear,decimal;
    JLabel firstLabel,secondLabel,ResultLabel;

    public ImprovedCalculator(){
        createComponents();
        setLayout();
        addComponents();
        createListeners();
        addListener();
        makeVisible();

    }

    private void addListener() {
        plus.addActionListener(new OperatorListener());
        minus.addActionListener(new OperatorListener());
        multiply.addActionListener(new OperatorListener());
        divide.addActionListener(new OperatorListener());
    }



    class OperatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object o=ae.getSource();
            int a=Integer.parseInt(first.getText());
            int b=Integer.parseInt(second.getText());

            if (o==plus){
                int r=a+b;
                result.setText(r+"");
            }
            if (o==minus){
                result.setText(a-b +"");
            }
            if (o==multiply){
                int r=a*b;
                result.setText(r+"");
            }
            if (o==divide){
                result.setText(a/b +"");
            }
            if(o==one){
                 a=1;
                first.setText(a+"");
            }
        }
    }

    private void createListeners() {
        new OperatorListener();
    }

    private void setLayout() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
    }
    private void makeVisible(){
        getContentPane().setBackground(Color.PINK);
        setSize(500,500);
        setVisible(true);
        first.setEditable(false);
        pack();

    }

    private void createComponents(){
        firstLabel=new JLabel("input number1");
        secondLabel=new JLabel("input number2");
        ResultLabel=new JLabel("Result:");

        plus=new JButton("+");
        minus=new JButton("-");
        multiply=new JButton("*");
        divide=new JButton("/");
        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        seven=new JButton("7");
        eight=new JButton("8");
        nine=new JButton("9");
        zero=new JButton("0");
        clear=new JButton("c");
        decimal=new JButton(".");


        first=new JTextField(10);
        second=new JTextField(10);
        result=new JTextField(10);
    }
    private void addComponents(){
        Container container=getContentPane();
        addInputControl(container);
        addOperationalControl(container);
       // addResultControl(container);
    }



    private void addInputControl(Container container){
        JPanel p=new JPanel();
        p.add(firstLabel);
        p.add(first);
        p.add(secondLabel);
        p.add(second);
        p.add(ResultLabel);
        p.add(result);
        container.add(p,"North");
    }
    private void addOperationalControl(Container container){

        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(4,4));
        panel1.add(one);
        panel1.add(two);
        panel1.add(three);
        panel1.add(plus);

        panel1.add(four);
        panel1.add(five);
        panel1.add(six);
        panel1.add(minus);

        panel1.add(seven);
        panel1.add(eight);
        panel1.add(nine);
        panel1.add(multiply);

        panel1.add(zero);
        panel1.add(decimal);
        panel1.add(clear);
        panel1.add(divide);
       container.add(panel1);


    }

    public static void main(String args[]){
        new ImprovedCalculator();
    }

}



