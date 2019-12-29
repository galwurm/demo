import static spark.Spark.*;

public class server {
    public static void main(String[] args) {
        get("/helloworld", (req, res) -> "Hello");

        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });

        
    }
}
