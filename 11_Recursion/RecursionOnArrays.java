public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {5,3,7,12,76,9,34};
        recPrint(arr,0);
        System.out.println();
        System.out.print(exist(arr,45,0));
    }

    public static boolean exist(int[] arr,int target, int indx){
        // for(int ele: arr){
        //     if(ele == target) return true;
        // }
        // return false;
        if(indx == arr.length) return false;
        if(arr[indx] == target) return true;
        return exist(arr, 45, indx+1);
    }

    public static void recPrint(int[] arr, int indx){
        if(indx == arr.length) return;
        System.out.print(arr[indx]+" ");
        recPrint(arr,indx+1);
    }
}


