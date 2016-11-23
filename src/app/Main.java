package app;

import static spark.Spark.*;

public class Main {

	public static void main(String[] args) {
		port(8080);
		get("/test", (request, response) -> {
			
		    return "hello world";
		});	
	}
}
