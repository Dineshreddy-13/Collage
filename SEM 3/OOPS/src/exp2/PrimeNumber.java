package exp2;

public class PrimeNumber {
    public static void main(String[] args){
        int arr[] = new int[100];
        for(int i=0,j=1; i<arr.length && j<=100; i++, j++){
            arr[i] = j;
        }

        for(int i=1;i<arr.length; i++){
            if(arr[i] !=0){
                for(int j= ++i; j<arr.length; j++){
                    if (arr[j] != 0 && arr[j]%i == 0){
                        arr[j] = 0;
                    }
                }
            }
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i] !=0)
            System.out.print(arr[i] +" ");
        }
    }
}
