package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;


public class ShowTextFileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        String val;
        try(PrintWriter w = rs.getWriter()) {
            URL url = getClass().getClassLoader().getResource("test.html");
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            while ((val = br.readLine()) != null) {
               w.println(val);
            }

            // Closing the file
            br.close();
        }catch (Exception e){
            e.fillInStackTrace();
        }

    }
}
