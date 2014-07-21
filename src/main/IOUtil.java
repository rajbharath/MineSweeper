package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUtil {

	private static BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

	public static void printLine(String input) {
		System.out.println(input);
	}

	public static void print(String input) {
		System.out.print(input);
	}

	public static String readInput() {

		try {
			return br.readLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
