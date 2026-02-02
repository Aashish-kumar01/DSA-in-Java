public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8}; 
        missingNum(arr);    
        System.out.print(missingNum(arr));
    }


    public static int missingNum(int arr[]){
        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        int arraySum = 0;
        for(int ele : arr){
            arraySum += ele;
        }
        return sum - arraySum;
    }

}