
package Helloworld;
import java.util.Scanner;
public class Taxes {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        try {
        System.out.println("Nhap Status: ");
        String status = nhap.nextLine();
        System.out.println("Nhap Income: ");
        float income = nhap.nextFloat();
        float incometax = 0;
    if ("single filers".equals(status))
        { if ((income>0) && (income<=835))
        { incometax=income*10/100;
        }else if (income<=33950)
                { incometax=income*15/100;
        }else if (income<=82250)
                { incometax=income*25/100;
        }else if (income<=171550)
                { incometax=income*28/100;
        }else if(income<=372950)
            { incometax=income*33/100;
        }else  { incometax=income*35/100;
        }
            }
    else if ("married filing jointly".equals(status))
        { if ((income>0) && (income<=16700))
        { incometax=income*10/100;
        }else if (income<=67900)
                { incometax=income*15/100;
        }else if (income<=137050)
                { incometax=income*25/100;
        }else if (income<=208850)
                { incometax=income*28/100;
        }else if(income<= 372950  )
            { incometax=income*33/100;
        }else  { incometax=income*35/100;
        }
            }
    else if ("married filing saparately".equals(status))
        { if ((income>0) && (income<=8350))
        { incometax=income*10/100;
        }else if (income<=33950)
                { incometax=income*15/100;
        }else if (income<=68525)
                { incometax=income*25/100;
        }else if (income<=104425)
                { incometax=income*28/100;
        }else if(income<=186475)
            { incometax=income*33/100;
        }else  { incometax=income*35/100;
        }
            }
    else if ("head of household".equals(status))
        { if ((income>0) && (income<=11950))
        { incometax=income*10/100;
        }else if (income<=45500)
                { incometax=income*15/100;
        }else if (income<=117450)
                { incometax=income*25/100;
        }else if (income<=190200)
                { incometax=income*28/100;
        }else if(income<=372950)
            { incometax=income*33/100;
        }else  { incometax=income*35/100;
        }
            }
    else { System.out.println("status false!");}
        System.out.println("Taxes is: " + incometax +"$");
        }
        catch  (ArithmeticException e) {
        System.out.print("Income false! ");} 
        
    }}