package io.kakai.security.renderer;

import com.sun.net.httpserver.HttpExchange;
import io.kakai.implement.ViewRenderer;
import io.kakai.model.web.HttpRequest;
import io.kakai.security.SecurityManager;

public class GuestRenderer implements ViewRenderer {

    public boolean truthy(HttpRequest httpRequest, HttpExchange exchange){
        return !SecurityManager.isAuthenticated();
    }

    public String render(HttpRequest httpRequest, HttpExchange exchange){
        return "";
    }

    public String getKey() { return "kakai:guest"; }

    public Boolean isEval() {
        return true;
    }
}
