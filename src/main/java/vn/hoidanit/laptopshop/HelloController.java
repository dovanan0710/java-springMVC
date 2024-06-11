package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController // beans
public class HelloController {
    @GetMapping("/") // rảng buộc kết nối
    public String index() {
        return "Hello World from Spring Boot DO VAN AN!";
    }
}
