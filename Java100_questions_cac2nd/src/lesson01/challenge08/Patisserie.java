/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		{

		}
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolateStock = 30;
		int pistachioStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolateStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistachioStock + "個");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン      >");
		String citronBuyCountStr = br.readLine();
		double citronBuyCount = Double.parseDouble(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolateBuyCountStr = br.readLine();
		double chocolateBuyCount = Double.parseDouble(chocolateBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistachioBuyCountStr = br.readLine();
		double pistachioBuyCount = Double.parseDouble(pistachioBuyCountStr);

		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolateBuyCount + "個");
		System.out.println("ピスターシュ " + pistachioBuyCount + "個");

		double totalBuyCount = citronBuyCount + chocolateBuyCount + pistachioBuyCount;
		int totalPrice = (int) (250 * citronBuyCount + 280 * chocolateBuyCount + 320 * pistachioBuyCount);

		System.out.println("\n合計個数    " + totalBuyCount + "個");
		System.out.println("合計金額   " + totalPrice + "円");
		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		citronStock = (int) (citronStock - citronBuyCount);
		//２つ目の（）はそれから計算してねの合図
		chocolateStock = (int) (chocolateStock - chocolateBuyCount);
		pistachioStock = (int) (pistachioStock - pistachioBuyCount);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolateStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistachioStock + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売り上げの合計");
		System.out.println("売上合計　\\" + totalPrice);

		System.out.println("\n内訳");
		System.out.println("シトロン　　\\" + (int) (250 * citronBuyCount) + "・・・"
				+ (int) ((250 * citronBuyCount) / totalPrice * 100) + "%");
		System.out.println("ショコラ　　\\" + (int) (280 * chocolateBuyCount) + "・・・"
				+ (int) ((280 * chocolateBuyCount) / totalPrice * 100) + "%");
		System.out.println("ピスターシュ\\" + (int) (320 * pistachioBuyCount) + "・・・"
				+ (int) (320 * pistachioBuyCount / totalPrice * 100) + "%");

	}

}
