public class Piramide {
    public void piramide(int numero) {
        for(int i = 0; i <= numero; i++ ){
            for(int j = 0; j < i; j++ ){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
