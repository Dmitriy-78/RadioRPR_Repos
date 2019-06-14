package templates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.radiorpr.service.repositories.UsersRepository;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/registration")
    public String getUsersRegistrationPage() {
        return "registration";
    }

    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        model.addAttribute("usersfromserver", usersRepository.findAll());
        return "users";
    }
}
