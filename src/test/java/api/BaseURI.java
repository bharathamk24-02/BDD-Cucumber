package api;

import io.github.cdimascio.dotenv.Dotenv;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public interface BaseURI {

    //    public static final String postURL = "http://10.192.190.158:5002/api/trainings";
    public static final String getURL = "http://10.192.190.158:5002";
    public static final String updateURL = "http://10.192.190.158:5002/api/trainings/";
//    public static final String DeleteURL = "http://10.192.190.158:5002/api/trainings/";

    public static final String BASE =
            "http://10.192.190.158:5002";

    public static final String TRAININGS =
            BASE + "/api/trainings";

//    Dotenv dotenv = Dotenv.load();
//    public static String token = dotenv.get("GITHUB_TOKEN");


//    public static String token = System.getenv("GITHUB_TOKEN");




    public static final String githubPostRequest = "https://api.github.com";
}


