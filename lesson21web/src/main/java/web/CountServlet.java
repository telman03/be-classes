package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CountServlet extends HttpServlet {
    private final Counter c;

    public CountServlet(Counter c) {
        this.c = c;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        c.inc();
        try (PrintWriter w = resp.getWriter()) {
            w.println("counted...");

        }
    }
}
