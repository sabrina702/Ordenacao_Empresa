package ordenaçãoatividadeiii;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {
    ArrayList<Dados> lista = new ArrayList<>();
   // Definir os comparadores
    Comparator<Dados> comparaEmpresa = (Dados d1, Dados d2) -> d1.getEmpresa().compareTo(d2.getEmpresa());
    Comparator<Dados> comparaMercado = (Dados d1, Dados d2) -> d1.getMercado() .compareTo(d2.getMercado());
    Comparator<Dados> comparaLocalizacao = (Dados d1, Dados d2) -> d1.getLocalizacao() .compareTo(d2.getLocalizacao());
    
    public FormSistema() {
        initComponents();
        carregaArquivo();
        mostra();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JToggleButton();
        rbLinear = new javax.swing.JRadioButton();
        rbBinario = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 255, 255));
        lblProx.setText("Sistema de Informações de 100 empresas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(134, 134, 134)
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 59, Short.MAX_VALUE)
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordenaçãoatividadeiii/clipboard.png"))); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Classificação", "Empresa", "Mercado", "Receita", "Quant.Funcionarios", "Localização"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaDados);
        if (tabelaDados.getColumnModel().getColumnCount() > 0) {
            tabelaDados.getColumnModel().getColumn(0).setResizable(false);
            tabelaDados.getColumnModel().getColumn(1).setResizable(false);
            tabelaDados.getColumnModel().getColumn(2).setResizable(false);
            tabelaDados.getColumnModel().getColumn(3).setResizable(false);
            tabelaDados.getColumnModel().getColumn(4).setResizable(false);
            tabelaDados.getColumnModel().getColumn(5).setResizable(false);
        }

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empresas", "Mercado", "Localizacao", "Classificação" }));
        cbOrdena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenaActionPerformed(evt);
            }
        });

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordenaçãoatividadeiii/task.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbLinear);
        rbLinear.setText("Linear");
        rbLinear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLinearActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbBinario);
        rbBinario.setSelected(true);
        rbBinario.setText("Binária");
        rbBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBinarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOrdNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbOrdena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(rbLinear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbBinario)
                                .addGap(29, 29, 29)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbLinear)
                            .addComponent(rbBinario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBusca))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo(){
     String csvFile = "dados.csv";
        String line = "";
        String[] leitura = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Dados empresa = new Dados();
                leitura = line.split(",");
                empresa.setClassificacao(Integer.parseInt(leitura[0]));
                empresa.setEmpresa(leitura[1]);
                empresa.setMercado((leitura[2]));
                empresa.setReceita(leitura[3]);
                empresa.setFuncionario(leitura[4]);
                empresa.setLocalizacao(leitura[5]);
                lista.add(empresa); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //https://1bestcsharp.blogspot.com/2016/03/java-populate-jtable-from-arraylist.html
    void mostra(){
        tabelaDados.setModel(new DefaultTableModel(null,new String[]{"Classificação","Empresa","Mercado","Receita","Quantidade de funcionário","Localização"}));
       
        DefaultTableModel model = (DefaultTableModel)tabelaDados.getModel();
        Object rowData[] = new Object[6];// qtd colunas
        for(Dados d: lista)
        {
            rowData[0] = d.getClassificacao();
            rowData[1] = d.getEmpresa();
            rowData[2] = d.getMercado();
            rowData[3] = d.getReceita();
            rowData[4] = d.getFuncionario();
            rowData[5] = d.getLocalizacao();
            model.addRow(rowData);
        }
    }
   
    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
       switch(cbOrdena.getSelectedIndex()){
           case 0:lista.sort(comparaEmpresa);
           break;
           case 1:lista.sort(comparaMercado);
           break;
           case 2:lista.sort(comparaLocalizacao);
           break;
           case 3:Collections.sort(lista);
           break;
       }
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void rbLinearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLinearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLinearActionPerformed

    private void rbBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBinarioActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        Dados dadoBusca = new Dados();
        dadoBusca.setEmpresa(txtBusca.getText());
        int r = -1;
        if(rbLinear.isSelected()){
            r = lista.indexOf(dadoBusca);
        }else{
            if(rbBinario.isSelected()){
                r = Collections.binarySearch(lista, dadoBusca);
            }
        }
        if(r == -1){
            JOptionPane.showMessageDialog(null, "Não encontrado: "+r);
        }
        else{
            JOptionPane.showMessageDialog(null, "Encontrado: "+r);
        }
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void cbOrdenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdenaActionPerformed

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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBusca;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JRadioButton rbBinario;
    private javax.swing.JRadioButton rbLinear;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
