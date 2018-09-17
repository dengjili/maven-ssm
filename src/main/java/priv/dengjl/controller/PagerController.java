package priv.dengjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagerController {
    @RequestMapping("/test")
    public String loginPage() {
        return "test";
    }
}