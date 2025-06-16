package in.kodder;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        String url = "https://fakestoreapi.com/products/";

        Request request = new Request.Builder()
                .url(url)
                .build();

        try(Response response = client.newCall(request).execute()){
            if (response.isSuccessful()) {
                assert response.body() != null;
                String responseData = response.body().string();
                System.out.println("Response Data: " + responseData);
            } else {
                System.out.println("Request failed with code: " + response.code());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}