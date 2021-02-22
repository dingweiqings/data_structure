package recursion;

import string.Int;

import java.util.*;

/**
 * cc.ketianyun.com copyright
 * 以数字表示圆盘大小，数字越大，表示大号圆盘
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
    //n 表示盘子的个数，从上到下，1到n,和List下标相反
    private static void hannota(int n,List<Integer> A,List<Integer> B,List<Integer> C){
        if(n==0){
            return;
        }
        //如果只有一个盘子
        if(n==1){
            move(A.size()-1,A,C);
            return;
        }
        hannota(n - 1, A, C, B);
        //移动n号圆盘,最后只剩1个,下标为A.size()-1
        move(A.size()-1,A,C);
        hannota(n - 1, B, A, C);
    }
    private static void move(int index, List<Integer> source,List<Integer> target){
        //操作数组移动盘子，从上到下盘子编号是1，n
      //  int index=source.indexOf(num-1);
       // target.add(source.get(index));
      //  source.remove(index);
        target.add(source.remove(index));
    }
    //n 表示盘子的个数，从上到下，1到n,和List下标相反
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
