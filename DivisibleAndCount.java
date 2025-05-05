package Day4;

public class DivisibleAndCount {
    public static void main(String[] args) {

        int count = 0;

        for(int i=1; i<=30; i++){
            if(i%3==0){
                System.out.println(i);
                count += 1;
            }
        }

        System.out.println("Count : "+count);
    }
}
