import java.util.*;


class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exRoman = sc.nextLine();

        System.out.println(romanToInt(exRoman));
    }
    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        int hasilConvert = 0;
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        if (s.length() > 1) {
            for (int i = s.length()-1; i > 0; i--) {
                if (map.get(Character.toString(s.charAt(i))) <= map.get(Character.toString(s.charAt(i-1)))) {
                    if(i == s.length()-1){
                        hasilConvert = map.get(Character.toString(s.charAt(i))) + map.get(Character.toString(s.charAt(i-1)));
                    }
                    else{
                        hasilConvert += map.get(Character.toString(s.charAt(i-1)));
                    }
                    
                }else{
                    if(i == s.length()-1){
                        hasilConvert = map.get(Character.toString(s.charAt(i))) - map.get(Character.toString(s.charAt(i-1)));                        
                    }else{
                        hasilConvert -= map.get(Character.toString(s.charAt(i-1)));
                    }
                }
            }   
        }else{
            hasilConvert += map.get(Character.toString(s.charAt(0)));
        }
        return hasilConvert;
    }
}
