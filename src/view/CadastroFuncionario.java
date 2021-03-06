package view;

import data.Funcionario;
import data.FuncionarioDao;
import javax.swing.JOptionPane;

public class CadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFuncionario
     */
    public CadastroFuncionario() {
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

        lblMat = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblSal = new javax.swing.JLabel();
        btnSalva = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();
        txtMat = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtSal = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnAltera = new javax.swing.JButton();
        btnDeleta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD Funcionários");

        lblMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMat.setText("Matrícula");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("Nome");

        lblCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCargo.setText("Cargo");

        lblSal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSal.setText("Salário");

        btnSalva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalva.setText("Salvar");
        btnSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaActionPerformed(evt);
            }
        });

        btnCancela.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancela.setText("Cancelar");
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });

        txtMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnAltera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAltera.setText("Alterar");
        btnAltera.setEnabled(false);
        btnAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteraActionPerformed(evt);
            }
        });

        btnDeleta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeleta.setText("Deletar");
        btnDeleta.setEnabled(false);
        btnDeleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalva)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblMat)
                                    .addGap(45, 45, 45)
                                    .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(89, 89, 89))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSal)
                                    .addGap(59, 59, 59)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnConsulta)
                                            .addGap(28, 28, 28)
                                            .addComponent(btnAltera))))))
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleta)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancela))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCargo)
                        .addGap(61, 61, 61)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(62, 62, 62)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMat)
                    .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSal)
                    .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalva)
                    .addComponent(btnCancela)
                    .addComponent(btnConsulta)
                    .addComponent(btnAltera)
                    .addComponent(btnDeleta))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaActionPerformed
        //instanciando classe funcionario
        Funcionario funcionario;
        FuncionarioDao dao;
        boolean status;
        int resp;

        funcionario = new Funcionario();
        funcionario.setMatricula(txtMat.getText());
        funcionario.setNome(txtNome.getText());
        funcionario.setCargo(txtCargo.getText());
        funcionario.setSalario(Double.parseDouble(txtSal.getText()));

        dao = new FuncionarioDao();
        status = dao.conectar();
        if (status == false) {
            JOptionPane.showMessageDialog(rootPane, "Erro na conexão do banco de dados!!!");
        } else {
            resp = dao.salvar(funcionario);
            if (resp == 1) {
                JOptionPane.showMessageDialog(rootPane, "Dados incluídos com sucesso!!!");
                btnCancelaActionPerformed(evt);
            } else if (resp == 1062) {
                JOptionPane.showMessageDialog(rootPane, "Essa matrícula já foi cadastrada!!!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error: " + resp + " ao tentar incluir dados!!!");
            }
            dao.desconectar();
        }

    }//GEN-LAST:event_btnSalvaActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        //Botão para limpar campos
        txtMat.setText("");
        txtNome.setText("");
        txtCargo.setText("");
        txtSal.setText("");
        txtMat.requestFocus();
    }//GEN-LAST:event_btnCancelaActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        String matricula;
        matricula = txtMat.getText();

        FuncionarioDao dao = new FuncionarioDao();
        boolean status = dao.conectar();

        if (status == true) {
            Funcionario funcionario = dao.consultar(matricula);
            if (funcionario == null) {
                JOptionPane.showMessageDialog(rootPane, "Funcionário não localizado");
            } else {
                txtNome.setText(funcionario.getNome());
                txtCargo.setText(funcionario.getCargo());
                txtSal.setText(String.valueOf(funcionario.getSalario()));
                btnDeleta.setEnabled(true);
                btnAltera.setEnabled(true);
            }
            dao.desconectar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao conectar com banco de dados!!!");
        }
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteraActionPerformed
        Funcionario funcionario;
        FuncionarioDao dao;
        boolean status;
        
        funcionario = new Funcionario();
        funcionario.setMatricula(txtMat.getText());
        funcionario.setNome(txtNome.getText());
        funcionario.setCargo(txtCargo.getText());
        funcionario.setSalario(Double.parseDouble(txtSal.getText()));
        
        
        dao = new FuncionarioDao();
        status = dao.conectar();
        if (status == false) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao conectar banco de dados");
        } else {
            status = dao.alterar(funcionario);
            if (status == true) {
                JOptionPane.showMessageDialog(rootPane, "Dados alterados com sucesso!!!");
                btnCancelaActionPerformed(evt);
                btnAltera.setEnabled(false);
                btnDeleta.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao tentar alterar dados");
            }
            dao.desconectar();
        }
    }//GEN-LAST:event_btnAlteraActionPerformed

    private void btnDeletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletaActionPerformed
        FuncionarioDao dao = new FuncionarioDao();
        boolean status = dao.conectar();

        if (status == false) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao conectar banco de dados");
        } else {
            status = dao.deletar(txtMat.getText());
            if (status == true) {
                JOptionPane.showMessageDialog(rootPane, "Funcionário excluido com sucesso!!!");
                btnCancelaActionPerformed(evt);
                btnDeleta.setEnabled(false);
                btnAltera.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao tentar excluir funcionário");
            }
            dao.desconectar();
        }
    }//GEN-LAST:event_btnDeletaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltera;
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnDeleta;
    private javax.swing.JButton btnSalva;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblMat;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSal;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtMat;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSal;
    // End of variables declaration//GEN-END:variables
}
