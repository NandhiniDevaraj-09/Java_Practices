/*import java.util.Scanner;

public class ChainMarketing{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
string Parent=sc.nextLine();
string isChild=sc.nextLine();
if(isChild=='Y'){
int size=2;
String[] child=next string[size];
for(int i=0,i<n;i++){
child[i]=sc.nextLine();
}
int n=5000;
for(int i=0,i<n;i++){
if(a[0]){
int parentcom=(n/100)*10;
int childcom=(n/100)*5;
System.out.print(parentcom+','+childcom);
}else{
int parentcom=((n/100)*10)*2;
int child1com=((n/100)*5);
int child2com=((n/100)*5);
System.out.print(parentcom+','+child1com+','+child2com);
}
}
}
}*/


         












import java.util.Scanner;

public class ChainMarketing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Parent name: ");
        String parent = sc.nextLine();
        
        int totalMembers = 1; 

        System.out.print("Does the parent have children? (Y/N): ");
        String isChild = sc.nextLine();

        int amount = 5000;
        int parentCom;
        int childCom;

        if (isChild.equals("Y")) { 
           System.out.print("Enter number of children: "); 
           int size = sc.nextInt(); 
           if(size==2){
            String[] children = new String[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter child " + (i + 1) + " name: ");
                children[i] = sc.nextLine();
            }

            totalMembers += children.length; 

            
            if (children.length == 2) {
                parentCom = (amount * 10) / 100 * 2; 
            } else {
                parentCom = (amount * 10) / 100;
            }
            childCom = (amount * 5) / 100;

            System.out.println("Parent Commission: " + parentCom);
            System.out.println("Child 1 Commission: " + childCom);
            System.out.println("Child 2 Commission: " + childCom);
        }
        else if(size==1){
        String[] children = new String[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter child " + i + " name: ");
                children[i] = sc.nextLine();
            }

            totalMembers += children.length; 

            
            if (children.length == 2) {
                parentCom = (amount * 10) / 100 * 2; 
            } else {
                parentCom = (amount * 10) / 100;
            }
            childCom = (amount * 5) / 100;

            System.out.println("Parent Commission: " + parentCom);
            System.out.println("Child 1 Commission: " + childCom);
            System.out.println("Child 2 Commission: " + childCom);
        }

        } else {
            parentCom = (amount * 5) / 100;
            System.out.println("Parent Commission: " + parentCom);
        }

        
        System.out.println("Total Members in the Chain: " + totalMembers);

        sc.close();
    }
}




































