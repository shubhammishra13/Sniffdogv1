/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sniffdog;

import java.awt.EventQueue;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.jnetpcap.PcapIf;

/**
 *
 * @author Rishabh
 */
public class User_Interface extends javax.swing.JFrame {
    static final String headers[]={"PacketNo","Time(hh:mm:ss)","Source","Destination"};
   static final DefaultTableModel dtm=new DefaultTableModel(headers,0);
   
   /**
     * Creates new form User_Interface
     */
    public User_Interface() {
        initComponents();
        do_on_start();
    }
    private void do_on_start(){
    jpf=new JnetPcap_Functions();
        List<PcapIf> devices=jpf.listNetworkInterfaces();
       for(PcapIf dev:devices){
       jTextArea2.append(dev.getName()+"\n");
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SniffDog");
        setMinimumSize(new java.awt.Dimension(652, 720));
        getContentPane().setLayout(null);

        jTable1.setModel(dtm
        );
        jScrollPane1.setViewportView(jTable1);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override

            public void valueChanged(ListSelectionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {

                        int index=jTable1.getSelectedRow()+1;
                        System.out.println(index);
                        if (index != -1) {
                            up.display_info(index);
                        }
                        //To change body of generated methods, choose Tools | Templates.
                    }
                });

            }
        });

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 270, 610, 180);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 450, 610, 190);

        jPanel3.setLayout(null);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 370, 110);

        jPanel2.setLayout(null);

        jLabel1.setText("Device Number");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 20, 90, 14);

        jLabel2.setText("File Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 50, 60, 14);

        jLabel3.setText("Filter Option");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 80, 70, 14);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(100, 20, 210, 20);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(100, 50, 210, 20);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(100, 80, 210, 20);

        jCheckBox1.setText("Filter");
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(320, 80, 60, 23);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(10, 130, 400, 110);

        jPanel1.setLayout(null);

        jButton2.setText("STOP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 50, 100, 23);

        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 20, 100, 23);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(440, 50, 130, 80);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 10, 600, 250);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Analysis");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Packet Length");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Protocol Analysis");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Flow Diagram");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
static UI_Processing up;
Thread dump_packets;
JnetPcap_Functions jpf;
static String filename;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       up=new UI_Processing(dtm,jTextArea1);
       int ind=Integer.parseInt(jTextField2.getText());
       jpf.set(ind);
       filename=jTextField3.getText();
jpf.setfilename(filename);       
//if(jCheckBox1.isSelected()){
         //  String filter=jTextField3.getText();
       //jpf.set_filter(filter);
       //}
       dump_packets=new sniffDog.Packet_Dumper_Thread(jpf);
       dump_packets.start();
Pcap_File_Processing fileprocess=new Pcap_File_Processing(up,jpf);
fileprocess.start();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
static boolean stop=false;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        stop=true;
       dump_packets.interrupt();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
new Packet_Length().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
new Protocol_Analysis().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
new FlowDiagram().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable1;
    private static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
