/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd_patcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author supmac
 */
public class version {
    String version;
    public String getversion() throws MalformedURLException, IOException {

        String url = "http://omegabd.000webhostapp.com/version.txt"; //repositorio para ler a versão do app
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int ResponseCode = con.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) == "1") { // vai ler todo o arquivo linha por linha e adicionar na string inputline
            response.append(inputLine);
        }
        in.close();
        
        return inputLine;

    }
     

}
