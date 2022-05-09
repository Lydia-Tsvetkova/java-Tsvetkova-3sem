package src.homework;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = " ,Это строка  , у которой зачем-то написаны    , два пробела перед запятой  ,";
		String fixed = s1.replaceAll(" +,", ",");
		System.out.println(s1);
		System.out.println(fixed);
		
		
	}

}
