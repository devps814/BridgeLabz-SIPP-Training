package level01;

public class ProfitAndLoss {
	public static void main(String[] args) {
		double cp = 129;
		double sp = 191;
		double profit = sp - cp;
		if (profit > 0 ) {
			double profitpercent = (profit/cp) * 100;
			System.out.println("The Profit is INR" + profit + "and the profitpercentage" + profitpercent);
		}
		else {
			double loss = profit * -1;
			double losspercent = (loss/cp) * 100;
			System.out.println("The Loss is INR " + loss + "and the losspercentage " + losspercent);
		}
	}
}
