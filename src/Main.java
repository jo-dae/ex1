public class Main {
    public static void main(String[] args) {
        String city = "columbus";
        int zip = 43125;
        System.out.println(city);
        System.out.println(zip);

        double dailyHighs[] = {10,20,30,40,50};
        double total = 0;

       for(int i = 0; i<5;i++){
            total = dailyHighs[i] + total;
        }
        System.out.println(total/5);
    }
    }