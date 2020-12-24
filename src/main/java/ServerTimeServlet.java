import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "ServerTimeServlet", urlPatterns = "/demo")
public class ServerTimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response){

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        writer.println("<html>");
        writer.println("<h1>Hello world</h1>");
        writer.println("<h1>"+ format.format(date) + "</h1>");
        writer.println("</html>");
    }
}
