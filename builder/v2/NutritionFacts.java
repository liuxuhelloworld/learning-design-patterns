package builder.v2;

/**
 * JavaBeans pattern example
 */
public class NutritionFacts {
    // required
    private int servingSize = -1;

    // required
    private int servings = -1;

    // optional
    private int calories = 0;

    // optional
    private int fat = 0;

    // optional
    private int sodium = 0;

    // optional
    private int carbohydrate = 0;

    public NutritionFacts() { }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
