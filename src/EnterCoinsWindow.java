/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Mohammad Alshareef
 */
public class EnterCoinsWindow extends javax.swing.JFrame {

	/**
	 * Creates new form EnterCoinsWindow
	 */
	public EnterCoinsWindow() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jButton5 = new javax.swing.JButton();
                jButton6 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setText("Enter Coins");

                jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mohammad Alshareef\\Documents\\NetBeansProjects\\JavaProject\\src\\img\\one_resized.jpg")); // NOI18N

                jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mohammad Alshareef\\Documents\\NetBeansProjects\\JavaProject\\src\\img\\two_resized.jpg")); // NOI18N

                jLabel4.setBackground(new java.awt.Color(255, 255, 255));
                jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mohammad Alshareef\\Documents\\NetBeansProjects\\JavaProject\\src\\img\\five_resized.jpg")); // NOI18N

                jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mohammad Alshareef\\Documents\\NetBeansProjects\\JavaProject\\src\\img\\ten_resized.jpg")); // NOI18N

                jButton1.setText("Enter 1 NIS");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setText("Enter 2 NIS");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setText("Enter 5 NIS");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton4.setText("Enter 10 NIS");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel6.setText("You need to enter:");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel7.setText("0");

                jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel8.setText("You have entered: ");

                jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel9.setText("0");

                jButton5.setText("Done");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jButton6.setText("Cancel");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(131, 131, 131)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel6))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(20, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jButton5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		Information.Entered += 5;
		Information.Coins_Entered[2] += 1;
		jLabel9.setText(Integer.toString(Information.Entered));
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		Information.E.setVisible(false);

        }//GEN-LAST:event_jButton6ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		Information.Coins_Entered[0] += 1;
		Information.Entered += 1;
		jLabel9.setText(Integer.toString(Information.Entered));
		

        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		Information.Coins_Entered[1] += 1;
		Information.Entered += 2;
		jLabel9.setText(Integer.toString(Information.Entered));
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
		Information.Coins_Entered[3] += 1;
		Information.Entered += 10;
		jLabel9.setText(Integer.toString(Information.Entered));
        }//GEN-LAST:event_jButton4ActionPerformed

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
		if (Information.Entered >= Information.Pay){
			int rem = Information.Entered - Information.Pay;


			for(int i = 0; i < 4; i++){
				Information.Coins_In_Machine[i] += Information.Coins_Entered[i];
			}

			for (int i = 0; i < 4; i++){
				System.out.print(Information.Coins_In_Machine[i] + " ");
			}
			System.out.println();


			for (int i = 3; i >= 0; i--){
				int t = Math.min(Information.Coins_In_Machine[i] , rem / Information.Val[i]);
				rem -= t * Information.Val[i];
			}

			if (rem == 0){

				rem = Information.Entered - Information.Pay;
				String print = "Purchaes sucessfully: \n The remaining is: " + Integer.toString(rem) + '\n';
				for (int i = 3; i >= 0; i--){
					int t = Math.min(Information.Coins_In_Machine[i] , rem / Information.Val[i]);
					rem -= t * Information.Val[i];
					Information.Coins_In_Machine[i] -= t;
					print += "From Coins: " + Integer.toString(Information.Val[i]) + ", You Get: " + Integer.toString(t) + '\n';
				}

				System.out.println("After purshase:");
				for (int i = 0; i < 4; i++){
					System.out.print(Information.Coins_In_Machine[i] + " ");
				}
				System.out.println();

				if (Information.Selected == 1) Information.A.get(0).set_quantity(Information.A.get(0).get_quantity_int() - 1);
				if (Information.Selected == 2) Information.A.get(1).set_quantity(Information.A.get(1).get_quantity_int() - 1);
				if (Information.Selected == 3) Information.B.get(0).set_quantity(Information.B.get(0).get_quantity_int() - 1);
				if (Information.Selected == 4) Information.B.get(1).set_quantity(Information.B.get(1).get_quantity_int() - 1);
				if (Information.Selected == 5) Information.B.get(2).set_quantity(Information.B.get(2).get_quantity_int() - 1);
				if (Information.Selected == 6) Information.C.get(0).set_quantity(Information.C.get(0).get_quantity_int() - 1);
				if (Information.Selected == 7) Information.C.get(1).set_quantity(Information.C.get(1).get_quantity_int() - 1);

				JOptionPane.showMessageDialog(null, print);
				Information.E.setVisible(false);

			} else {
				JOptionPane.showMessageDialog(null, "No Enough Coins in the Machine and Yes You can't get your money back");
				Information.E.setVisible(false);
			}
		} else {
			JOptionPane.showMessageDialog(null, "You need to Enter more Money");
		}
        }//GEN-LAST:event_jButton5ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        public javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        public javax.swing.JLabel jLabel9;
        // End of variables declaration//GEN-END:variables
}
