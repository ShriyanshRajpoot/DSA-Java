    public static void main(String[] args) {
        String s = "Gopi";
        for(int i=0;i<=s.length();i++){
            for(int j=i;j<=s.length();j++){
                System.out.print(s.substring(j));
            }
            System.out.println();