package com.practice.strings;

public class RomanToInteger {
    public int romanToInt(String s) {
        int output = 0;
        int i = 0;
        for(i = 0; i < s.length() - 1; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch1 == 'I'){
                if(ch2 == 'V'){
                    output += 4;
                    i++;
                }else if(ch2 == 'X'){
                    output += 9;
                    i++;
                }else{
                    output += 1;
                }
            }else if(ch1 == 'V'){
                output += 5;
            }else if(ch1 == 'X'){
                if(ch2 == 'L'){
                    output += 40;
                    i++;
                }else if(ch2 == 'C'){
                    output += 90;
                    i++;
                }else{
                    output += 10;
                }
            }else if(ch1 == 'L'){
                output += 50;
            }else if(ch1 == 'C'){
                if(ch2 == 'D'){
                    output += 400;
                    i++;
                }else if(ch2 == 'M'){
                    output += 900;
                    i++;
                }else{
                    output += 100;
                }
            }else if(ch1 == 'D'){
                output += 500;
            }else if(ch1 == 'M'){
                output += 1000;
            }
        }
        if(i == s.length()-1){
            char ch = s.charAt(i);
            if(ch == 'I'){
                output += 1;
            }else if(ch == 'V'){
                output += 5;
            }else if(ch == 'X'){
                output += 10;
            }else if(ch == 'L'){
                output += 50;
            }else if(ch == 'C'){
                output += 100;
            }else if(ch == 'D'){
                output += 500;
            }else if(ch == 'M'){
                output += 1000;
            }
        }
        return output;
    }
}
