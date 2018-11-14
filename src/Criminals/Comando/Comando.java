package Criminals.Comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Comando {

    public String execute(HttpServletRequest req,
                          HttpServletResponse resp)
            throws Exception;

}
