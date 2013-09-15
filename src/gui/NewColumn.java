/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.DefaultComboBoxModel;
import logic.draw.*;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class NewColumn extends javax.swing.JDialog
{

    private DefaultComboBoxModel<DBConstraint> jl_model;
    private DBColumn db_colunm;
    private boolean ok;

    /**
     * Creates new form NewColumn
     */
    public NewColumn(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        this.setTitle("New Column");
        initComponents();
        popuni_tabele();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jtf_ime_kolone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcb_tip_kolone = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_N = new javax.swing.JTextField();
        jtf_M = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcb_ogranicenja = new javax.swing.JComboBox();
        jb_add_ogranicenje = new javax.swing.JButton();
        j_obrisi_ogranicenje = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_ogranicenja = new javax.swing.JList();
        jb_cancel = new javax.swing.JButton();
        jb_create = new javax.swing.JButton();
        jl_error_msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ime:");

        jLabel2.setText("Tip:");

        jcb_tip_kolone.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jcb_tip_koloneActionPerformed(evt);
            }
        });

        jLabel3.setText("N:");

        jLabel4.setText("M:");

        jtf_N.setEnabled(false);

        jtf_M.setEnabled(false);

        jLabel5.setText("Ogranicenja:");

        jb_add_ogranicenje.setText("+");
        jb_add_ogranicenje.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jb_add_ogranicenjeActionPerformed(evt);
            }
        });

        j_obrisi_ogranicenje.setText("-");
        j_obrisi_ogranicenje.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                j_obrisi_ogranicenjeActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jl_ogranicenja);

        jb_cancel.setText("cancel");
        jb_cancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jb_cancelActionPerformed(evt);
            }
        });

        jb_create.setText("create");
        jb_create.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jb_createActionPerformed(evt);
            }
        });

        jl_error_msg.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_tip_kolone, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_ime_kolone)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_N)
                            .addComponent(jtf_M)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jcb_ogranicenja, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_add_ogranicenje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j_obrisi_ogranicenje))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jl_error_msg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_create)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_cancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_ime_kolone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcb_tip_kolone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_N, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_ogranicenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_add_ogranicenje)
                    .addComponent(j_obrisi_ogranicenje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancel)
                    .addComponent(jb_create)
                    .addComponent(jl_error_msg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_tip_koloneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jcb_tip_koloneActionPerformed
    {//GEN-HEADEREND:event_jcb_tip_koloneActionPerformed
        DBTypes val = (DBTypes) jcb_tip_kolone.getSelectedItem();
        int num_arg = val.num_of_arguments();
        if (num_arg == 0)
        {
            jtf_M.setEnabled(false);
            jtf_M.setText("");
            jtf_N.setEnabled(false);
            jtf_N.setText("");
        } else if (num_arg == 1)
        {
            jtf_M.setEnabled(true);
            jtf_M.setText("");
            jtf_N.setEnabled(false);
            jtf_N.setText("");
        } else if (num_arg == 2)
        {
            jtf_M.setEnabled(true);
            jtf_M.setText("");
            jtf_N.setEnabled(true);
            jtf_N.setText("");
        }
    }//GEN-LAST:event_jcb_tip_koloneActionPerformed

    private void jb_add_ogranicenjeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jb_add_ogranicenjeActionPerformed
    {//GEN-HEADEREND:event_jb_add_ogranicenjeActionPerformed
        DBConstraint val = (DBConstraint) jcb_ogranicenja.getSelectedItem();

        jl_model.addElement(val);
    }//GEN-LAST:event_jb_add_ogranicenjeActionPerformed

    private void j_obrisi_ogranicenjeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_j_obrisi_ogranicenjeActionPerformed
    {//GEN-HEADEREND:event_j_obrisi_ogranicenjeActionPerformed
        jl_model.removeElement(jl_ogranicenja.getSelectedValue());
    }//GEN-LAST:event_j_obrisi_ogranicenjeActionPerformed

    private void jb_cancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jb_cancelActionPerformed
    {//GEN-HEADEREND:event_jb_cancelActionPerformed
        this.setVisible(false);
        ok = false;
    }//GEN-LAST:event_jb_cancelActionPerformed

    private int chack_form()
    {

        String ime_kolone = jtf_ime_kolone.getText();
        int val_m=-1;
        int val_n=-1;
        int errors = 0;

        if (ime_kolone == null || (ime_kolone != null && ime_kolone.length() == 0))
        {
            errors++;
        }

        DBTypes type = (DBTypes) jcb_tip_kolone.getSelectedItem();
        int num_arg = type.num_of_arguments();
        if (num_arg == 0)
        {
            //no elements
        } else if (num_arg == 1)
        {
            String m = jtf_M.getText();
            if (m == null || (m != null && m.length() == 0))
            {
                errors++;
            } else
            {
                try
                {
                  val_m = Integer.parseInt(m);                    
                } catch (Exception e)
                {
                    errors++;
                }
            }
        } else if (num_arg == 2)
        {
            String m = jtf_M.getText();
            String n = jtf_N.getText();

            if (m == null || (m != null && m.length() == 0))
            {
                errors++;
            } else
            {
                try
                {
                    val_m = Integer.parseInt(m);
                } catch (Exception e)
                {
                    errors++;
                }
            }

            if (n == null || (n != null && n.length() == 0))
            {
                errors++;
            } else
            {
                try
                {
                    val_n = Integer.parseInt(n);
                } catch (Exception e)
                {
                    errors++;
                }
            }
        }

        if (errors == 0)
        {
            db_colunm = new DBColumn(ime_kolone);
            db_colunm.setType(type);
            db_colunm.setM(val_m);
            db_colunm.setN(val_n);
            int size_dec = jl_model.getSize();
            for (int i = 0; i < size_dec; i++)
            {
                DBConstraint dbc = jl_model.getElementAt(i);
                db_colunm.setDecoration(dbc);
            }
        }

        return errors;
    }
    private void jb_createActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jb_createActionPerformed
    {//GEN-HEADEREND:event_jb_createActionPerformed
        int br_err = chack_form();
        if (br_err != 0)
        {
            jl_error_msg.setText("Greska " + br_err);
        } else
        {
            jl_error_msg.setText("");
            ok = true;
            setVisible(false);
        }
    }//GEN-LAST:event_jb_createActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(NewColumn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(NewColumn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(NewColumn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(NewColumn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                NewColumn dialog = new NewColumn(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton j_obrisi_ogranicenje;
    private javax.swing.JButton jb_add_ogranicenje;
    private javax.swing.JButton jb_cancel;
    private javax.swing.JButton jb_create;
    private javax.swing.JComboBox jcb_ogranicenja;
    private javax.swing.JComboBox jcb_tip_kolone;
    private javax.swing.JLabel jl_error_msg;
    private javax.swing.JList jl_ogranicenja;
    private javax.swing.JTextField jtf_M;
    private javax.swing.JTextField jtf_N;
    private javax.swing.JTextField jtf_ime_kolone;
    // End of variables declaration//GEN-END:variables

    private void popuni_tabele()
    {
        jcb_tip_kolone.setModel(new DefaultComboBoxModel<>(DBTypes.values()));
        jcb_ogranicenja.setModel(new DefaultComboBoxModel<>(DBConstraint.values()));

        jl_model = new DefaultComboBoxModel<DBConstraint>();
        jl_ogranicenja.setModel(jl_model);

    }

    boolean isOk()
    {
        return ok;
    }

    DBColumn getColumn()
    {
        return db_colunm;
    }
}
