package _MakeAPatternOfU_LCase_P._MakeAPatternOfU_LCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class MakeAPatternOfULCase {
	
	StringBuffer out=new StringBuffer();;
	public String makepattern(String in) {
		if(in.isEmpty()) {
			//out= "no value";
			
		}
		//StringBuffer lo=new StringBuffer();
		//StringBuffer up=new StringBuffer();
		
		/*
		 for(int i=0;i<in.length();i++) {
			if(Character.isLowerCase(in.charAt(i))) {
				lo.append(in.charAt(i));
			}else if(Character.isUpperCase(in.charAt(i))) {
				up.append(in.charAt(i));
			}
			
		}
		
		
		String los=lo.toString();
		String ups=up.toString();
		System.out.println("loercase : " + los + "uppercase : "+ups);
		int count=0,i=0,j=0;
		//for(int i=0,j=0;i<in.length();i++) {
		while(count<in.length()) {
			
			if(i<los.length() && (j<ups.length())) {
			if(count%2==0 ) {
				out.append(los.charAt(i));
				System.out.println("letter at los " + i+ "is appened" +out);
				i++;
			}
				
			else if(count%2!=0 || (i==los.length()-1)) {
				out.append(ups.charAt(j));
				System.out.println("letter at ups " + j+ "is appened" +out);
				j++;
		
			}
		}else if((i==los.length()) && (j<ups.length())) {
			out.append(ups.charAt(j));
			j++;
		}else if((i<los.length()) && (j==ups.length())) {
			out.append(los.charAt(i));
			i++;
		}
			count++;
			
		}
		System.out.println("out with pattern : "+ out.toString());
		return out.toString();
		 */
		
		List<String>lo=new ArrayList<String>();
		List<String>up=new ArrayList<String>();
		
		for(int i=0;i<in.length();i++) {
			if(Character.isLowerCase(in.charAt(i))) {
				lo.add(String.valueOf(in.charAt(i)));
			}else if(Character.isUpperCase(in.charAt(i))) {
				up.add(String.valueOf(in.charAt(i)));
			}
			
		}
		Collections.sort(lo);
		Collections.sort(up);
	
		int count=0,i=0,j=0;
		
		while(count<in.length()) {
			
			if(i<lo.size() && (j<up.size())) {
			if(count%2==0 ) {
				out.append(lo.get(i));
				System.out.println("letter at los " + i+ "is appened" +out);
				i++;
			}
				
			else if(count%2!=0) {
				out.append(up.get(j));
				System.out.println("letter at ups " + j+ "is appened" +out);
				j++;
		
			}
		}else if((i==lo.size()) && (j<up.size())) {
			out.append(up.get(j));
			j++;
		}else if((i<lo.size()) && (j==up.size())) {
			out.append(lo.get(i));
			i++;
		}
			count++;
			
		}
		System.out.println("out with pattern : "+ out.toString());
		return out.toString();
	}
	
	
	
	@Test
	public void t1() {
		System.out.println(makepattern("abcABC"));
	}
	
	@Test
	public void t2() {
		System.out.println(makepattern("aDFBc"));
	}
	
	@Test
	public void t3() {
		System.out.println(makepattern("aDFBcefb"));
	}

}
