
class Singleton{
private static Singleton firstInstance=null;
private Singleton(){
}
public static Singleton getInstance()
{
if(firstInstance==null)
{
firstInstance=new Singleton();
}
return firstInstance;
}
}
public class SingletonPatternExample{
public static void main(String[] args)
{
Singleton instance=Singleton.getInstance();
System.out.println(instance);
Singleton Instance=Singleton.getInstance();
System.out.println(instance);
}
}
