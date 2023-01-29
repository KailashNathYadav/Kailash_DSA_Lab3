package com.problem2.service;
import java.util.*;

public class FindSumPairs {
	public Node root;
	private int[] res = { -1, -1 };
	private Set<Integer> set = new HashSet<>();

	public Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else if (data < root.val) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public void inOrder(Node root, int sum) {
		if (root == null)
			return;
		inOrder(root.left, sum);
		if (set.contains(sum - root.val) && res[0] == -1) {
			res[0] = sum - root.val;
			res[1] = root.val;
		} else {
			set.add(root.val);
		}
		inOrder(root.right, sum);
	}

	public void findPairWithGivenSum(Node root, int sum) {
		inOrder(root, sum);
		if (res[0] == -1)
			System.out.println("Nodes are not Found.");
		else
			System.out.printf("Pair is (%d,%d).", res[0], res[1]);
	}
}
