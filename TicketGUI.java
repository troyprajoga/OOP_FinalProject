package Parking;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketGUI implements ActionListener {
    //Initializing TicketGUI frame and elements
    JFrame getTicket = new JFrame();
    JLabel pLabel = new JLabel();
    JLabel eaLabel = new JLabel();
    JButton getTicketButton = new JButton();
    Border border = BorderFactory.createLineBorder(Color.BLACK,1);
    private void makeLabel(JLabel label)
    {
        //This method makes the common attributes of the labels
        label.setFont(new Font("Times New Roman",Font.BOLD,30));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setBorder(border);
        getTicket.add(label);
    }
    TicketGUI()
    {
        //make labels for the gui
        pLabel.setText("Enter Parking");
        pLabel.setBounds(145,0,200,150);
        makeLabel(pLabel);

        eaLabel.setText("Every Action is 5 Minutes");
        eaLabel.setBounds(45,314,400,150);
        makeLabel(eaLabel);

        //make the ticket button to open the ParkingGUI
        getTicketButton.setBounds(100,150,285,165);
        getTicketButton.setText("Get Ticket");
        getTicketButton.setFont(new Font("Times New Roman",Font.BOLD,30));
        getTicketButton.setFocusable(false);
        getTicketButton.addActionListener(this);
        getTicket.add(getTicketButton);

        //makes the layout of the frame
        getTicket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getTicket.setLayout(null);
        getTicket.setResizable(false);
        getTicket.setSize(500,500);
        getTicket.setVisible(true);
        getTicket.getContentPane().setBackground(new Color(200,200,200));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==getTicketButton)
        {
            //if get ticket button is pressed, make parking lot
            getTicket.setVisible(false);
            new ParkingLot();
        }
    }
}
