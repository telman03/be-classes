package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        try(PrintWriter w = rs.getWriter()){
            String xs = rq.getParameter("x");
            String ys = rq.getParameter("y");
            int x = Integer.parseInt(xs);
            int y = Integer.parseInt(ys);
            int z = x + y;
            w.printf("adding... %d + %d = %d", x, y, z);
        }
    }
}
