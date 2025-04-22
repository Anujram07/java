public class target {
    public static void main(String[] args){
        String str="racecar";
        int count=0;
        char[] name=str.toCharArray();
        for(int i=0;i<str.length();i++){
          count = 0;
          for (int j = 0; j < str.length(); j++) {
              if(name[i]==name[j]){
                count++;
              }
          }
          System.out.println(count);
        }
        }
    }

        


      