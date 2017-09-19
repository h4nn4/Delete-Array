import java.util.Scanner;
public class ManipulateArray{
static Scanner read = new Scanner (System.in);

   public static void main(String [] args)
   {  
      int [] arr = new int[100];
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

   static int processChoice(int [] arr,int choice,int count){
      switch(choice){
         case 1: count=addItem(arr,count); break;
         case 2: count=editItem(arr,count); break;
         case 3: count=removeItem(arr,count); break;
         case 4: display(arr,count); break;
         case 5: search(arr,count); break;
         default: System.out.println("Sorry your choice is not in the list. Please choose again.");
   }//switch
  return count;
}//processChoice

   static void search(int [] arr,int count){
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
  }//end search

   static void display(int[] arr,int count){
      if (count==0)
          System.out.println("Sorry list is empty.");
      else
      for (int i=0; i<count;i++)
        System.out.println("Element "+(i+1)+":"+arr[i]);  
   }//end display

   static int editItem(int [] arr,int count){
      int nom;
      boolean cari=false;
      if (count==0)
         System.out.println("Sorry list is empty.");
      else {
      System.out.print("Edit value?:");
      nom=read.nextInt();
      for (int i=0; i<count;i++){
      if (arr[i]==nom){
          System.out.print("New value?:");
          nom=read.nextInt();
          arr[i]=nom;
          cari=true;
          break;
          }
        }
        if (cari==false)
         System.out.println("Sorry your search value is not in the list.");
   }
   return count;   
  }//end editItem

   static int addItem(int [] arr,int count){
      if (count < arr.length){
      System.out.print("New value to insert?:");
      arr[count++]=read.nextInt();
      }
      else
         System.out.println("List is FULL.");
   return count;
   }//addItem

   static int removeItem(int [] arr,int count){
      int i,j,nom;
      int bil=count;
      boolean delete=false;
      
      if (bil==0)
         System.out.println("Sorry list is empty.");
      else {
         System.out.print("Number to be deleted?:");
         nom=read.nextInt();
         
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