import java.util.Scanner;

public class MinHeap {
   public static int arrSize = 1000000;
   public static int arr[] = new int[arrSize];
   public static int i = 0;
   public static void insert(int value){
      if(i == arrSize){
         System.out.println("Heap is full!");
         return;
      }
      ++i;
      arr[i] = value;
      System.out.println("Inserted: "+arr[i]);
      int insertPos = i;
      while (insertPos > 1){
         int parent = insertPos / 2;
         if (arr[parent] > arr[insertPos]){
            int temp = arr[parent];
            arr[parent] = arr[insertPos];
            arr[insertPos] = temp;
            insertPos = parent;
         } else {
            break;
         }
      }
   }

   public static void find(){
      System.out.println("Found current root: "+arr[1]);
   }

   public static void delete(){
      if(i == 0){
         System.out.println("Can't delete! Heap is already empty");
         return;
      }
      int deletedRoot = arr[1];
      arr[1] = arr[i];
      i--;
      int parent = 1;
      while (2*parent <= i){
         int child = 2*parent;
         if( 2 * parent + 1 <= i ) {
            if( arr[child] > arr[child+1] ) {
               child++;
            }
            }
         if( arr[parent] > arr[child] ) {
            int temp = arr[parent];
            arr[parent] = arr[child];
            arr[child] = temp;
            parent = child;
         } else {
            break;
         }
      }
      System.out.println("Deleted root: "+deletedRoot);
   }

   public static void print(){
      System.out.print("Current nodes are-> ");
      for (int j = 1; j <= i; j++){
         System.out.print(arr[j]+" ");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int i = 0; i < n; i++){
         System.out.println("1) Insert.");
         System.out.println("2) Find.");
         System.out.println("3) Delete.");
         int choice = sc.nextInt();
         switch (choice){
            case 1:
               System.out.print("Insert: ");
               insert(sc.nextInt());
               print();
               break;
            case 2:
               find();
               print();
               break;
            case 3:
               delete();
               print();
               break;
            default:
               System.out.println("Invalid choice!");
         }
      }
   }
}


