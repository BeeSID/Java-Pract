public class HolllowInverpyr {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            if(i==1 || i==2 || i==5)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
        }
            else
            {
                for(j=1;j<=i;j++)
                if(j==1 || j==i)
                {
                    System.out.print("* ");
                }
            else{
                System.out.print("  ");
            }
            }
            System.out.print("\n");}
        for(i=5;i>=1;i--)
        {
            for(k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            if(i==1 || i==2 || i==5)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
        }
            else
            {
                for(j=1;j<=i;j++)
                if(j==1 || j==i)
                {
                    System.out.print("* ");
                }
            else{
                System.out.print("  ");
            }
            }
            //System.out.print("\n");
        }
        }
    }

