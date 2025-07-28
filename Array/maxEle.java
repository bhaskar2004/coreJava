package Array;

public class maxEle {
    public static void max(int[]a){
        int max=0;
        for(int i=0;i<a.length;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max +" the max element .");
    }

    public static void main(String[] args) {

    }
}
