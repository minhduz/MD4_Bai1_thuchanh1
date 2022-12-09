package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("HelloController")
public class HelloController {
    @RequestMapping("hello123")
    public String helloJava8(){
        return "hello";
    }
}
