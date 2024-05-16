public class PatternFour {
        public static void main(String[] args)
        {
            for (int i = 1; i <=5; i++) 
            {
                for (int j = 1; j <=i; j++) {
                    System.out.print("* ");
                }    
                System.out.println();
            }
            for (int k = 1; k<=5; k++) 
            {
                for (int o = 5; o >=k; o--) 
                {
                    
                        System.out.print("* ");
                }    
                System.out.println();
            }
        }
    }
