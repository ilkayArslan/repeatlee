import java.util.Arrays;

public class Main {
    static boolean isFinder(int[] arr,int value){
        for(int i : arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,1,2,24,83,83,84,82,82,24,9,7,4,4,4};
        int[] newarr=new int[arr.length];
        int newarrindis = 0;
        for (int a=0;a<arr.length;a++){
            for (int i = 0;i<arr.length;i++){
                if (arr[a]==arr[i] && a !=i && arr[a]%2==0){
                    if (!isFinder(newarr,arr[a])){
                        newarr[newarrindis]=arr[a];
                        newarrindis++;
                    }

                    break;
                }
            }
        }
        System.out.print("[ ");
        for (int a:newarr){
            if (a!=0){

                    System.out.print(a + " ");


            }
        }
        System.out.print("]");
    }
}