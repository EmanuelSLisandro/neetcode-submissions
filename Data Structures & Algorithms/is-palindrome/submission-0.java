class Solution {
    public boolean isPalindrome(String s) {
       String resultado =  s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       String invertida = new StringBuilder(resultado).reverse().toString();
       return resultado.equals(invertida);
    }
}
