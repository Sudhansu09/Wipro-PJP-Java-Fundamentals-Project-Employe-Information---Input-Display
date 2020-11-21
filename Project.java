class Project1
{
	public static void main(String args[])
	{
		String[] details=new String[]{"Emp No.","Emp Name","Department","Designaation","Salary"};

		int[] emp_no=new int[]{1001,1002,1003,1004,1005,1006,1007};
		String[] emp_name=new String[]{"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String[] join_date=new String[]{"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
		char[] designation_code1=new char[]{'e','c','k','r','m','e','c'};
		String[] department=new String[]{"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int[] basic=new int[]{20000,30000,10000,12000,50000,23000,29000};
		int[] hra=new int[]{8000,12000,8000,6000,20000,9000,12000};
		int[] it=new int[]{3000,9000,1000,2000,20000,4400,10000};

		char[] designation_code2=new char[]{'e','c','k','r','m'};
		String[]  designation=new String[]{"Engineer","Consultant","Clerk","Receptionist","Manager"};
		int[] da=new int[]{20000,32000,12000,15000,40000};

		if(args.length==0)
		{
			System.out.print("Please Enter the Employee Number.");
		}
		else
		{
			int emp_num=Integer.parseInt(args[0]);
			boolean check_emp=false;
			int index=0;
			String desig="";
			int dearness_allowance=0;
			int salary=0;
			for(int i=0; i<emp_no.length; i++) 
			{
				if(emp_no[i] == emp_num)
				{
					check_emp=true;
					index=i;
					break;
				}
			}

			if(check_emp==true)
			{
				switch(designation_code1[index])
				{
					case 'e':
					desig=designation[0];
					dearness_allowance=da[0];
					break;

					case 'c':
					desig=designation[1];
					dearness_allowance=da[1];
					break;

					case 'k':
					desig=designation[2];
					dearness_allowance=da[2];
					break;

					case 'r':
					desig=designation[3];
					dearness_allowance=da[3];
					break;
					
					case 'm':
					desig=designation[4];
					dearness_allowance=da[4];
					break;

					default:
					System.out.print("Error in Switch case.");
				}

				salary=(basic[index]+hra[index]+dearness_allowance)-it[index];
				for(int i=0;i<5;i++)
				{
					System.out.print(details[i]+"\t\t");
				}
				System.out.println("\n");
				System.out.print(emp_no[index]+"\t\t"+emp_name[index]+"\t\t\t"+department[index]+"\t\t\t"+desig+"\t\t"+salary);
			}
			else
			{
				System.out.print("There is no employee with empid :"+emp_num);
			}
		}
	}
}