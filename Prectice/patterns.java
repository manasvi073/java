import java.util.*;
class patterns{
	public static void main(String arg[])
    {
        
      Scanner sc=new Scanner(System.in);

		/*for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}

			System.out.println(" ");
		}*/

		/*for(int i=1;i<=5;i++){

			for(int k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}

		for(int i=4;i>=1;i--){

			for(int k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}
*/

		/*for(int i=1;i<=4;i++){

			for(int j=1;j<=4;j++){
				if(i==1 || i==4 || j==1 || j==4){
				System.out.print("* ");

				}else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}*/

/*
1
23
456
78910


int no=1;
		for(int i=1;i<=4;i++){

			for(int j=1;j<=i;j++)
			{
				System.out.print(no+" ");
				no++;
			}
			System.out.println(" ");
		}



		char ch =65;

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(ch +" ");
				ch++;
			}
			System.out.println("");
		}
*/

/*for(int i=5;i>=1;i--){
	for(int j=1;j<=i;j++){
		System.out.print("*");
	}
	System.out.println("");
}
*/


		/*for (int i=1;i<5 ;i++ ) {
			for (int j=1;j<=i ;j++ ) {
				if((i+j)%2==0){
					System.out.print(1+" ");
				}else{
					System.out.print(0+" ");
				}
			}
			System.out.println(" ");
		}*/



/*

*****
 ****
  ***
   **
    *
    *
   **
  ***
 ****
*****

	for(int i=5;i>=1;i--){

			for(int k=1;k<=5-i;k++){
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){

				System.out.print("*");
			}
			System.out.println(" ");

		}


		for(int i=1;i<=5;i++){

			for(int k=1;k<=5-i;k++){
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){

				System.out.print("*");
			}
			System.out.println(" ");

		}



*/

    
/*


     *
    * *
   *   *
  *     *
 *       *
*         *
 *       *
  *     *
   *   *
    * *
     *


*/
        for (int i = 1; i <= 6; i++) {
          
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        
        for (int i = 6 - 1; i >= 1; i--) {
            
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    


	for(int i=1;i<=5;i++){

		for(int k=1;k<=5-i;k++){
			System.out.print(" ");
		}
		
		for(int j=1;j<=i;j++){

			if(j==1||j==i){
					System.out.print("*");

				}else {
					System.out.print(" ");
				}
		}
		System.out.println(" ");
	}

	for(int i=5;i>=1;i--){

		for(int k=1;k<=5-i;k++){
			System.out.print(" ");
		}
		
		for(int j=1;j<=i;j++){

			if(j==1||j==i){
					System.out.print("*");

				}else {
					System.out.print(" ");
				}
		}
		System.out.println(" ");
	}

/*
	*
   **
  * *
 *  *
*   *
*   *
 *  *
  * *
   **
    *



  	
/*
for (int i=5;i>=1;i--) 
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) 
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }*/
	}
}
