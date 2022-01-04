package array;
import java.util.Hashtable;
import java.util.Enumeration;
public class C_MAP {
 public static void main(String[] args) {
 //Hashtabletable_de_hachage = new Hashtable();
 Hashtable<Integer, String> table_de_hachage = new Hashtable<Integer, String>();
 table_de_hachage.put(1, "PRINTEMPS");
 table_de_hachage.put(5, "ETE");
 table_de_hachage.put(10, "AUTOMNE");
 table_de_hachage.put(30, "HIVER");
 Enumeration<String> enumeration = table_de_hachage.elements();
 while (enumeration.hasMoreElements()) {
 System.out.println(enumeration.nextElement());
 }
 }
}