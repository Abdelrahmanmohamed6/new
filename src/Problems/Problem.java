
package Problems;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Problem {//class que
  int SIZE = 5;
  int items[] = new int[SIZE];
  int front, rear;

  Problem() {//Queue
    front = -1;
    rear = -1;
  }

  // check if the queue is full
  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    return false;
  }

  // check if the queue is empty
  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  // insert elements to the queue
  void enQueue(int element) {

    // if queue is full
    if (isFull()) {
      System.out.println("Queue is full");
    }
    else {
      if (front == -1) {
        // mark front denote first element of queue
        front = 0;
      }

      rear++;
      // insert element at the rear
      items[rear] = element;
      System.out.println("Insert " + element);
    }
  }

  // delete element from the queue
  int deQueue() {
    int element;

    // if queue is empty
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    }
    else {
      // remove element from the front of queue
      element = items[front];

      // if the queue has only one element
      if (front >= rear) {
        front = -1;
        rear = -1;
      }
      else {
        // mark next element as the front
        front++;
      }
      System.out.println( element + " Deleted");
      return (element);
    }
  }

  // display element of the queue
  void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    }
    else {
      // display the front of the queue
      System.out.println("\nFront index-> " + front);

      // display element of the queue
      System.out.println("Items -> ");
      for (i = front; i <= rear; i++)
        System.out.print(items[i] + "  ");

      // display the rear of the queue
      System.out.println("\nRear index-> " + rear);
    }
  }
    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        String s1 = scan.next();
//        String s2 = scan.next();
//
//        if (s1.compareToIgnoreCase(s2) < 0) {
//            System.out.println("-1");
//        } else if (s1.compareToIgnoreCase(s2) > 0) {
//            System.out.println("1");
//        } else {
//            System.out.println("0");
//        }
//            Date date = new Date( );
//            Date date2=new Date();
//            Calendar calender = Calendar.getInstance();
//        calender.set(Calendar.DATE, 23);
//        calender.set(Calendar.MONTH, 4);
//        calender.set(Calendar.YEAR, 2022);
//        date=calender.getTime();
////            SimpleDateFormat date# = new SimpleDateFormat ("yyyy.MM.dd");
////            System.out.println(date.format(dNow));
//        System.out.println(date);
//        if(date.after(date2)){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }

//String sDate1="31/12/1998";  
//    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
//    System.out.println(sDate1+"\t"+date1); 
//Date date=new Date("21/1/2002 17:5");
//DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm");
//Calendar obj = Calendar.getInstance();
//System.out.println(dfor.format(obj.getTime()));

        Queue <String> names=new PriorityQueue<>();
        names.add("ahmed");
        names.add("ibrahim");
        names.add("ali");
        System.out.println(names);
        System.out.println("hello");
    }
}
