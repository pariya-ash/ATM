
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class atm implements ActionListener {


    JFrame frame = new JFrame();
    Color clr= new Color(200, 190,  220);
    JPanel panel_password = new JPanel();
    JPanel panel_lang= new JPanel();
    JPanel panel_asli= new JPanel();
    JPanel panel_taghir= new JPanel();
    JPanel panel_kart= new JPanel();
    JPanel panel_mojodi= new JPanel();
    JPanel panel_bardasht= new JPanel();
    JPanel panel_akhar= new JPanel();


    JLabel label_lang= new JLabel ("choose language        زبان خود را انتخاب کنید");
    JLabel label_jadid= new JLabel ("رمز جدید را وارد کنید ");

    JLabel label_ghabl= new JLabel ("رمز قبلی را وارد کنید ");
    JLabel label_akhar= new JLabel ("عملیات با موفقیت انجام شد " );
    JLabel label_mablagh= new JLabel ("مبلغ موردنظر را وارد کنید  ");
    JLabel label_mablagh2= new JLabel ("مبلغ موردنظر را وارد کنید  ");
    JLabel label_shomare= new JLabel ("شماره کارت مقصد را وارد کنید  " );
    JLabel label_mojodi= new JLabel ("موجودی شما: 27862945 ریال " );




    JTextField textField_pass = new JTextField();
    JTextField textField_ghabl = new JTextField();
    JTextField textField_jadid = new JTextField();
    JTextField textField_mablagh = new JTextField();
    JTextField textField_mablagh2 = new JTextField();
    JTextField textField_shomare = new JTextField();




    //buttons
    JButton fa = new JButton("fa");
    JButton en = new JButton("en");
    JButton submit = new JButton("ثبت رمز");
    JButton taghir= new JButton("تغییر رمز");
    JButton mojodi= new JButton(" اعلام موجودی");
    JButton bardasht= new JButton("برداشت وجه");
    JButton kart= new JButton("کارت به کارت");
    JButton sabt_taghir= new JButton("ثبت");
    JButton sabt_mojodi= new JButton("ثبت");
    JButton sabt_bardasht= new JButton("ثبت");
    JButton sabt_kart= new JButton("ثبت");
    JButton exit= new JButton("خروج");






    atm() {

        setthings();
        addActionEvent();
    }
    public void setthings() {

        //FRAME
        frame.setTitle("ATM");
        frame.setSize(700, 500);
        frame.getContentPane().setBackground(clr);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);



        en.setBounds(5, 200, 100, 200);
        frame.add(en);
        fa.setBounds(580, 200, 100, 50);
        frame.add(fa);

        //panel lang
        panel_lang.setLayout(null);
        panel_lang.setBounds(0,0,700,500);
        panel_lang.setBackground(clr);


        en.setBounds(5, 200, 100, 50);
        panel_lang.add(en);
        fa.setBounds(580, 200, 100, 50);
        panel_lang.add(fa);

        label_lang.setBounds(250,150,300,100);
        panel_lang.add(label_lang);
        frame.add(panel_lang,BorderLayout.NORTH);


        // panel password
        panel_password.setBackground(clr);
        panel_password.setLayout(null);
        panel_password.setBounds(0,0,700,500);

        submit.setBounds(300, 200, 100, 50);
        panel_password.add(submit);

        textField_pass.setBounds(250, 140, 200, 50);
        panel_password.add(textField_pass);

        //panel asli
        panel_asli.setBackground(clr);
        panel_asli.setLayout(null);
        panel_asli.setBounds(0,0,700,500);

        taghir.setBounds(5,100,100,40);
        kart.setBounds(5,200,100,40);
        mojodi.setBounds(580,100,100,40);
        bardasht.setBounds(580,200,100,40);

        panel_asli.add(taghir);
        panel_asli.add(kart);
        panel_asli.add(mojodi);
        panel_asli.add(bardasht);

        //panel akahr
        panel_akhar.setBackground(clr);
        panel_akhar.setLayout(null);

        panel_akhar.setBounds(0,0,700,500);
        label_akhar.setBounds(300,100,200,200);
        exit.setBounds(300,400,100,50);

        panel_akhar.add(label_akhar);
        panel_akhar.add(exit);


        // panel taghir
        panel_taghir.setBackground(clr);
        panel_taghir.setLayout(null);
        panel_taghir.setBounds(0,0,700,500);

        textField_jadid.setBounds(250, 100, 200, 50);
        textField_ghabl.setBounds(250, 250, 200, 50);

        label_jadid.setBounds(300,50,200,50);
        label_ghabl.setBounds(300,200,200,50);
        sabt_taghir.setBounds(300,400,100,50);


        panel_taghir.add(textField_ghabl);
        panel_taghir.add(textField_jadid);
        panel_taghir.add(label_ghabl);
        panel_taghir.add(label_jadid);
        panel_taghir.add(sabt_taghir);

        //panel kart
        panel_kart.setBackground(clr);
        panel_kart.setLayout(null);
        panel_kart.setBounds(0,0,700,500);

        textField_mablagh.setBounds(250, 100, 200, 50);
        textField_shomare.setBounds(250, 250, 200, 50);

        label_mablagh.setBounds(290,50,200,50);
        label_shomare.setBounds(280,200,200,50);
        sabt_kart.setBounds(300,400,100,50);

        panel_kart.add(textField_mablagh);
        panel_kart.add(textField_shomare);
        panel_kart.add(label_mablagh);
        panel_kart.add(label_shomare);
        panel_kart.add(sabt_kart);

        //panel bardasht=
        panel_bardasht.setBackground(clr);
        panel_bardasht.setLayout(null);
        panel_bardasht.setBounds(0,0,700,500);

        textField_mablagh2.setBounds(250, 100, 200, 50);
        label_mablagh2.setBounds(290,50,200,50);
        sabt_bardasht.setBounds(300,400,100,50);

        panel_bardasht.add(textField_mablagh2);
        panel_bardasht.add(label_mablagh2);
        panel_bardasht.add(sabt_bardasht);

        //panel mojodi;

        panel_mojodi.setBackground(clr);
        panel_mojodi.setLayout(null);
        panel_mojodi.setBounds(0,0,700,500);

        label_mojodi.setBounds(285,100,200,200);
        sabt_mojodi.setBounds(300,400,100,50);

        panel_mojodi.add(label_mojodi);
        panel_mojodi.add(sabt_mojodi);
    }

    public void addActionEvent() {

        fa.addActionListener(this);
        en.addActionListener(this);
        submit.addActionListener(this);
        taghir.addActionListener(this);
        kart.addActionListener(this);
        mojodi.addActionListener(this);
        bardasht.addActionListener(this);
        sabt_bardasht.addActionListener(this);
        sabt_kart.addActionListener(this);
        sabt_mojodi.addActionListener(this);
        sabt_taghir.addActionListener(this);
        exit.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object dokme = e.getSource();
        if (dokme==en || dokme==fa){
            frame.getContentPane().removeAll();
            frame.add(panel_password);
            frame.repaint();
            frame.revalidate();

           // frame.remove(panel_lang);
            //frame.add(panel_password,BorderLayout.NORTH);
        }
        if (dokme==submit){
            frame.remove(panel_password);
            frame.add(panel_asli,BorderLayout.NORTH);
            frame.repaint();
            frame.revalidate();
        }

        if (dokme==taghir){
            frame.remove(panel_asli);
            frame.add(panel_taghir);
            frame.repaint();
            frame.revalidate();
        }
        if (dokme==sabt_taghir){
            frame.remove(panel_taghir);
            frame.add(panel_akhar);
            frame.repaint();
            frame.revalidate();
        }

        if (dokme==bardasht){
            frame.remove(panel_asli);
            frame.add(panel_bardasht);
            frame.repaint();
            frame.revalidate();
        }
        if (dokme==sabt_bardasht){
            frame.remove(panel_bardasht);
            frame.add(panel_akhar);
            frame.repaint();
            frame.revalidate();
        }

        if (dokme==kart){

            frame.remove(panel_asli);
            frame.add(panel_kart);
            frame.repaint();
            frame.revalidate();
        }
        if (dokme==sabt_kart){
            frame.remove(panel_kart);
            frame.add(panel_akhar);
            frame.repaint();
            frame.revalidate();
        }

        if (dokme==mojodi){
            frame.remove(panel_asli);
            frame.add(panel_mojodi);
            frame.repaint();
            frame.revalidate();
        }
        if (dokme==sabt_mojodi){
            frame.remove(panel_mojodi);
            frame.add(panel_akhar);
            frame.repaint();
            frame.revalidate();
        }
        if (dokme==exit){
            frame.remove(panel_akhar);
            frame.add(panel_asli);
            frame.repaint();
            frame.revalidate();
        }

    }
    public static void main(String[] args)
    {
        new atm();
    }
}