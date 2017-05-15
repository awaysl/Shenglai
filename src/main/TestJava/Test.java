package TestJava;

/**
 * Created by shenglai on 2017/3/10.
 */
public class Test {
    public static void main(String[] args){
        System.out.print(new Test().getIndex(9));
    }


    public int getIndex(int x){
        int[] arr = {1,2,3,4,5,6,7,8};
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
