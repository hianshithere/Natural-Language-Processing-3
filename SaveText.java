package gui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveText extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String text="";
    
    public SaveText() {
    	int an=657583,dp=6877,ar=6568,at=6582,ka=7571;
        initComponents();
        
       
    }
    	

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
        
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        fc = new javax.swing.JFileChooser();

        jFileChooser1.setAccessory(jButton1);
        jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Output");
        setName("Output"); // NOI18N
        
        jTextArea1.setText(text);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fc.setCursor(new java.awt.Cursor(java.awt.Cursor.W_RESIZE_CURSOR));
        //int an=657583,dp=6877,ar=0,at=0,ka=0;
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int i = fc.showDialog(null, "Choose");

        fc.setCurrentDirectory(new java.io.File(""));
        fc.setAcceptAllFileFilterUsed(false);
        fc.getCurrentDirectory();
        String savepath = fc.getCurrentDirectory().toString();
        String filename =fc.getSelectedFile().getName();
       
        
        try (PrintStream out = new PrintStream(new FileOutputStream(savepath+"\\"+filename))) {
            out.print(text);
            System.out.println(text);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveText.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

   //main ko cut kia yaha se
    public static void main(String[]args)throws IOException
    {
    	 PatternMatching pm = new PatternMatching();
         pm.PatternMatch();
         
        text=pm.output;
         
    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new SaveText().setVisible(true);
         });
        
      int an=657583,dp=6877,ar=6568,at=6582,ka=7571;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fc;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    
    
   
}
