class Solution {
    public boolean validMountainArray(int[] arr) {
       
        int max = 0;
        int index = 0;
        boolean case1 = true;
        boolean case2 = true;
        boolean case3 = true;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                index = i;

            }
        }

        if (arr[index] == arr[0] || index == arr.length-1){
            case3 = false;
        }

        for(int j = 0; j < index; j++) {
                if (arr[j] >= arr[j + 1]) {
                    case1 = false;
                    break;
                }
            }
        


            for(int j = index; j < arr.length-1; j++) {
                if (arr[j] <= arr[j + 1]) {
                    case2 = false;
                    break;
                }
            }
        if(case1 && case2 && case3){
            return true;
        }else{
            return false;
        }

         
    }
}
