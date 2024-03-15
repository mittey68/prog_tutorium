package Termin7.Musterklausur.Aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class CookieJar {

    private final List<Cookie> cookies;

    public CookieJar() {
        cookies = new ArrayList<>();
    }

    public void addCookie(Cookie cookie) {
        cookies.add(cookie);
    }

    public StuffedCookie getStuffedCookie() {
        for (int i = 0; i < cookies.size(); i++) {
            Cookie cookie = cookies.get(i);
            if (cookie instanceof StuffedCookie s) {
                cookies.remove(s);
                return s;
            }
        }
        return null;
    }

}