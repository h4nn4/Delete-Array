import java.util.Scanner;
public class DeleteArray{
static Scanner read = new Scanner (System.in);

   public static void main(String [] args)
   {  
      String [] arr = new String[10];
      int choice;
      int count=0;
      do {
         menu();
         System.out.print("Your choice:"); 
         choice=read.nextInt();
         if (choice==0){
         System.out.println("Thank you and Bye."); 
         break;
    }
   else
      count=processChoice(arr,choice,count);
      } while (choice!=0);
   }//end main

   static void menu(){
      System.out.println(":::::::: MENU :::::::::\n"
                   +"1. Add Item\n"
                   +"2. Edit Item\n"
                   +"3. Remove Item\n"
                   +"4. Display\n"
                   +"5. Search\n"
                   +"0. EXIT");
   }//menu

   static int processChoice(String [] arr,int choice,int count){
      switch(choice){
         case 1: count=addItem(arr,count); break;
         //case 2: count=editItem(arr,count); break;
         case 3: count=removeItem(arr,count); break;
         case 4: display(arr,count); break;
         //case 5: search(arr,count); break;
         default: System.out.println("Sorry your choice is not in the list. Please choose again.");
   }//switch
  return count;
}//processChoice

   /*static void search(int [] arr,int count){
      int nom, editItem;
      boolean cari=false;
      if (count==0)
      System.out.println("Sorry list is empty.");
      else {
      System.out.print("Search value?:");
      nom=read.nextInt();
      for (int i=0; i<count;i++){
      if (arr[i]==nom){
      cari=true;
      
      if(cari==true)
         System.out.println("Your search value is at index "+i+" in the list.");
         break;
      }
    }
      if (cari==false)
         System.out.println("Sorry your search value is not in the list.");
   }    
  }//end search*/

   static void display(String[] arr,int count){
      if (count==0)
          System.out.println("Sorry list is empty.");
      else
      for (int i=0; i<count;i++)
        System.out.println("Element "+(i+1)+":"+arr[i]);  
   }//end display

   /*static int editItem(String [] arr,int count){
      String nom;
      boolean cari=false;
      if (count==0)
         System.out.println("Sorry list is empty.");
      else {
      System.out.print("Edit value?:");
      nom=read.nextLine();
      for (int i=0; i<count;i++){
      if (arr[i]==nom){
          System.out.print("New value?:");
          nom=read.nextLine();
          arr[i]=nom;
          cari=true;
          break;
          }
        }
        if (cari==false)
         System.out.println("Sorry your search value is not in the list.");
   }
   return count;   
  }//end editItem*/

   static int addItem(String [] arr,int count){
      if (count < arr.length)
      {
      System.out.print("New dvd namet?:");
      arr[count++]=read.nextLine();
      String dummy=read.nextLine();
      }
      else
         System.out.println("List is FULL.");
   return count;
   }//addItem

   static int removeItem(String [] arr,int count){
      int i,j;
      String nom;
      int bil=count;
      boolean delete=false;
      
      if (bil==0)
         System.out.println("Sorry list is empty.");
      else {
         System.out.print("Number to be deleted?:");
         nom=read.nextLine();
      for ( i=0; i<bil;i++)
      if (arr[i]==nom){
        for(j=i;j<count-1;j++)
           arr[j]=arr[j+1];
         --bil;
         delete=true;
      break;
      }
      }
      if (delete==false)
      System.out.println("Sorry the number is not in the list.");
      return bil;
   }//end removeItem
 }//end class