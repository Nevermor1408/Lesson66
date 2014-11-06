
package JARFILES;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Studentpopupp extends javax.swing.JDialog {
    Student_1 temp;
    
    public Studentpopupp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public String getName(){
        return txtnm.getText();
    }
    public int[] getMarks(){
        int marks[] = new int[3];
        try{
        DefaultTableModel model = (DefaultTableModel)tblmarkss.getModel();
        marks[0] = Integer.parseInt(tblmarkss.getValueAt(0, 0).toString());
        marks[1] = Integer.parseInt(tblmarkss.getValueAt(0, 1).toString());
        marks[2] = Integer.parseInt(tblmarkss.getValueAt(0, 2).toString());
        } catch(Exception e){JOptionPane.showMessageDialog(this, "Fill Out All Fields");}
        
        return marks;
    
        }
    public void setForm(Student_1 s){
        DefaultTableModel model = (DefaultTableModel)(tblmarkss.getModel());
        txtnm.setText(s.getName());
        model.setValueAt(s.getScore(1),0,0);
        model.setValueAt(s.getScore(2),0,1);
        model.setValueAt(s.getScore(3),0,2);
    }
    public Student_1 getStudent(){
        return temp;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtnm = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblmarkss = new javax.swing.JTable();
        btnokay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Student Name");

        tblmarkss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Mark 1", "Mark 2", "Mark 3"
            }
        ));
        tblmarkss.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tblmarkss);
        if (tblmarkss.getColumnModel().getColumnCount() > 0) {
            tblmarkss.getColumnModel().getColumn(0).setResizable(false);
            tblmarkss.getColumnModel().getColumn(1).setResizable(false);
            tblmarkss.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );

        btnokay.setText("OK");
        btnokay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnokay)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnokay)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokayActionPerformed
        int marks[]=new int[3];
        String name = txtnm.getText();
        try{
            marks[0]=Integer.parseInt(tblmarkss.getValueAt(0, 0).toString());
            marks[1]=Integer.parseInt(tblmarkss.getValueAt(0, 1).toString());
            marks[2]=Integer.parseInt(tblmarkss.getValueAt(0, 2).toString());
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "fill out all the fields");
            return;
            
        }
        temp = new Student_1(name, marks);
        
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnokayActionPerformed
     private void btnokActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        this.dispose();
    }
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable tblmarks;
    private javax.swing.JTextField txtname;
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnokay;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblmarkss;
    private javax.swing.JTextField txtnm;
    // End of variables declaration//GEN-END:variables
}
