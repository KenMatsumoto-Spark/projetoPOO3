/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoHospede;
import fatec.poo.model.Hospede;
import javax.swing.JOptionPane;

/**
 *
 * @author DiogoGuilhermeMarcioVictor
 */
public class GuiHospede extends javax.swing.JFrame {

    /**
     * Creates new form GuiCadastroHospede
     */
    public GuiHospede() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtTaxaDesconto = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Hóspede");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        jLabel5.setText("Taxa de desconto (%)");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtTelefone.setEnabled(false);

        txtTaxaDesconto.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaxaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(txtNome)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTaxaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("BD2021001","BD2021001");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoHospede = new DaoHospede(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        hospede = null;
       
        if(!Hospede.validarCPF(txtCpf.getText())) {
            JOptionPane.showMessageDialog(null, "CPF inválido.");
            txtCpf.requestFocus();
            return;
        }
       
       hospede = daoHospede.consultar(txtCpf.getText());
       
       if (hospede == null){
           txtCpf.setEnabled(false);
           txtNome.setEnabled(true);
           txtNome.requestFocus();

           txtEndereco.setEnabled(true);           
           txtTaxaDesconto.setEnabled(true);
           txtTelefone.setEnabled(true);   
           
           btnConsultar.setEnabled(false);
           btnInserir.setEnabled(true);
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
       }
       else{
          txtNome.setText(hospede.getNome());
          txtEndereco.setText(hospede.getEndereco());
          txtTaxaDesconto.setText(Double.toString(hospede.getTaxaDesconto()));
          txtTelefone.setText(hospede.getTelefone());
          
          txtCpf.setEnabled(false); 
          txtNome.setEnabled(true);
          txtEndereco.setEnabled(true);           
          txtTaxaDesconto.setEnabled(true);
          txtTelefone.setEnabled(true);  
          txtNome.requestFocus();
          
          btnConsultar.setEnabled(false);
          btnInserir.setEnabled(false);
          btnAlterar.setEnabled(true);
          btnExcluir.setEnabled(true);
       }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        hospede = new Hospede(txtCpf.getText(),txtNome.getText());
        hospede.setEndereco(txtEndereco.getText());
        hospede.setTelefone(txtTelefone.getText());
        hospede.setTaxaDesconto(Double.parseDouble(txtTaxaDesconto.getText()));
        daoHospede.inserir(hospede);
         
        txtCpf.setText("");
        txtNome.setText("");      
        txtEndereco.setText("");   
        txtTelefone.setText("");   
        txtTaxaDesconto.setText("");   
        btnInserir.setEnabled(false);
        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTaxaDesconto.setEnabled(false);
        txtCpf.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){
           hospede.setNome(txtNome.getText());
           hospede.setEndereco(txtEndereco.getText());
           hospede.setTelefone(txtTelefone.getText());
           hospede.setTaxaDesconto(Double.parseDouble(txtTaxaDesconto.getText()));
           daoHospede.alterar(hospede);
        }         
        txtCpf.setText("");
        txtNome.setText("");      
        txtEndereco.setText("");   
        txtTelefone.setText("");   
        txtTaxaDesconto.setText("");   
        btnInserir.setEnabled(false);
        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTaxaDesconto.setEnabled(false);
        txtCpf.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);    
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daoHospede.excluir(hospede); 
            
            txtCpf.setText("");
            txtNome.setText("");      
            txtEndereco.setText("");   
            txtTelefone.setText("");   
            txtTaxaDesconto.setText("");   
            btnInserir.setEnabled(false);
            txtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtTaxaDesconto.setEnabled(false);
            txtCpf.requestFocus();

            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);  
        }  
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTaxaDesconto;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private DaoHospede daoHospede=null;
    private Hospede hospede=null;
    private Conexao conexao=null;
}
