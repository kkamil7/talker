package talker.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Kamil on 2016-06-03.
 */
@Controller
@RequestMapping("/talker")
public class HomeController {
    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }
}