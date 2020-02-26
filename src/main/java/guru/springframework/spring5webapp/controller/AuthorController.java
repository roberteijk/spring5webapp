package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.repository.AuthorRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepo authorRepo;

    public AuthorController(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepo.findAll());

        return "authors/list"; // = View name. References to list.html in authors which all can be found under resources/templates.
    }
}
