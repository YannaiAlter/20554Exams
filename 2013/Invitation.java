
/**
 * Write a description of class Inivitation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invitation
{
 private String name;
 private String id;
 private String type;
 public Invitation(String name,String id,String type)
 {
     this.name=name;
     this.id=id;
     this.type=type;
     
 }
 public String toString()
 {
     return name+"\n"+id+"\n"+type+"\n";
 }
}
