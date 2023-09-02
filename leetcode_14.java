import java.util.Arrays;

public class leetcode_14 {
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        Arrays.sort(str);
        String first=str[0];
        String last=str[str.length-1];
       int index=0;
       while(index<first.length()){
        if(first.charAt(index)==last.charAt(index)){
            index++;
        }
        else{
            break;
        }
       }
      if(index==0){
        System.out.println("");
      }
      else{
       System.out.println(first.substring(0, index)); 
      }
        
        }


    }

