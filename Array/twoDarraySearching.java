package Array;

public class twoDarraySearching {
        public static void main(String[] args) {
            int [][]a={{1,2},{2,3}};
            int key=3;
            for(int i=0;i<a.length;i++){
                for (int j=0 ;j<a.length;j++) {
                    if (key == a[i][j]) {
                        System.out.println("ele found");
                    }
                }
            }
        }
    }

