package com.company.Question_1;

public class OtherPrimaryColors extends FavoriteColorAndFavoritePrimaryColor{
    public OtherPrimaryColors(String blue, String red) {
        super(blue, red);
    }

    private String green = "Green";
    private String yellow = "Yellow";

    public OtherPrimaryColors(String blue, String red, String green, String yellow) {
        super(blue, red);
        this.green = green;
        this.yellow = yellow;
    }

    public String getGreen() {
        return green;
    }

    public void setGreen(String green) {
        this.green = green;
    }

    public String getYellow() {
        return yellow;
    }

    public void setYellow(String yellow) {
        this.yellow = yellow;
    }
}
