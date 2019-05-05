package com;
import java.util.*;
public class Huawei {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str=new String[n];
        ArrayList<String> list=new ArrayList<>();
       // 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            
            for(int i=0;i<n;i++)
            {
                str[i]=in.next();
                int mod=str[i].length()%8;
                int count=str[i].length()/8;
                if(mod!=0)
                {
                    for(int j=0;j<8-mod;j++)
                    {
                        str[i]+='0';
                    }
                    count++;
                }
                
                for(int k=0;k<count;k++)
                {
                    list.add(str[i].substring(8*k,8*k+8));  
                }
                 
            } 
        
            Collections.sort(list);
            StringBuffer s=new StringBuffer();
            for(int i=0;i<list.size();i++)
            {
                s.append(list.get(i));
                s.append(' ');
            }
            System.out.println(s);
    }
}
