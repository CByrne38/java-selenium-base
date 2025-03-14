package webservice;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WSClient {

    private static final String BASE_URL = "https://3ctoa6qv1i.execute-api.eu-west-2.amazonaws.com/dev/";
    private static HttpClient client = HttpClient.newHttpClient();

    public static String getApplicationsForUser(int userId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "applications/user/" + userId))
                .GET()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjE2LCJ1c2VybmFtZSI6InVzZXIiLCJlbWFpbCI6InVzZXJAdXNlci5jb20iLCJyb2xlIjoidXNlciIsImlhdCI6MTc0MTc4MTI1OX0.fe3zMFlYVBSgJeU94_fSmv5mcox806eXTc5mc6_NBNs")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

}
