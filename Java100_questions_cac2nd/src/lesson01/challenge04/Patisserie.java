/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		int citron = 30;
		int chocolate = 30;
		int pistachio = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250・・・残り" + citron + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + chocolate + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + pistachio + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.println("シトロン　　＞");
		String citronBuyCountStr = reader.readLine();
		int citronBuyCount = Integer.parseInt(citronBuyCountStr);

		System.out.println("ショコラ　　＞");
		String chocolateStr = reader.readLine();
		int chocolatBuyCount = Integer.parseInt(chocolateStr);

		System.out.println("ピスターシュ　　＞");
		String pistachioStr = reader.readLine();
		int pistachioBuyCount = Integer.parseInt(pistachioStr);

		System.out.println("\nシトロン" + citronBuyCount + "個");
		System.out.println("ショコラ" + chocolatBuyCount + "個");
		System.out.println("ピスターシュ" + pistachioBuyCount + "個");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");
	}
}
