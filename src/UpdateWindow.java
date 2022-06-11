import javax.swing.*;
import 	java.awt.*;
import 	java.awt.event.*;

public class UpdateWindow extends JFrame  {

	/**
	 * Creates new form RefillWindow
	 */
	public UpdateWindow() {
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
                CloseBtn = new javax.swing.JButton();
                jLabel5 = new javax.swing.JLabel();
                ProductTypeLabel = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                CurrentPriceLabel = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setText("Update Product");
                jLabel1.setToolTipText("");

                jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

                CloseBtn.setText("Close");
                CloseBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                CloseBtnActionPerformed(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel5.setText("The Selected Product");

                ProductTypeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                ProductTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                ProductTypeLabel.setText("nothing ");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel6.setText("The Price of The Product");

                CurrentPriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                CurrentPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                CurrentPriceLabel.setText("nothing");

                jButton1.setText("Update The Price");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setText("Update The Name");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setText("Remove The Product");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(39, 39, 39))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(ProductTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(CurrentPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel1)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CurrentPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ProductTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents


        private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
		jList1.clearSelection();
		jList2.clearSelection();
		jList3.clearSelection();

		jLabel5.setVisible(false);
		jLabel6.setVisible(false);

		ProductTypeLabel.setVisible(false);
		CurrentPriceLabel.setVisible(false);

		jButton1.setVisible(false);
		jButton2.setVisible(false);
		jButton3.setVisible(false);


		setVisible(false);

        }//GEN-LAST:event_CloseBtnActionPerformed


        private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
		jList2.clearSelection();
		jList3.clearSelection();

		int index = jList1.getSelectedIndex();
		if (index != -1){
			jLabel5.setVisible(true);
			jLabel6.setVisible(true);

			jButton1.setVisible(true);
			jButton2.setVisible(true);
			jButton3.setVisible(true);


			ProductTypeLabel.setText(Information.A.get(index).get_type());
			CurrentPriceLabel.setText(Information.A.get(index).get_price());


			ProductTypeLabel.setVisible(true);
			CurrentPriceLabel.setVisible(true);
		} else {
			jList1.clearSelection();
			jList2.clearSelection();
			jList3.clearSelection();

			jLabel5.setVisible(false);
			jLabel6.setVisible(false);

			ProductTypeLabel.setVisible(false);
			CurrentPriceLabel.setVisible(false);

			jButton1.setVisible(false);
			jButton2.setVisible(false);
			jButton3.setVisible(false);

		}
        }//GEN-LAST:event_jList1ValueChanged

        private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
		jList1.clearSelection();
		jList3.clearSelection();

		int index = jList2.getSelectedIndex();

		if (index != -1){
			jLabel5.setVisible(true);
			jLabel6.setVisible(true);

			jButton1.setVisible(true);
			jButton2.setVisible(true);
			jButton3.setVisible(true);

			ProductTypeLabel.setText(Information.B.get(index).get_type());
			CurrentPriceLabel.setText(Information.B.get(index).get_price());

			ProductTypeLabel.setVisible(true);
			CurrentPriceLabel.setVisible(true);
		} else {
			jList1.clearSelection();
			jList2.clearSelection();
			jList3.clearSelection();

			jLabel5.setVisible(false);
			jLabel6.setVisible(false);

			ProductTypeLabel.setVisible(false);
			CurrentPriceLabel.setVisible(false);

			jButton1.setVisible(false);
			jButton2.setVisible(false);
			jButton3.setVisible(false);

		}
        }//GEN-LAST:event_jList2ValueChanged

        private void jList3ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList3ValueChanged
		jList1.clearSelection();
		jList2.clearSelection();

		int index = jList3.getSelectedIndex();

		if (index != -1){
			jLabel5.setVisible(true);
			jLabel6.setVisible(true);

			jButton1.setVisible(true);
			jButton2.setVisible(true);
			jButton3.setVisible(true);

			ProductTypeLabel.setText(Information.C.get(index).get_type());
			CurrentPriceLabel.setText(Information.C.get(index).get_price());


			ProductTypeLabel.setVisible(true);
			CurrentPriceLabel.setVisible(true);
		} else {
			jList1.clearSelection();
			jList2.clearSelection();
			jList3.clearSelection();

			jLabel5.setVisible(false);
			jLabel6.setVisible(false);

			ProductTypeLabel.setVisible(false);
			CurrentPriceLabel.setVisible(false);

			jButton1.setVisible(false);
			jButton2.setVisible(false);
			jButton3.setVisible(false);
		}
        }//GEN-LAST:event_jList3ValueChanged




        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		String price = JOptionPane.showInputDialog("Enter the Price");
		if (jList1.getSelectedIndex() != -1){
			Information.A.get(jList1.getSelectedIndex()).set_price(Integer.valueOf(price));
			CurrentPriceLabel.setText(Information.A.get(jList1.getSelectedIndex()).get_price());
		}

		else if (jList2.getSelectedIndex() != -1){
			Information.B.get(jList2.getSelectedIndex()).set_price(Integer.valueOf(price));
			CurrentPriceLabel.setText(Information.B.get(jList2.getSelectedIndex()).get_price());

		}

		else if (jList3.getSelectedIndex() != -1){
			Information.C.get(jList3.getSelectedIndex()).set_price(Integer.valueOf(price));
			CurrentPriceLabel.setText(Information.C.get(jList3.getSelectedIndex()).get_price());
		}
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		String type = JOptionPane.showInputDialog("Enter the type");
		if (jList1.getSelectedIndex() != -1){
			Information.A.get(jList1.getSelectedIndex()).set_type(type);
			ProductTypeLabel.setText(Information.A.get(jList1.getSelectedIndex()).get_type());
			Information.model1.setElementAt(type , jList1.getSelectedIndex());
		}

		else if (jList2.getSelectedIndex() != -1){
			Information.B.get(jList2.getSelectedIndex()).set_type(type);
			ProductTypeLabel.setText(Information.B.get(jList2.getSelectedIndex()).get_type());
			Information.model2.setElementAt(type , jList2.getSelectedIndex());

		}

		else if (jList3.getSelectedIndex() != -1){
			Information.C.get(jList3.getSelectedIndex()).set_type(type);
			ProductTypeLabel.setText(Information.C.get(jList3.getSelectedIndex()).get_type());
			Information.model3.setElementAt(type , jList3.getSelectedIndex());
		}
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		if (jList1.getSelectedIndex() != -1){
			int result = JOptionPane.showConfirmDialog(null, "Do you want to remove the item");
			if (result == JOptionPane.YES_OPTION){
				if (Information.A.size() == 2) Information.P.jRadioButton2.setVisible(false);
				if (Information.A.size() == 1) Information.P.jRadioButton1.setVisible(false);

				Information.A.remove(jList1.getSelectedIndex());
				Information.model1.remove(jList1.getSelectedIndex());


			}
		}
		else if (jList2.getSelectedIndex() != -1){
			int result = JOptionPane.showConfirmDialog(null, "Do you want to remove the item");
			if (result == JOptionPane.YES_OPTION){
				if (Information.B.size() == 3) Information.P.jRadioButton5.setVisible(false);
				if (Information.B.size() == 2) Information.P.jRadioButton4.setVisible(false);
				if (Information.B.size() == 1) Information.P.jRadioButton3.setVisible(false);

				Information.B.remove(jList2.getSelectedIndex());
				Information.model2.remove(jList2.getSelectedIndex());

			}

		}
		else if (jList3.getSelectedIndex() != -1){
			int result = JOptionPane.showConfirmDialog(null, "Do you want to remove the item");
			if (result == JOptionPane.YES_OPTION){
				if (Information.C.size() == 2) Information.P.jRadioButton7.setVisible(false);
				if (Information.C.size() == 1) Information.P.jRadioButton6.setVisible(false);

				Information.C.remove(jList3.getSelectedIndex());
				Information.model3.remove(jList3.getSelectedIndex());

			}

		}
        }//GEN-LAST:event_jButton3ActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        public javax.swing.JButton CloseBtn;
        public javax.swing.JLabel CurrentPriceLabel;
        public javax.swing.JLabel ProductTypeLabel;
        public javax.swing.JButton jButton1;
        public javax.swing.JButton jButton2;
        public javax.swing.JButton jButton3;
        public javax.swing.JLabel jLabel1;
        public javax.swing.JLabel jLabel2;
        public javax.swing.JLabel jLabel3;
        public javax.swing.JLabel jLabel4;
        public javax.swing.JLabel jLabel5;
        public javax.swing.JLabel jLabel6;
        public javax.swing.JList<String> jList1;
        public javax.swing.JList<String> jList2;
        public javax.swing.JList<String> jList3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        // End of variables declaration//GEN-END:variables
}
