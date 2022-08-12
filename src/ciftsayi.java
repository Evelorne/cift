import java.util.Scanner ;

public class ciftsayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i+=2) {
            System.out.println(i);
            if(i%2!=0){
                continue;
            }
        }
    }
}
