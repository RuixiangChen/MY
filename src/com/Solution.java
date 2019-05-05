package com;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Solution {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        //处理N行句子
        String[] sentences=new String[N];
        for(int i=0;i<N;i++)
        {
        	sentences[i]=sc.nextLine();
        }
        List<HashSet<String>> sentenceList=new ArrayList<>(N);//list中元素允许重复
        for(int i=0;i<N;i++)
        {
        	HashSet<String> set=new HashSet<>();//set中元素不允许重复
        	//将一个句子中的所有词分开存在数组中
        	String[] temp=sentences[i].toLowerCase().split(" ");
        	//利用set的特性将重复词去掉
        	for(String s:temp)//遍历temp字符串数组，遍历得到的每个字符串给s
        	{
        		set.add(s);
        	}
        	
        	//将每行句子处理后加入到List中
        	sentenceList.add(set);
        }
        
        
        //处理M行句子，对每个句子去和N个句子比较
        for(int i=0;i<M;i++)
        {
        	HashSet<String> set = new HashSet<>();
            String[] temp = sc.nextLine().toLowerCase().split(" ");
            for (String s : temp) {
                set.add(s);
            }
            
            //1个M对所有的N比较,由于要输出重复词语最多的句子，所以定义一个标记，记录每个比较重复词的数目,最后要输出整个句子，要定义
            //一个id去记录最大重复词数对应的句子
            int max=0;
            int maxId=0;
            for(int j=0;j<N;j++)
            {
            	//先获得一个N
            	HashSet<String> tar=sentenceList.get(j);//获得List列表中的元素用get()
            	int count=0;
            	for(String s:set)//set是M句子的集合
            	{
            		if(tar.contains(s))
            			count++;
            	}
            	//和最大值比较
            	if(count>max)
            	{
            		max=count;
            		maxId=j;
            	}
            }
           System.out.println();
           System.out.println(maxId);
          // System.out.println(sentences[maxId]); 
        }
        
	}*/

}
