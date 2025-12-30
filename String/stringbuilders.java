public class stringbuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.length()+s.capacity());
        s.append("Raghav"); 
        System.out.println(s); 
        System.out.println(s.length()+s.capacity());
        s.append("Garg");
        System.out.println(s);
        System.out.println(s.length()+s.capacity());
    }
}
