package com.lamdafun;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertString {
	
	public static void main(String[] args) {
		List<String> al=List.of("He,","hii","Abc");
		
		System.out.println("Orginal List:\n"+al);
		//Convert into Upper Case
		
		List<String> list=  al.stream().map(x->x.toUpperCase()).toList();
		
		System.out.println("upperCase:\n"+ list);	
		//Convert into Lower Case
		List<String> list1=  al.stream().map(String::toLowerCase).collect(Collectors.toList()); 
		//IT is use as Suppler--it is use for the terminal operations		
		System.out.println("lowerCase:\n"+list1);	
		
		List<Integer> il=List.of(8,4,2,1,8,2,4,1,0);
		il.stream().sorted((x,y)->x.compareTo(y)).forEach(x->System.out.println(x)); //Longer way
		il.stream().sorted(Integer::compareTo).forEach(System.out::println); //Shorter way using refernce for performing shorting and printing
		
		
	}
}

