/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        if(head == null || head?.next == null) return head
        val next = head?.next
        head?.next = swapPairs(next?.next)
        next?.next = head
        return next
    }
}