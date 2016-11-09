/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd_patcher;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author supmac
 */
public class tela extends javax.swing.JFrame {

    String diretorio = null;
    String language = null;
    String disco = null;
    String versao = null;
    language_pt_br traducao_pt = new language_pt_br();

    public tela() {
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

        jLabel2 = new javax.swing.JLabel();
        install_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        combobox_diretorio = new javax.swing.JComboBox<>();
        combobox_language = new javax.swing.JComboBox<>();
        download_progress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(846, 280));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bd_patcher/Img/BI_BlackDeserts_ENG.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 250, 70);

        install_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bd_patcher/Img/downloadbutton2.png"))); // NOI18N
        install_button.setBorderPainted(false);
        install_button.setContentAreaFilled(false);
        install_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                install_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(install_button);
        install_button.setBounds(330, 150, 210, 40);

        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Copyright | Desenvolvido por: William Mendes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 220, 260, 14);

        combobox_diretorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diretorio", "A:", "B:", "C:", "D:", "E:", "F:", "G:", "Manual" }));
        combobox_diretorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_diretorioActionPerformed(evt);
            }
        });
        getContentPane().add(combobox_diretorio);
        combobox_diretorio.setBounds(440, 110, 110, 20);

        combobox_language.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Linguagem", "PT_BR", "ENG_US" }));
        combobox_language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_languageActionPerformed(evt);
            }
        });
        getContentPane().add(combobox_language);
        combobox_language.setBounds(320, 110, 110, 20);
        getContentPane().add(download_progress);
        download_progress.setBounds(330, 210, 210, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 210, 50, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bd_patcher/Img/bd_wp.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 850, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void install_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_install_buttonActionPerformed
        if (versao == null) {
            JOptionPane.showMessageDialog(null, "Voce não selecionou a versão do jogo, Favor escolha Russo ou koreano.");
        } else {
            if (disco == null) {

                JOptionPane.showMessageDialog(null, "Selecione o diretorio do jogo.");
            } else {
                File file = new File(diretorio);

                if (versao == "RUSSO") {
                    if (file.isDirectory()) {
                        for (int j = 0; j < size; j++) {
                            try {
                                String url2 = "http://mmobrazil.com/patcher_files/" + russo.get(j);
                                URL url = new URL(url2);
                                String path = pt_br.get(j) + " Baixando...";
                                download_progress.setText(path);
                                download_progress.paintAll(download_progress.getGraphics());
                                URLConnection conn = url.openConnection();
                                InputStream in = conn.getInputStream();
                                FileOutputStream out = new FileOutputStream(diretorio + russo.get(j));
                                byte[] b = new byte[1024];
                                int count;
                                while ((count = in.read(b)) >= 0) {
                                    out.write(b, 0, count);
                                }
                                out.flush();
                                out.close();
                                in.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                        JOptionPane.showMessageDialog(null, "Tradução Completa! Bom jogo :) ");
                        System.exit(0);
                    } else {

                        JOptionPane.showMessageDialog(null, "Não existe jogo neste Diretorio.");

                    }

                } else {
                    if (file.isDirectory()) {

                        for (int k = 0; k < sizekor; k++) {
                            try {
                                String url2 = "http://mmobrazil.com/patcher_files/" + koreano.get(k);
                                URL url = new URL(url2);
                                String path = koreano.get(k) + " Baixando...";
                                download_tag.setText(path);
                                download_tag.paintAll(download_tag.getGraphics());
                                URLConnection conn = url.openConnection();
                                InputStream in = conn.getInputStream();
                                FileOutputStream out = new FileOutputStream(diretorio + koreano.get(k));
                                byte[] b = new byte[1024];
                                int count;
                                while ((count = in.read(b)) >= 0) {
                                    out.write(b, 0, count);
                                }
                                out.flush();
                                out.close();
                                in.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                        JOptionPane.showMessageDialog(null, "Tradução Completa! Bom jogo :) ");
                        System.exit(0);
                    } else {

                        JOptionPane.showMessageDialog(null, "Não existe jogo neste Diretorio.");

                    }
                }
            }
        }
    }//GEN-LAST:event_install_buttonActionPerformed

    private void combobox_diretorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_diretorioActionPerformed

        if (versao != null) {
            disco = (String) combobox_diretorio.getSelectedItem();

            if (versao == "PT_BR") {
                if (disco == "Manual") {
                    JOptionPane.showMessageDialog(null, "Vá até a pasta /Games/BlackDesert/live/");
                    String caminho = null;
                    JFileChooser fc = new JFileChooser();

                    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    int res = fc.showOpenDialog(null);
                    if (res == JFileChooser.APPROVE_OPTION) {
                        File diretorio = fc.getSelectedFile();
                        JOptionPane.showMessageDialog(null, "Voce Selecionou o diretorio " + diretorio + " como instação do jogo.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum diretorio");
                    }
                    caminho = fc.getSelectedFile().getAbsolutePath();
                    diretorio = caminho + "/";

                } else {

                    diretorio = disco + "/Games/BlackDesert/live/";

                    JOptionPane.showMessageDialog(null, "Voce Selecionou o diretorio " + diretorio + " como instação do jogo.");
                }
            } else {
                if (disco == "Manual") {
                    JOptionPane.showMessageDialog(null, "Vá até a pasta /Games/BlackDesert/live/");
                    String caminho = null;
                    JFileChooser fc = new JFileChooser();

                    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    int res = fc.showOpenDialog(null);
                    if (res == JFileChooser.APPROVE_OPTION) {
                        File diretorio = fc.getSelectedFile();
                        JOptionPane.showMessageDialog(null, "Voce Selecionou o diretorio " + diretorio + " como instação do jogo.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum diretorio");
                    }
                    caminho = fc.getSelectedFile().getAbsolutePath();
                    diretorio = caminho + "/";

                } else {
                    if (disco == "C:") {
                        diretorio = disco + "/Games/BlackDesert/live/";

                        JOptionPane.showMessageDialog(null, "Voce Selecionou o diretorio " + diretorio + " como instação do jogo.");

                    } else {
                        diretorio = disco + "/Games/BlackDesert/live/";

                        JOptionPane.showMessageDialog(null, "Voce Selecionou o diretorio " + diretorio + " como instação do jogo.");

                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione a Linguagem do jogo primeiro.");
        }


    }//GEN-LAST:event_combobox_diretorioActionPerformed

    private void combobox_languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_languageActionPerformed
        versao = (String) combobox_language.getSelectedItem();
    }//GEN-LAST:event_combobox_languageActionPerformed

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobox_diretorio;
    private javax.swing.JComboBox<String> combobox_language;
    private javax.swing.JTextField download_progress;
    private javax.swing.JButton install_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
