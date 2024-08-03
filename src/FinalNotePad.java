//Java Bytes
//Sourav Chowdhury, Priyadeep Sen, Annesha Basu, Sanchita Purkait,Poulami Sarkar, Monami Ghosh, Shreyasi Talukdar, Rounik Chakraborty, Adarsh Annand, Arpan Dey


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class FinalNotePad implements ActionListener
{
    public String x[] = {"Serif","Century Gothic","SansSerif","Monospaced","Courier",},nm="";
    public int s[]={0,2,1},st=0;
    public int f[]={10,20,30,40,50},fs=20;
    JFrame frm;
    JMenuBar mnubar;
    JScrollPane jsrlpane;
    JMenu fileMenu, editMenu, fontMenu, helpMenu;
    JMenu fontType, fontStyle, fontSize, bg ,txtclr, wWrap;
    JMenuItem saveAs, open, close, abt;
    JMenuItem cutItem, copyItem, pasteItem, selectAll;
    JMenuItem f1,f2,f3,f4,f5,fs10,fs20,fs30,fs40,fs50, red, blue, green, white, plain, italics, bold ,r,g,b,bl,wt,ON,OFF;
    JTextArea txtarea;

    //FrontEnd Designing
    FinalNotePad()//Constructor to define class variables
    {
        frm = new JFrame();
        frm.setTitle(" Simple Notepad ");

        mnubar = new JMenuBar();
        mnubar.setBounds(0, 0, 1920, 25);

        txtarea = new JTextArea();
        txtarea.setBounds(0, 25, 1920, 1080);

        jsrlpane = new JScrollPane(txtarea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        txtarea.setFont(new Font("Tahoma", 0, 20));
        txtarea.setLineWrap(true);
        txtarea.setWrapStyleWord(true);

        //JMenu type Object creation
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        fontMenu = new JMenu("Format");
        helpMenu = new JMenu("Help");
        bg = new JMenu("Background");
        fontType = new JMenu("Font Type");
        fontStyle = new JMenu("Font Style");
        fontSize = new JMenu("Font Size");
        txtclr = new JMenu("Change text colour");
        wWrap = new JMenu( " Word Wrap ");

        //Menu Items
        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");

        open = new JMenuItem("Open");
        saveAs = new JMenuItem("Save");
        close = new JMenuItem("Close");

        f1 = new JMenuItem("Serif");
        f2 = new JMenuItem("Century Gothic");
        f3 = new JMenuItem("SansSerif");
        f4 = new JMenuItem("Monospaced");
        f5 = new JMenuItem("Courier");

        fs10 = new JMenuItem("10");
        fs20 = new JMenuItem("20");
        fs30 = new JMenuItem("30");
        fs40 = new JMenuItem("40");
        fs50 = new JMenuItem("50");

        red = new JMenuItem("Red");
        green = new JMenuItem("Green");
        blue = new JMenuItem("Blue");
        white = new JMenuItem("White");

        r = new JMenuItem("Red");
        g = new JMenuItem("Green");
        b = new JMenuItem("Blue");
        bl = new JMenuItem("Black");
        wt = new JMenuItem("White");

        plain = new JMenuItem("Plain");
        italics = new JMenuItem("Italics");
        bold = new JMenuItem("Bold");

        ON = new JMenuItem("ON");
        OFF = new JMenuItem("OFF");

        abt = new JMenuItem("About");

        //Action Listeners
        open.addActionListener(this);
        saveAs.addActionListener(this);
        close.addActionListener(this);

        copyItem.addActionListener(this);
        cutItem.addActionListener(this);
        selectAll.addActionListener(this);
        pasteItem.addActionListener(this);

        f1.addActionListener(this);
        f2.addActionListener(this);
        f3.addActionListener(this);
        f4.addActionListener(this);
        f5.addActionListener(this);

        fs10.addActionListener(this);
        fs20.addActionListener(this);
        fs30.addActionListener(this);
        fs40.addActionListener(this);
        fs50.addActionListener(this);

        plain.addActionListener(this);
        italics.addActionListener(this);
        bold.addActionListener(this);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        white.addActionListener(this);

        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);
        bl.addActionListener(this);
        wt.addActionListener(this);

        ON.addActionListener(this);
        OFF.addActionListener(this);

        abt.addActionListener(this);

        //Adding menu buttons to menu bar
        mnubar.add(fileMenu);
        mnubar.add(editMenu);
        mnubar.add(fontMenu);
        mnubar.add(bg);
        mnubar.add(helpMenu);

        fileMenu.add(open);
        fileMenu.add(saveAs);
        fileMenu.add(close);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(selectAll);

        fontMenu.add(fontType);
        fontType.add(f1);
        fontType.add(f2);
        fontType.add(f3);
        fontType.add(f4);
        fontType.add(f5);
        fontMenu.add(fontSize);
        fontSize.add(fs10);
        fontSize.add(fs20);
        fontSize.add(fs30);
        fontSize.add(fs40);
        fontSize.add(fs50);
        fontMenu.add(fontStyle);
        fontStyle.add(plain);
        fontStyle.add(italics);
        fontStyle.add(bold);
        fontMenu.add(txtclr);
        txtclr.add(r);
        txtclr.add(g);
        txtclr.add(b);
        txtclr.add(bl);
        txtclr.add(wt);
        fontMenu.add(wWrap);
        wWrap.add(ON);
        wWrap.add(OFF);

        bg.add(red);
        bg.add(green);
        bg.add(blue);
        bg.add(white);

        helpMenu.add(abt);

        //Adding menu buttons to menu bar
        frm.add(mnubar);
        frm.add(txtarea);
        txtarea.add(jsrlpane);
        frm.setLayout(null);
        frm.setSize(800, 600);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == cutItem)
            txtarea.cut();
        if (ae.getSource() == pasteItem)
            txtarea.paste();
        if (ae.getSource() == copyItem)
            txtarea.copy();
        if (ae.getSource() == selectAll)
            txtarea.selectAll();
        if(ae.getSource() == open)
        {
            JFileChooser chooser = new JFileChooser();
            if(chooser.showOpenDialog(frm)==JFileChooser.APPROVE_OPTION){
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream(chooser.getSelectedFile());
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                StringBuffer text = new StringBuffer();
                String read;
                while(true){
                    try {
                        if (!((read=br.readLine())!=null)) break;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    text.append(read).append("\n");
                }
                txtarea.setText(text.toString());
            }
        }
        if(ae.getSource() == close)
            frm.dispose();
        if(ae.getSource() == saveAs)
        {
            final JFileChooser SaveAs = new JFileChooser();
            SaveAs.setApproveButtonText("saveAs");
            int actionDialog = SaveAs.showOpenDialog(frm);
            if (actionDialog != JFileChooser.APPROVE_OPTION) {
                return;
            }

            File fileName = new File(SaveAs.getSelectedFile() + ".txt");
            BufferedWriter outFile = null;
            try {
                outFile = new BufferedWriter(new FileWriter(fileName));

                txtarea.write(outFile);

            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if (outFile != null) {
                    try {
                        outFile.close();
                    } catch (IOException e) {
                    }
                }
            }
        }
        //background packs
        if(ae.getSource()==red)
            txtarea.setBackground(Color.RED);
        if(ae.getSource()==blue)
            txtarea.setBackground(Color.BLUE);
        if(ae.getSource()==green)
            txtarea.setBackground(Color.GREEN);
        if(ae.getSource()==white)
            txtarea.setBackground(Color.WHITE);

        //font packs
        if (ae.getSource()==f1) {
            txtarea.setFont(new Font(x[0], st, fs));
            nm=x[0];
        }
        if (ae.getSource()==f2) {
            txtarea.setFont(new Font(x[1], st, fs));
            nm=x[1];
        }
        if (ae.getSource()==f3) {
            txtarea.setFont(new Font(x[2], st, fs));
            nm=x[2];
        }
        if (ae.getSource()==f4) {
            txtarea.setFont(new Font(x[3], st, fs));
            nm=x[3];
        }
        if (ae.getSource()==f5) {
            txtarea.setFont(new Font(x[4], st, fs));
            nm=x[4];
        }
        //fontsize pack
        if(ae.getSource()==fs10) {
            txtarea.setFont(new Font(nm, st, f[0]));
            fs=f[0];
        }
        if(ae.getSource()==fs20) {
            txtarea.setFont(new Font(nm, st, f[1]));
            fs=f[1];
        }
        if(ae.getSource()==fs30) {
            txtarea.setFont(new Font(nm, st, f[2]));
            fs=f[2];
        }
        if(ae.getSource()==fs40) {
            txtarea.setFont(new Font(nm, st, f[3]));
            fs=f[3];
        }
        if(ae.getSource()==fs50) {
            txtarea.setFont(new Font(nm, st, f[4]));
            fs=f[4];
        }
        //fontstyle pack
        if(ae.getSource()==plain) {
            txtarea.setFont(new Font(nm, s[0], fs));
            st=s[0];
        }
        if(ae.getSource()==italics) {
            txtarea.setFont(new Font(nm, s[1], fs));
            st=s[1];
        }
        if(ae.getSource()==bold) {
            txtarea.setFont(new Font(nm, s[2], fs));
            st=s[2];
        }

        //change text colour
        if (ae.getSource()==r)
            txtarea.setForeground(Color.RED);
        if(ae.getSource()==g)
            txtarea.setForeground(Color.GREEN);
        if(ae.getSource()==b)
            txtarea.setForeground(Color.BLUE);
        if(ae.getSource()==bl)
            txtarea.setForeground(Color.BLACK);
        if(ae.getSource()==wt)
            txtarea.setForeground(Color.WHITE);

        //Word Wrap
        if(ae.getSource()==ON){
            txtarea.setLineWrap(true);
            txtarea.setWrapStyleWord(true);
        }
        if(ae.getSource()==OFF){
            txtarea.setLineWrap(false);
            txtarea.setWrapStyleWord(false);
        }
        if (ae.getSource()==abt)
        {
            JOptionPane.showMessageDialog(null,"Developed By JavaBytes","INFO",1);
        }
    }
    public static void main(String[] args)
    {
        new FinalNotePad();
    }
}
