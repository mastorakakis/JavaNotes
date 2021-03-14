package enums;

import java.util.EnumSet;

public class MainEnums {

    public static void main(String[] args) {
        for (Color c : Color.values()) {		// enum.values()
            System.out.println(c);
        }
        System.out.println();
        for (Color c : EnumSet.range(Color.RED, Color.GREEN)) {  // EnumSet.range(Enum.TYPE, Enum.TYPE)
            System.out.println(c.getShade());
        }
        System.out.println();
        String input = "RED";
        Color c = Enum.valueOf(Color.class, input);  // Enum.valueOf(Enum.class, input)
        Color d = Color.GREEN;
        System.out.println(c);
        System.out.println(d);
    }
}

enum Color {
    RED("Light"), YELLOW("Light"), GREEN("Dark"), BROWN("Dark"), WHITE("Dark");

    private final String shade;

    Color(String shade) {
        this.shade = shade;
    }

    public String getShade() {
        return shade;
    }

}

