//4.C Program to Count the Number of Vowels & Consonants in a Sentence 

import java.util.*;
class find_vovel_consonent
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer str=new StringBuffer(sc.nextLine());
        String st=str.toString();
        int vo=0,co=0;
        int l=st.length();
        char ch;
        for(int i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vo++;
            else
                co++;
        }
        System.out.println("vovels="+vo+" consonant="+co);

    }
}