
package classes;

import java.text.DecimalFormat;

public class Tela1_notas extends javax.swing.JFrame {

    // variáveis de instância ou atributos da classe
    double total=0, mediaf=0,maior=0,menor=0;
    int t=0, i=0, ta=0, tr=0;
    
    // formatar as casas decimais       
    DecimalFormat casas = new DecimalFormat("0.00"); 
    
    /** Creates new form Tela1 */
    public Tela1_notas() {
        initComponents();
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldN1 = new javax.swing.JTextField();
        fieldN2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buttonCalcular = new javax.swing.JButton();
        buttonNovo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fieldMedia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fieldSit = new javax.swing.JTextField();
        fieldN3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fieldFreq = new javax.swing.JTextField();
        buttonSair = new javax.swing.JButton();
        fieldDisc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldCurso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fieldMediaTurma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldTA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldTR = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fieldMaior = new javax.swing.JTextField();
        fieldMenor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DADOS DO ALUNO"));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(16, 31, 45, 22);
        jPanel1.add(fieldNome);
        fieldNome.setBounds(65, 32, 370, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Notas");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 70, 50, 20);
        jPanel1.add(fieldN1);
        fieldN1.setBounds(70, 70, 70, 30);
        jPanel1.add(fieldN2);
        fieldN2.setBounds(150, 70, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Disciplina");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 150, 80, 20);

        buttonCalcular.setText("CALCULAR");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCalcular);
        buttonCalcular.setBounds(70, 240, 100, 23);

        buttonNovo.setText("NOVO");
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonNovo);
        buttonNovo.setBounds(190, 240, 90, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("MÉDIA");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 180, 60, 40);

        fieldMedia.setEditable(false);
        fieldMedia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(fieldMedia);
        fieldMedia.setBounds(90, 190, 80, 30);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(260, 80, 0, 0);

        jLabel9.setText("SITUAÇÃO");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(200, 190, 90, 20);

        fieldSit.setEditable(false);
        fieldSit.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jPanel1.add(fieldSit);
        fieldSit.setBounds(260, 190, 220, 30);
        jPanel1.add(fieldN3);
        fieldN3.setBounds(240, 70, 70, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Frequencia");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 110, 80, 20);
        jPanel1.add(fieldFreq);
        fieldFreq.setBounds(100, 110, 70, 30);

        buttonSair.setText("SAIR");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSair);
        buttonSair.setBounds(310, 240, 57, 23);
        jPanel1.add(fieldDisc);
        fieldDisc.setBounds(90, 150, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Curso");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(270, 150, 36, 17);
        jPanel1.add(fieldCurso);
        fieldCurso.setBounds(320, 142, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 490, 280);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "RESULTADOS"));

        jLabel4.setText("MÉDIA DA TURMA");

        fieldMediaTurma.setEditable(false);

        jLabel5.setText("TOTAL APROVADOS");

        fieldTA.setEditable(false);

        jLabel7.setText("TOTAL REPROVADOS");

        fieldTR.setEditable(false);

        jLabel12.setText("MAIOR MÉDIA");

        jLabel13.setText("MENOR MÉDIA");

        fieldMaior.setEditable(false);

        fieldMenor.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldTA, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldMediaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldMaior, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(fieldMenor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fieldTR, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldMaior, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldMediaTurma, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 300, 490, 150);

        setSize(new java.awt.Dimension(546, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed

    String nome, curso, disc;   
    double n1,n2,n3,freq,media;
            
        nome = fieldNome.getText();
        n1 = Double.parseDouble(fieldN1.getText());
        n2 = Double.parseDouble(fieldN2.getText());
        n3 = Double.parseDouble(fieldN3.getText());
        freq = Double.parseDouble(fieldFreq.getText());
        disc = fieldDisc.getText();
        curso = fieldCurso.getText();
        
        media = (n1+n2+n3)/3;
        fieldMedia.setText(casas.format(media));
        
          
        if (media>=6 && freq >=40){
            fieldSit.setText("aprovado na disciplina "+disc);
            ta = ta+1; // contador dos aprovados
           
        }
        else{
            fieldSit.setText("reprovado na disciplina "+disc);
            tr = tr+1;  // contador dos reprovados
            
        }
        
       
        // cálculo da média da turma...........................................
        
        total = total + media; // acumulador - somando as medias dos alunos
        t = t+1; // contando a qtde de alunos
        
        
      // calculo da media da turma.............................................
      mediaf = total/t;
      fieldMediaTurma.setText(casas.format(mediaf));  
      
      // maior e menor média
      
      if (t==1){
          maior = media;
          menor = media;
      }
      else{
          if (media > maior)
              maior = media;
          if (media < menor)
              menor = media;
      }
      
     
      // resultados
      
      fieldTA.setText(String.valueOf(ta));
      fieldTR.setText(String.valueOf(tr));
      fieldMaior.setText(casas.format(maior));
      fieldMenor.setText(casas.format(menor));
      
     
      
      if(t>=3){  // parar o programa 
          fieldNome.setEditable(false);
          fieldN1.setEditable(false);
          fieldN2.setEditable(false);
          fieldN3.setEditable(false);
          fieldFreq.setEditable(false);
          fieldMedia.setEditable(false);
          fieldDisc.setEditable(false);
          fieldCurso.setEditable(false);
          buttonCalcular.setEnabled(false);
      }

    
    
}//GEN-LAST:event_buttonCalcularActionPerformed

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
        
        // chamando o método limpar_tudo()
        limpar_tudo();  // método criado por mim para limpar os campos de texto

    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_buttonSairActionPerformed

     public void limpar_tudo(){  // método void - método sem retorno
         
        fieldNome.setText(null);
        fieldN1.setText(null);
        fieldN2.setText(null);
        fieldFreq.setText(null);
        fieldMedia.setText(null);
        fieldSit.setText(null);
        fieldN3.setText(null);
        fieldDisc.setText(null);
        fieldCurso.setText(null);
     
    }

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
            java.util.logging.Logger.getLogger(Tela1_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tela1_notas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonSair;
    private javax.swing.JTextField fieldCurso;
    private javax.swing.JTextField fieldDisc;
    private javax.swing.JTextField fieldFreq;
    private javax.swing.JTextField fieldMaior;
    private javax.swing.JTextField fieldMedia;
    private javax.swing.JTextField fieldMediaTurma;
    private javax.swing.JTextField fieldMenor;
    private javax.swing.JTextField fieldN1;
    private javax.swing.JTextField fieldN2;
    private javax.swing.JTextField fieldN3;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldSit;
    private javax.swing.JTextField fieldTA;
    private javax.swing.JTextField fieldTR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
