package global;

import java.util.Comparator;

import account.AccountMemberBean;

/**
 * @date   :2016. 7. 8.
 * @author :ckan
 * @file   :NameAscSort.java 
 * @story  :
 */
public class NameAscSort implements Comparator<AccountMemberBean>{
	public int compare(AccountMemberBean first,AccountMemberBean second){
		return first.getName().compareTo(second.getName());
	}
}
