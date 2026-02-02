package main.Lego;

public class LegoSet {
    private String name;
    private int pieces;
    private double buildTime;
    private int setNumber;
    private double cost;
    private char rating;


    public LegoSet (String name, int pieces, double buildTime, int setNumber, double cost, char rating) {
        this.name = name;
        this.pieces = pieces;
        this.buildTime = buildTime;
        this.setNumber = setNumber;
        this.cost = cost;
        this.rating = rating;
    }
    // Getters
    public String getName() {return name;}
    public int getPieces() {return pieces;}
    public double getBuildTime() {return buildTime;}
    public int getSetNumber() {return setNumber;}
    public double getCost() {return cost;}
    public char getRating() {return rating;}

    // Setters
    public void setName(String name) {this.name = name;}
    public void setPieces(int pieces) {this.pieces = pieces;}
    public void setBuildTime(double buildTime) {this.buildTime = buildTime;}
    public void setSetNumber(int setNumber) {this.setNumber = setNumber;}
    public void setCost(double cost) {this.cost = cost;}
    public void setRating(char rating) {this.rating = rating;}



}
