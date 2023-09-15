package ali.mine.hellowworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@CrossOrigin
@RequestMapping("/")
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "Hi this is ali from BALF";
    }
}
