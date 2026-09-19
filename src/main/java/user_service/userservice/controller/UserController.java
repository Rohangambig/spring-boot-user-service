package user_service.userservice.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/user")

class UserController {
    @GetMapping("/health")
    public String healthCheck() {
        return "User service is up and running!";
    }
}