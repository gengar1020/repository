package project;
import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] arg){
    	get("/private", (request, response) -> {
            response.status(401);
            return "Go Away!!!";
        });
    }
}