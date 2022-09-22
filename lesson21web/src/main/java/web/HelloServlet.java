package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class HelloServlet extends HttpServlet {

    /** http://localhost:8000/hello?x=5&y=7&z=3&z=13&z=15 */

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        String queryString = rq.getQueryString();


//        rq.getPathInfo();
//        rq.getQueryString();
//        rq.getPart("a");
//        rq.getCookies();
//        rq.getHeader("b");

        Map<String, String[]> all = rq.getParameterMap();



        String xs = rq.getParameter("x");
        String ys= rq.getParameter("y");
        String zs = rq.getParameter("z"); //null

        int x = Integer.parseInt(xs);
        int y = Integer.parseInt(ys);
        int z = x +y;

        try(PrintWriter w = rs.getWriter()) {
            w.println(queryString);
            w.printf("Hello, %d , %d given, the sum is %d", x, y, z);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter w = resp.getWriter()) {
            w.println("handling POST");
        }
    }
}
