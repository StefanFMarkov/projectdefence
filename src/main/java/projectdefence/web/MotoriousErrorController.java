package projectdefence.web;

import org.apache.http.HttpStatus;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;


@Controller
public class MotoriousErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());
            if (statusCode == HttpStatus.SC_NOT_FOUND) {
                return "error/error_404";
            } else if (statusCode == HttpStatus.SC_INTERNAL_SERVER_ERROR) {
                return "error/error_500";
            }
        }
        return "error/error";
    }

    @Override
    public String getErrorPath() {
        return "error/error";
    }

    @GetMapping("/access-denied")
    public String getAccessDenied() {
        return "/error/error_high_voltage";
    }
}
