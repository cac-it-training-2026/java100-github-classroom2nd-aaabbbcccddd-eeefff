/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolateStock = 30;
		int pistachioStock = 30;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン      >");
		String citronBuyCountStr = reader.readLine();
		int citronBuyCount = Integer.parseInt(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolateBuyCountStr = reader.readLine();
		int chocolateBuyCount = Integer.parseInt(chocolateBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistacheBuyCountStr = reader.readLine();
		int pistachioBuyCount = Integer.parseInt(pistacheBuyCountStr);

		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolateBuyCount + "個");
		System.out.println("ピスターシュ " + pistachioBuyCount + "個");

		int totalBuyCount = citronBuyCount + chocolateBuyCount + pistachioBuyCount;
		int totalPrice = 250 * citronBuyCount + 280 * chocolateBuyCount + 320 * pistachioBuyCount;

		System.out.println("\n合計個数    " + totalBuyCount + "個");
		System.out.println("合計金額  " + totalPrice + "円");
		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + (citronStock - citronBuyCount) + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + (chocolateStock - chocolateBuyCount) + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + (pistachioStock - pistachioBuyCount) + "個");
	}
}
