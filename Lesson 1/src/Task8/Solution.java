package Task8;

import java.time.Year;

public class Solution {
    public static void main(String[] args) {

        class Years{
            void years(int a){
              if (a%4==0)
                  System.out.println(a + " не високосный");
              else if (a%100==0)
                  if (a%400==0)
                      System.out.println(a+" високосный");
                  else
                      System.out.println(a + " не високосный");
              else System.out.println(a+" високосный");
                  }
              }

            }
        }









