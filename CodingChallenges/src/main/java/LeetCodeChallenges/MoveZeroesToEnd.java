package LeetCodeChallenges;

import java.util.Arrays;
/*1)2 pointer--slow pointer-non zero position tracker-pos ,faster pointer i to iterate through array

2)when you come across a non zero element move it to pos and increment pos

3)fill remaining positions with zero
dry run --> arr[i=0]=0,nothing happens; arr[i=1]=1,so now arr[pos=0]=1,pos=1;// next arr[i=2]nothing happens,so arr[pos]=[1],pos=1;//arr[3],arr[pos=1]=3 so arr[pos]=[1,3] pos=2........arr[pos]=[1,3,12] pos=3;

now ,fill arr[3]=0,arr[4]=0,increase pos++ arr[pos]={1,3,13,0,0};*/

//****************2-POINTER************************ The Writer & Explorer (same direction)//

public class MoveZeroesToEnd {

    public static int[] moveZeroes(int[] arr){


        int pos=0;//initialize slow pointer

        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]!=0)
            {
                arr[pos]=arr[i];
                pos++;
            }

        }

        while(pos<arr.length)
        {
            arr[pos]=0;
            pos++;

        }


        return arr;
    }



    public static void main(String[] args)
    {
        int[] arr={0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZeroes(arr)));

    }




}


