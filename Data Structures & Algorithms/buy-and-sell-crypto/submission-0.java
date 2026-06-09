class Solution {
    public int maxProfit(int[] prices) {
        int menorPreco = prices[0];
        int maiorLucro = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < menorPreco) {
                menorPreco = prices[i];
            } else {
                int lucroAtual = prices[i] - menorPreco;
                if(lucroAtual > maiorLucro){
                    maiorLucro = lucroAtual;
                }
            }
        }
        return maiorLucro;
    }
}
