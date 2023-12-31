/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package diceprogram;

import javax.swing.JOptionPane;

/**
 *
 * @author 22013691
 */
public class DiceGame extends javax.swing.JFrame {
    
    Player[] thePlayers = new Player[2];

    /**
     * Creates new form DiceGame
     */
    public DiceGame() {
        initComponents();
        for (int i = 0; i < thePlayers.length; i++) {
            thePlayers[i] = new Player ();
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

        pnl_credits = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        pnl_welcome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_startGame = new javax.swing.JButton();
        btn_credits = new javax.swing.JButton();
        pnl_userData = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_player0Name = new javax.swing.JTextField();
        txt_player1Name = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        pnl_game = new javax.swing.JPanel();
        lbl_player0Name = new javax.swing.JLabel();
        lbl_player1Name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_player0Output = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_player1Output = new javax.swing.JTextArea();
        btn_rollDice = new javax.swing.JButton();
        btn_restart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        pnl_credits.setBackground(new java.awt.Color(0, 0, 30));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(0, 0, 30));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(200, 200, 100));
        jTextArea1.setRows(5);
        jTextArea1.setText("Game made and tested by me!");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 100)));
        jScrollPane3.setViewportView(jTextArea1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diceprogram/abomination.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jTextPane1);

        javax.swing.GroupLayout pnl_creditsLayout = new javax.swing.GroupLayout(pnl_credits);
        pnl_credits.setLayout(pnl_creditsLayout);
        pnl_creditsLayout.setHorizontalGroup(
            pnl_creditsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_creditsLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(pnl_creditsLayout.createSequentialGroup()
                .addGroup(pnl_creditsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_creditsLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_creditsLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_creditsLayout.setVerticalGroup(
            pnl_creditsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_creditsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_credits, "card5");

        pnl_welcome.setBackground(new java.awt.Color(0, 0, 30));
        pnl_welcome.setForeground(new java.awt.Color(0, 0, 30));
        pnl_welcome.setToolTipText("Secret");

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 200, 100));
        jLabel1.setText("Welcome to Dice Game");

        btn_startGame.setBackground(new java.awt.Color(0, 0, 51));
        btn_startGame.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        btn_startGame.setForeground(new java.awt.Color(200, 200, 100));
        btn_startGame.setText("Start Game");
        btn_startGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startGameActionPerformed(evt);
            }
        });

        btn_credits.setBackground(new java.awt.Color(0, 0, 51));
        btn_credits.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        btn_credits.setForeground(new java.awt.Color(200, 200, 100));
        btn_credits.setText("Credits");
        btn_credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creditsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_welcomeLayout = new javax.swing.GroupLayout(pnl_welcome);
        pnl_welcome.setLayout(pnl_welcomeLayout);
        pnl_welcomeLayout.setHorizontalGroup(
            pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_welcomeLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_welcomeLayout.createSequentialGroup()
                        .addGroup(pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_startGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_credits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_welcomeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71))))
        );
        pnl_welcomeLayout.setVerticalGroup(
            pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_welcomeLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_startGame)
                .addGap(18, 18, 18)
                .addComponent(btn_credits)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_welcome, "card2");

        pnl_userData.setBackground(new java.awt.Color(0, 0, 30));

        jLabel3.setBackground(new java.awt.Color(200, 200, 200));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(200, 200, 100));
        jLabel3.setText("Player 2 Name");

        jLabel2.setBackground(new java.awt.Color(200, 200, 200));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(200, 200, 100));
        jLabel2.setText("Player 1 Name");

        txt_player0Name.setBackground(new java.awt.Color(200, 200, 200));
        txt_player0Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_player0NameActionPerformed(evt);
            }
        });

        txt_player1Name.setBackground(new java.awt.Color(200, 200, 200));

        btn_start.setText("Start");
        btn_start.setToolTipText("");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_userDataLayout = new javax.swing.GroupLayout(pnl_userData);
        pnl_userData.setLayout(pnl_userDataLayout);
        pnl_userDataLayout.setHorizontalGroup(
            pnl_userDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_userDataLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnl_userDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(pnl_userDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_player0Name, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(txt_player1Name))
                .addGap(46, 46, 46))
            .addGroup(pnl_userDataLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(btn_start)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_userDataLayout.setVerticalGroup(
            pnl_userDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_userDataLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pnl_userDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_player0Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(pnl_userDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_player1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59)
                .addComponent(btn_start)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_userData, "card3");

        pnl_game.setBackground(new java.awt.Color(0, 0, 30));

        lbl_player0Name.setBackground(new java.awt.Color(0, 0, 30));
        lbl_player0Name.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        lbl_player0Name.setForeground(new java.awt.Color(200, 200, 100));
        lbl_player0Name.setText("jLabel4");

        lbl_player1Name.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        lbl_player1Name.setForeground(new java.awt.Color(200, 200, 100));
        lbl_player1Name.setText("jLabel5");

        txt_player0Output.setBackground(new java.awt.Color(0, 0, 51));
        txt_player0Output.setColumns(20);
        txt_player0Output.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        txt_player0Output.setForeground(new java.awt.Color(200, 200, 100));
        txt_player0Output.setLineWrap(true);
        txt_player0Output.setRows(5);
        txt_player0Output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 100)));
        jScrollPane1.setViewportView(txt_player0Output);

        txt_player1Output.setBackground(new java.awt.Color(0, 0, 51));
        txt_player1Output.setColumns(20);
        txt_player1Output.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        txt_player1Output.setForeground(new java.awt.Color(200, 200, 100));
        txt_player1Output.setLineWrap(true);
        txt_player1Output.setRows(5);
        txt_player1Output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 100)));
        jScrollPane2.setViewportView(txt_player1Output);

        btn_rollDice.setBackground(new java.awt.Color(0, 0, 30));
        btn_rollDice.setForeground(new java.awt.Color(0, 0, 30));
        btn_rollDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diceprogram/dice.png"))); // NOI18N
        btn_rollDice.setBorder(null);
        btn_rollDice.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_rollDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rollDiceActionPerformed(evt);
            }
        });

        btn_restart.setBackground(new java.awt.Color(0, 0, 51));
        btn_restart.setForeground(new java.awt.Color(200, 200, 100));
        btn_restart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diceprogram/restart.png"))); // NOI18N
        btn_restart.setToolTipText("");
        btn_restart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 100)));
        btn_restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_gameLayout = new javax.swing.GroupLayout(pnl_game);
        pnl_game.setLayout(pnl_gameLayout);
        pnl_gameLayout.setHorizontalGroup(
            pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gameLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lbl_player0Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_player1Name)
                .addGap(100, 100, 100))
            .addGroup(pnl_gameLayout.createSequentialGroup()
                .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_gameLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_gameLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btn_rollDice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(btn_restart)))
                .addGap(14, 14, 14))
        );
        pnl_gameLayout.setVerticalGroup(
            pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gameLayout.createSequentialGroup()
                .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_gameLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_restart, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_gameLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_player0Name)
                            .addComponent(lbl_player1Name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_rollDice, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        getContentPane().add(pnl_game, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startGameActionPerformed
        pnl_welcome.setVisible(false);
        pnl_userData.setVisible(true);
    }//GEN-LAST:event_btn_startGameActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        thePlayers[0].setPlayerName(txt_player0Name.getText());
        thePlayers[1].setPlayerName(txt_player1Name.getText());
        
        lbl_player0Name.setText(thePlayers[0].getPlayerName());
        lbl_player1Name.setText(thePlayers[1].getPlayerName());
        
        pnl_userData.setVisible(false);
        pnl_game.setVisible(true);
    }//GEN-LAST:event_btn_startActionPerformed

    private void txt_player0NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_player0NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_player0NameActionPerformed

    private void btn_rollDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rollDiceActionPerformed
        txt_player0Output.append(thePlayers[0].getPlayerName() + " rolled a " + thePlayers[0].getPlayerDice(0).rollDice() + " and a " + thePlayers[0].getPlayerDice(1).rollDice() + "\n");
        txt_player1Output.append(thePlayers[1].getPlayerName() + " rolled a " + thePlayers[1].getPlayerDice(0).rollDice() + " and a " + thePlayers[1].getPlayerDice(1).rollDice() + "\n");
        
        if (thePlayers[0].getPlayerDice(0).getCurrentShownFace() == thePlayers[0].getPlayerDice(1).getCurrentShownFace()){
            thePlayers[0].setHasWon(true);
        } 
            
        if (thePlayers[1].getPlayerDice(0).getCurrentShownFace() == thePlayers[1].getPlayerDice(1).getCurrentShownFace()){
            thePlayers[1].setHasWon(true);
        }
        
        if (thePlayers[0].isHasWon() && thePlayers[1].isHasWon())
            JOptionPane.showMessageDialog(null, "It was a draw!" );
        else if (thePlayers[0].isHasWon()){
            JOptionPane.showMessageDialog(null, thePlayers[0].getPlayerName() + " has won!!" + "\n" + "To play again press the restart button." );
            btn_rollDice.setEnabled(false);
        }
        else if (thePlayers[1].isHasWon()){
            JOptionPane.showMessageDialog(null, thePlayers[1].getPlayerName() + " has won!!" + "\n" + "To play again press the restart button.");
            btn_rollDice.setEnabled(false);
        }
    }//GEN-LAST:event_btn_rollDiceActionPerformed

    private void btn_restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restartActionPerformed
        pnl_game.setVisible(false);
        pnl_welcome.setVisible(true);
    }//GEN-LAST:event_btn_restartActionPerformed

    private void btn_creditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creditsActionPerformed
        pnl_game.setVisible(false);
        pnl_credits.setVisible(true);
    }//GEN-LAST:event_btn_creditsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_credits;
    private javax.swing.JButton btn_restart;
    private javax.swing.JButton btn_rollDice;
    private javax.swing.JButton btn_start;
    private javax.swing.JButton btn_startGame;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbl_player0Name;
    private javax.swing.JLabel lbl_player1Name;
    private javax.swing.JPanel pnl_credits;
    private javax.swing.JPanel pnl_game;
    private javax.swing.JPanel pnl_userData;
    private javax.swing.JPanel pnl_welcome;
    private javax.swing.JTextField txt_player0Name;
    private javax.swing.JTextArea txt_player0Output;
    private javax.swing.JTextField txt_player1Name;
    private javax.swing.JTextArea txt_player1Output;
    // End of variables declaration//GEN-END:variables
}
