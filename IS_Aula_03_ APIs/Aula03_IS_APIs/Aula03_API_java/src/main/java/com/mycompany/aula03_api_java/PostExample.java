/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Retirado do site
//https://techndeck.com/how-to-send-http-get-post-request-in-java/

package com.mycompany.aula03_api_java;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 *
 * @author filipegutemberg
 */
public class PostExample {

    public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException {
        String url = "http://127.0.0.1/isficha03/acao.php";

        URL UrlObj = new URL(url);

        HttpURLConnection connection = (HttpURLConnection) UrlObj.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
        connection.setDoOutput(true);

        DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

        String urlPostParameters = "nome=Filipe&idade=29";
        outputStream.writeBytes(urlPostParameters);

        outputStream.flush();
        outputStream.close();

        System.out.println("Send 'HTTP POST' request to : " + url);

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code : " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader inputReader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = inputReader.readLine()) != null) {
                response.append(inputLine);
            }
            inputReader.close();

            System.out.println(response.toString());
        }

    }
}