package Parking;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeaveGUI implements ActionListener {
    //Initializes elements and frame of leaveGUI
    JFrame leaveParking = new JFrame();
    JLabel parkedLabel= new JLabel();
    JLabel levelLabel = new JLabel();
    JLabel rowLabel = new JLabel();
    JLabel colLabel = new JLabel();
    JLabel levelValue = new JLabel();
    JLabel rowValue = new JLabel();
    JLabel colValue = new JLabel();
    JLabel payTicket = new JLabel();
    JLabel payment = new JLabel();
    JButton leaveButton = new JButton();
    Border border = BorderFactory.createLineBorder(Color.BLACK,1);
    private void makeLabel(JLabel label)
    {
        //This method makes the common attributes of the labels
        label.setFont(new Font("Times New Roman",Font.BOLD,30));
        label.setBackground(Color.WHITE);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setOpaque(true);
        label.setBorder(border);
        leaveParking.add(label);
    }
    LeaveGUI()
    {
        //Make the labels for where the car is parked
        //and also how much payment is due
        parkedLabel.setText("Your Car is Parked at ");
        makeLabel(parkedLabel);
        parkedLabel.setBounds(0,0,300,200);

        levelLabel.setText("Level");
        makeLabel(levelLabel);
        levelLabel.setBounds(300,0,100,100);

        rowLabel.setText("Row");
        makeLabel(rowLabel);
        rowLabel.setBounds(400,0,100,100);

        colLabel.setText("Col");
        makeLabel(colLabel);
        colLabel.setBounds(500,0,100,100);

        makeLabel(levelValue);
        levelValue.setBounds(300,100,100,100);

        makeLabel(rowValue);
        rowValue.setBounds(400,100,100,100);

        makeLabel(colValue);
        colValue.setBounds(500,100,100,100);

        payTicket.setText("Payment Due: ");
        makeLabel(payTicket);
        payTicket.setBounds(0,400,300,165);

        makeLabel(payment);
        payment.setBounds(300,400,300,165);

        //This button will close the program
        leaveButton.setText("Leave Parking");
        leaveButton.setFocusable(false);
        leaveButton.setBounds(100,200,400,200);
        leaveButton.setFont(new Font("Times New Roman",Font.BOLD,40));
        leaveButton.addActionListener(this);
        leaveParking.add(leaveButton);

        //Frame for leaveGUI
        leaveParking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        leaveParking.setLayout(null);
        leaveParking.setVisible(false);
        leaveParking.setSize(615,600);
        leaveParking.getContentPane().setBackground(new Color(200,200,200));
        leaveParking.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==leaveButton)
        {
            //if button is pressed, close program
            System.exit(0);
        }
    }
}
