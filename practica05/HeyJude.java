public class HeyJude {
public static void main (String[] args){
String jude = "Hey Jude, ";
String dont = "don't ";
String remem = "Remember to ";
String then = "Then you ";
String better = "better ";
String bet = "better, oh";
String na = "na ";
String make = "make it bad";
String be = "be afraid";
String let = "let me down";
String can = "can start to ";
String begin = "begin to ";
String take = "Take a sad song and make it better";
String you = "You were made to go out and get her";
String found = "You have found her, now go and get her";
String heart = "let her into your heart";
String skin = "let her under your skin";
String makeit = "make it better";
String waaa = "waaaa";
String heyFinal = "Hey Jude";
int i = 0;
int k = 0;
int q = 0;
int m = 0;
int l = 0;
while (i<4){
  System.out.print(jude + dont);
  i++;
  if (i==1 || i==4){
    System.out.println(make);
    System.out.println(take);
  }else{
      if (i==2){
        System.out.println(be);
        System.out.println(you);
      }else{
            System.out.println(let);
            System.out.println(found);
}

        }




    System.out.print(remem);
    if (i==1 || i==3){
      System.out.println(heart);
    }  else {
        System.out.println(skin);

      }

    System.out.print(then);
    if (i==1 || i==3){
      System.out.print(can);
      System.out.println(makeit);
    }else{
        System.out.print(begin);
        System.out.println(makeit);

      }

    if (i==4){
      while(k<5){
        k++;
        if(k==5){
          System.out.println(bet);
        }else{
            System.out.print(better);
          }
        }
      }

    if (i==2){
     while(q<9){
       q++;
       System.out.print(na);


      }
     System.out.println(na);
    }
    else {
      if (i==3)
      {
       while(m<9){
         m++;
         System.out.print(na);
       }
       System.out.println(na);
     } else{
       if (i==4){
         while(l<9){
           l++;
           System.out.print(na);

         }
         System.out.println(na + heyFinal);
       }
     }

    }
  }
}
}
