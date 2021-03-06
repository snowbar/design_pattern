public final class AmericanStyleMenuBuilder implements MenuBuilder, GetResult{
    private final double rate = 1.2;
    private final String item = " ";
    private final StringBuffer output = new StringBuffer();
    private final StringBuffer breakfast = new StringBuffer();
    private final StringBuffer lunch = new StringBuffer();
    private final StringBuffer dinner = new StringBuffer();
    private final StringBuffer drink = new StringBuffer();

    public void shopTitle(String title) {
        output.append("======" + title + "======" + "\n");
    }
    public void addBreakfast(String breakfast,int price) {
        this.breakfast.append(item + breakfast + makePrice(price) + "\n");
    }
    public void addLunch(String lunch,int price) {
        this.lunch.append(item + lunch + makePrice(price) + "\n");       
    }
    public void addDinner(String dinner,int price) {
        this.dinner.append(item + dinner+ makePrice(price) + "\n");
    }
    public void addDrink(String drink,int price) {
        this.drink.append(item + drink + makePrice(price) + "\n");
    }
    public void close() {
        output.append("* Mornig *\n\n");
        output.append(this.breakfast + "\n");
        output.append("・ Lunch ・\n\n");
        output.append(this.lunch + "\n");
        output.append("[] Dinner []\n\n");
        output.append(this.dinner + "\n");
        output.append("+ Drink +\n\n");
        output.append(this.drink + "\n");
    }
    public String getResult() {
        return output.toString();
    }
    private String makePrice(int price){
        return (makeBlank() + priceConvert(price));
    }
    private String priceConvert(int price) {
        price *= rate;
        return("$" + price);
    }
    private String makeBlank() {
        return(" : ");
    }
}
