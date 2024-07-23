package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController // beans
public class HelloController {
    @GetMapping("/") // rảng buộc kết nối
    public String index() {
        return "Hello World from Spring Boot";
    }

    @GetMapping("/user") // rảng buộc kết nối
    public String userPage() {
        return "Only user can access this page";
    }

    @GetMapping("/admin") // rảng buộc kết nối
    public String adminPage() {
        return "Only admin can access this page";
    }
}
