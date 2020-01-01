
package tictactoe;
import javax.swing.*;
import tictactoe.Board;
public class tiktaktoe extends javax.swing.JFrame {
   JButton[][] buttons = new JButton[3][3];;
  private static Board board;
  private int Player =1;
  
  
  protected void setButtonReference(){
  
      buttons[0][0] = jButton1;
      buttons[0][1] = jButton2;
      buttons[0][2] = jButton3;
      buttons[1][0] = jButton4;
      buttons[1][1] = jButton5;
      buttons[1][2] = jButton6;
      buttons[2][0] = jButton7;
      buttons[2][1] = jButton8;
      buttons[2][2] = jButton9;
  }
  public tiktaktoe(){
    initComponents();
  }
  public void setPlayer(int Value){
      Player = Value;
  
  }
  public void refreshBoardDisplay(){
      
      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
            switch(board.getBoardValue(i, j))
            {
                case 2:
                    buttons[i][j].setEnabled(true);
                    buttons[i][j].setText("");
                    break;
                case 3:
                    buttons[i][j].setEnabled(false);
                     buttons[i][j].setText("X");
                    break;
                case 5:
                    buttons[i][j].setEnabled(false);
                    buttons[i][j].setText("O");
                    break;
            
                
            
            }
         
         }
      }
      
  }  
             
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     if(Player == 1)
        {
        board.setBoardValue(2,0, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(1)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
                      setPlayer(1);

        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }
        }
        else
        { // Player Two
         board.setBoardValue(0,0, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(2)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
           this.setPlayer(1);
        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }   
        
            
            
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     if(Player == 1)
        {
        board.setBoardValue(2,2, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(1)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
                      setPlayer(1);

        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }
        }
        else
        { // Player Two
         board.setBoardValue(2,2, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(2)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
           this.setPlayer(1);
        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }   
        
            
            
        }
            Buttons22EventHandling();    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(Player == 1)
        {
        board.setBoardValue(0,0, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(1)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
                      setPlayer(1);

        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }
        }
        else
        { // Player Two
         board.setBoardValue(0,0, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(2)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
           this.setPlayer(1);
        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }   
        
            
            
        }
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     if(Player == 1)
        {
        board.setBoardValue(0,1, 3);
        refreshBoardDisplay();
        if(board.CheckWin(1)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
                      setPlayer(1);

        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }
        }
        else
        { // Player Two
         board.setBoardValue(0,1, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(2)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
           this.setPlayer(1);
        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }   
        
            
            
        }
        
            Buttons01EventHandling();    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   if(Player == 1)
        {
        board.setBoardValue(0,2, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(1)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
                      setPlayer(1);

        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }
        }
        else
        { // Player Two
         board.setBoardValue(0,2, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(2)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
           this.setPlayer(1);
        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }   
        
            
            
        }
        
        Buttons02EventHandling();    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   if(Player == 1)
        {
        board.setBoardValue(1,0, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(1)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
                      setPlayer(1);

        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }
        }
        else
        { // Player Two
         board.setBoardValue(1,0, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(2)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
           this.setPlayer(1);
        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }   
        
            
            
        }
        
           Buttons10EventHandling();    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   if(Player == 1)
        {
        board.setBoardValue(1,1, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(1)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
                      setPlayer(1);

        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }
        }
        else
        { // Player Two
         board.setBoardValue(1,1, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(2)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
           this.setPlayer(1);
        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }   
        
            
            
        }
        
        Buttons11EventHandling();    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     if(Player == 1)
        {
        board.setBoardValue(1,2, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(1)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
                      setPlayer(1);

        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }
        }
        else
        { // Player Two
         board.setBoardValue(1,2, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(2)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
           this.setPlayer(1);
        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }   
        
            
            
        }   Buttons12EventHandling();    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    if(Player == 1)
        {
        board.setBoardValue(2,1, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(1)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
                      setPlayer(1);

        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }
        }
        else
        { // Player Two
         board.setBoardValue(2,1, 3);
        this.refreshBoardDisplay();
        if(board.CheckWin(2)){
           JOptionPane.showMessageDialog(this,"Congrats!!, You Win");
           board.InitializeBoard();
           refreshBoardDisplay();
           setPlayer(1);
        }
        else if(board.isBoardFilled())
        {
           JOptionPane.showMessageDialog(this, "Game Draw");
           board.InitializeBoard();
           refreshBoardDisplay();
           this.setPlayer(1);
        }
        else
        {
        setPlayer(3-Player);
            PlayComputer();
        }   
        
            
            
        }
           Buttons21EventHandling();    }//GEN-LAST:event_jButton8ActionPerformed
    public void PlayComputer(){
        int buttonNumber;
       //1: buttonNumber == possiblewin(player)
        // if(buttonNumber!=0) play move
        buttonNumber = board.possibleWin(Player);
        //2:buttonNumber!=0
          // if(buttonNumber!=0) play move
         if(buttonNumber == 0)
         {
             buttonNumber = board.possibleWin(3-Player);
         }
        //3: buttonNumber = randomBlankButton()
         if(buttonNumber == 0)
         {
            buttonNumber = board.randomBlankButton();
         }
          // playmove
         if(buttonNumber!=0)
         {
           switch(buttonNumber)
           { 
               case 1 :
                   board.setBoardValue(0,0, Player);
                   this.refreshBoardDisplay();
                   break;
               case 2 :
                   board.setBoardValue(0,1, Player);
                   this.refreshBoardDisplay();
                   break;
                case 3 :
                   board.setBoardValue(0,2, Player);
                   this.refreshBoardDisplay();
                   break;
                case 4 :
                   board.setBoardValue(1,0, Player);
                   this.refreshBoardDisplay();
                   break;
                case 5 :
                   board.setBoardValue(1,1, Player);
                   this.refreshBoardDisplay();
                   break;
               case 6 :
                   board.setBoardValue(1,2, Player);
                   this.refreshBoardDisplay();
                   break;
                case 7 :
                   board.setBoardValue(2,0, Player);
                   this.refreshBoardDisplay();
                   break;
                case 8 :
                   board.setBoardValue(2,1, Player);
                   this.refreshBoardDisplay();
                   break;
                case 9 :
                   board.setBoardValue(2,2, Player);
                   this.refreshBoardDisplay();
                   break;
           
           
           }
           if(board.CheckWin(Player))
           {
           JOptionPane.showMessageDialog(this,"Computer Win !! ");
           board.InitializeBoard();
           this.refreshBoardDisplay();
           this.setPlayer(1);
           
           }
           else if(board.isBoardFilled())
           {
           JOptionPane.showMessageDialog(this,"Game Draw");
           board.InitializeBoard();
           this.refreshBoardDisplay();
           this.setPlayer(1);
           }
           else
           {
           this.setPlayer(3-Player);
           }
         
         }
    
    }
    
    
    public static void main(String args[]) {
       
                      java.awt.EventQueue.invokeLater(new Runnable() {

                          @Override
                          public void run() {
                          
                          new tiktaktoe().setVisible(true);
                          board = new Board();
                          tiktaktoe game = new tiktaktoe();
                          game.setButtonReference();
                          board.InitializeBoard();
                          game.setPlayer(1);
                          game.refreshBoardDisplay();

                          
                          }
                      } );
                         
                    
           
            
        
        
          
          
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables

    private void Buttons22EventHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Buttons01EventHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Buttons02EventHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Buttons10EventHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Buttons11EventHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Buttons12EventHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Buttons21EventHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

