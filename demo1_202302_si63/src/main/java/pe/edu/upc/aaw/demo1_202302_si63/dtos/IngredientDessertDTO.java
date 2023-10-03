package pe.edu.upc.aaw.demo1_202302_si63.dtos;

public class IngredientDessertDTO {
    private String nameDessert;
    private int quantityIngredient;
    private double amountIngredient;

    public double getAmountIngredient(double v) {
        return amountIngredient;
    }

    public void setAmountIngredient(double amountIngredient) {
        this.amountIngredient = amountIngredient;
    }

    public String getNameDessert() {
        return nameDessert;
    }

    public void setNameDessert(String nameDessert) {
        this.nameDessert = nameDessert;
    }

    public int getQuantityIngredient() {
        return quantityIngredient;
    }

    public void setQuantityIngredient(int quantityIngredient) {
        this.quantityIngredient = quantityIngredient;
    }
}
