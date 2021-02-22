package recursion;

import string.Int;

import java.util.*;

/**
 * cc.ketianyun.com copyright
 * �����ֱ�ʾԲ�̴�С������Խ�󣬱�ʾ���Բ��
 * A 3 2 1 0 B C
 * @Author kurt.ding
 * @Description
 * @Date 2021/1/4
 */

public class Hannota {
    public static void main(String[] args) {
        List<Integer> A= new ArrayList<>();
        A.addAll(Arrays.asList(3,2,1,0));
        List<Integer> B=new ArrayList<>();
        List<Integer> C=new ArrayList<>();
        hannota(A.size(),A,B,C);
        System.out.println(C);
    }
    //n ��ʾ���ӵĸ��������ϵ��£�1��n,��List�±��෴
    private static void hannota(int n,List<Integer> A,List<Integer> B,List<Integer> C){
        if(n==0){
            return;
        }
        //���ֻ��һ������
        if(n==1){
            move(A.size()-1,A,C);
            return;
        }
        hannota(n - 1, A, C, B);
        //�ƶ�n��Բ��,���ֻʣ1��,�±�ΪA.size()-1
        move(A.size()-1,A,C);
        hannota(n - 1, B, A, C);
    }
    private static void move(int index, List<Integer> source,List<Integer> target){
        //���������ƶ����ӣ����ϵ������ӱ����1��n
      //  int index=source.indexOf(num-1);
       // target.add(source.get(index));
      //  source.remove(index);
        target.add(source.remove(index));
    }
    //n ��ʾ���ӵĸ��������ϵ��£�1��n,��List�±��෴
    private static void hannotaStack(int n,List<Integer> A,List<Integer> B,List<Integer> C){
        Deque<Integer> stack=new LinkedList<>();
        while(n>1){
            stack.push(A.get(n));
            n--;
        }
        C.add(A.get(0));
        while(!stack.isEmpty()){
            Integer plate=stack.pop();

        }
    }
    private static void queues(int n){
        byte[] arr=new byte[n*n];
    }
}
