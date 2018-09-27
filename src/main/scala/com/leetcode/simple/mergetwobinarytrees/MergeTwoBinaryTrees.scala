package com.leetcode.simple.mergetwobinarytrees

/**
  * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
  *
  * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
  *
  * Example 1:
  * Input:
  * Tree 1                     Tree 2
  *       1                         2
  *      / \                       / \
  *     3   2                     1   3
  *   /                           \   \
  * 5                             4   7
  * Output:
  * Merged tree:
  *         3
  *       /   \
  *     4      5
  *   / \       \
  * 5   4        7
  * Note: The merging process must start from the root nodes of both trees.
  *
  * @param _value
  */
//    Definition for a binary tree node.
class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = _
  var right: TreeNode = _
}

object MergeTwoBinaryTrees {

  def main(args: Array[String]): Unit = {

  }

  object Solution {
    def mergeTrees(t1: TreeNode, t2: TreeNode): TreeNode = {

      if (t1 == null)
        return t2

      if (t2 == null)
        return t1
      t1.value += t2.value
      t1.left = mergeTrees(t1.left, t2.left)
      t1.right = mergeTrees(t1.right, t2.right)
      t1
    }
  }

}
