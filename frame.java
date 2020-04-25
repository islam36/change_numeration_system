
import java.util.Objects;
import javax.swing.JOptionPane;

public class frame extends javax.swing.JFrame {

    static public boolean isTrue(long x,long base)
   {
      long i=base;
      boolean check=true;
      
      while(i>=base && i<10)
      {
          if(String.valueOf(x).contains(String.valueOf(i)))
          {
              check =false;
              break;
          }
          else
              i++;
      }
      
      return check;
   }
    
    
    public String DECtoANY(long x,long base)
    {
          long a[]=new long [10000];
        int i=0;
        
        while(x>0)
        {
          a[i]=x%base;
          x/=base;
          i++;
        }
        
        i--;
        
        String s="";
        
        while(i>=0)
        {
            s+=String.valueOf(a[i]);
            i--;
        }
        
       return s;
      
    }
    
    public String ANYtoDEC(long x,long base)
    {
          long a[]=new long[String.valueOf(x).length()];
        int i=0;
        long result=0;
        
        while(x>0)
        {
            a[i]=x%10;
            i++;
            x/=10;
        }
        
        for(i=0;i<a.length;i++)
        {
            result+=a[i] * Math.pow(base,i);
        }
        
        return String.valueOf(result);
        
    }
    
    public frame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        getX = new javax.swing.JFormattedTextField();
        text1 = new javax.swing.JLabel();
        get_base_a = new javax.swing.JComboBox<>();
        text2 = new javax.swing.JLabel();
        get_base_b = new javax.swing.JComboBox<>();
        button = new javax.swing.JButton();
        result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("From counting system a to counting system b");
        setAlwaysOnTop(true);
        setResizable(false);

        getX.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getX.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        text1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text1.setText("From counting system based on:");

        get_base_a.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        get_base_a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        text2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text2.setText("To counting system based on:");

        get_base_b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        get_base_b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button.setText("OK");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        result.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(get_base_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text2)
                                .addGap(23, 23, 23)
                                .addComponent(get_base_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(getX)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(result)
                            .addComponent(button))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(getX, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1)
                    .addComponent(get_base_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(get_base_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text2))
                .addGap(27, 27, 27)
                .addComponent(result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
    Long x,base_a,base_b;
    
    if(getX.getText().isEmpty() || getX.getText().contains(".") || getX.getText().contains(","))
    {
     JOptionPane.showMessageDialog(rootPane, "Please enter a positive integer", "Error",0);
    }
    else
    {
        x=Long.parseLong(getX.getText());
        base_a=Long.parseLong((String) get_base_a.getSelectedItem());
        base_b=Long.parseLong((String) get_base_b.getSelectedItem());
        
        if(isTrue(x,base_a)==false)
        {
            JOptionPane.showMessageDialog(rootPane, "The number you have entered is not written\nin the correct counting system", "Error",0);
        }
        else if(x<0)
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter a positive integer", "Error",0);
        }
        else if(Objects.equals(base_a, base_b))
        {
            result.setText("Result = " + String.valueOf(x));
        }
        else if(base_a==10)
        {
            result.setText("Result = " + DECtoANY(x,base_b) );
        }
        else if(base_b==10)
        {
             result.setText("Result = " + ANYtoDEC(x,base_a) );
        }
        else
        {
            result.setText("Result = " + DECtoANY(Long.parseLong(ANYtoDEC(x,base_a) ), base_b) );
        }
       
    }
    
    }//GEN-LAST:event_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JFormattedTextField getX;
    private javax.swing.JComboBox<String> get_base_a;
    private javax.swing.JComboBox<String> get_base_b;
    private javax.swing.JLabel result;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    // End of variables declaration//GEN-END:variables
}
