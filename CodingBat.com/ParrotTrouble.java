public class ParrotTrouble {

    public String notString(String str) {
        if (str.startsWith("not"))
            return str;
        return "not " + str;
    }
    public boolean posNeg(int a, int b, boolean negative) {
        if ( negative ) {
            return ( a < 0 && b<0);
        }
        return ((a < 0 && b > 0) || (a> 0 && b < 0));
    }
    public boolean parrotT(boolean talking, int hour) {
        if (talking){
            if (7 <= hour && hour <= 20){
                return false;
            }
        }
        else{
            return false;
        }
        return true;
    }

    public boolean makes10(int a, int b) {
        if ((a == 10 || b == 10) || ( a + b == 10)) {
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        if (Math.abs(100 - n) <=10 || Math.abs(200 -n) <= 10) {
            return true;
        }
        return false;
    }
}
