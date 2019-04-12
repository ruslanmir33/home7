import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box("Red", 6);
//        Box box2 = new Box("red", 6);
//
//        System.out.println(box1.equals(box2));
//
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());

//        Integer i = new Integer(79543);
//        System.out.println(i);
//        System.out.println(i.intValue());
//        int temp = Integer.parseInt("2431");
//
//        Double d = new Double(876);
//        Character c = new Character('6');

//        String s = "Java Core 200";
//        String s1 = new String("Java");

//        s = s.toUpperCase();

//        System.out.println(s.equals(s1));
//        System.out.println(s.startsWith("Jav"));

//        String[] words = s.split(" ");
//        System.out.println(Arrays.toString(words));

        StringBuilder sb = new StringBuilder(200);
        for (int i = 0; i < 43; i++) {
            sb.append("А");
            
        }
//        System.out.println(sb);
//        StringBuffer sf = new StringBuffer(200);

        String s = "Java!\tCore!\t200";
        System.out.println(s);

    }
}
