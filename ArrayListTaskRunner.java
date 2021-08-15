
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListTaskRunner{
   public static ArrayList<String> createStringArrayList(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of strings:");
     int size=sc.nextInt();
     System.out.println("Enter the strings:");
     String [] stringArray=new String[size];
     for(int i=0;i<size;i++){
          stringArray[i]=sc.next();
     }
     ArrayList<String> stringList=new ArrayList<String>();
     for(int i=0;i<stringArray.length;i++){
          stringList.add(stringArray[i]);
      } 
    return stringList;
  }
   public static ArrayList<Integer> createIntegerArrayList(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of integers:");
     int size1=sc.nextInt();
     System.out.println("Enter the integers:");
     int [] integerArray=new int[size1];
     for(int i=0;i<size1;i++){
          integerArray[i]=sc.nextInt();
     }
     ArrayList<Integer> integerList=new ArrayList<Integer>();
     for(int i=0;i<integerArray.length;i++){
          integerList.add(integerArray[i]);
      } 
    return integerList;
  }
  public static ArrayList<Double> createDecimalArrayList(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of decimal values:");
     int size1=sc.nextInt();
     System.out.println("Enter the decimals:");
     Double [] doubleArray=new Double[size1];
     for(int i=0;i<size1;i++){
          doubleArray[i]=sc.nextDouble();
     }
     ArrayList<Double> doubleList=new ArrayList<Double>();
     for(int i=0;i<doubleArray.length;i++){
          doubleList.add(doubleArray[i]);
      } 
    return doubleList;
  }
  public static ArrayList<Long> createLongArrayList(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of long values:");
     int size1=sc.nextInt();
     System.out.println("Enter the long values:");
     Long [] longArray=new Long[size1];
     for(int i=0;i<size1;i++){
          longArray[i]=sc.nextLong();
     }
     ArrayList<Long> longList=new ArrayList<Long>();
     for(int i=0;i<longArray.length;i++){
          longList.add(longArray[i]);
      } 
    return longList;
  }
   public static void main(String [] args){
    System.out.println("Enter the program number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    switch(number){
    case 1:
       int length=ArrayListTask.findLength();
       System.out.println("Length of the ArrayList with no elements:"+length);
       break;
   case 2:
       ArrayList<String> list1=createStringArrayList();
       int listLength=ArrayListTask.findListLength(list1);
       System.out.println("Length of the ArrayList with elements:"+listLength);
       break;
  case 3:
       ArrayList<Integer> list2=createIntegerArrayList();
       int integerListLength=ArrayListTask.findIntegerListLength(list2);
       System.out.println("Length of the ArrayList with elements:"+integerListLength);
       break;
  case 4:
       int customArrLength=ArrayListTask.createCustomArrayList();
       System.out.println("Custom ArrayList size:"+customArrLength);
       break;
  case 5:
        ArrayList<String> listArray=createStringArrayList();
        ArrayList<Integer> listInteger=createIntegerArrayList();
       int arrLength=ArrayListTask.createList(listInteger,listArray);
       System.out.println("ArrayList size:"+arrLength);
       break;
  case 6:
       ArrayList<String> list3=createStringArrayList();
       int listSize=ArrayListTask.findIndex(list3);
       System.out.println("Length of the ArrayList :"+listSize);
       break;
  case 7:
       ArrayList<String> list4=createStringArrayList();
       ArrayListTask.iterator(list4);
       break;
  case 8:
       ArrayList<String> list5=createStringArrayList();
       int stringSize=ArrayListTask.findStringAtIndex(list5);
       System.out.println("Length of the string :"+stringSize);
       break;
  case 9:
       ArrayList<String> list6=createStringArrayList();
       ArrayListTask.findIndexOfDuplicate(list6);
       break;
  case 10:
       ArrayList<String> list7=createStringArrayList();
       int strSize=ArrayListTask.addString(list7);
       System.out.println("Length of the ArrayList :"+strSize);
       break;
  case 11:
       ArrayList<String> list8=createStringArrayList();
       int arrayListSize=ArrayListTask.createArrayList(list8);
       System.out.println("Second ArrayList size:"+arrayListSize);
       break;
 case 12:
       ArrayList<String> list9=createStringArrayList();
       int arrListSize=ArrayListTask.createThreeArrayList(list9);
       System.out.println("third ArrayList size:"+arrListSize);
       break;
  case 13:
       ArrayList<String> list10=createStringArrayList();
       int arrListSize1=ArrayListTask.createThirdArrayList(list10);
       System.out.println("third ArrayList size:"+arrListSize1);
       break;
 case 14:
       ArrayList<Double> doubleList=createDecimalArrayList();
       int arrListSize2=ArrayListTask.removeDecimalValue(doubleList);
       System.out.println("ArrayList size:"+arrListSize2);
       break;
 case 15:
       ArrayList<Double> doubleList1=createDecimalArrayList();
       int arrListSize3=ArrayListTask.removeDecimalValueAtIndex(doubleList1);
       System.out.println("ArrayList size:"+arrListSize3);
       break;
 case 16:
       int longArrayListSize=Remove.removeLongValue();
       System.out.println("ArrayList size:"+longArrayListSize);
       break;
 case 17:
       ArrayList<String> list11=createStringArrayList();
       int arrListSize4=ArrayListTask.removeElements(list11);
       System.out.println("ArrayList size:"+arrListSize4);
       break;
 case 18:
       ArrayList<String> list12=createStringArrayList();
       int arrListSize5=ArrayListTask.removeNonDuplicateElements(list12);
       System.out.println("ArrayList size:"+arrListSize5);
       break;
  case 19:
       ArrayList<Long> longList=createLongArrayList();
       int longListSize=ArrayListTask.removeAllLongValue(longList);
       System.out.println("ArrayList size:"+longListSize);
       break;
  case 20:
       ArrayList<String> list13=createStringArrayList();
       int arrListSize6=ArrayListTask.checkString(list13);
       System.out.println("ArrayList size:"+arrListSize6);
       break;
   default:
       System.out.println("No program");
       break;
   }
 }
}
 