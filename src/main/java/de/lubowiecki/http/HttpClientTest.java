package de.lubowiecki.http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientTest {

    // Wenn die Daten aus dem Web kommen, verwendet man einen HttpClient

    private static final URI URL = URI.create("https://api.openligadb.de/getmatchdata/bl1/2024/3");

    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URL)
                                .build();

        try {
            // Der Client verbindet sind mit dem Server und fragt Daten hinter der gewünschten URL ab
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenApply(HttpClientTest::parseJson)
                    .join();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static String parseJson(String json) {
        System.out.println(json);
        return null;
    }
}
