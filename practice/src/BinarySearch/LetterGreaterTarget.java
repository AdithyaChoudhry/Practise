package BinarySearch;

public class LetterGreaterTarget {
    public static void main(String[] args) {
        char[] letters = {'a','b','c'};
        char target = 'b';
        char ans = (char) binarysearch(letters,target);
        System.out.println(ans);
    }
    static int binarysearch(char[] letters , char target){
    int start = 0;
    int end = letters.length -1;

      while(start<=end){
        int mid = start + (end-start)/2;


        if(target <= letters[mid]){//same as binary search but do not keep the mid equal to target condition
            end=mid-1;            //instead just return the start value because
            //we are finding the element which is greater than the target
        }
        else {
            start=mid+1;
        }

    }

    return letters[start % letters.length];}
}
