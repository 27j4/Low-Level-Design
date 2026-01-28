import creationalDesignPattern.builder.simplerBuilder.HttpRequest;

void main(){
    HttpRequest request = new HttpRequest.HttpRequestBuilder()
            .withUrl("https://api.example2.com")
            .withMethod("POST")
            .withHeader("Content-Type", "application/json")
            .withHeader("Accept", "application/json")
            .withQueryParams("key", "12345")
            .withBody("{\"name\": \"Aditya\"}")
            .withTimeout(60)
            .build();

    request.execute(); // Guaranteed to be in a consistent state
}