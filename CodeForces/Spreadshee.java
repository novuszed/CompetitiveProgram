import java.util.*;

public class Spreadshee
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for(int i=0;i<cases;i++)
        {
            String code = sc.next();
            int end = code.length()-1;

            int a =0;
            int firstDig=0;
            int lastLet=0;
            String add="";
            String row="";  
            while(firstDig<=end)
            {
                if(Character.isDigit(code.charAt(firstDig)))
                break;
                firstDig++;
            }
            int temp1 = 0;
            while(lastLet<=end)
            {
                if(Character.isLetter(code.charAt(lastLet)))
                {
                	temp1=lastLet;
                }
                lastLet++;

            }
           //System.out.println(firstDig);
           //System.out.println(lastLet);

            if(firstDig>temp1)
            {
            while(a<=end && Character.isLetter(code.charAt(a)))
            {
                add+=code.charAt(a);

                a++;
            }
            while(a<=end && Character.isDigit(code.charAt(a)))
            {
                row+=code.charAt(a);
                a++;
            }
            //System.out.println(row);
            int convert = add.length()-1;
            int col = add.charAt(convert)-64 ;
            int run =1;
            long counter=26;
          // System.out.println(col);
            while(convert-1>=0)
            {
            	int temp=(add.charAt(convert-1)-64);
            //	System.out.println(temp);
                col+=(counter * temp);
                run++;
                counter*=26;
                convert--;
            }
            System.out.println("R"+row+"C"+col);
            }
            else
            {
            	a=a+1;
            	while(a<=end)
                {
            		if(Character.isDigit(code.charAt(a)))
                    row+=code.charAt(a);
            		else
            		break;
                    a++;
                }
            	a=a+1;
                while(a<=end)
                {
                	
                	if(Character.isDigit(code.charAt(a)))
                        add+=code.charAt(a);
                		else
                		break;
                    a++;
                }
                long lengthAdd = add.length();
                Integer x = Integer.parseInt(add);
               // System.out.println(col);
                long len = (long)Math.pow(26,lengthAdd-1);
                //System.out.println(len);
                String colA="";
                //int rem=0;
                
                while(x!=0)
                {
                	int m=x%26;
					if(m==0){
						colA="Z"+colA;
						x-=26;
					}
					else
						colA=(char)(m+'A'-1)+colA;
					x/=26;
                	
                }
                
                //colA+=col;
                System.out.println(colA+row);
            	
            	
            	
            }



        }


    }
}