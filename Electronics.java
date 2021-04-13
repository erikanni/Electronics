import java.util.ArrayList;

public class Electronics
{
  private String event;
  private int year;
  
  public Electronics(String Event, int Year){
    event = Event;
    year = Year;

  }
  
  public String getEvent(){
    return event;
  }
  public int getYear(){
    return year;
  }
  public static ArrayList<Electronics> getEvents (ArrayList<Electronics> el)
    {
        int index = 0;
           while (index < el.size())
           {
               Electronics temp = el.get(index);
               System.out.print(temp.getYear());
             //if (el.get(index).getYear() <= 1940 || el.get(index).getYear() >= 1980)
             {
               //el.remove(index);
             }
             //else
               index++;
           }
        return el;
    }
    public String toString(){
    return event + " " + year;
  }

  public static void main(String[] args) {
  Electronics event1 = new Electronics("event1", 1930);
  Electronics event2 = new Electronics("event2", 1980);
  Electronics event3 = new Electronics("event3", 1976);
  ArrayList<Electronics> events = new ArrayList<Electronics>();
        events.add(event1);
        events.add(event2);
        events.add(event3);
    System.out.println("Original array: ");
   for(Electronics item:events) {
            System.out.println(item);
        } 

  System.out.println("new array: ");
  for(Electronics item:events) {
            System.out.println(item);
        }
    getEvents(events);

  }
   
}
