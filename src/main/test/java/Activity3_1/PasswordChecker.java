package Activity3_1;

import java.util.Random;

public class PasswordChecker {

    public String combineString(String custName) {
        String newCustName;
        if (custName.length() > 3) {
            newCustName = custName.substring(0, 3);
        } else {
            newCustName = custName;
        }

        String randChars = getRandString();
        String passResult = newCustName + randChars;

        return passResult;
    }

    public static String getRandString() {
        Random random = new Random();
        int digit1 = random.nextInt(10);
        int digit2 = random.nextInt(10);
        int digit3 = random.nextInt(10);

        return "" + digit1 + digit2 + digit3;
    }
}

class TestPass {
    public static void main(String[] args) {
        PasswordChecker passwordChecker = new PasswordChecker();
        String printPass = passwordChecker.combineString("Samuel");
        System.out.println("Generated Password: " + printPass);
    }
}
