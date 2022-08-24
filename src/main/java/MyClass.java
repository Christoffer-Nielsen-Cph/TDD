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
            greeting = "Hello, ";
            if(multipleNames.length == 2) {
                for (int i = 0; i < multipleNames.length; i++) {
                    if (i == multipleNames.length - 1) {
                        greeting += multipleNames[i] + ".";
                    } else {
                        greeting += multipleNames[i] + " and ";
                    }

                }
            }
            if(multipleNames.length > 2){

                int nameLength = multipleNames.length;

                for (int i = 0; i < multipleNames.length ; i++) {
                    if (i == multipleNames.length - nameLength) {
                        greeting += multipleNames[i] + ", ";
                    } else if(i == multipleNames.length - nameLength+1){
                        greeting += multipleNames[i] + ", and ";
                    } else {
                        greeting += multipleNames[i]+".";
                    }


                }
            }

            return greeting;

        }
        return greeting;
    }
}
