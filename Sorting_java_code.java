import java.util.*;
public class Main{
  public static void bubblesort(int num[]){
    for(int i= 0; i<num.length-1;i++){
      for(int j=0; j<num.length-1-i;j++){
        if(num[j]>num[j+1]){
          int temp = num[j];
          num[j]=num[j+1];
          num[j+1]=temp;
        }
      }
    }
  }
  public static void countingsort(int num[]){
    int largest = Integer.MIN_VALUE;
    for( int i =0; i< num.length; i++){
      largest = Math.max(largest,num[i]);
    }
    int count[] = new int[largest+1];
    for(int i= 0; i< num.length; i++){
      count[num[i]]++;
    }
    int j=0; 
    for(int i =0; i< num.length;i++){
      while(count[i]>0){
        num[j]=i;
        j++;
        count[i]--;
      }
    }
      }
    public static void SelectionSort(int num[]){
        for (int i=0; i< num.length-1;i++){
            int smallest = i;
            for( int j=i+1; j<num.length;j++){
                if(num[smallest]>num[j]){
                    smallest = j;
                }
            }
             if (smallest != i) { 
            int temp = num[smallest];
            num[smallest]= num[i];
            num[i]=temp;
             }
        }
            
    }
    public static void InsertionSort(int num[]){
        for( int i=1; i<num.length;i++){
            int curr = num[i];
            int prev = i-1;
            while(prev>=0 && num[prev]> curr){
                num[prev+1]=num[prev];
                prev--;
            }
            num[prev+1]=curr;
        }
    }
  public static void main(String[] args){
    int num[]= {2,8,90,3,56,69,8,6};
    InsertionSort(num);
    for(int i=0; i< num.length;i++){
      System.out.print(num[i]+" ");
    }

  }
}