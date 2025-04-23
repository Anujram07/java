public class vowel {
    public static void main(String[] args) {
        String str="radhe bhaiya";
        int count = 0;
        char[] vowel = {'a','e','i','o','u'};
        char[] name=str.toCharArray();  
        for(int i=0;i<str.length();i++){
           
          for (int j = 0; j < vowel.length; j++) {
            if(name[i]==vowel[j]){
                count++;
              }
          }
          
        }
        System.out.println(count);
    }
}


         
