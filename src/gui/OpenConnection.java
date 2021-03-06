/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import logic.connection.mysql.MySqlConnection;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class OpenConnection extends javax.swing.JDialog
{

    /**
     * Creates new form OpenConnection
     */
    public OpenConnection()
    {
        initComponents();
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

        jl_url = new javax.swing.JLabel();
        jtf_url = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtf_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jpf_password = new javax.swing.JPasswordField();
        jb_connect = new javax.swing.JButton();
        jb_cancel = new javax.swing.JButton();
        jl_message = new javax.swing.JLabel();

        setTitle("Connection");
        setMaximumSize(new java.awt.Dimension(400, 180));
        setMinimumSize(new java.awt.Dimension(400, 180));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(400, 180));
        setResizable(false);

        jl_url.setText("URL:");

        jLabel1.setText("USER NAME:");

        jLabel2.setText("PASSWORD");

        jb_connect.setText("connect");
        jb_connect.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jb_connectActionPerformed(evt);
            }
        });

        jb_cancel.setText("cancel");
        jb_cancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jb_cancelActionPerformed(evt);
            }
        });

        jl_message.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_url)
                        .addGap(10, 10, 10)
                        .addComponent(jtf_url))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_username)
                            .addComponent(jpf_password)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_message)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addComponent(jb_connect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_cancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_url)
                    .addComponent(jtf_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_connect)
                    .addComponent(jb_cancel)
                    .addComponent(jl_message))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_connectActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jb_connectActionPerformed
    {//GEN-HEADEREND:event_jb_connectActionPerformed
        mysql_connection = new MySqlConnection(jtf_username.getText(),jpf_password.getText(),jtf_url.getText());
        if(mysql_connection.connect())
        {
            this.jl_message.setText("");
            jtf_username.setText("");
            jpf_password.setText("");
            jtf_url.setText("");
            connected = true;
            this.setVisible(false);
        }
        else
        {
            connected = false;
            jpf_password.setText("");
            this.jl_message.setText("Greska!!!");
        }
    }//GEN-LAST:event_jb_connectActionPerformed

    private void jb_cancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jb_cancelActionPerformed
    {//GEN-HEADEREND:event_jb_cancelActionPerformed
        connected = false;
        jpf_password.setText("");
        this.jl_message.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_jb_cancelActionPerformed

    private MySqlConnection mysql_connection;
    private boolean connected;
    public boolean isconnect()
    {
        return connected;
    }
    public MySqlConnection getMysql_connection()
    {
        return mysql_connection;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jb_cancel;
    private javax.swing.JButton jb_connect;
    private javax.swing.JLabel jl_message;
    private javax.swing.JLabel jl_url;
    private javax.swing.JPasswordField jpf_password;
    private javax.swing.JTextField jtf_url;
    private javax.swing.JTextField jtf_username;
    // End of variables declaration//GEN-END:variables
}
