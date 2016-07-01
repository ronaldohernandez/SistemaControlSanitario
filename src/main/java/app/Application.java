package app;
import app.index.IndexController;
import app.login.LoginController;

/**
 * Created by Vicky on 30/06/2016.
 */

import static spark.Spark.*;
import static spark.debug.DebugScreen.*;

public class Application {
    public static void main(String[] args) {

        port(getPort(8080));
        enableDebugScreen();

        get(Routes.Web.INDEX, IndexController.serveIndexPage);

        // Login
        get(Routes.Web.LOGIN, LoginController.serverLoginPage);
        post(Routes.Web.LOGIN, LoginController.handleLoginPost);
    }

    private static int getPort(int defaultPort) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return defaultPort; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
