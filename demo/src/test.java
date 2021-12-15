import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] a={12,21,11,23,14,25,};
        int[] b= method(a);
        System.out.println(Arrays.toString(b));
    }
    public  static int[] method(int[] a) {
        for(int i = 1; i<=a.length-1; i++){
            System.out.println("第一论"+i+"排列"+Arrays.toString(a));
            for (int q=0;q<a.length-1;q++){
                if (a[q]>a[q+1]){
                    int w=a[q];
                    a[q]=a[q+1];
                    a[q+1]=w;

                }
                System.out.println(Arrays.toString(a));
            }
        }
        return a;
    };


}
