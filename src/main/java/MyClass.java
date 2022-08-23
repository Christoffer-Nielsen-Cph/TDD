import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class MyClass {

    public String greet(Object name) {
        String greeting = "";
        String oneName = "";

        if (name == null) {
            return greeting = "Hello, my friend.";
        }

        if (name instanceof String) {
            oneName = name.toString();
            if (oneName != null & !oneName.equals(oneName.toUpperCase())) {
                return greeting = "Hello, " + oneName + ".";
            } else if ((oneName.equals(oneName.toUpperCase()))) {
                return greeting = "HELLO, " + oneName + "!";
            }
        } else if (name instanceof String[]) {
            String [] multipleNames = (String[]) name;
            ArrayList<String> stringList = new ArrayList<>();
            greeting = "Hello, ";
            for (int i = 0; i < multipleNames.length; i++) {
                stringList.add(String.valueOf(multipleNames));
                if (i == multipleNames.length-1){
                    greeting += multipleNames[i];
                } else {
                    greeting += multipleNames[i]+" and ";
                }

            }

            return greeting;

        }
        return greeting;
    }
}