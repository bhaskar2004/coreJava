package Array;

public class revesre {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int []b=new int[a.length];
        for(int i=0;i<a.length;i++) {
            b[a.length-i-1] = a[i];
        }

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
