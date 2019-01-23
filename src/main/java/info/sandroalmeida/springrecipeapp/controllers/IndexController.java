package info.sandroalmeida.springrecipeapp.controllers;

import info.sandroalmeida.springrecipeapp.domain.Category;
import info.sandroalmeida.springrecipeapp.domain.UnitOfMeasure;
import info.sandroalmeida.springrecipeapp.repositories.CategoryRepository;
import info.sandroalmeida.springrecipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by sandro on 17/01/19
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category Id is: " + categoryOptional.get().getId());
        System.out.println("UnitOfMeasure Id is: " + unitOfMeasureOptional.get().getId());

        return "index";

    }

}

