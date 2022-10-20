import java.util.ArrayList;
import java.util.List;

public class Arr {
    public boolean check(ArrayList<Integer> list, int secund){
        int plus=0;
        int multiply=0;
        for (int element: list) {
            plus+=element;
            multiply+=element;
        }
        return (plus>secund & multiply>secund);
    }
}
