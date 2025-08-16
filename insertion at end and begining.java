import java.util.Arrays;
class ArrayInsert{
    public static void main(String[]args){
        int[] Original={2,3,4,5,7,8};
        int newAtStart=1;
        int newAtEnd=10;
        int[] withStart=new int[Original.length+1];
        withStart[0]=newAtStart;
        for(int i=0;i<Original.length;i++){
            withStart[i+1]=Original[i];
        }
        int[] withEnd=new int[withStart.length+1];
        for(int i=0;i<withStart.length;i++){
            withEnd[i]=withStart[i];
        }
        withEnd[withStart.length-1]=newAtEnd;
        System.out.println("Final array:"+ Arrays.toString(withEnd));


    }
}
