/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_GUI;

/**
 *
 * @author 1leste
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 */
public class PriceIsRight extends JFrame implements ActionListener, MouseListener {

    private JPanel middlePanel;
    private JPanel topDicePanel;
    private JPanel midDicePanel;
    private JPanel botDicePanel;
    private JPanel[][] dice;
    private JPanel[][] fixPanel;
    private JPanel[][] emptyPanel;
    private JPanel[][] blackPanel;
    private DiePanel[] die = new DiePanel[4];
    private JButton button;

    public PriceIsRight() {
        init();
    }

    public void init() {

        // MAIN WINDOW; The Price is Righta
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("The Price is Right!");

        // WINDOW; Border Layout
        this.setLayout(new BorderLayout());
        this.setSize(800, 400);

        // PARENT PANEL
        this.middlePanel = new JPanel();
        this.middlePanel.setLayout(new BoxLayout(this.middlePanel, BoxLayout.PAGE_AXIS));
        this.middlePanel.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

        // TOP DICE; HIGH
        this.topDicePanel = new JPanel();
        this.topDicePanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        // BOT DICE; ROLLed
        this.midDicePanel = new JPanel();
        this.midDicePanel.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));

        // BOT DICE; LOW
        this.botDicePanel = new JPanel();
        this.botDicePanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        for (int i = 0; i < 4; i++) {
            die[i] = new DiePanel();
        }



        // GENERATE DIE, put them in TOP/BOT Dice Panel
        this.emptyPanel = new JPanel[3][4];
        this.fixPanel = new JPanel[3][4];
        this.dice = new Die[3][4];
        initDice();

        //Button
        this.button = new JButton("Roll");
        this.button.addActionListener(this);
        this.button.setActionCommand("Roll");

        // TOP / BOT Dice Panel
        this.middlePanel.add(topDicePanel);
        this.middlePanel.add(midDicePanel);
        this.middlePanel.add(botDicePanel);


        // ADD ITEMS TO middlePanel
        this.add(middlePanel, BorderLayout.CENTER);
        this.add(new JLabel("PAGE_START"), BorderLayout.PAGE_START);
        this.add(button, BorderLayout.LINE_START);
        this.add(button, BorderLayout.LINE_END);

        //this.pack();

    }

    private void initDice() {

        Dimension d = new Dimension(100, 100);

        for (int i = 0; i < 4; i++) {
            die[i].setPreferredSize(d);
            die[i].addMouseListener(this);
            die[i].setVisible(false);
        }
        for (int row = 0; row < dice.length; row++) {
            for (int col = 0; col < dice[row].length; col++) {

                emptyPanel[row][col] = new JPanel();
                emptyPanel[row][col].setPreferredSize(d);
                emptyPanel[row][col].setName(row + "-" + col);
                emptyPanel[row][col].addMouseListener(this);
                emptyPanel[row][col].setBackground(Color.black);

                blackPanel[row][col] = new JPanel();
                blackPanel[row][col].setPreferredSize(d);
                blackPanel[row][col].setName(row + "-" + col);
                blackPanel[row][col].setBackground(Color.black);
                
                
                
                if ((row + col) % 2 == 0) {
                    for (int i = 0; i < 4; i++) {
                        die[i].setBorder(BorderFactory.createLineBorder(Color.RED));
                        die[i].setBackground(Color.GREEN);
                    }
                } else {
                    for (int i = 0; i < 4; i++) {
                        die[i].setBorder(BorderFactory.createLineBorder(Color.GREEN));
                        die[i].setBackground(Color.RED);
                    }
                }

                if (row == 0) {
                    this.topDicePanel.add(this.dice[row][col]);
                } else if (row == 1) {
                    this.midDicePanel.add(this.dice[row][col]);
                } else {
                    this.botDicePanel.add(this.dice[row][col]);
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // BUTTON PRESSED!!
        if (e.getActionCommand().equals("roll")) {
            System.out.println("DO SOMETHING?");
        }



    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked on " + e.getComponent().getName());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // DO NOTHING
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // DO NOTHING
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // DO NOTHING
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // DO NOTHING
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PriceIsRight().setVisible(true);
            }
        });

    }
}
