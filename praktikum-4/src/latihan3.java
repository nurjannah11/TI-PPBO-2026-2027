public class latihan3 {
    public static void main(String[] args) {
         int[] angka = {10, 20, 30 ,40, 50};
         System.out.println("Array asli:");

         for(int i = 0; i < angka.length; i++){
             System.out.println(angka[i] + "");
         }
         System.out.println();
         System.out.println("array setelah dibalik:");

         for (int i = angka.length - 1; i >= 0; i--) {
             System.out.println(angka[i] +" ");
         }
    }
}
