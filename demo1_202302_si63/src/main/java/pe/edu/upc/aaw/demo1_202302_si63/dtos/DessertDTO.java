package pe.edu.upc.aaw.demo1_202302_si63.dtos;

import pe.edu.upc.aaw.demo1_202302_si63.entities.Ingredient;

import java.time.LocalDate;

public class DessertDTO {
    private int idDessert;
    private String nameDessert;
    private LocalDate dueDateDessert;
    private String typeDessert;
    private int caloryDessert;
    private Ingredient ingredient;

    public int getIdDessert() {
        return idDessert;
    }

    public void setIdDessert(int idDessert) {
        this.idDessert = idDessert;
    }

    public String getNameDessert() {
        return nameDessert;
    }

    public void setNameDessert(String nameDessert) {
        this.nameDessert = nameDessert;
    }

    public LocalDate getDueDateDessert() {
        return dueDateDessert;
    }

    public void setDueDateDessert(LocalDate dueDateDessert) {
        this.dueDateDessert = dueDateDessert;
    }

    public String getTypeDessert() {
        return typeDessert;
    }

    public void setTypeDessert(String typeDessert) {
        this.typeDessert = typeDessert;
    }

    public int getCaloryDessert() {
        return caloryDessert;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void setCaloryDessert(int caloryDessert) {
        this.caloryDessert = caloryDessert;
    }
}
