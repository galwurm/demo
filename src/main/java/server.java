import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import static spark.Spark.*;

public class server {
    public static void main(String[] args) {
        get("/helloworld", (req, res) -> "Hello");

        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });

        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });

        initdb();
    }

        private static void initdb() {
            MongoClientURI uri = new MongoClientURI(
                    "mongodb+srv://test:Aa123456@cluster0-5w6ij.mongodb.net/test?retryWrites=true&w=majority");

            MongoClient mongoClient = new MongoClient(uri);
            MongoDatabase database = mongoClient.getDatabase("sample_training");

            MongoCollection coll = database.getCollection("grades");

            System.out.println(coll.countDocuments());
        }
    }
