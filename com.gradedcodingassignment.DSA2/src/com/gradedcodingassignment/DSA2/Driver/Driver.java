package com.gradedcodingassignment.DSA2.Driver;

import com.gradedcodingassignment.DSA2.BinarySearchTree.BinarySearchTree;
import com.gradedcodingassignment.DSA2.BinarySearchTree.Node;
import java.util.Scanner;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Integer> input = new ArrayList<Integer>();
		Node root = new Node(50);
		input.add(root.data);
		root.leftNode = new Node(30);
		input.add(root.leftNode.data);
		root.leftNode.leftNode = new Node(10);
		input.add(root.leftNode.leftNode.data);
		root.rightNode = new Node(60);
		input.add(root.rightNode.data);
		root.rightNode.leftNode = new Node(55);
		input.add(root.rightNode.leftNode.data);

		// considering input without display after execution

		for (int i = 0; i < input.size(); i++) {
			if (i == input.size() - 1) {

			} else {

			}
		}

		ArrayList<Integer> output = BinarySearchTree.traversal(root);
		// Displaying the Output
		System.out.println("Output  ");
		System.out.println();
		for (int i = 0; i < output.size(); i++) {
			if (i == input.size() - 1) {
				System.out.print(output.get(i));
			} else {
				System.out.print(output.get(i) + " ");
			}
		}
	}
}