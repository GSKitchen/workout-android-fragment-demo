package com.example.workout.dao;

public class Workout {

    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Listener", "Line one\nLine two"),
            new Workout("Core Agony", "Line Five\nLine two"),
            new Workout("Strength and Length", "Line nine\nLine ten")
    };

    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
