package Array;

public class sorting {
    public static void main(String[] args) {
        int []a={29,3,1,45,2,33,11};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("sorted array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
