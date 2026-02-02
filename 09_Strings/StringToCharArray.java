import java.util.Arrays;
public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Akhil";
        char[] arr = s.toCharArray();
        // isTarikeKoHumCamelCaseKehteHai
        // IsWayKoPascalCaseKehteHai  
        for(char ch: arr){
            System.out.println(ch);
        }
        Arrays.sort(arr);
        for(char ele: arr){
            System.out.print(ele+" ");
        }
    }
}
