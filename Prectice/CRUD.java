import java.util.*;
class emp
{
    private int eno;
    private String ename;
    private int sal;

    emp(int eno,String ename,int sal)
    {
        this.eno=eno;
        this.ename=ename;
        this.sal=sal;
    }

    public int geteno()
    {
        return eno;
    }

     public int getsal()
    {
        return sal;
    }

     public String getename()
    {
        return ename;
    }

    public String toString()
    {
        return eno+" "+ename+" "+sal;
    }

}
class CRUD
{
    public static void main(String arg[])
    {
        List<emp> e= new ArrayList<emp>();

        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int ch;

        do
        {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.print("Enter your choice : ");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1://........insert.........
                    System.out.print("enter eno : ");
                    int eno=sc.nextInt();

                    System.out.print("enter ename : ");
                    String ename=sc1.nextLine();

                    System.out.print("enter sal : ");
                    int sal=sc.nextInt();

                    e.add(new emp(eno,ename,sal));
                    break;
            
                case 2://........display..........
                    System.out.println("--------------------------------------------------");
                    Iterator<emp> i= e.iterator();
                    while(i.hasNext())
                    {
                        emp c= i.next();
                        System.out.println(c);
                    }
                    System.out.println("--------------------------------------------------");
                    break;  

                case 3://.........search............
                    boolean found=false;
                    System.out.print("Enter Empno to search : ");
                    eno=sc.nextInt();

                    System.out.println("--------------------------------------------------");
                    i= e.iterator();
                    while(i.hasNext())
                    {
                        emp c= i.next();
                        if(c.geteno()==eno)
                        {
                            System.out.println(c);
                            found =true;    
                        }
                        
                    }
                    
                    if(!found)
                    {
                        System.out.println("Record Not Found");
                    }
                    System.out.println("--------------------------------------------------");
                    break;  

                case 4://...............delete...............
                    found=false;
                    System.out.print("Enter Empno to Delete : ");
                    eno=sc.nextInt();

                    System.out.println("--------------------------------------------------");
                    i= e.iterator();
                    while(i.hasNext())
                    {
                        emp c= i.next();
                        if(c.geteno()==eno)
                        {
                            i.remove();
                            found =true;    
                        }
                        
                    }
                    
                    if(!found)
                    {
                        System.out.println("Record Not Found");
                    }
                    else
                    {
                         System.out.println("Record Delete successfully...!");   
                    }
                    System.out.println("--------------------------------------------------");
                    break;  

                case 5://..............update.................
                    found=false;
                    System.out.print("Enter Empno to update : ");
                    eno=sc.nextInt();

                    ListIterator<emp> li= e.listIterator();
                    while(li.hasNext())
                    {
                        emp c= li.next();
                        if(c.geteno()==eno)
                        {
                            System.out.print("Enter new ename : ");
                            ename=sc1.nextLine();
                            
                            System.out.print("Enter new salary : ");
                            sal=sc.nextInt();

                            li.set(new emp(eno,ename,sal));

                            found =true;    
                        }
                        
                    }
                    
                    if(!found)
                    {
                        System.out.println("Record Not Found");
                    }
                    else
                    {
                         System.out.println("Record updated successfully...!");   
                    }
                    
                    break;  
            }

        }while(ch!=0);
    }
}