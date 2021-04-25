public class Vowel
{
public static void main(String a[])
{
String str="hello";
str=str.toLowerCase();
char[] chars=str.toCharArray();
int count=0;
for (int i=0;i<str.length();i++)
{
if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u')
{
count++;
}
}
System.out.println("total no of vowels in a string: " +count);
}
}