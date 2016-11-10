/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd_patcher;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author supmac
 */
public class BD_Patcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
        String caminho = null;
        tela jn = new tela();
        jn.setLocationRelativeTo(null);
        jn.setVisible(true);
        version verify_version = new version();// chama o objeto version

        if (!"4".equals(verify_version.getversion())) {
            JOptionPane.showMessageDialog(null, "Atualizando Patcher, favor clique em OK para iniciar o Download.");
            caminho = BD_Patcher.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
            caminho = caminho.substring(1, caminho.lastIndexOf('/') + 1);
            System.out.println(caminho);

            try {
                String url2 = "http://omegabd.000webhostapp.com/BD_Patcher.jar";// Novo patcher
                URL url3 = new URL(url2);
                URLConnection conn = url3.openConnection();
                InputStream in2 = conn.getInputStream();
                FileOutputStream out = new FileOutputStream(caminho + "/BD_Patcher.jar");
                byte[] b = new byte[1024];
                int count;
                while ((count = in2.read(b)) >= 0) {
                    out.write(b, 0, count);
                }
                out.flush();
                out.close();
                
                JOptionPane.showMessageDialog(null, "Patcher atualizado com sucesso! Favor abrir o novo Patcher salvo em " + caminho + "BD_Patcher.jar");
                in.close();
                System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);

            }

        }

    }

}
