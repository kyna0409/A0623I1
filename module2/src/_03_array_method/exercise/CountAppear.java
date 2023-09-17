package _03_array_method.exercise;

import java.util.Scanner;

public class CountAppear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st ="Nguyen thi tHu hoa";
        System.out.println("nhap mot ki tu ban muon nhap");
        char s = sc.next().charAt(0);
        int count =0;
       String str=st.toLowerCase();
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)==s)
            {
                count ++;
            }
        }
        System.out.println("so lan xuat hien ki tu "+s+" trong chuoi "+str+" la: "+count+" lan");
    }

}
