package Parking;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class ParkingGUI{
    //Initializing ParkingGUI Frame and elements
    JFrame pLot = new JFrame();
    JPanel levelPanel = new JPanel();
    JPanel timePanel = new JPanel();
    JLabel levelLabel = new JLabel();
    JLabel timeLabel = new JLabel();
    Border border = BorderFactory.createLineBorder(Color.BLACK,1);
    private void makeLabel(JLabel label)
    {
        //This method makes the common attributes of the labels
        label.setBackground(new Color(200,200,200));
        label.setFont(new Font("Times New Roman",Font.BOLD,30));
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setOpaque(true);
    }
    ParkingGUI()
    {
        //Make Label that displays the level of the parking Lot
        makeLabel(levelLabel);
        levelPanel.setLayout(new BorderLayout());
        levelPanel.setBounds(0,0,600,100);
        levelPanel.add(levelLabel);
        pLot.add(levelPanel);

        //Make label that displays the Time
        timeLabel.setText("12:00");
        makeLabel(timeLabel);
        timePanel.setLayout(new BorderLayout());
        timePanel.setBounds(600,0,190,100);
        timePanel.add(timeLabel);
        pLot.add(timePanel);

        //Make the frame layout
        pLot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pLot.setSize(800,800);
        pLot.setLayout(null);
        pLot.setVisible(false);
        pLot.setResizable(false);
        }
}
