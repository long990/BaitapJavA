package bai_th_1;


import java.awt.Frame;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.GroupLayout;


public class Bai_TH_1 extends JFrame{

    private static Bai_TH_1 Bai_TH_1;
    Button bntongButton, bnchiaButton, bntruButton, bnnhanButton;
    Label lbA, lbB,lbKq;
    TextField txtA, txtB,txtKq;
    public Bai_TH_1(){
        
        Frame fr = new Frame();
        fr.setTitle("bai 1");
        fr.setLayout(new FlowLayout());
        fr.setSize(400, 400);
        fr.setLayout(new GridLayout(4, 2));
        fr.setLocationRelativeTo(null);
       
        
        Label lbA = new Label("A=  ");
        fr.add(lbA);
        txtA = new TextField(20);
        fr.add(txtA);
        
        Label lbB = new Label("B=  ");
        fr.add(lbB);
        txtB = new TextField(20);
        fr.add(txtB);
        
        bntongButton = new Button("+");
        bntongButton.addActionListener(new Langnghecong());
        //fr.add(bntongButton);
        
        bnchiaButton = new Button("/");
        bnchiaButton.addActionListener(new Langnghechia());
        //fr.add(bnchiaButton);
        
        bnnhanButton = new Button("*");
        bnnhanButton.addActionListener(new Langnghenhan());
        //fr.add(bnnhanButton);
        
        bntruButton = new Button("-");
        bntruButton.addActionListener(new Langnghetru());
        //fr.add(bntruButton);
        Label lbXLabel = new Label("");
        fr.add(lbXLabel);
        
        Panel a = new Panel();
        a.add(bnchiaButton);
        a.add(bntongButton);
        a.add(bntruButton);
        a.add(bnnhanButton);
        fr.add(a);
        
        
        
        
        Label Kq = new Label("Kq=  ");
        fr.add(Kq);
        txtKq = new TextField(20);
        fr.add(txtKq);
        //dong cua so chuong trinh
        fr.addWindowListener( new WindowAdapter()
        {    
            public void windowClosing(WindowEvent event)
            {
                System.exit(0); 
            }});
        fr.setVisible(true);
    }
    public static void main(String[] args) {
       Bai_TH_1 = new Bai_TH_1();
    }
    class Langnghecong implements ActionListener 
    {

        public void actionPerformed(ActionEvent ae) 
        {
           int A = Integer.parseInt(txtA.getText());
            int B = Integer.parseInt(txtB.getText());
            int tong =A+B;
            txtKq.setText(String.valueOf(tong));
        }
    }
    class Langnghenhan implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            int A = Integer.parseInt(txtA.getText());
            int B = Integer.parseInt(txtB.getText());
            int nhan =A*B;
            txtKq.setText(String.valueOf(nhan));
        }
    }
    class Langnghechia implements ActionListener
    {
        public void actionPerformed(ActionEvent ae) {
            float A = Float.parseFloat(txtA.getText());
            float B = Float.parseFloat(txtB.getText());
            float chia = A/B;
            txtKq.setText(String.valueOf(chia));
        }
    }
    class Langnghetru implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            int A = Integer.parseInt(txtA.getText());
            int B = Integer.parseInt(txtB.getText());
            int tru = A-B;
            txtKq.setText(String.valueOf(tru));
        }
    }
}
