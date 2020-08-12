package chillOut;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("hello welcome");
System.out.println(sb);
System.out.println(sb.length());
System.out.println(sb.append(" world"));//add extra
//System.out.println(sb.delete(0,4));//delets 0 positin to 3rd position
System.out.println(sb.substring(5,8));//displays 6 and 7 th position 
System.out.println(sb.insert(6,"Lakshmi "));
System.out.println(sb.replace(6,13,"Anirudh "));
System.out.println(sb.reverse());
	}

}
