public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if(myString.length() == 0){
            return false;
        }
        if (myString.length() == 1) {
            return true;
        }
        boolean firstIsUpper = Character.isUpperCase(myString.charAt(0));
        boolean secondIsUpper = Character.isUpperCase(myString.charAt(1));

        if (firstIsUpper && secondIsUpper) {
            for (int i = 2; i < myString.length(); i++) {
                if (Character.isLowerCase(myString.charAt(i))) {
                    return false;
                }
            }
        } else if (!firstIsUpper && !secondIsUpper) {
            for (int i = 2; i < myString.length(); i++) {
                if (Character.isUpperCase(myString.charAt(i))) {
                    return false;
                }
            }
        } else if (firstIsUpper && !secondIsUpper) {
            for (int i = 2; i < myString.length(); i++) {
                if (Character.isUpperCase(myString.charAt(i))) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }

}

