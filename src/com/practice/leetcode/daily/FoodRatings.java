package com.practice.leetcode.daily;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class FoodRatings {
    class Food implements Comparable<Food>{
        String name, cuisine;
        int rating;

        public Food(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }

        @Override
        public int compareTo(Food food) {
            if(this.rating == food.rating) return this.name.compareTo(food.name);
            return food.rating - this.rating;
        }

    }

    Map<String, TreeSet<Food>> types = new HashMap<>();
    Map<String, Food> data = new HashMap<>();
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        int n = foods.length;
        for(int i = 0; i < n; i++) {
            String name = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            Food food = new Food(name, cuisine, rating);
            TreeSet<Food> curr = types.getOrDefault(cuisine, new TreeSet<>());
            curr.add(food);
            types.put(cuisine, curr);
            data.put(name, food);
        }
    }

    public void changeRating(String food, int newRating) {
        Food oldFood = data.get(food);
        TreeSet<Food> curr = types.get(oldFood.cuisine);
        curr.remove(oldFood);
        oldFood.rating = newRating;
        curr.add(oldFood);
    }

    public String highestRated(String cuisine) {
        return types.get(cuisine).first().name;
    }
}