package com.algorithm.leetcode;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @author qct
 */
public class AddTwoNunbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}

		ListNode lnResult = new ListNode(0);
		ListNode ln1 = l1;
		ListNode ln2 = l2;
		ListNode ln3 = lnResult;

		int sum = 0;
		while (ln1 != null || ln2 != null) {
			if (ln1 != null) {
				sum += ln1.val;
				ln1 = ln1.next;
			}

			if (ln2 != null) {
				sum += ln2.val;
				ln2 = ln2.next;
			}

			ln3.next = new ListNode(sum % 10);
			ln3 = ln3.next;
			sum /= 10;
		}

		if (sum == 1) {
			ln3.next = new ListNode(1);
		}

		return lnResult.next;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l11 = new ListNode(4);
		ListNode l12 = new ListNode(3);
		l11.next = l12;
		l1.next = l11;

		ListNode l2 = new ListNode(5);
		ListNode l21 = new ListNode(6);
		ListNode l22 = new ListNode(4);
		l21.next = l22;
		l2.next = l21;

		AddTwoNunbers addTwoNunbers = new AddTwoNunbers();
		ListNode addTwoNumbers = addTwoNunbers.addTwoNumbers(l1, l2);
		System.out.println(addTwoNumbers);
	}
}

class ListNode {
	int val;
	ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
