package main;

public class TradeApp {
	private String tradeId;
	private String amount;
	
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Trade Details [TradeID=" + tradeId + ", amount=" + amount +"]";
	}
}