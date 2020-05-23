package com.practice.dh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;

public class TestDH {

    /**
     * Given this menu of a restaurant, extract top k ingredients
     *
     * For this example,
     * if k = 2
     * The output will be ["OliveOil","Wheat"]
     *
     * if k = 3
     * The output will be ["OliveOil","Wheat", "Cheese"] or , ["OliveOil","Wheat", "Chicken"] or ...
     */
    public static void main(String[] args) {
        String[] menu = new String[] {
            "Pizza Margherita: Cheese, Wheat, OliveOil",
            "Pizza BBQ: Chicken, BBQSauce, Tomato, OliveOil",
            "Pizza Vegan: Broccoli, OliveOil, Mushroom, Wheat"
        };

        List<String> topIngredients = getKTopIngredients(menu, 3);
        System.out.println(topIngredients);
    }

    private static List<String> getKTopIngredients(String[] menu, int k) {
        List<String> dishes = new ArrayList<>();
        List<String> ingredientsList = Arrays.stream(menu)
            .map(s -> s.substring(s.indexOf(":")+1))
            .map(s -> s.split(","))
            .flatMap(Stream::of)
            .collect(Collectors.toList());
        Map<String, Integer> ingredientCountMap = getIngredientCountMap(ingredientsList);
        List<Entry<String, Integer>> sortedEntriesByIngredient = sortIngredientByCount(ingredientCountMap);
        sortedEntriesByIngredient.subList(0, k).forEach(stringIntegerEntry -> {
            dishes.add(stringIntegerEntry.getKey());
        });
        return dishes;
    }

    @NotNull
    private static List<Entry<String, Integer>> sortIngredientByCount(Map<String, Integer> ingredientCountMap) {
        return ingredientCountMap.entrySet().stream().sorted((o1, o2) -> o2.getValue()
                .compareTo(o1.getValue())).collect(
                Collectors.toList());
    }

    @NotNull
    private static Map<String, Integer> getIngredientCountMap(List<String> ingredientsList) {
        Map<String, Integer> ingredientCountMap = new HashMap<>();
        ingredientsList.forEach(ingredient -> {
            if (ingredientCountMap.get(ingredient) == null) {
                ingredientCountMap.put(ingredient, 1);
            } else {
                ingredientCountMap.put(ingredient, ingredientCountMap.get(ingredient)+1);
            }
        });
        return ingredientCountMap;
    }
}
