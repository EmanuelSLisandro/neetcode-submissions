class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode  atual = head;
       ListNode  anterior = null;

        while(atual != null){
            ListNode proximo = atual.next;
            atual.next = anterior;
            anterior = atual;
            atual = proximo;
        }
        return anterior;
    }
}
