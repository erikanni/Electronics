import java.util.ArrayList;

public class Electronics
{
  private String event;
  private int year;
  private String inventor;
  
  public Electronics(String Event, int Year, String Inventor){
    event = Event;
    year = Year;
    inventor = Inventor;
  }
  
  public String getEvent(){
    return event;
  }
  public int getYear(){
    return year;
  }
  public String getInventor(){
    return inventor;
  }
  public static ArrayList<Electronics> getEvents (ArrayList<Electronics> el, int startYear, int endYear)
    {
        int index = 0;
           while (index < el.size())
           {
               Electronics temp = el.get(index);
             if (temp.getYear() < startYear || temp.getYear() > endYear)
             {
               el.remove(index);
             }
             else
               index++;
           }
        return el;
    }
    public static void printEvents (ArrayList<Electronics> el)
    {
        for(Electronics item:el) {
            System.out.println(item);
        }
    
    }
    public String toString(){
    return year + ": " + event + ", Invented by: " + inventor;
  }

  public static void main(String[] args) {
    //data gathered from https://en.wikipedia.org/wiki/Timeline_of_electrical_and_electronic_engineering#1921%E2%80%931930
      ArrayList<Electronics> events = new ArrayList<Electronics>();
        events.add(new Electronics("Oscillograph", 1937, "Van Ardenne, Dowling, and Bullen"));
        events.add(new Electronics("Solar battery", 1954, "Chapin, Fuller, and Pearson"));
        events.add(new Electronics("Transatlantic telephone cable", 1956, "UK and U.S."));
        events.add(new Electronics("Sputnik I satellite", 1957, "Soviet Union"));
        events.add(new Electronics("Nuclear Missile", 1957, "Kurchatov / Soviet Union"));
        events.add(new Electronics("FORTRAN programming language", 1957, "Watson Scientific"));
        events.add(new Electronics("First one-piece plain paper photocopier (Xerox 914)", 1959, "Xerox"));
        events.add(new Electronics("Veroboard (Stripboard)", 1959, "Terry Fitzpatrick"));
        events.add(new Electronics("Electronic clock", 1961, "Vogel and Cie, patented by Alexander Bain, Scottish clockmaker in 1840."));
        events.add(new Electronics("First programmable word processor", 1972, "Automatic Electronic Systems"));
        events.add(new Electronics("IBM Personal Computer (8088 processor)", 1981, "IBM"));
        events.add(new Electronics("Commodore 64", 1982, "Commodore Business Machines"));
    
    System.out.println("Original Array: ");
    System.out.println(" ");
    printEvents(events); 
    
        int startYear = 1940;
        int endYear = 1980;
    getEvents(events, startYear, endYear);
    System.out.println(" ");
  System.out.println("New Array(Events between " + startYear +" and " + endYear + "): ");
  System.out.println(" ");
  printEvents(events);

  }
   
}
