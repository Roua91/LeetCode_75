class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length() < str2.length()){
            return gcdOfStrings(str2, str1); //swap str2 if it's longer, to ensure str1 is the longer string
        }

        if(!str1.startsWith(str2)){  //If str2 is not a common prefix of str1 and str2, then there is no common divisor 
            return ""; 
        }

        if(str2.isEmpty()){  //If str2 is empty, it means that str1 and str2 are equal, so the gcd string is found.
            return str1;
        }

        return gcdOfStrings(str1.substring(str2.length()), str2); //the function recursively cuts off the common prefix part of str1
    }
}
