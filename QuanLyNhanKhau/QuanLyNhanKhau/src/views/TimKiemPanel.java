/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Me
 */
public class TimKiemPanel extends javax.swing.JPanel {
    private JFrame parentFrame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    /**
     * Creates new form TimKiemPanel
     */
    public TimKiemPanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(Color.WHITE);
        
        JLabel jLabel7 = new JLabel();
        jLabel7.setText("Ti\u00EAu ch\u00ED 1:");
        jLabel7.setFont(new Font("Arial", Font.BOLD, 14));
        
        JLabel lblTiuCh = new JLabel();
        lblTiuCh.setText("Ti\u00EAu ch\u00ED 2:");
        lblTiuCh.setFont(new Font("Arial", Font.BOLD, 14));
        
        JLabel lblTiuCh_1 = new JLabel();
        lblTiuCh_1.setText("Ti\u00EAu ch\u00ED 3:");
        lblTiuCh_1.setFont(new Font("Arial", Font.BOLD, 14));
        
        JLabel lblTiuCh_2 = new JLabel();
        lblTiuCh_2.setText("Ti\u00EAu ch\u00ED 4:");
        lblTiuCh_2.setFont(new Font("Arial", Font.BOLD, 14));
        
        JComboBox<String> GenderJcb = new JComboBox<String>();
        GenderJcb.setFont(new Font("Arial", Font.PLAIN, 14));
        
        JComboBox<String> GenderJcb_1 = new JComboBox<String>();
        GenderJcb_1.setFont(new Font("Arial", Font.PLAIN, 14));
        
        JComboBox<String> GenderJcb_2 = new JComboBox<String>();
        GenderJcb_2.setFont(new Font("Arial", Font.PLAIN, 14));
        
        JComboBox<String> GenderJcb_3 = new JComboBox<String>();
        GenderJcb_3.setFont(new Font("Arial", Font.PLAIN, 14));
        
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
        
        textField_2 = new JTextField();
        textField_2.setFont(new Font("Arial", Font.PLAIN, 14));
        
        textField_3 = new JTextField();
        textField_3.setFont(new Font("Arial", Font.PLAIN, 14));
        
        JButton jButton1 = new JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        jButton1.setText("T\u00ECm Ki\u1EBFm");
        jButton1.setFont(new Font("Arial", Font.PLAIN, 14));
        
        JButton jButton1_1 = new JButton();
        jButton1_1.setText("L\u1ECBch s\u1EED thay \u0111\u1ED5i nh\u00E2n kh\u1EA9u");
        jButton1_1.setFont(new Font("Arial", Font.PLAIN, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addGap(44)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel7, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
        						.addComponent(GenderJcb, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        						.addComponent(GenderJcb_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        					.addGap(21))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(textField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        						.addComponent(lblTiuCh_1, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblTiuCh)
        						.addComponent(GenderJcb_3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        						.addComponent(GenderJcb_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
        						.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
        					.addContainerGap())
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(textField_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        						.addComponent(lblTiuCh_2, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
        					.addContainerGap())))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(270)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(274, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(433)
        			.addComponent(jButton1_1, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblTiuCh, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(GenderJcb, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(GenderJcb_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(4)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblTiuCh_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblTiuCh_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(GenderJcb_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(GenderJcb_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(74)
        			.addComponent(jButton1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(53, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents
}
