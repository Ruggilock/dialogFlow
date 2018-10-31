package ruggi.chatbot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class RootController {
    @RequestMapping("/")
    public String greeting() {
        String welcome= "welcome";
        return welcome;
    }
}
