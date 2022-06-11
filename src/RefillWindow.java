
import javax.swing.*;
import 	java.awt.*;
import 	java.awt.event.*;

public class RefillWindow extends JFrame  {

	/**
	 * Creates new form RefillWindow
	 */
	public RefillWindow() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jList1 = new javax.swing.JList<>();
                jScrollPane2 = new javax.swing.JScrollPane();
                jList2 = new javax.swing.JList<>();
                jScrollPane3 = new javax.swing.JScrollPane();
                jList3 = new javax.swing.JList<>();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                RefillBtn = new javax.swing.JButton();
                CloseBtn = new javax.swing.JButton();
                jLabel5 = new javax.swing.JLabel();
                ProductTypeLabel = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                CurrentQuantityLabel = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                ToAdd = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setText("Refill Product");

                jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                jList1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jList1MouseClicked(evt);
                        }
                });
                jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                                jList1ValueChanged(evt);
                        }
                });
                jScrollPane1.setViewportView(jList1);

                jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                                jList2ValueChanged(evt);
                        }
                });
                jScrollPane2.setViewportView(jList2);

                jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                jList3.setToolTipText("");
                jList3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                                jList3ValueChanged(evt);
                        }
                });
                jScrollPane3.setViewportView(jList3);

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel2.setText("Water");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel3.setText("Soft Drinks");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel4.setText("Kids Jucies");

                RefillBtn.setText("Refill Prodcut");
                RefillBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                RefillBtnActionPerformed(evt);
                        }
                });

                CloseBtn.setText("Close");
                CloseBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                CloseBtnActionPerformed(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel5.setText("The Selected Product");

                ProductTypeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                ProductTypeLabel.setText("nothing ");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel6.setText("The Existing Amount");

                CurrentQuantityLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                CurrentQuantityLabel.setText("nothing");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel7.setText("Quantity to be Added");

                ToAdd.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ToAddActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RefillBtn)
                                .addContainerGap(176, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(95, 95, 95)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4)
                                                .addGap(46, 46, 46))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(ProductTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(56, 56, 56)
                                                .addComponent(CurrentQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(76, 76, 76)
                                                .addComponent(ToAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel5))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(15, 15, 15))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ProductTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CurrentQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ToAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RefillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
		jList1.clearSelection();
		jList2.clearSelection();
		jList3.clearSelection();

		jLabel5.setVisible(false);
		jLabel6.setVisible(false);
		jLabel7.setVisible(false);

		ProductTypeLabel.setVisible(false);
		ToAdd.setVisible(false);
		CurrentQuantityLabel.setVisible(false);
		RefillBtn.setVisible(false);

		ToAdd.setText("0");

		setVisible(false);

        }//GEN-LAST:event_CloseBtnActionPerformed

        private void ToAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToAddActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_ToAddActionPerformed


        private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
                if(evt.getValueIsAdjusting()){
			jList2.clearSelection();
		jList3.clearSelection();		
		}


		int index = jList1.getSelectedIndex();
		
		if (index != -1){
			jLabel5.setVisible(true);
			jLabel6.setVisible(true);
			jLabel7.setVisible(true);


			ProductTypeLabel.setText(Information.A.get(index).get_type());
			CurrentQuantityLabel.setText(Information.A.get(index).get_quantity());
			ToAdd.enable(true);


			ProductTypeLabel.setVisible(true);
			ToAdd.setVisible(true);
			CurrentQuantityLabel.setVisible(true);
			RefillBtn.setVisible(true);
			ToAdd.setText("0");
		} else{
			jList1.clearSelection();
			jList2.clearSelection();
			jList3.clearSelection();

			jLabel5.setVisible(false);
			jLabel6.setVisible(false);
			jLabel7.setVisible(false);

			ProductTypeLabel.setVisible(false);
			ToAdd.setVisible(false);
			CurrentQuantityLabel.setVisible(false);
			RefillBtn.setVisible(false);

			ToAdd.setText(Integer.toString(0));
		}
        }//GEN-LAST:event_jList1ValueChanged

        private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
                if(evt.getValueIsAdjusting()){
			jList1.clearSelection();
			jList3.clearSelection();
		}

		int index = jList2.getSelectedIndex();

		if (index != -1){
			jLabel5.setVisible(true);
			jLabel6.setVisible(true);
			jLabel7.setVisible(true);


			ProductTypeLabel.setText(Information.B.get(index).get_type());
			CurrentQuantityLabel.setText(Information.B.get(index).get_quantity());


			ProductTypeLabel.setVisible(true);
			ToAdd.setVisible(true);
			CurrentQuantityLabel.setVisible(true);
			RefillBtn.setVisible(true);
			ToAdd.setText(Integer.toString(0));
		} else {
			jList1.clearSelection();
			jList2.clearSelection();
			jList3.clearSelection();

			jLabel5.setVisible(false);
			jLabel6.setVisible(false);
			jLabel7.setVisible(false);

			ProductTypeLabel.setVisible(false);
			ToAdd.setVisible(false);
			CurrentQuantityLabel.setVisible(false);
			RefillBtn.setVisible(false);

			ToAdd.setText(Integer.toString(0));
		}
        }//GEN-LAST:event_jList2ValueChanged

        private void jList3ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList3ValueChanged
                if(evt.getValueIsAdjusting()){
			jList1.clearSelection();
			jList2.clearSelection();
		}

		int index = jList3.getSelectedIndex();

		if (index != -1){
			jLabel5.setVisible(true);
			jLabel6.setVisible(true);
			jLabel7.setVisible(true);


			ProductTypeLabel.setText(Information.C.get(index).get_type());
			CurrentQuantityLabel.setText(Information.C.get(index).get_quantity());


			ProductTypeLabel.setVisible(true);
			ToAdd.setVisible(true);
			CurrentQuantityLabel.setVisible(true);
			RefillBtn.setVisible(true);
			ToAdd.setText("0");
		} else {
			jList1.clearSelection();
			jList2.clearSelection();
			jList3.clearSelection();

			jLabel5.setVisible(false);
			jLabel6.setVisible(false);
			jLabel7.setVisible(false);

			ProductTypeLabel.setVisible(false);
			ToAdd.setVisible(false);
			CurrentQuantityLabel.setVisible(false);
			RefillBtn.setVisible(false);

			ToAdd.setText(Integer.toString(0));
		}
        }//GEN-LAST:event_jList3ValueChanged

        private void RefillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefillBtnActionPerformed
		if (jList1.getSelectedIndex() != -1){
			Information.A.get(jList1.getSelectedIndex()).set_quantity_add(Integer.valueOf(ToAdd.getText()));
			CurrentQuantityLabel.setText(Information.A.get(jList1.getSelectedIndex()).get_quantity());
			JOptionPane.showMessageDialog(null, "Sucessfully Added");
		}

		else if (jList2.getSelectedIndex() != -1){
			Information.B.get(jList2.getSelectedIndex()).set_quantity_add(Integer.valueOf(ToAdd.getText()));
			CurrentQuantityLabel.setText(Information.B.get(jList2.getSelectedIndex()).get_quantity());
			JOptionPane.showMessageDialog(null, "Sucessfully Added");
		}
		else if (jList3.getSelectedIndex() != -1){
			Information.C.get(jList3.getSelectedIndex()).set_quantity_add(Integer.valueOf(ToAdd.getText()));
			CurrentQuantityLabel.setText(Information.C.get(jList3.getSelectedIndex()).get_quantity());
			JOptionPane.showMessageDialog(null, "Sucessfully Added");
		}
        }//GEN-LAST:event_RefillBtnActionPerformed

        private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_jList1MouseClicked


        // Variables declaration - do not modify//GEN-BEGIN:variables
        public javax.swing.JButton CloseBtn;
        public javax.swing.JLabel CurrentQuantityLabel;
        public javax.swing.JLabel ProductTypeLabel;
        public javax.swing.JButton RefillBtn;
        public javax.swing.JTextField ToAdd;
        public javax.swing.JLabel jLabel1;
        public javax.swing.JLabel jLabel2;
        public javax.swing.JLabel jLabel3;
        public javax.swing.JLabel jLabel4;
        public javax.swing.JLabel jLabel5;
        public javax.swing.JLabel jLabel6;
        public javax.swing.JLabel jLabel7;
        public javax.swing.JList<String> jList1;
        public javax.swing.JList<String> jList2;
        public javax.swing.JList<String> jList3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        // End of variables declaration//GEN-END:variables
}
