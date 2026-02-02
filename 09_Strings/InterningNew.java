public class InterningNew {
    public static void main(String[] args) {
        String s = "Aashish ";
        s = "Kashish"; // yaha pe bhi 's' iske address ko point kar raha hai
        s += "Singh"; // yaha pe Singh add nahi ho raha hai ye eki nayi string bana raha hai 's' jisme isne dono ko add kar ke likha hai
        String s1 = "Virat";
        String s2 = new String("Virat");
        System.out.println(s1.charAt(0) == s2.charAt(0));
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s);

        String st = "A" + s.substring(1,12);

        System.out.println(st);

    }
}


