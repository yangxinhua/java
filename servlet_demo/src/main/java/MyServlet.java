import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.sound.midi.Soundbank;
import javax.xml.ws.Response;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by jacky on 2016/3/10.
 */
public class MyServlet implements Servlet {
    private ServletConfig servletConfig;
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;
    }

    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String servletName=servletConfig.getServletName();
        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();
        writer.print("<html>" +
                        "<hean></head>" +
                        "<body>hello from"+servletName+"</body>"+
                    "</html>"
        );
        System.out.println("servletRequest.getContentLength():"+servletRequest.getContentLength());
        System.out.println("servletRequest.getContentType():"+servletRequest.getContentType());
        System.out.println("servletRequest.getParameter():"+servletRequest.getParameter("id"));
        System.out.println("servletRequest.getProtocol():"+servletRequest.getProtocol());


    }

    public String getServletInfo() {
        return "MyServlet";
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
