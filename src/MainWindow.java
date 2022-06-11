import javax.swing.*;

public class MainWindow extends JFrame {


    /**
     * 
     * 
     */

    public MainWindow() {
        initComponents();
    }

    public static void init(){
	JOptionPane.showMessageDialog(null, "WELOCOME TO MOHAMMAD ALSHAREEF AWESOME PROGRAM");
	Information.M.setVisible(true);


	Information.U.jLabel5.setVisible(false);
	Information.U.jLabel6.setVisible(false);
	Information.U.CurrentPriceLabel.setVisible(false);
	Information.U.ProductTypeLabel.setVisible(false);
	Information.U.jButton1.setVisible(false);
	Information.U.jButton2.setVisible(false);
	Information.U.jButton3.setVisible(false);

	Information.R.jLabel5.setVisible(false);
	Information.R.jLabel6.setVisible(false);
	Information.R.jLabel7.setVisible(false);
	Information.R.ProductTypeLabel.setVisible(false);
	Information.R.CurrentQuantityLabel.setVisible(false);
	Information.R.ToAdd.setVisible(false);
	Information.R.RefillBtn.setVisible(false);

	Information.P.jButton1.setVisible(false);


	/// quantities , prices ,
	Information.A.add(new Water(0 , 1 , "Normal Water"));
	Information.A.add(new Water(0 , 2 , "Sparkling Water"));
	Information.B.add(new SoftDrinks(0 , 3 , "Coca Cola"));
	Information.B.add(new SoftDrinks(0 , 4 , "Fanta"));
	Information.B.add(new SoftDrinks(0 , 5 , "Sprite"));
	Information.C.add(new KidsJuices(0 , 6 , "Apple Jucie"));
	Information.C.add(new KidsJuices(0 , 7 , "Cocktail"));

	Information.model1.addElement("Normal Water");
	Information.model1.addElement("Sparkling Water");

	Information.model2.addElement("Coca Cola");
	Information.model2.addElement("Fanta");
	Information.model2.addElement("Sprite");

	Information.model3.addElement("Apple Jucie");
	Information.model3.addElement("Cocktail");

	Information.U.jList1.setModel(Information.model1);
	Information.U.jList2.setModel(Information.model2);
	Information.U.jList3.setModel(Information.model3);

	Information.R.jList1.setModel(Information.model1);
	Information.R.jList2.setModel(Information.model2);
	Information.R.jList3.setModel(Information.model3);
    }

    public static void main(String args[]){
	    init();
    }

    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jButton1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setResizable(false);

                jButton1.setText("Refill Product");
                jButton1.setToolTipText("");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel1.setText("Drink Machine");
                jLabel1.setToolTipText("");

                jButton2.setText("Update Product");
                jButton2.setToolTipText("");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setText("Purchase a Drink ");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel2.setText("Tasks as a Worker");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel3.setText("Tasks as a Consumer");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1)
                                .addContainerGap(158, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	    Information.R.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	    Information.U.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
	    if (Information.A.size() > 0) Information.P.jRadioButton1.setText(Information.A.get(0).product());
	    if (Information.A.size() > 1) Information.P.jRadioButton2.setText(Information.A.get(1).product());

	    if (Information.B.size() > 0) Information.P.jRadioButton3.setText(Information.B.get(0).product());
	    if (Information.B.size() > 1) Information.P.jRadioButton4.setText(Information.B.get(1).product());
	    if (Information.B.size() > 2) Information.P.jRadioButton5.setText(Information.B.get(2).product());

	    if (Information.C.size() > 0) Information.P.jRadioButton6.setText(Information.C.get(0).product());
	    if (Information.C.size() > 1) Information.P.jRadioButton7.setText(Information.C.get(1).product());

	    Information.P.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        // End of variables declaration//GEN-END:variables
}
