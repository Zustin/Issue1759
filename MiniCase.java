import java.util.ArrayList;

public class MiniCase {

    ArrayList<Integer> lst = new ArrayList<Integer>();
    Integer[] res;
    public Integer[] flaw() {
        res = (Integer[]) ((Object[])(lst.toArray()));  // should report a warning here
        return res;
    }

    public static void main(String[] args) {
        MiniCase caser = new MiniCase();
        caser.flaw();
    }

}
