package com.problem2.driver;
import com.problem2.service.*;

public class MainBSTPair {
	public static void main(String[] args) {
		Node root = null;
		FindSumPairs findSP = new FindSumPairs();
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
		root = findSP.insert(root, 60);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 50);
		root = findSP.insert(root, 70);
		int sum = 130;
		findSP.findPairWithGivenSum(root, sum);
	}
}