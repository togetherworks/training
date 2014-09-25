package com.togetherworks.ikm.j2ee;

import java.util.*;

public class CountToken {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringTokenizer stk1 = new StringTokenizer("a,b", ",");
		StringTokenizer stk2 = new StringTokenizer(",ab", ",");
		StringTokenizer stk3 = new StringTokenizer("ab,", ",");
		StringTokenizer stk4 = new StringTokenizer(",ab,", ",");

		System.out.println(stk1.countTokens() + " " + stk2.countTokens() + " "
				+ stk3.countTokens() + " " + stk4.countTokens());
		
	}

}
