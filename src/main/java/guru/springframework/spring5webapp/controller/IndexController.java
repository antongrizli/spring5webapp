package guru.springframework.spring5webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.LinkedList;

@RestController
public class IndexController {

    @GetMapping("/index")
    @ResponseBody
    public LinkedList<String> getEnvironments() {
        return new LinkedList<String>() {{
            add("/variables");
        }};
    }

    @RequestMapping("/")
    public RedirectView handleFoo() {
        return new RedirectView("/swagger-ui-custom.html");
    }
}
