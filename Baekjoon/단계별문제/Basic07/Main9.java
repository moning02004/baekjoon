package Basic07; //2941λ²?
//?? ?? ?΄?μ²΄μ ?? ?¬λ‘μ?°? ??λ²³μ ?? ₯?  ?κ°? ???€. ?°?Ό?, ?€?κ³? κ°μ΄ ?¬λ‘μ?°? ??λ²³μ ?€?κ³? κ°μ΄ λ³?κ²½ν΄? ?? ₯??€.
//?¬λ‘μ?°? ??λ²?
//λ³?κ²?
//Δ
//c=
//Δ
//c-
//dΕΎ
//dz=
//Γ±
//d-
//lj
//lj
//nj
//nj
//Ε‘
//s=
//ΕΎ
//z=
//?λ₯? ?€?΄, ljes=njak?? ?¬λ‘μ?°? ??λ²? 6κ°?(lj, e, Ε‘, nj, a, k)λ‘? ?΄λ£¨μ΄? Έ ??€. ?¨?΄κ°? μ£Όμ΄μ‘μ ?, λͺ? κ°μ ?¬λ‘μ?°? ??λ²³μΌλ‘? ?΄λ£¨μ΄? Έ ??μ§? μΆλ ₯??€.
//dΕΎ? λ¬΄μ‘°κ±? ??? ??λ²³μΌλ‘? ?°?΄κ³?, d?? ΕΎκ°? λΆλ¦¬? κ²μΌλ‘? λ³΄μ? ???€. lj?? nj? λ§μ°¬κ°?μ§??΄?€. ? λͺ©λ‘? ?? ??λ²³μ? ? κΈ???© ?Ό?€.

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		word = word + ' ';
		int count = word.length()-1;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == 'c' && word.charAt(i+1) == '=') {count--; i++; continue;}
			if(word.charAt(i) == 'c' && word.charAt(i+1) == '-') {count--; i++; continue;}
			if(word.charAt(i) == 'd' && word.charAt(i+1) == 'z' && word.charAt(i+2) == '=') {count -= 2 ; i+=2; continue;}
			if(word.charAt(i) == 'd' && word.charAt(i+1) == '-') {count--; i++; continue;}
			if(word.charAt(i) == 'l' && word.charAt(i+1) == 'j') {count--; i++; continue;}
			if(word.charAt(i) == 'n' && word.charAt(i+1) == 'j') {count--; i++; continue;}
			if(word.charAt(i) == 's' && word.charAt(i+1) == '=') {count--; i++; continue;}
			if(word.charAt(i) == 'z' && word.charAt(i+1) == '=') {count--; i++; continue;}
		}
		
		System.out.println(count);
		
		scan.close();
	}
}