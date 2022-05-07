package com.example.tacocloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.tacocloud.Ingredient.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model){
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO", "CORN TORTILLA", Type.WRAP),
                new Ingredient("sjfdsj", "Ground Beff", Type.PROTEIN),
                new Ingredient("dahsfkj", "Diced Tomatoes", Type.VEGGIES),
                new Ingredient("jafhdkj", "Cheddar", Type.CHEESE),
                new Ingredient("dfahjk", "Salsa", Type.SAUCE)
        );

        Type[] types = Type.values();

        for(Type type : types){
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
        }
    }



}
