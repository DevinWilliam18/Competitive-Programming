public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pjgBaris = sc.nextInt();
        Integer intObj;
        ArrayList<ArrayList<Integer>> baris = new ArrayList<>(pjgBaris);
        for (int i = 0; i < pjgBaris; i++) {
            int pjgKolom = sc.nextInt();
            ArrayList<Integer> kolom = new ArrayList<>();
            for (int j = 0; j < pjgKolom; j++) {
                intObj = sc.nextInt();
                kolom.add(intObj);
            }
            baris.add(kolom);            
        }
        int L_Query = sc.nextInt();
        for (int i = 0; i < L_Query; i++) {
            int[] iQuery = new int[2];
            iQuery[0] = sc.nextInt();
            iQuery[1] = sc.nextInt();
            try {
                System.out.println(baris.get(iQuery[0]-1).get(iQuery[1]-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
