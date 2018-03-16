import java.util.ArrayList;
import java.util.List;

public class Client {
    public int solution(int[] A) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<A.length;i++){
            if(!list.contains(A[i])){
                list.add(A[i]);
            }else{
                list.remove((Object)A[i]);
            }
        }
        return list.get(0);
    }

}
