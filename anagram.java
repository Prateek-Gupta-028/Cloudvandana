import java.util.*;

class anagram{
    static boolean checkanagram(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(checkanagram(str1, str2))
            System.out.println("Strings are anagrams");
        else
            System.out.println("Not Anagram");
    }
}