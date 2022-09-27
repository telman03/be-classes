package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;


public class HelloServlet extends HttpServlet {

    /** http://localhost:8000/hello?x=5&y=7 */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String queryString = req.getQueryString();
        Map<String, String[]> all = req.getParameterMap();

        String xs = req.getParameter("x");
        String ys = req.getParameter("y");
        String zs = req.getParameter("z");

        int x = Integer.parseInt(xs);
        int y = Integer.parseInt(ys);

        int z = x + y;


        try (PrintWriter w = resp.getWriter()) {
            w.println(queryString);
            w.printf("all params: %s", all);
            w.printf("%d, %d given, the sum is %d", x, y, z);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try (PrintWriter w = resp.getWriter()) {
            w.println("handling POST");
            w.printf("Custom-Header: %s\n",req.getHeader("Custom-Header"));
            w.printf("user: %s\n", req.getParameter("user"));
            w.printf("password: %s\n", req.getParameter("password"));

        }
    }
}
