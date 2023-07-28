
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Desktop;
import java.util.Set;

public class DrawUI extends Dictionary {
    public static String outputfix;
    public static String outputfix2;

    public static void drawUI() {
        Desktop desktop = Desktop.getDesktop();

        JFrame myFrame = new JFrame("Farm-Guide");
//panel1 components
        JPanel Panel1 = new JPanel();
        JLabel Title = new JLabel("Farm-Guide", JLabel.CENTER);
        JLabel prompt = new JLabel("What would you like to raise/rare : ");
        JTextField searchfield = new JTextField();
        JPanel buttonelpanel = new JPanel();
        JButton searchbutton = new JButton(" Search ➤");
        JButton Historybutton = new JButton(" Display History");
        JButton Indexbutton = new JButton(" Display Index");
        JButton Dedbutton = new JButton(" Dedsec");

//panel2 components
        JPanel Panel2 = new JPanel();
        JLabel output = new JLabel();
        JLabel PGR = new JLabel("Proper Growth Requirements :");


////////Second Frame  - Index Frame
        JFrame frame2 = new JFrame("Farm-Guide Index");
        JList index = new JList(indexarray);
        JScrollPane scrollie = new JScrollPane(index);
        scrollie.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        index.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                    searchfield.setText(index.getSelectedValue().toString());
                }
            }
        });
////////Third Frame - Group Info
        JFrame frame3 = new JFrame("Dedsec");
        JList group = new JList(grouparray);


//customization
        //Panel 1 components
        Panel1.setLayout(new BoxLayout(Panel1, BoxLayout.Y_AXIS));
        Title.setFont(new Font("Calibri", Font.BOLD, 35));
        Title.setForeground(Color.white);
        prompt.setForeground(Color.white);
        prompt.setFont(new Font("Calibri", Font.BOLD, 20));
        searchfield.setForeground(Color.white);
        searchfield.setFont(new Font("Calibri", Font.PLAIN, 25));
        searchfield.setBackground(new Color(59, 59, 134));
        Panel1.add(Title);
        Panel1.add(prompt);
        Panel1.add(searchfield);
        Panel1.setBackground(new Color(1, 1, 33));

        //Button Panel components
        searchbutton.setForeground(Color.white);
        searchbutton.setBackground(new Color(59, 59, 134));
        Indexbutton.setForeground(Color.white);
        Indexbutton.setBackground(new Color(59, 59, 134));
        Historybutton.setForeground(Color.white);
        Historybutton.setBackground(new Color(59, 59, 134));
        Dedbutton.setForeground(Color.RED);
        Dedbutton.setBackground(new Color(0, 0, 0));
        buttonelpanel.setLayout(new GridLayout(2, 2));
        buttonelpanel.add(searchbutton);
        buttonelpanel.add(Indexbutton);
        buttonelpanel.add(Historybutton);
        buttonelpanel.add(Dedbutton);

        //Panel 2 components
        PGR.setForeground(Color.white);
        PGR.setFont(new Font("Calibri", Font.PLAIN, 20));
        output.setForeground(Color.white);
        output.setFont(new Font("Calibri", Font.PLAIN, 17));
        Panel2.setBackground(new Color(1, 1, 1));
        Panel2.add(PGR);
        Panel2.add(output);

//////  Frame1 Components
        myFrame.setBackground(new Color(1, 1, 1));
        myFrame.add(Panel1);
        myFrame.add(buttonelpanel);
        myFrame.add(Panel2);
        myFrame.setResizable(false);
        myFrame.setVisible(true);
        myFrame.setSize(900, 440);
        myFrame.setLayout(new GridLayout(0, 1));
////////FRAME 2
        index.setBackground(new Color(1, 1, 1));
        index.setForeground(Color.white);
        frame2.add(scrollie);
        frame2.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        frame2.setResizable(false);
        frame2.setVisible(false);
        frame2.setLocationRelativeTo(myFrame);
        frame2.setSize(300, 440);
////////Frame 3
        group.setBackground(new Color(1, 1, 1));
        group.setForeground(Color.white);
        frame3.add(group);
        frame3.setResizable(false);
        frame3.setVisible(false);
        frame3.setSize(300, 440);
        frame3.setLayout(new GridLayout(0, 1));
////////////////////////////////////////////////////////////////////////////////////////
        //Buttons Functions//
        searchbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                outputfix = searchfield.getText(); //stores what is in the searchfield in outputfix
                String outputfix1 = outputfix.toLowerCase(); //stores outputfix in lowercase in outputfix1
                for (int i = 0; i < indexlist.size(); i++) {  //the for loop checks if the outputifx1 matches any keys in the hashtable
                    if (dict.containsKey(outputfix1)) {
                        String outputfix2 = dict.get(outputfix1); //sets the value of the key in output jlabel
                        output.setText(outputfix2);
                    } else {                                   // if it doesnt match it returns no informatino available
                        output.setText("No information available");
                    }
                }
                stores.add(searchfield.getText());        // it adds what ever was in the searchfield when someone clicks the buttons in an arraylist called stores
            }
        });
        Historybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter("SearchHistory.txt");
                    for (int i = 1; i < stores.size(); i++) {
                        writer.write(i+". " + stores.get(i) + "\n");
                    }
                    writer.close();
                } catch (IOException f) {
                    System.out.println("Didn't work");
                }
                File file = new File("SearchHistory.txt");
                if (file.exists()) {
                    try {
                        desktop.open(file);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }

            }
        });
        Indexbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(true);

            }
        });
        Dedbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame3.setVisible(true);

            }
        });
    }
}


