package com.kingyal.rpc.client.transport;

import com.kingyal.rpc.client.Peer;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;;

public class HTTPTransportClient implements TransportClient {
    private String url;
    @Override
    public void connect(Peer peer) {
        this.url = "http://" + peer.getHost() + ":" + peer.getPort();
    }

    @Override
    public InputStream write(InputStream data) {
        try {
            HttpURLConnection httpURLConne = (HttpURLConnection)new URL(url).openConnection();
            httpURLConne.setDoInput(true);
            httpURLConne.setDoOutput(true);
            httpURLConne.setUseCaches(false);
            httpURLConne.setRequestMethod("POST");

            httpURLConne.connect();
            IOUtils.copy(data, httpURLConne.getOutputStream());

            int resultCode = httpURLConne.getResponseCode();
            if (resultCode == HttpURLConnection.HTTP_OK) {
                return httpURLConne.getInputStream();
            } else {
                return httpURLConne.getErrorStream();
            }

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void close() {

    }
}
